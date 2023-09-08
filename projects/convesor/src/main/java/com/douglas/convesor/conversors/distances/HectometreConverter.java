package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class HectometreConverter extends Convertible {

    public HectometreConverter() {
        CONSTRAINT_TO_BASIC = 100; // to meter
        CONSTRAINT_FROM_BASIC = 0.01; // from meter
    }

}
