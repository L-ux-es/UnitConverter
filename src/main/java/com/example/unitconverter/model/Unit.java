package com.example.unitconverter.model;

import java.util.Map;

public class Unit {
    private String baseUnit;
    private Map<String, Double> units;

    public Unit(Map<String, Double> units, String baseUnit) {
        this.units = units;
        this.baseUnit = baseUnit;
    }

    public Map<String, Double> getUnits() {
        return units;
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public void setUnits(Map<String, Double> units) {
        this.units = units;
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
