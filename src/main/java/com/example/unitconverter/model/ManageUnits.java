package com.example.unitconverter.model;

import com.example.unitconverter.LengthUnits;
import com.example.unitconverter.WeightUnits;

import java.util.HashMap;

import static java.lang.Math.pow;

public class ManageUnits {
    private ManageUnits() {
        throw new IllegalStateException("Utility class");
    }

    public static final int PRECISION_DECIMAL = 6;

    public static Unit createLengthUnits() {
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
        return new Unit(lengthUnits, LengthUnits.METER.toString());
    }

    public static Unit createWeightUnits() {
        HashMap<String, Double> weightUnits = new HashMap<>();
        weightUnits.put(WeightUnits.MICROGRAM.toString(), 1000000000.0);
        weightUnits.put(WeightUnits.MILLIGRAM.toString(), 1000000.0);
        weightUnits.put(WeightUnits.GRAM.toString(), 1000.0);
        weightUnits.put(WeightUnits.KILOGRAM.toString(), 1.0);
        weightUnits.put(WeightUnits.POUND.toString(), 2.204622621848775807);
        weightUnits.put(WeightUnits.OUNCE.toString(), 35.27396194958041292);
        weightUnits.put(WeightUnits.TON.toString(), 0.001);
        return new Unit(weightUnits, WeightUnits.KILOGRAM.toString());
    }

    public static double convert(Unit unitMeasurement, String unit, String other, double value) {
        return Math.round(unitMeasurement.convertTo(unit, other, value) * pow(10.0, PRECISION_DECIMAL)) / pow(10.0, PRECISION_DECIMAL);
    }
}
