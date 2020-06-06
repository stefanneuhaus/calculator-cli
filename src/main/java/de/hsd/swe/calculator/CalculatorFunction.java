package de.hsd.swe.calculator;

import de.hsd.swe.calculator.functions.Absolute;
import de.hsd.swe.calculator.functions.PrimeNumbers;

import java.util.function.Consumer;
import java.util.function.Function;

public enum CalculatorFunction {

    ABSOLUTE_VALUE("abs", value -> parseValueToIntAndPrintResult(Absolute.INSTANCE::absoluteValueOf, value)),
    IS_PRIME("prime", value -> parseValueToIntAndPrintResult(PrimeNumbers.INSTANCE::isPrimeNumber, value));

    public final String shortName;
    private final Consumer<String> implementation;

    CalculatorFunction(String shortName, Consumer<String> implementation) {
        this.shortName = shortName;
        this.implementation = implementation;
    }

    public void executeWith(String inputValue) {
        implementation.accept(inputValue);
    }

    public static CalculatorFunction parseFrom(String givenShortName) {
        for (CalculatorFunction function : CalculatorFunction.values()) {
            if (function.shortName.equals(givenShortName)) {
                return function;
            }
        }

        throw new IllegalArgumentException(("unknown function name '" + givenShortName + "'"));
    }

    private static void parseValueToIntAndPrintResult(Function<Integer, ?> implementation, String value) {
        int intValue = Integer.parseInt(value);
        Object result = implementation.apply(intValue);
        System.out.println(result);
    }
}
