package com.example.unitconverter.model;

import com.example.unitconverter.model.enums.TemperatureUnits;

import static java.lang.Math.pow;

public class Temperature extends Unit {

    public Temperature() {
        super();
        setPrecisionDecimal(2);
    }

    @Override
    public double convertTo(String unit, String otherUnit, double count) {
        double result = 0.0;
        if (unit.equalsIgnoreCase(otherUnit)) {
            return count;
        }
        if (unit.equalsIgnoreCase(TemperatureUnits.CELSIUS.toString()) && otherUnit.equalsIgnoreCase(TemperatureUnits.KELVIN.toString())) {
            result = count + 273.15;
        } else if (unit.equalsIgnoreCase(TemperatureUnits.CELSIUS.toString()) && otherUnit.equalsIgnoreCase(TemperatureUnits.FAHRENHEIT.toString())) {
            result = count * (9.0 / 5.0) + 32;
        } else if (unit.equalsIgnoreCase(TemperatureUnits.FAHRENHEIT.toString()) && otherUnit.equalsIgnoreCase(TemperatureUnits.CELSIUS.toString())) {
            result = 5.0 / 9.0 * (count - 32);
        } else if (unit.equalsIgnoreCase(TemperatureUnits.KELVIN.toString()) && otherUnit.equalsIgnoreCase(TemperatureUnits.CELSIUS.toString())) {
            result = count - 273.15;
        } else if (unit.equalsIgnoreCase(TemperatureUnits.KELVIN.toString()) && otherUnit.equalsIgnoreCase(TemperatureUnits.FAHRENHEIT.toString())) {
            result = (count - 273.15) * (9.0 / 5.0) + 32;
        } else if (unit.equalsIgnoreCase(TemperatureUnits.FAHRENHEIT.toString()) && otherUnit.equalsIgnoreCase(TemperatureUnits.KELVIN.toString())) {
            result = ((5.0 / 9.0) * (count - 32)) + 273.15;
        }
        return Math.round(result * pow(10, precisionDecimal)) / pow(10.0, precisionDecimal);
    }
}
