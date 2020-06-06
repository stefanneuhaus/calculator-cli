package de.hsd.swe.calculator.functions;

import org.apache.commons.math3.primes.Primes;

public class PrimeNumbers {

    public static final PrimeNumbers INSTANCE = new PrimeNumbers();

    private PrimeNumbers() {
        // make constructor private for Singleton pattern
    }

    public boolean isPrimeNumber(int value) {
        return Primes.isPrime(value);
    }
}
