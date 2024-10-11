// MaxElementTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
	// Test case 1: Test with an empty list
    @Test
    void testMaxElementEmptyList() {
        List<Integer> l = List.of();
        int expected = Integer.MIN_VALUE;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 2: Test with a list containing one element
    @Test
    void testMaxElementOneElement() {
        List<Integer> l = List.of(1);
        int expected = 1;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 3: Test with a list containing two elements
    @Test
    void testMaxElementTwoElements() {
        List<Integer> l = List.of(1, 2);
        int expected = 2;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 4: Test with a list containing three elements
    @Test
    void testMaxElementThreeElements() {
        List<Integer> l = List.of(1, 2, 3);
        int expected = 3;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 5: Test with a list containing four elements
    @Test
    void testMaxElementFourElements() {
        List<Integer> l = List.of(1, 2, 3, 4);
        int expected = 4;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 6: Test with a list containing five elements
    @Test
    void testMaxElementFiveElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        int expected = 5;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 7: Test with a list containing negative elements
    @Test
    void testMaxElementNegativeElements() {
        List<Integer> l = List.of(-1, -2, -3, -4, -5);
        int expected = -1;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 8: Test with a list containing duplicate elements
    @Test
    void testMaxElementDuplicateElements() {
        List<Integer> l = List.of(1, 2, 3, 3, 4, 5);
        int expected = 5;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 9: Test with a list containing large elements
    @Test
    void testMaxElementLargeElements() {
        List<Integer> l = List.of(1000, 2000, 3000, 4000, 5000);
        int expected = 5000;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }

    // Test case 10: Test with a list containing a mix of positive and negative elements
    @Test
    void testMaxElementMixElements() {
        List<Integer> l = List.of(-1, 2, -3, 4, -5);
        int expected = 4;
        int actual = MaxElement.maxElement(l);
        assertEquals(expected, actual);
    }
}