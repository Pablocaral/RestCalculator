package com.uclm.restcalculator.controllets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/sum")
    public double sum(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }
}