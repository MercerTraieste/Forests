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
        forest.setCoordinates("25.474439,45.179276,2 25.473983,45.176355,2 25.472084,45.175281,2 25.471625,45.17532,2 25.471271,45.175482,2 25.4707,45.175645,2 25.470206,45.175571,2 25.469726,45.175227,2 25.470067,45.174377,2 25.469807,45.174072,2 25.469328,45.173944,2 25.468718,45.173918,2 25.468272,45.173705,2 25.46809,45.173347,2 25.467915,45.173007,2 25.467363,45.172496,2 25.466868,45.172426,2 25.466377,45.17251,2 25.465972,45.172648,2 25.465566,45.172859,2 25.465487,45.173164,2 25.465833,45.173564,2 25.465974,45.173971,2 25.465332,45.174219,2 25.465018,45.174525,2 25.467621,45.176877,2 25.467367,45.177301,2 25.466656,45.177264,2 25.465741,45.176978,2 25.464925,45.176562,2 25.464176,45.176066,2 25.463834,45.175764,2 25.463283,45.175685,2 25.462764,45.175579,2 25.462304,45.175438,2 25.461933,45.175248,2 25.461433,45.174913,2 25.460875,45.174618,2 25.460223,45.174483,2 25.459598,45.174596,2 25.458902,45.175833,2 25.458354,45.175879,2 25.457667,45.175155,2 25.457814,45.174693,2 25.457845,45.174235,2 25.457775,45.173784,2 25.457233,45.173358,2 25.456694,45.173508,2 25.456698,45.173837,2 25.456885,45.174244,2 25.456578,45.174731,2 25.456145,45.174995,2 25.455677,45.174912,2 25.455559,45.174568,2 25.455601,45.174182,2 25.455676,45.173774,2 25.455719,45.17336,2 25.455483,45.172916,2 25.455156,45.17252,2 25.454661,45.172253,2 25.454042,45.172096,2 25.453628,45.172342,2 25.453696,45.172649,2 25.453953,45.173062,2 25.453675,45.173423,2 25.45311,45.173392,2 25.452726,45.173266,2 25.452304,45.173085,2 25.451864,45.172885,2 25.451366,45.172752,2 25.45084,45.17266,2 25.4504,45.172717,2 25.450188,45.173029,2 25.449949,45.173854,2 25.44953,45.173834,2 25.449151,45.173748,2 25.448745,45.173684,2 25.448271,45.173817,2 25.447862,45.17414,2 25.44754,45.174505,2 25.447269,45.174879,2 25.447067,45.175304,2 25.446929,45.175689,2 25.446861,45.176079,2 25.446813,45.176452,2 25.446488,45.176897,2 25.445986,45.176913,2 25.445826,45.177172,2 25.446071,45.178669,2 25.446655,45.178717,2 25.447209,45.178954,2 25.447828,45.17912,2 25.448481,45.179183,2 25.4492,45.179211,2 25.449892,45.179229,2 25.450606,45.179185,2 25.451244,45.17909,2 25.451617,45.178964,2 25.452037,45.17893,2 25.452465,45.178899,2 25.452847,45.178855,2 25.455447,45.179165,2 25.457737,45.178948,2 25.458334,45.179217,2 25.458281,45.179545,2 25.458125,45.179907,2 25.458048,45.180401,2 25.460165,45.179507,2 25.460567,45.179684,2 25.460895,45.179801,2 25.46121,45.179904,2 25.46154,45.179931,2 25.462237,45.180035,2 25.462847,45.180048,2 25.463507,45.180092,2 25.46415,45.180101,2 25.464773,45.1801,2 25.465416,45.180073,2 25.466028,45.180059,2 25.466669,45.180072,2 25.4673,45.180044,2 25.467885,45.180061,2 25.468495,45.180056,2 25.469099,45.180082,2 25.469722,45.180104,2 25.470651,45.180319,2 25.471709,45.180526,2 25.472634,45.180651,2 25.474439,45.179276,2");
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
