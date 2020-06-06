package de.hsd.swe.calculator.cli;

import de.hsd.swe.calculator.CalculatorFunction;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class CommandLineUI {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    private final Scanner scanner = new Scanner(System.in);

    /**
     * Implements a read-evaluate-print loop.
     * It prints a list of available functions, reads the current function, and executes it.
     */
    public void repl() {
        while (true) {
            printMenu();
            var calculatorFunction = readFunction();
            String inputValue = readUserInputWithPrompt("Input value: ");
            calculatorFunction.executeWith(inputValue);
        }
    }


    private void printMenu() {
        System.out.println();
        String menu = Arrays.stream(CalculatorFunction.values())
                .map(function -> "(" + function.shortName + ")")
                .collect(joining(LINE_SEPARATOR));
        System.out.println(menu);
        System.out.println();
    }

    private CalculatorFunction readFunction() {
        String givenName = readUserInputWithPrompt("Enter function name: ");
        return CalculatorFunction.parseFrom(givenName);
    }

    private String readUserInputWithPrompt(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
