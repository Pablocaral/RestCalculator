package com.uclm.restcalculator.controllers;

import com.uclm.restcalculator.controllets.CalculatorController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorControllerTest {
    @InjectMocks
    private CalculatorController calculatorController;
    private Random random = new Random();;

    private double a;
    private double b;
    private double result;

    @Test
    public void sumTest() {
        givenRandomParameters();
        whenSumMethodIsCalled();
        assertEquals(result, a+b);
    }

    private void givenRandomParameters() {
        a = random.nextDouble();
        b = random.nextDouble();
    }

    private void whenSumMethodIsCalled() {
        result = calculatorController.sum(a, b);
    }
}