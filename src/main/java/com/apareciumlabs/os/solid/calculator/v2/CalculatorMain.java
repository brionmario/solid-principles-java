package com.apareciumlabs.os.solid.calculator.v2;

import com.apareciumlabs.os.solid.calculator.v2.repository.FileNumberRepository;
import com.apareciumlabs.os.solid.calculator.v2.repository.NumberRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2018. Aparecium Labs.  http://www.apareciumlabs.com
 *
 * @author brionsilva
 * @version 1.0
 * @since 22/01/2018
 */
public class CalculatorMain {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {

        NumberRepository numberRepository = new FileNumberRepository();
        List<Integer> numberList = new ArrayList<Integer>();
        numberList = numberRepository.read(numberList); // Assigns the list returned from the number reader method
        int result;

        if (args.length > 0) {

            String operand = args[0];

            switch (operand) {
                case "add":
                    result = numberList.get(0) + numberList.get(1);
                    break;
                case "sub":
                    result = numberList.get(0) - numberList.get(1);
                    break;
                case "mul":
                    result = numberList.get(0) * numberList.get(1);
                    break;
                case "div":
                    result = numberList.get(0) / numberList.get(1);
                    break;
                default:
                    throw new IllegalArgumentException("Please enter a valid argument");
            }

            System.out.println("Result : " + result);

        } else {

            throw new ArrayIndexOutOfBoundsException("Arguments can not be left blank");

        }
    }
}
