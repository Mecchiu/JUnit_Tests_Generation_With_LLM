// PairsSumToZeroTest.java
package scenario1;

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

    // Test case 3: List with two elements
    @Test
    void testTwoElementsList() {
        List<Integer> l = List.of(1, 2);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 4: List with two elements summing to zero
    @Test
    void testTwoElementsSumToZero() {
        List<Integer> l = List.of(1, -1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 5: List with three elements
    @Test
    void testThreeElementsList() {
        List<Integer> l = List.of(1, 2, 3);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 6: List with three elements summing to zero
    @Test
    void testThreeElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 7: List with four elements
    @Test
    void testFourElementsList() {
        List<Integer> l = List.of(1, 2, 3, 4);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 8: List with four elements summing to zero
    @Test
    void testFourElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 2);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 9: List with five elements
    @Test
    void testFiveElementsList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    // Test case 10: List with five elements summing to zero
    @Test
    void testFiveElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 2, -2);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }
}
