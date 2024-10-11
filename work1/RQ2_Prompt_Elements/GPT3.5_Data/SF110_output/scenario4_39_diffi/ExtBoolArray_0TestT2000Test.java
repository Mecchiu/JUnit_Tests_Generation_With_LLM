// Here's an example of how you could test the ExtBoolArray class using JUnit 5:

package de.beiri22.stringincrementor.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtBoolArrayTest {

    @Test
    void testSetTrue() {
        ExtBoolArray arr = new ExtBoolArray(5);
        arr.setTrue(1, 3);
        assertTrue(arr.isFalse(0, 1));
        assertFalse(arr.isFalse(1, 3));
        assertTrue(arr.isFalse(3, 5));
    }

    @Test
    void testIsFalse() {
        ExtBoolArray arr = new ExtBoolArray(5);
        assertTrue(arr.isFalse(0, 5));
        arr.setTrue(1, 3);
        assertTrue(arr.isFalse(0, 1));
        assertFalse(arr.isFalse(1, 3));
        assertTrue(arr.isFalse(3, 5));
        arr.setTrue(0, 5);
        assertFalse(arr.isFalse(0, 5));
    }

    @Test
    void testLeft() {
        ExtBoolArray arr = new ExtBoolArray(5);
        assertEquals(5, arr.left());
        arr.setTrue(1, 3);
        assertEquals(3, arr.left());
        arr.setTrue(0, 5);
        assertEquals(0, arr.left());
    }
}