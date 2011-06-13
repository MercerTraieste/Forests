package org.ecoassist.forest.datastore;

import org.ecoassist.forest.domain.Forest;

import java.util.List;

public interface ForestDatastore {
    void save(Forest forest);
    Forest getRandomForest();
    Forest get(String id);
    List<Forest> getAll();
}
