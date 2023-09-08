package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class InchConverter extends Convertible {

    public InchConverter() {
        CONSTRAINT_TO_BASIC = 0.0254; // to meter
        CONSTRAINT_FROM_BASIC = 39.3701; // from meter
    }

}
