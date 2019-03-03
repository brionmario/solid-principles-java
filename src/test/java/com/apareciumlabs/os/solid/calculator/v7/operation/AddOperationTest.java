package com.apareciumlabs.os.solid.calculator.v7.operation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit Test class for Add Operation
 *
 * @author brionsilva
 * @version 1.0
 * @since 25/01/2018
 */
public class AddOperationTest {

    @Test
    public void should_addTwoPositiveNumbers() {
        Operation operation = new AddOperation();
        int testResult = operation.calculate(42,5);
        assertThat(testResult,is(47));
    }

    @Test
    public void should_addTwoNegativeNumbers() {
        Operation operation = new AddOperation();
        int testResult = operation.calculate(-90,-15);
        assertThat(testResult,is(-105));
    }

    @Test
    public void should_addTwoMixedNumbers() {
        Operation operation = new AddOperation();
        int testResult = operation.calculate(-10,+5);
        assertThat(testResult,is(-5));
    }
}