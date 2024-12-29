package com.example.unitconverter.model.enums;

public enum WeightUnits {
    MICROGRAM("microgram"),
    MILLIGRAM("milligram"),
    GRAM("gram"),
    KILOGRAM("kilogram"),
    POUND("pound"),
    OUNCE("ounce"),
    TON("ton");
    private final String weightName;

    WeightUnits(String weightName) {
        this.weightName = weightName;
    }

    @Override
    public String toString() {
        return weightName;
    }
}

