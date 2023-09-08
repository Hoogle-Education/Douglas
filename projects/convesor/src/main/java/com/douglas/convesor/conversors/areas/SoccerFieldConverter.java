package com.douglas.convesor.conversors.areas;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class SoccerFieldConverter extends Convertible {

    public SoccerFieldConverter() {
        CONSTRAINT_TO_BASIC = 7140; // to meter
        CONSTRAINT_FROM_BASIC = 0.00014005602240896; // from meter
    }

}
