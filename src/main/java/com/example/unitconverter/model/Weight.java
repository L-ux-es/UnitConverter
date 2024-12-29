package com.example.unitconverter.model;

import com.example.unitconverter.WeightUnits;

import java.util.HashMap;

public class Weight extends Unit {

    public Weight() {
        super();
        HashMap<String, Double> weightUnits = new HashMap<>();
        weightUnits.put(WeightUnits.MICROGRAM.toString(), 1000000000.0);
        weightUnits.put(WeightUnits.MILLIGRAM.toString(), 1000000.0);
        weightUnits.put(WeightUnits.GRAM.toString(), 1000.0);
        weightUnits.put(WeightUnits.KILOGRAM.toString(), 1.0);
        weightUnits.put(WeightUnits.POUND.toString(), 2.204622621848775807);
        weightUnits.put(WeightUnits.OUNCE.toString(), 35.27396194958041292);
        weightUnits.put(WeightUnits.TON.toString(), 0.001);
        setUnits(weightUnits);
        setBaseUnit(WeightUnits.KILOGRAM.toString());
        setPrecisionDecimal(5);
    }

}
