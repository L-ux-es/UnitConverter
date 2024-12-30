package com.example.unitconverter;

import com.example.unitconverter.model.Length;
import com.example.unitconverter.model.Temperature;
import com.example.unitconverter.model.Unit;
import com.example.unitconverter.model.Weight;
import com.example.unitconverter.model.enums.LengthUnits;
import com.example.unitconverter.model.enums.TemperatureUnits;
import com.example.unitconverter.model.enums.WeightUnits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitConverterApplicationTests {


    @Test
    void testLengthUnits() {
        Unit length = new Length();
        Assertions.assertEquals(roundToPrecision(0.1, length.getPrecisionDecimal()), length.convertTo(LengthUnits.CENTIMETER.toString(), LengthUnits.METER.toString(), 10.0));
        Assertions.assertEquals(roundToPrecision(304.8, length.getPrecisionDecimal()), length.convertTo(LengthUnits.FOOT.toString(), LengthUnits.METER.toString(), 1000.0));
        Assertions.assertEquals(roundToPrecision(36, length.getPrecisionDecimal()), length.convertTo(LengthUnits.YARD.toString(), LengthUnits.INCH.toString(), 1.0));
        Assertions.assertEquals(roundToPrecision(1000.0, length.getPrecisionDecimal()), length.convertTo(LengthUnits.METER.toString(), LengthUnits.MILLIMETER.toString(), 1.0));
        Assertions.assertEquals(roundToPrecision(63360.0, length.getPrecisionDecimal()), length.convertTo(LengthUnits.MILE.toString(), LengthUnits.INCH.toString(), 1.0));
        Assertions.assertEquals(roundToPrecision(0.0, length.getPrecisionDecimal()), length.convertTo(LengthUnits.MILE.toString(), "none", 1.0));
        Assertions.assertEquals(roundToPrecision(12.01, length.getPrecisionDecimal()), length.convertTo(LengthUnits.MILE.toString(), LengthUnits.MILE.toString(), 12.01));
    }

    @Test
    void testWeightUnits() {
        Unit weight = new Weight();
        Assertions.assertEquals(roundToPrecision(10.0, weight.getPrecisionDecimal()), weight.convertTo(WeightUnits.GRAM.toString(), WeightUnits.KILOGRAM.toString(), 10000.0));
        Assertions.assertEquals(roundToPrecision(6.25, weight.getPrecisionDecimal()), weight.convertTo(WeightUnits.OUNCE.toString(), WeightUnits.POUND.toString(), 100.0));
        Assertions.assertEquals(roundToPrecision(0.01, weight.getPrecisionDecimal()), weight.convertTo(WeightUnits.GRAM.toString(), WeightUnits.TON.toString(), 10000.0));
        Assertions.assertEquals(roundToPrecision(2.20462, weight.getPrecisionDecimal()), weight.convertTo(WeightUnits.KILOGRAM.toString(), WeightUnits.POUND.toString(), 1.0));
        Assertions.assertEquals(roundToPrecision(35.27396, weight.getPrecisionDecimal()), weight.convertTo(WeightUnits.KILOGRAM.toString(), WeightUnits.OUNCE.toString(), 1.0));

    }

    @Test
    void testTemperatureUnits() {
        Unit temperature = new Temperature();
        Assertions.assertEquals(roundToPrecision(33.8, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.CELSIUS.toString(), TemperatureUnits.FAHRENHEIT.toString(), 1));
        Assertions.assertEquals(roundToPrecision(274.15, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.CELSIUS.toString(), TemperatureUnits.KELVIN.toString(), 1));
        Assertions.assertEquals(roundToPrecision(1.0, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.FAHRENHEIT.toString(), TemperatureUnits.CELSIUS.toString(), 33.8));
        Assertions.assertEquals(roundToPrecision(274.15, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.FAHRENHEIT.toString(), TemperatureUnits.KELVIN.toString(), 33.8));
        Assertions.assertEquals(roundToPrecision(33.8, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.KELVIN.toString(), TemperatureUnits.FAHRENHEIT.toString(), 274.15));
        Assertions.assertEquals(roundToPrecision(1.0, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.KELVIN.toString(), TemperatureUnits.CELSIUS.toString(), 274.15));
        Assertions.assertEquals(roundToPrecision(-253.15, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.KELVIN.toString(), TemperatureUnits.CELSIUS.toString(), 20));
        Assertions.assertEquals(roundToPrecision(-369.67, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.KELVIN.toString(), TemperatureUnits.FAHRENHEIT.toString(), 50));
        Assertions.assertEquals(roundToPrecision(0.0, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.KELVIN.toString(), "none", 50));
        Assertions.assertEquals(roundToPrecision(50.0, temperature.getPrecisionDecimal()), temperature.convertTo(TemperatureUnits.KELVIN.toString(), TemperatureUnits.KELVIN.toString(), 50));

    }

    public double roundToPrecision(double value, int precision) {
        return Math.round(value * Math.pow(10, precision)) / Math.pow(10, precision);
    }


}
