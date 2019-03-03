package com.apareciumlabs.os.solid.calculator.v7.operation;

/**
 * This class implements the Operation interface. And performs
 * an addition operation on the two numbers passed as parameters
 *
 * @author brionsilva
 * @version 1.0
 * @since 24/01/2018
 */
public class AddOperation implements Operation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
