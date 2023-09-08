package com.douglas.convesor.conversors.volumes;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class USLiquidGallonConverter extends Convertible {

    public USLiquidGallonConverter() {
        CONSTRAINT_TO_BASIC = 0.00378541; // to meter
        CONSTRAINT_FROM_BASIC = 264.172; // from meter
    }

}
