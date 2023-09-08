package com.douglas.convesor.conversors.volumes;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class LitreConverter extends Convertible {

    public LitreConverter() {
        CONSTRAINT_TO_BASIC = 0.001; // to meter
        CONSTRAINT_FROM_BASIC = 1000; // from meter
    }

}
