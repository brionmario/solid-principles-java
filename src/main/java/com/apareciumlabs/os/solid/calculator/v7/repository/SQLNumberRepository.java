package com.apareciumlabs.os.solid.calculator.v7.repository;

import java.util.List;

/**
 * This class implements the NumberRepository interface. It contains
 * the logic to retrieve a set of numbers from a SQL database,
 * adding the numbers inside it to a List and returning.
 *
 * @author brionsilva
 * @version 1.0
 * @since 22/01/2018
 */
public class SQLNumberRepository implements NumberRepository {

    /**
     * TODO: Connect the SQL database
     * @param numberList
     * @return
     */
    @Override
    public List<Integer> read(List<Integer> numberList) {
        return null;
    }
}
