package com.apareciumlabs.os.solid.calculator.v7.operation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit Test class for Divide Operation
 *
 * @author brionsilva
 * @version 1.0
 * @since 25/01/2018
 */
public class DivOperationTest {

    @Test
    public void should_divideTwoPositiveNumbers() {
        Operation operation = new DivOperation();
        int testResult = operation.calculate(10,2);
        assertThat(testResult,is(5));
    }

    @Test
    public void should_divideTwoNegativeNumbers() {
        Operation operation = new DivOperation();
        int testResult = operation.calculate(-10,-2);
        assertThat(testResult,is(5));
    }

    @Test
    public void should_divideTwoMixedNumbers() {
        Operation operation = new DivOperation();
        int testResult = operation.calculate(-15,+5);
        assertThat(testResult,is(-3));
    }
}