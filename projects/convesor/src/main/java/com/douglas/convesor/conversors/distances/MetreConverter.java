package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class MetreConverter extends Convertible {

    public MetreConverter() {
        CONSTRAINT_TO_BASIC = 1; // to meter
        CONSTRAINT_FROM_BASIC = 1; // from meter
    }

}
