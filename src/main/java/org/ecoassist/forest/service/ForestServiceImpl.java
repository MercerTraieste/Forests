package org.ecoassist.forest.service;

import org.ecoassist.forest.datastore.ForestDatastore;
import org.ecoassist.forest.domain.Forest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForestServiceImpl implements ForestService {

    @Autowired
    ForestDatastore forestDatastore;

    @Override
    public void save(Forest forest) {
        forestDatastore.save(forest);
    }

    @Override
    public Forest getRandomForest() {
        return forestDatastore.getRandomForest();
    }

    @Override
    public Forest getForest(String id) {
        return forestDatastore.get(id);
    }

    @Override
    public List<Forest> getAllForests() {
        return forestDatastore.getAll();
    }
}
