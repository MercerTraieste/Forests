package org.ecoassist.forest.service;

import org.ecoassist.forest.domain.Forest;

import java.util.List;

public interface ForestService {
    void save(Forest forest);
    Forest getRandomForest();
    Forest getForest(String id);
    List<Forest> getAllForests();
}
