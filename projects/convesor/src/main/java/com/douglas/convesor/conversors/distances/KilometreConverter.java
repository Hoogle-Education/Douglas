package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class KilometreConverter extends Convertible {

    public KilometreConverter() {
        CONSTRAINT_TO_BASIC = 1000; // to meter
        CONSTRAINT_FROM_BASIC = 0.001; // from meter
    }

}
