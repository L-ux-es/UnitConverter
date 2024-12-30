package com.example.unitconverter.model;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.pow;

public class Unit {
    private String baseUnit;
    private Map<String, Double> units;
    protected int precisionDecimal = 6;

    public Unit() {
        baseUnit = "";
        units = new HashMap<>();
    }

    public Unit(Map<String, Double> units, String baseUnit) {
        this.units = units;
        this.baseUnit = baseUnit;
    }

    protected void setUnits(Map<String, Double> units) {
        this.units = units;
    }

    protected void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    protected void setPrecisionDecimal(int precisionDecimal) {
        this.precisionDecimal = precisionDecimal;
    }

    public int getPrecisionDecimal() {
        return precisionDecimal;
    }

    public double getUnit(String unit) {
        return units.get(unit.toLowerCase());
    }

    public double convertTo(String unit, String otherUnit, double count) {
        double result = 0.0;
        if (units.containsKey(unit.toLowerCase()) && units.containsKey(otherUnit.toLowerCase())) {
            if (unit.equalsIgnoreCase(otherUnit)) {
                return count;
            }
            if (baseUnit.equalsIgnoreCase(unit)) {
                result = count * getUnit(otherUnit);
            } else if (baseUnit.equalsIgnoreCase(otherUnit)) {
                result = count / getUnit(unit);
            } else if (units.containsKey(unit.toLowerCase()) && units.containsKey(otherUnit.toLowerCase())) {
                result = count / getUnit(unit) * getUnit(otherUnit);
            }
        }
        return Math.round(result * pow(10.0, precisionDecimal)) / pow(10.0, precisionDecimal);
    }


}
