package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class MicrometreConverter extends Convertible {

    public MicrometreConverter() {
        CONSTRAINT_TO_BASIC = 1e-6; // to meter
        CONSTRAINT_FROM_BASIC = 1e+6; // from meter
    }

}
