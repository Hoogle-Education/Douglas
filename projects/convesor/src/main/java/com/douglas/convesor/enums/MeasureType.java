package com.douglas.convesor.enums;

public enum MeasureType {
	DISTANCE("distance", "metre (m)"), 
	AREA("area", "square metre (m\\u33a1)"), 
	VOLUME("volume", "litre (L)");

	private String type;
	private String basicUnit;

	private MeasureType(String type, String basicUnit) {
		this.type = type;
		this.basicUnit = basicUnit;
	}

	public final String getBasicUnit() {
		return basicUnit;
	}

	public String getTypeString() {
		return (type);
	}
}