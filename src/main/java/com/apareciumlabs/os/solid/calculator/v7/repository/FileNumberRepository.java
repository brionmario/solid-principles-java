package com.apareciumlabs.os.solid.calculator.v7.repository;

import java.io.*;
import java.util.List;

/**
 * This class implements the NumberRepository interface. It contains
 * the logic for reading a text file, adding the numbers inside it
 * to a List and returning.
 *
 * @author brionsilva
 * @version 1.0
 * @since 22/01/2018
 */
@SuppressWarnings("Duplicates")
public class FileNumberRepository implements NumberRepository {

    @Override
    public List<Integer> read(List<Integer> numberList) {
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
