package com.apareciumlabs.os.solid.calculator.v7.operation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit Test class for Subtract Operation
 *
 * @author brionsilva
 * @version 1.0
 * @since 25/01/2018
 */
public class SubOperationTest {

    @Test
    public void should_subtractTwoPositiveNumbers() {
        Operation operation = new SubOperation();
        int testResult = operation.calculate(22,2);
        assertThat(testResult,is(20));
    }

    @Test
    public void should_subtractTwoNegativeNumbers() {
        Operation operation = new SubOperation();
        int testResult = operation.calculate(-10,-20);
        assertThat(testResult,is(10));
    }

    @Test
    public void should_subtractTwoMixedNumbers() {
        Operation operation = new SubOperation();
        int testResult = operation.calculate(-5,+5);
        assertThat(testResult,is(-10));
    }

}