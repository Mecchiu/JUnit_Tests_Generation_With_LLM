// BelowZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
			// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Object> operations = List.of();
        assertFalse(BelowZero.belowZero(operations));
    }

    // Test case 2: List with one positive number
    @Test
    void testOnePositiveNumber() {
        List<Object> operations = List.of(10.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    // Test case 3: List with one negative number
    @Test
    void testOneNegativeNumber() {
        List<Object> operations = List.of(-10.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    // Test case 4: List with multiple positive numbers
    @Test
    void testMultiplePositiveNumbers() {
        List<Object> operations = List.of(10.0, 20.0, 30.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    // Test case 5: List with multiple negative numbers
    @Test
    void testMultipleNegativeNumbers() {
        List<Object> operations = List.of(-10.0, -20.0, -30.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    // Test case 6: List with both positive and negative numbers
    @Test
    void testBothPositiveAndNegativeNumbers() {
        List<Object> operations = List.of(10.0, -20.0, 30.0, -40.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    // Test case 7: List with zero
    @Test
    void testZero() {
        List<Object> operations = List.of(0.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    // Test case 8: List with multiple zeros
    @Test
    void testMultipleZeros() {
        List<Object> operations = List.of(0.0, 0.0, 0.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    // Test case 9: List with non-numeric elements
    @Test
    void testNonNumericElements() {
        List<Object> operations = List.of(10.0, "20.0", 30.0);
        assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(operations));
    }

    // Test case 10: List with null elements
    @Test
    void testNullElements() {
        List<Object> operations = List.of(10.0, null, 30.0);
        assertThrows(NullPointerException.class, () -> BelowZero.belowZero(operations));
    }
}