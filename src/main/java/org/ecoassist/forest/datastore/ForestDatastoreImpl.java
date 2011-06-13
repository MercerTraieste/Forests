package org.ecoassist.forest.datastore;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import org.ecoassist.forest.domain.Forest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class ForestDatastoreImpl implements ForestDatastore {
    @Override
    public void save(Forest forestInput) {
        UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();

        Key forestKey = KeyFactory.createKey("ForestData", "ForestData");
        Entity forest = new Entity("Forest", forestKey);
        forest.setProperty("name", forestInput.getName());
        forest.setProperty("dateCreated", new Date());
        forest.setProperty("coordinates", new Text(forestInput.getCoordinates()));
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        datastore.put(forest);
    }

    @Override
    public Forest getRandomForest() {
        Key forestKey = KeyFactory.createKey("ForestData", "ForestData");
        Query query = new Query("Forest", forestKey);
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        List<Entity> forests = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(30));
        if (forests.size() == 0) {
            return null;
        }
        Collections.shuffle(forests);
        Forest forest = new Forest();
        forest.setCoordinates(((Text) forests.get(0).getProperty("coordinates")).getValue());
        return forest;
    }

    @Override
    public Forest get(String id) {
        Key forestKey = KeyFactory.createKey("ForestData", "ForestData");
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Query query = new Query("Forest", forestKey);
        query.addFilter("ID", Query.FilterOperator.EQUAL, id);
        List<Entity> forests = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(30));
        Forest forest = new Forest();
        forest.setCoordinates(((Text) forests.get(0).getProperty("coordinates")).getValue());
        return forest;
    }

    @Override
    public List<Forest> getAll() {
        Key forestKey = KeyFactory.createKey("ForestData", "ForestData");
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Query query = new Query("Forest", forestKey);
        List<Entity> forests = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(30));
        List<Forest> forestsModel = new ArrayList<Forest>();
        for (Entity forest : forests) {
            Forest forestModel = new Forest();
            forestModel.setId(forest.getAppId());
            forestModel.setCoordinates(((Text) forest.getProperty("coordinates")).getValue());
        }
        return forestsModel;
    }
}
