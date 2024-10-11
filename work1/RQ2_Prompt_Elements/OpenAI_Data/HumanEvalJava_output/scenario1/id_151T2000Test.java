// DoubleTheDifferenceTest.java
package scenario1;

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
    void testDoubleTheDifference_EmptyList() {
        List<Object> lst = List.of();
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 2: List with one element of type Integer
    @Test
    void testDoubleTheDifference_ListWithOneInteger() {
        List<Object> lst = List.of(5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(25, result);
    }

    // Test case 3: List with one element of type String
    @Test
    void testDoubleTheDifference_ListWithOneString() {
        List<Object> lst = List.of("Hello");
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 4: List with two elements of type Integer
    @Test
    void testDoubleTheDifference_ListWithTwoIntegers() {
        List<Object> lst = List.of(5, 10);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(125, result);
    }

    // Test case 5: List with two elements of type String
    @Test
    void testDoubleTheDifference_ListWithTwoStrings() {
        List<Object> lst = List.of("Hello", "World");
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 6: List with three elements of type Integer
    @Test
    void testDoubleTheDifference_ListWithThreeIntegers() {
        List<Object> lst = List.of(5, 10, 15);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(425, result);
    }

    // Test case 7: List with three elements of type String
    @Test
    void testDoubleTheDifference_ListWithThreeStrings() {
        List<Object> lst = List.of("Hello", "World", "!");
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 8: List with four elements of type Integer
    @Test
    void testDoubleTheDifference_ListWithFourIntegers() {
        List<Object> lst = List.of(5, 10, 15, 20);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(925, result);
    }

    // Test case 9: List with four elements of type String
    @Test
    void testDoubleTheDifference_ListWithFourStrings() {
        List<Object> lst = List.of("Hello", "World", "!", "!");
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }

    // Test case 10: List with five elements of type Integer
    @Test
    void testDoubleTheDifference_ListWithFiveIntegers() {
        List<Object> lst = List.of(5, 10, 15, 20, 25);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(1625, result);
    }
}
