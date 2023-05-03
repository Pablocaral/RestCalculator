package com.uclm.restcalculator.controllers;

import com.uclm.restcalculator.exceptions.IllegalParameterException;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void subtractTest() throws Exception {
        givenRandomParameters();
        whenSubtractMethodIsCalled();
        assertEquals(result, a-b);
    }

    @Test
    public void multiplyTest() throws Exception {
        givenRandomParameters();
        whenMultiplyMethodIsCalled();
        assertEquals(result, a*b);
    }

    @Test
    public void divideTest() throws Exception {
        givenRandomParameters();
        whenDivideMethodIsCalled();
        assertEquals(result, a/b);
    }

    @Test
    public void divideByZeroTest() throws Exception {
        givenRandomParameters();
        givenZeroValueForBParameter();
        illegalParameterExceptionIsThrownWhenDivideMethodIsCalled();
    }

    private void givenRandomParameters() {
        a = random.nextDouble();
        b = random.nextDouble();
    }
    private void givenZeroValueForBParameter() {
        b = 0;
    }

    private void whenSumMethodIsCalled() {
        result = calculatorController.sum(a, b);
    }
    private void whenSubtractMethodIsCalled() {
        result = calculatorController.subtract(a, b);
    }
    private void whenMultiplyMethodIsCalled() {
        result = calculatorController.multiply(a, b);
    }
    private void whenDivideMethodIsCalled() throws IllegalParameterException {
        result = calculatorController.divide(a, b);
    }
    private void illegalParameterExceptionIsThrownWhenDivideMethodIsCalled() {
        assertThrows(
                IllegalParameterException.class,
                () -> calculatorController.divide(a, b),
                "Divisor cannot be zero"
        );
    }
}