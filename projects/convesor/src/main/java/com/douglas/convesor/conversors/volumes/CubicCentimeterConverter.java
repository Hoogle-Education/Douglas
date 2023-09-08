package com.douglas.convesor.conversors.volumes;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class CubicCentimeterConverter extends Convertible {

    public CubicCentimeterConverter() {
        CONSTRAINT_TO_BASIC = 1; // to meter
        CONSTRAINT_FROM_BASIC = 1; // from meter
    }

}
