package com.example.unitconverter;

public enum LengthUnits {
    MILLIMETER("millimeter"),
    CENTIMETER("centimeter"),
    DECIMETER("decimeter"),
    METER("meter"),
    KILOMETER("kilometer"),
    INCH("inch"),
    FOOT("foot"),
    YARD("yard"),
    MILE("mile");
    private final String lengthName;

    LengthUnits(String lengthName) {
        this.lengthName = lengthName;
    }

    @Override
    public String toString() {
        return lengthName;
    }
}