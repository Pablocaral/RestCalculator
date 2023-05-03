package com.uclm.restcalculator.controllers;

import com.uclm.restcalculator.exceptions.IllegalParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/sum")
    public double sum(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) throws IllegalParameterException {
        if (b == 0)
            throw new IllegalParameterException("Divisor cannot be zero");

        return a / b;
    }
}