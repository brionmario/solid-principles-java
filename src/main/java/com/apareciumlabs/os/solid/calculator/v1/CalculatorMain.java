package com.apareciumlabs.os.solid.calculator.v1;

import java.io.*;
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

        List<Integer> numberList = new ArrayList<Integer>();
        numberList = read(numberList); // Assigns the list returned from the number reader method
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

    /**
     * Reads the list of numbers from the text file and returns them
     * @return The numbers as an integer list
     */
    @SuppressWarnings("Duplicates")
    public static List<Integer> read(List<Integer> numberList) {

        File file = new File("./res/numberDB.txt");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String number = null;

            while ((number = bufferedReader.readLine()) != null) {
                numberList.add(Integer.parseInt(number));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return numberList;
    }
}
