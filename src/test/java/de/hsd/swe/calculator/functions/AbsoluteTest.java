package de.hsd.swe.calculator.functions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteTest {

    @Test
    void absoluteValueOf_worksForZero() {
        assertEquals(0, Absolute.INSTANCE.absoluteValueOf(0));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 42, Integer.MAX_VALUE})
    void absoluteValueOf_worksForPositiveValues(int positiveValue) {
        assertEquals(positiveValue, Absolute.INSTANCE.absoluteValueOf(positiveValue));
    }
}
