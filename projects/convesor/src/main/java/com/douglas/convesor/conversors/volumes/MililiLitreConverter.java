package com.douglas.convesor.conversors.volumes;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class MililiLitreConverter extends Convertible {

    public MililiLitreConverter() {
        CONSTRAINT_TO_BASIC = 1e-6; // to meter
        CONSTRAINT_FROM_BASIC = 1e+6; // from meter
    }

}
