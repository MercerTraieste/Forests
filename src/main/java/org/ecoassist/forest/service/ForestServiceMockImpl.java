package org.ecoassist.forest.service;

import org.ecoassist.forest.domain.Forest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "mockForestService")
public class ForestServiceMockImpl implements ForestService {
    @Override
    public void save(Forest forest) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Forest getRandomForest() {
        final Forest forest = new Forest();
        forest.setCoordinates("25.252487,45.188251,2 25.253024,45.187976,2 25.25355,45.187822,2 25.253919,45.187625,2\n" +
                "25.254218,45.1874,2 25.254449,45.187134,2 25.254662,45.186624,2 25.254969,45.186166,2\n" +
                "25.255417,45.185637,2 25.255734,45.185084,2 25.25577,45.184522,2 25.255447,45.183834,2\n" +
                "25.255434,45.183217,2 25.255328,45.182747,2 25.254689,45.182405,2 25.254154,45.18223,2\n" +
                "25.253625,45.182056,2 25.253077,45.181872,2 25.252554,45.181711,2 25.251961,45.181535,2\n" +
                "25.251539,45.181416,2 25.251223,45.181344,2 25.250907,45.181267,2 25.250546,45.181212,2\n" +
                "25.250173,45.181148,2 25.249799,45.181093,2 25.249419,45.181042,2 25.249007,45.181,2\n" +
                "25.248582,45.180966,2 25.248163,45.180942,2 25.247705,45.180943,2 25.246915,45.181602,2\n" +
                "25.246583,45.181615,2 25.246225,45.181677,2 25.245922,45.18183,2 25.245168,45.181926,2\n" +
                "25.244583,45.182317,2 25.244148,45.182823,2 25.243766,45.183461,2 25.243427,45.184117,2\n" +
                "25.243119,45.18485,2 25.242781,45.185695,2 25.242513,45.186555,2 25.242323,45.187339,2\n" +
                "25.250311,45.188272,2 25.252487,45.188251,2");
        return forest;
    }

    @Override
    public Forest getForest(String id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Forest> getAllForests() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
