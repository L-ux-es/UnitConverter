package com.example.unitconverter.model;

import java.util.Map;

public class Unit {
    private final String baseUnit;
    private final Map<String, Double> units;

    public Unit(Map<String, Double> units, String baseUnit) {
        this.units = units;
        this.baseUnit = baseUnit;
    }

    public double getUnit(String unit) {
        return units.get(unit);
    }

    public double convertTo(String unit, String otherUnit, double count) {
        if (baseUnit.equals(unit)) {
            return count * getUnit(otherUnit);
        } else if (baseUnit.equals(otherUnit)) {
            return count / getUnit(unit);
        }
        return count / getUnit(unit) * getUnit(otherUnit);
    }
}
