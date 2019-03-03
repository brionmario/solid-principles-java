package com.apareciumlabs.os.solid.calculator.v7;

import com.apareciumlabs.os.solid.calculator.v7.repository.NumberRepository;
import com.apareciumlabs.os.solid.calculator.v7.ui.UI;
import com.apareciumlabs.os.solid.calculator.v7.argumentparser.ArgsParser;
import com.apareciumlabs.os.solid.calculator.v7.operation.Operation;
import com.apareciumlabs.os.solid.calculator.v7.operation.OperationFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2018. Aparecium Labs.  http://www.apareciumlabs.com
 *
 * @author brionsilva
 * @version 1.0
 * @since 24/01/2018
 */
public class CalculatorApp {

    private final NumberRepository numberRepository;
    private final ArgsParser argsParser;
    private final UI ui;

    public CalculatorApp(NumberRepository numberRepository, ArgsParser argsParser, UI ui) {
        this.numberRepository = numberRepository;
        this.argsParser = argsParser;
        this.ui = ui;
    }

    void run() {
        List<Integer> numberList = new ArrayList<Integer>();
        numberList = numberRepository.read(numberList); // Assigns the list returned from the number reader method

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.gerOperation(argsParser.getArgument());

        int result = operation.calculate(numberList.get(0), numberList.get(1));

        ui.display("Result : " + result);
    }
}
