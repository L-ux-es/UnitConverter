package com.example.unitconverter.model.enums;

public enum TemperatureUnits {
    CELSIUS("celsius"),
    FAHRENHEIT("fahrenheit"),
    KELVIN("kelvin");

    private final String temperatureName;

    TemperatureUnits(String temperatureName) {
        this.temperatureName = temperatureName;
    }

    @Override
    public String toString() {
        return temperatureName;
    }
}
