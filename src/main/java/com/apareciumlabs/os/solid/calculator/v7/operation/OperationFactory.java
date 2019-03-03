package com.apareciumlabs.os.solid.calculator.v7.operation;

/**
 * This class takes a string as a parameter and checks
 * if it matches the operations and returns the respective
 * operation
 *
 * @author brionsilva
 * @version 1.0
 * @since 24/01/2018
 */
@SuppressWarnings("Duplicates")
public class OperationFactory {

    public Operation gerOperation(String operator) throws IllegalArgumentException {
        switch (operator) {
            case "add":
                return new AddOperation();
            case "sub":
                return new SubOperation();
            case "mul":
                return new MulOperation();
            case "div":
                return new DivOperation();
            default:
                System.err.println("Please enter a valid argument");
                return new DefaultOperation();
        }
    }
}
