// TriplesSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
			// Test case 1: List contains three elements that sum to zero.
    @Test
    void testTriplesSumToZero1() {
        List<Integer> l = List.of(1, 2, -3);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 2: List contains three elements that do not sum to zero.
    @Test
    void testTriplesSumToZero2() {
        List<Integer> l = List.of(1, 2, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 3: List contains more than three elements that sum to zero.
    @Test
    void testTriplesSumToZero3() {
        List<Integer> l = List.of(1, 2, -3, 4, -5, 6);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 4: List contains more than three elements that do not sum to zero.
    @Test
    void testTriplesSumToZero4() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 5: List contains three elements that sum to zero, but with duplicates.
    @Test
    void testTriplesSumToZero5() {
        List<Integer> l = List.of(1, 2, -3, -3);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 6: List contains three elements that do not sum to zero, but with duplicates.
    @Test
    void testTriplesSumToZero6() {
        List<Integer> l = List.of(1, 2, 3, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 7: List contains more than three elements that sum to zero, but with duplicates.
    @Test
    void testTriplesSumToZero7() {
        List<Integer> l = List.of(1, 2, -3, 4, -5, 6, -3);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 8: List contains more than three elements that do not sum to zero, but with duplicates.
    @Test
    void testTriplesSumToZero8() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 9: List contains three elements that sum to zero, but with negative numbers.
    @Test
    void testTriplesSumToZero9() {
        List<Integer> l = List.of(-1, -2, 3);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    // Test case 10: List contains three elements that do not sum to zero, but with negative numbers.
    @Test
    void testTriplesSumToZero10() {
        List<Integer> l = List.of(-1, -2, -3);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }
}