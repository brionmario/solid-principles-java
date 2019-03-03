package com.apareciumlabs.os.solid.calculator.v7.repository;

import java.util.List;

/**
 * This interface contains the generalized read method
 * which will take an empty list of numbers as a parameter
 * and adds numbers to it and will return it back
 *
 * @author brionsilva
 * @version 1.0
 * @since 22/01/2018
 */
public interface NumberRepository {
    List<Integer> read(List<Integer> numberList);
}
