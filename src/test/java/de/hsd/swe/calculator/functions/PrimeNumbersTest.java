package de.hsd.swe.calculator.functions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 23, 1597, 28657})
    void isPrimeNumber_returnsTrueForActualPrimes(int primeNumber) {
        assertTrue(PrimeNumbers.INSTANCE.isPrimeNumber(primeNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = {-13, -1, 0, 1, 4, 6, 9, 999})
    void isPrimeNumber_returnsFalseForNonPrimeNumbers(int nonPrimeNumber) {
        assertFalse(PrimeNumbers.INSTANCE.isPrimeNumber(nonPrimeNumber));
    }
}
