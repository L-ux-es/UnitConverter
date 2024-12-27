package com.example.unitconverter.model;

import java.util.HashMap;

public class ManageUnits {
    private ManageUnits() {
        throw new IllegalStateException("Utility class");
    }

    public static Unit createLengthUnits() {
        HashMap<String, Double> lengthUnits = new HashMap<>();
        lengthUnits.put("mile", 0.000621371192237333);
        lengthUnits.put("kilometer", 0.001);
        lengthUnits.put("decimeter", 10.0);
        lengthUnits.put("centimeter", 100.0);
        lengthUnits.put("millimeter", 1000.0);
        return new Unit(lengthUnits, "meter");
    }

    public static double convert(Unit unitMeasurement, String unit, String other, double value) {
        return unitMeasurement.convertTo(unit, other, value);
    }
}
