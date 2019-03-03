package com.apareciumlabs.os.solid.calculator.v7.operation;

/**
 * This class implements the Operation interface.
 * And returns 0 in-case of a default operation
 *
 * @author brionsilva
 * @version 1.0
 * @since 24/01/2018
 */
public class DefaultOperation implements Operation {
    @Override
    public int calculate(int num1, int num2) {
        return 0;
    }
}
