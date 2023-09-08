package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class MiliMeterConverter extends Convertible {

    public MiliMeterConverter () {
        CONSTRAINT_TO_BASIC = 0.001; // to meter
        CONSTRAINT_FROM_BASIC = 1000; // from meter
    }

}
