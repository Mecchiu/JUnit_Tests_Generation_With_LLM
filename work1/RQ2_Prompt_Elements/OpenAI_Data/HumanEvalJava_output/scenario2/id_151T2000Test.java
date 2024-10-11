// DoubleTheDifferenceTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
	// Test case 1: Empty list
    @Test
    void testDoubleTheDifferenceEmptyList() {
        List<Object> lst = List.of();
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 2: List with one positive integer
    @Test
    void testDoubleTheDifferenceOnePositiveInteger() {
        List<Object> lst = List.of(5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(25, result);
    }

    // Test case 3: List with one negative integer
    @Test
    void testDoubleTheDifferenceOneNegativeInteger() {
        List<Object> lst = List.of(-5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 4: List with one zero
    @Test
    void testDoubleTheDifferenceOneZero() {
        List<Object> lst = List.of(0);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 5: List with two positive integers
    @Test
    void testDoubleTheDifferenceTwoPositiveIntegers() {
        List<Object> lst = List.of(5, 7);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(74, result);
    }

    // Test case 6: List with two negative integers
    @Test
    void testDoubleTheDifferenceTwoNegativeIntegers() {
        List<Object> lst = List.of(-5, -7);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 7: List with two zeros
    @Test
    void testDoubleTheDifferenceTwoZeros() {
        List<Object> lst = List.of(0, 0);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 8: List with one positive and one negative integer
    @Test
    void testDoubleTheDifferenceOnePositiveAndOneNegativeInteger() {
        List<Object> lst = List.of(5, -7);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(25, result);
    }

    // Test case 9: List with one positive integer and one zero
    @Test
    void testDoubleTheDifferenceOnePositiveIntegerAndOneZero() {
        List<Object> lst = List.of(5, 0);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(25, result);
    }

    // Test case 10: List with one negative integer and one zero
    @Test
    void testDoubleTheDifferenceOneNegativeIntegerAndOneZero() {
        List<Object> lst = List.of(-5, 0);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
}
