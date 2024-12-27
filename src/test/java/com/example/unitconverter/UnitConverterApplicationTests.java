package com.example.unitconverter;

import com.example.unitconverter.model.ManageUnits;
import com.example.unitconverter.model.Unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.crypto.Mac;

@SpringBootTest
class UnitConverterApplicationTests {


    @Test
    void testLengthUnits() {
        Unit length = ManageUnits.createLengthUnits();
        Assertions.assertEquals(0.1, ManageUnits.convert(length, LengthUnits.CENTIMETER.toString(), LengthUnits.METER.toString(), 10.0));
        Assertions.assertEquals(304.8, ManageUnits.convert(length, LengthUnits.FOOT.toString(), LengthUnits.METER.toString(), 1000.0));
        Assertions.assertEquals(36, ManageUnits.convert(length, LengthUnits.YARD.toString(), LengthUnits.INCH.toString(), 1.0));
        Assertions.assertEquals(1000.0, ManageUnits.convert(length, LengthUnits.METER.toString(), LengthUnits.MILLIMETER.toString(), 1.0));
        Assertions.assertEquals(63360.0, Math.round(ManageUnits.convert(length, LengthUnits.MILE.toString(), LengthUnits.INCH.toString(), 1.0)));
    }

    @Test
    void testWeightUnits() {
        Unit weight = ManageUnits.createWeightUnits();
        Assertions.assertEquals(10, ManageUnits.convert(weight, WeightUnits.GRAM.toString(), WeightUnits.KILOGRAM.toString(), 10000.0));
        Assertions.assertEquals(6.25, ManageUnits.convert(weight, WeightUnits.OUNCE.toString(), WeightUnits.POUND.toString(), 100.0));
        Assertions.assertEquals(0.01, ManageUnits.convert(weight, WeightUnits.GRAM.toString(), WeightUnits.TON.toString(), 10000.0));
        Assertions.assertEquals(2.204622621848775807, ManageUnits.convert(weight, WeightUnits.KILOGRAM.toString(), WeightUnits.POUND.toString(), 1.0));
        Assertions.assertEquals(35.27396194958041292, ManageUnits.convert(weight, WeightUnits.KILOGRAM.toString(), WeightUnits.OUNCE.toString(), 1.0));

    }


}
