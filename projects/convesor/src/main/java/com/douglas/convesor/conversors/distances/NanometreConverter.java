package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class NanometreConverter extends Convertible {

    public NanometreConverter() {
        CONSTRAINT_TO_BASIC = 1e-9; // to meter
        CONSTRAINT_FROM_BASIC = 1e+9; // from meter
    }

}
