package com.apareciumlabs.os.solid.calculator.v7;

import com.apareciumlabs.os.solid.calculator.v7.argumentparser.ArgsParser;
import com.apareciumlabs.os.solid.calculator.v7.argumentparser.CmdLineArgsParser;
import com.apareciumlabs.os.solid.calculator.v7.repository.FileNumberRepository;
import com.apareciumlabs.os.solid.calculator.v7.repository.NumberRepository;
import com.apareciumlabs.os.solid.calculator.v7.ui.CmdLineUI;
import com.apareciumlabs.os.solid.calculator.v7.ui.UI;

/**
 * Copyright (c) 2018. Aparecium Labs.  http://www.apareciumlabs.com
 *
 * @author brionsilva
 * @version 1.0
 * @since 24/01/2018
 */
@SuppressWarnings("Duplicates")
public class CalculatorMain {

    public static void main(String[] args) {

        NumberRepository numberRepository = new FileNumberRepository();
        ArgsParser argsParser = new CmdLineArgsParser(args);
        UI ui = new CmdLineUI();

        CalculatorApp calculatorApp = new CalculatorApp(numberRepository, argsParser, ui);
        calculatorApp.run();
    }
}
