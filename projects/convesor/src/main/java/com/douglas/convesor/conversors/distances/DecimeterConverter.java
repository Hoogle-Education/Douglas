package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class DecimeterConverter extends Convertible {

    public DecimeterConverter() {
        CONSTRAINT_TO_BASIC = 0.1; // to meter
        CONSTRAINT_FROM_BASIC = 10; // from meter
    }

}
