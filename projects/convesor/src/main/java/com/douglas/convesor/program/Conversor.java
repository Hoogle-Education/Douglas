package com.douglas.convesor.program;

import java.util.List;

import com.douglas.convesor.conversors.distances.CentimeterConverter;
import com.douglas.convesor.conversors.volumes.CubicCentimeterConverter;
import com.douglas.convesor.conversors.distances.DecameterConverter;
import com.douglas.convesor.conversors.distances.DecimeterConverter;
import com.douglas.convesor.conversors.distances.HectometreConverter;
import com.douglas.convesor.conversors.distances.InchConverter;
import com.douglas.convesor.conversors.distances.KilometreConverter;
import com.douglas.convesor.conversors.volumes.LitreConverter;
import com.douglas.convesor.conversors.distances.MetreConverter;
import com.douglas.convesor.conversors.distances.MicrometreConverter;
import com.douglas.convesor.conversors.distances.MiliMeterConverter;
import com.douglas.convesor.conversors.volumes.MililiLitreConverter;
import com.douglas.convesor.conversors.distances.NanometreConverter;
import com.douglas.convesor.conversors.areas.SoccerFieldConverter;
import com.douglas.convesor.conversors.areas.SquareMetreConverter;
import com.douglas.convesor.conversors.volumes.USLiquidGallonConverter;
import com.douglas.convesor.conversors.distances.YardConverter;
import com.douglas.convesor.conversors.interfaces.Convertible;
import com.douglas.convesor.enums.MeasureUnits;

public class Conversor {

	private static CentimeterConverter centimeter;
	private static CubicCentimeterConverter cubicCentimeter;
	private static DecameterConverter decameter;
	private static DecimeterConverter decimeter;
	private static HectometreConverter hectometre;
	private static InchConverter inch;
	private static KilometreConverter kilometre;
	private static LitreConverter litre;
	private static MetreConverter metre;
	private static MicrometreConverter micrometre;
	private static MililiLitreConverter mililitre;
	private static MiliMeterConverter milimeter;
	private static NanometreConverter nanometre;
	private static SoccerFieldConverter soccerField;
	private static SquareMetreConverter squareMetre;
	private static USLiquidGallonConverter usLiquidGallon;
	private static YardConverter yard;
	
	private static Convertible convertibleUnit;
	
	private List<MeasureUnits> distances = List.of(MeasureUnits.CENTIMETER,
			MeasureUnits.DECAMETER, MeasureUnits.DECIMETER, MeasureUnits.HECTOMETRE,
			MeasureUnits.INCH, MeasureUnits.KILOMETRE, MeasureUnits.METRE,
			MeasureUnits.MICROMETRE, MeasureUnits.MILILITRE, MeasureUnits.NONOMETRE);
	
	private List<MeasureUnits> areas = List.of(MeasureUnits.SOCCER_FIELD,
			MeasureUnits.SQUARE_METER, MeasureUnits.YARD);
	
	private List<MeasureUnits> volumes = List.of(MeasureUnits.CUBIC_CENTIMETER,
			MeasureUnits.LITRE, MeasureUnits.MILILITRE, MeasureUnits.US_LIQUID_GALOON);
	
	public Conversor() {
		centimeter = new CentimeterConverter();
		cubicCentimeter = new CubicCentimeterConverter();
		decameter = new DecameterConverter();
		decimeter = new DecimeterConverter();
		hectometre = new HectometreConverter();
		inch = new InchConverter();
		kilometre = new KilometreConverter();
		litre = new LitreConverter();
		metre = new MetreConverter();
		micrometre = new MicrometreConverter();
		mililitre = new MililiLitreConverter();
		milimeter = new MiliMeterConverter();
		nanometre = new NanometreConverter();
		soccerField = new SoccerFieldConverter();
		squareMetre = new SquareMetreConverter();
		usLiquidGallon = new USLiquidGallonConverter();
		yard = new YardConverter();
	}
	
	public List<MeasureUnits> getConvertiblesUnits (MeasureUnits unit) {
		if(distances.contains(unit)) return distances;
		
		if(areas.contains(unit)) return areas;
		
		return volumes;
	}
	
	private void setupConversor(double value, MeasureUnits unit) {
		switch(unit) {
			case CENTIMETER:
				convertibleUnit = centimeter;
				break;
			case CUBIC_CENTIMETER:
				convertibleUnit = cubicCentimeter;
				break;
			case DECAMETER:
				convertibleUnit = decameter;
				break;
			case DECIMETER:
				convertibleUnit = decimeter;
		}
	
	}

	public double convert(double value, MeasureUnits unit, MeasureUnits target) {
		
		
		
		if(distances.contains(unit) ) {
			
		}
		
		return -1;
	}
}
