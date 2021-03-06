package de.hsd.swe.calculator.functions;

public class Absolute {

    public static final Absolute INSTANCE = new Absolute();

    private Absolute() {
        // make constructor private for Singleton pattern
    }

    public long absoluteValueOf(int value) {
        // TODO: replace by: long negativeValue = de.hsd.swe.MathUtils.negate(value);
        long negativeValue = -42;

        long result = value >= 0 ? value : negativeValue;
        return result;
    }
}
