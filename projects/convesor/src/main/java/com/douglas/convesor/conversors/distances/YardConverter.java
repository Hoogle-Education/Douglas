package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class YardConverter extends Convertible {

    public YardConverter() {
        CONSTRAINT_TO_BASIC = 0.9144; // to meter
        CONSTRAINT_FROM_BASIC = 1.09361; // from meter
    }

}
