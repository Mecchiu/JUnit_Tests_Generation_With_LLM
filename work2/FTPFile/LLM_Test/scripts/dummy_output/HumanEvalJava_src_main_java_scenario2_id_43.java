// PairsSumToZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {
			// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Integer> l = List.of();
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 2: List with one element
    @Test
    void testOneElementList() {
        List<Integer> l = List.of(1);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 3: List with two elements that sum to zero
    @Test
    void testTwoElementsSumToZero() {
        List<Integer> l = List.of(1, -1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 4: List with two elements that do not sum to zero
    @Test
    void testTwoElementsDoNotSumToZero() {
        List<Integer> l = List.of(1, 2);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 5: List with more than two elements and two elements that sum to zero
    @Test
    void testMoreThanTwoElementsAndTwoElementsSumToZero() {
        List<Integer> l = List.of(1, 2, -2, 3, -3);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 6: List with more than two elements and two elements that do not sum to zero
    @Test
    void testMoreThanTwoElementsAndTwoElementsDoNotSumToZero() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 7: List with more than two elements and no elements that sum to zero
    @Test
    void testMoreThanTwoElementsAndNoElementsSumToZero() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 8: List with more than two elements and all elements sum to zero
    @Test
    void testMoreThanTwoElementsAndAllElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 2, -2, 3, -3);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 9: List with more than two elements and two elements that sum to zero multiple times
    @Test
    void testMoreThanTwoElementsAndTwoElementsSumToZeroMultipleTimes() {
        List<Integer> l = List.of(1, 2, -2, 3, -3, 4, -4);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 10: List with more than two elements and two elements that sum to zero multiple times
    @Test
    void testMoreThanTwoElementsAndTwoElementsDoNotSumToZeroMultipleTimes() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
}