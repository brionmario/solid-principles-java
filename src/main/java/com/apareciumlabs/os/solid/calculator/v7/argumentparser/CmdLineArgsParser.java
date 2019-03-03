package com.apareciumlabs.os.solid.calculator.v7.argumentparser;

/**
 * This class implements the ArgsParser class and has a
 * constructor that takes a string array of arguments which then
 * gets checked by the inherited method
 *
 * @author brionsilva
 * @version 1.0
 * @since 24/01/2018
 */
public class CmdLineArgsParser implements ArgsParser {

    private String[] args;

    public CmdLineArgsParser(String[] args) {
        this.args = args;
    }
    @Override
    public String getArgument() throws ArrayIndexOutOfBoundsException {

        if (args.length > 0) {
            return args[0];
        } else {
            throw new ArrayIndexOutOfBoundsException("Arguments can not be left blank");
        }
    }
}
