package com.douglas.convesor.conversors.areas;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class SquareMetreConverter extends Convertible {
    public SquareMetreConverter() {
        CONSTRAINT_TO_BASIC = 1; // to meter
        CONSTRAINT_FROM_BASIC = 1; // from meter
    }

}
