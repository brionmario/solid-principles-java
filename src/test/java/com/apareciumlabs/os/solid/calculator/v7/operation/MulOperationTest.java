package com.apareciumlabs.os.solid.calculator.v7.operation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit Test class for Multiply Operation
 *
 * @author brionsilva
 * @version 1.0
 * @since 25/01/2018
 */
public class MulOperationTest {

    @Test
    public void should_multiplyTwoPositiveNumbers() {
        Operation operation = new MulOperation();
        int testResult = operation.calculate(1,2);
        assertThat(testResult,is(2));
    }

    @Test
    public void should_multiplyTwoNegativeNumbers() {
        Operation operation = new MulOperation();
        int testResult = operation.calculate(-1,-3);
        assertThat(testResult,is(3));
    }

    @Test
    public void should_multiplyTwoMixedNumbers() {
        Operation operation = new MulOperation();
        int testResult = operation.calculate(-50,+5);
        assertThat(testResult,is(-250));
    }
}