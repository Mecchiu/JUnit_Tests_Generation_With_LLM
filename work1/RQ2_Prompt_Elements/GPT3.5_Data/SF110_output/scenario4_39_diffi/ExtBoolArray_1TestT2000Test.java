// Source code for ExtBoolArray_1Test.java

package de.beiri22.stringincrementor.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ExtBoolArray}.
 * It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
 */
class ExtBoolArray_1Test {

    /**
     * Test case for an empty array.
     */
    @Test
    void testEmptyArray() {
        ExtBoolArray arr = new ExtBoolArray(0);
        assertEquals(0, arr.left());
    }

    /**
     * Test case for an array with all true values.
     */
    @Test
    void testAllTrue() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(0, 4);
        assertEquals(0, arr.left());
    }

    /**
     * Test case for an array with all false values.
     */
    @Test
    void testAllFalse() {
        ExtBoolArray arr = new ExtBoolArray(5);
        assertEquals(5, arr.left());
    }

    /**
     * Test case for an array with alternating true and false values.
     */
    @Test
    void testAlternating() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(0, 2);
        arr.setTrue(3, 4);
        assertEquals(1, arr.left());
    }

    /**
     * Test case for an array with a single true value.
     */
    @Test
    void testSingleTrue() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(2, 2);
        assertEquals(4, arr.left());
    }

    /**
     * Test case for an array with a single false value.
     */
    @Test
    void testSingleFalse() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(2, 2);
        assertEquals(4, arr.left());
    }

    /**
     * Test case for an array with a range of true values.
     */
    @Test
    void testRangeTrue() {
        ExtBoolArray arr = new ExtBoolArray(10);
        arr.setTrue(2, 6);
        assertEquals(4, arr.left());
    }

    /**
     * Test case for an array with a range of false values.
     */
    @Test
    void testRangeFalse() {
        ExtBoolArray arr = new ExtBoolArray(10);
        arr.setTrue(2, 6);
        assertEquals(6, arr.left());
    }

    /**
     * Test case for an array with all true values except for one false value.
     */
    @Test
    void testAlmostAllTrue() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(0, 4);
        arr.setTrue(2, 2);
        assertEquals(1, arr.left());
    }

    /**
     * Test case for an array with all false values except for one true value.
     */
    @Test
    void testAlmostAllFalse() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(2, 2);
        arr.setTrue(0, 1);
        arr.setTrue(3, 4);
        assertEquals(1, arr.left());
    }

    /**
     * Test case for an array with all true values except for one false value at the end.
     */
    @Test
    void testAlmostAllTrueEnd() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(0, 3);
        arr.setTrue(4, 4);
        assertEquals(0, arr.left());
    }
}