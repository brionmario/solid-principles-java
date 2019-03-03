package com.apareciumlabs.os.solid.calculator.v7.ui;

/**
 * Copyright (c) 2018. Aparecium Labs.  http://www.apareciumlabs.com
 *
 * @author brionsilva
 * @version 1.0
 * @since 24/01/2018
 */
public class CmdLineUI implements UI {
    @Override
    public void display(String displayMessage) {
        System.out.println(displayMessage);
    }
}
