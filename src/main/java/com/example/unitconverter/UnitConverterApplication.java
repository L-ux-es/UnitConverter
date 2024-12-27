package com.example.unitconverter;

import com.example.unitconverter.model.ManageUnits;
import com.example.unitconverter.model.Unit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitConverterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitConverterApplication.class, args);
        Unit length = ManageUnits.createLengthUnits();
        System.out.println(ManageUnits.convert(length, "mile", "kilometer", 5.0));
    }
}
