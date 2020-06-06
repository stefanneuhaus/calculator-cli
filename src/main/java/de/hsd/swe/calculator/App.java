package de.hsd.swe.calculator;

import de.hsd.swe.calculator.cli.CommandLineUI;

public class App {

    public static void main(String[] args) {
        CommandLineUI cli = new CommandLineUI();
        cli.repl();
    }
}
