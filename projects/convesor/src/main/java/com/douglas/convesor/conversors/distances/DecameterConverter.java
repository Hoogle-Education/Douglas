package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class DecameterConverter extends Convertible {

    public DecameterConverter() {
        CONSTRAINT_TO_BASIC = 10; // to meter
        CONSTRAINT_FROM_BASIC = 0.1; // from meter
    }
}
