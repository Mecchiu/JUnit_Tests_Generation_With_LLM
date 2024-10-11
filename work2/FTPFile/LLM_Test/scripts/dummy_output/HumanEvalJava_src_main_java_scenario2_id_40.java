// TriplesSumToZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
			// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Integer> l = List.of();
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 2: List with one element
    @Test
    void testOneElementList() {
        List<Integer> l = List.of(1);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 3: List with two elements
    @Test
    void testTwoElementsList() {
        List<Integer> l = List.of(1, 2);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 4: List with three elements that sum to zero
    @Test
    void testThreeElementsSumToZero() {
        List<Integer> l = List.of(-1, 0, 1);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 5: List with three elements that do not sum to zero
    @Test
    void testThreeElementsDoNotSumToZero() {
        List<Integer> l = List.of(-1, 0, 2);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 6: List with four elements that sum to zero
    @Test
    void testFourElementsSumToZero() {
        List<Integer> l = List.of(-1, 0, 1, 2);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 7: List with four elements that do not sum to zero
    @Test
    void testFourElementsDoNotSumToZero() {
        List<Integer> l = List.of(-1, 0, 1, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 8: List with five elements that sum to zero
    @Test
    void testFiveElementsSumToZero() {
        List<Integer> l = List.of(-1, 0, 1, 2, 3);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 9: List with five elements that do not sum to zero
    @Test
    void testFiveElementsDoNotSumToZero() {
        List<Integer> l = List.of(-1, 0, 1, 2, 4);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 10: List with six elements that sum to zero
    @Test
    void testSixElementsSumToZero() {
        List<Integer> l = List.of(-1, 0, 1, 2, 3, 4);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }
}