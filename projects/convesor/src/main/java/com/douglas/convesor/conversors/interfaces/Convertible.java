package com.douglas.convesor.conversors.interfaces;

import java.math.BigDecimal;

public abstract class Convertible {
	
	protected double CONSTRAINT_TO_BASIC;
	protected double CONSTRAINT_FROM_BASIC;
	
	public BigDecimal toBasicUnit(double value) {
		return BigDecimal.valueOf(value * CONSTRAINT_TO_BASIC );
	}
	
	public BigDecimal fromBasicUnit(BigDecimal valueInBasicUnit) {
		return valueInBasicUnit.multiply(BigDecimal.valueOf(CONSTRAINT_FROM_BASIC));
	}

}
