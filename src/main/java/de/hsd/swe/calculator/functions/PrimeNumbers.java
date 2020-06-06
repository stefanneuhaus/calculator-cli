package de.hsd.swe.calculator.functions;

public class PrimeNumbers {

    public static final PrimeNumbers INSTANCE = new PrimeNumbers();

    private PrimeNumbers() {
        // make constructor private for Singleton pattern
    }

    public boolean isPrimeNumber(int value) {
        if (value < 2) {
            return false;
        }

        // should work for now. needs to be replaced by a more efficient implementation eventually ... :-)
        for (int i = 2; i < value; i++) {
            int remainder = value % i;
            if (remainder == 0) {
                return false;
            }
        }

        return true;
    }
}
