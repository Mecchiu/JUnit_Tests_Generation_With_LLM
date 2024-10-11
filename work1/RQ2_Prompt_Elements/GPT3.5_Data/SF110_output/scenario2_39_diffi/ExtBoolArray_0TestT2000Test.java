// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ExtBoolArray}.
 * It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
 */
class ExtBoolArray_0Test {

    @Test
    void testIsFalseWithAllFalseValues() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {false, false, false, false, false};
        boolean result = extBoolArray.isFalse(0, 4, werte);
        assertTrue(result);
    }

    @Test
    void testIsFalseWithAllTrueValues() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {true, true, true, true, true};
        boolean result = extBoolArray.isFalse(0, 4, werte);
        assertFalse(result);
    }

    @Test
    void testIsFalseWithMixedValues() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {false, true, false, true, false};
        boolean result = extBoolArray.isFalse(0, 4, werte);
        assertFalse(result);
    }

    @Test
    void testIsFalseWithSingleValue() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {false};
        boolean result = extBoolArray.isFalse(0, 0, werte);
        assertTrue(result);
    }

    @Test
    void testIsFalseWithInvalidRange() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {false, false, false, false, false};
        assertThrows(IllegalArgumentException.class, () -> {
            extBoolArray.isFalse(3, 1, werte);
        });
    }

    @Test
    void testIsFalseWithEmptyArray() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {};
        boolean result = extBoolArray.isFalse(0, 0, werte);
        assertTrue(result);
    }

    @Test
    void testIsFalseWithNullArray() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        assertThrows(NullPointerException.class, () -> {
            extBoolArray.isFalse(0, 0, null);
        });
    }

    @Test
    void testIsFalseWithMaxRange() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {false, false, false, false, false};
        boolean result = extBoolArray.isFalse(0, Integer.MAX_VALUE, werte);
        assertFalse(result);
    }

    @Test
    void testIsFalseWithMinRange() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {false, false, false, false, false};
        boolean result = extBoolArray.isFalse(Integer.MIN_VALUE, 4, werte);
        assertFalse(result);
    }

    @Test
    void testIsFalseWithMaxAndMinRange() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] werte = {false, false, false, false, false};
        boolean result = extBoolArray.isFalse(Integer.MIN_VALUE, Integer.MAX_VALUE, werte);
        assertFalse(result);
    }
}