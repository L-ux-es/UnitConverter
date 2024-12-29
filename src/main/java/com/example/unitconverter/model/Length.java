package com.example.unitconverter.model;

import com.example.unitconverter.model.enums.LengthUnits;

import java.util.HashMap;

public class Length extends Unit {

    public Length() {
        super();
        HashMap<String, Double> lengthUnits = new HashMap<>();
        lengthUnits.put(LengthUnits.MILLIMETER.toString(), 1000.0);
        lengthUnits.put(LengthUnits.CENTIMETER.toString(), 100.0);
        lengthUnits.put(LengthUnits.DECIMETER.toString(), 10.0);
        lengthUnits.put(LengthUnits.METER.toString(), 1.0);
        lengthUnits.put(LengthUnits.KILOMETER.toString(), 0.001);
        lengthUnits.put(LengthUnits.INCH.toString(), 39.37007874015748031);
        lengthUnits.put(LengthUnits.FOOT.toString(), 3.280839895013123359);
        lengthUnits.put(LengthUnits.YARD.toString(), 1.093613298337707786);
        lengthUnits.put(LengthUnits.MILE.toString(), 0.000621371192237333);
        setUnits(lengthUnits);
        setBaseUnit(LengthUnits.METER.toString());
        setPrecisionDecimal(6);
    }


}
