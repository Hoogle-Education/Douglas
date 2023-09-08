package com.douglas.convesor.conversors.distances;

import com.douglas.convesor.conversors.interfaces.Convertible;

public class CentimeterConverter extends Convertible {

	public CentimeterConverter() {
		CONSTRAINT_TO_BASIC = 0.01; // to meter
		CONSTRAINT_FROM_BASIC = 100; // from meter
	}
	

}
