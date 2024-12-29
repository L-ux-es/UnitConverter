package com.example.unitconverter.controller;

import com.example.unitconverter.model.Length;
import com.example.unitconverter.model.Temperature;
import com.example.unitconverter.model.Weight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UnitController {

    @GetMapping("/")
    public String home() {
        return "form";
    }

    private final Length length;
    private final Weight weight;
    private final Temperature temperature;
    private static final String CONVERTED_VALUE = "convertedValue";
    private static final String RESULT_PAGE = "result";

    public UnitController() {
        length = new Length();
        weight = new Weight();
        temperature = new Temperature();
    }

    @PostMapping("/length")
    public String convertLength(@RequestParam("value") double value, @RequestParam("lengthConvertFrom") String unit,
                                @RequestParam("lengthConvertTo") String otherUnit, Model model) {
        double result = length.convertTo(unit, otherUnit, value);
        return returnResultPage(value, unit, otherUnit, result,model);
    }

    private String returnResultPage(double value, String unit, String otherUnit, double result, Model model) {
        model.addAttribute("value", value);
        model.addAttribute("unit", unit);
        model.addAttribute("otherUnit", otherUnit);
        model.addAttribute(CONVERTED_VALUE, result);
        return RESULT_PAGE;
    }

    @PostMapping("/weight")
    public String convertWeight(@RequestParam("value") double value, @RequestParam("weightConvertFrom") String unit,
                                @RequestParam("weightConvertTo") String otherUnit, Model model) {
        double result = weight.convertTo(unit, otherUnit, value);
        return returnResultPage(value, unit, otherUnit, result, model);
    }

    @PostMapping("/temperature")
    public String convertTemperature(@RequestParam("value") double value, @RequestParam("temperatureConvertFrom") String unit,
                                     @RequestParam("temperatureConvertTo") String otherUnit, Model model) {
        double result = temperature.convertTo(unit, otherUnit, value);
        return returnResultPage(value, unit, otherUnit, result, model);
    }

}
