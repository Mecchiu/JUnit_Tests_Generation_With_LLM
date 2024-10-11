// PairsSumToZero.java
package scenario3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PairsSumToZero {

    /**
     * * pairs_sum_to_zero takes a list of integers as an input.
     * it returns true if there are two distinct elements in the list that
     * sum to zero, and false otherwise.
     *
     * > pairsSumToZero([1, 3, 5, 0])
     * false
     * > pairsSumToZero([1, 3, -2, 1])
     * false
     * > pairsSumToZero([1, 2, 3, 7])
     * false
     * > pairsSumToZero([2, 4, -5, 3, 5, 7])
     * true
     * > pairsSumToZero([1])
     * false
     * > pairsSumToZero([1, 3, 5, 0])
     * false
     * > pairsSumToZero([1, 3, -2, 1])
     * false
     * > pairsSumToZero([1, 2, 3, 7])
     * false
     * > pairsSumToZero([2, 4, -5, 3, 5, 7])
     * true
     * > pairsSumToZero([1])
     * false
     * > pairsSumToZero([-3, 9, -1, 3, 2, 30])
     * true
     * > pairsSumToZero([-3, 9, -1, 3, 2, 31])
     * true
     * > pairsSumToZero([-3, 9, -1, 4, 2, 30])
     * false
     * > pairsSumToZero([-3, 9, -1, 4, 2, 31])
     * false
     */
    public static Boolean pairsSumToZero(List<Integer> l) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : l) {
            if (set.contains(-i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}

// PairsSumToZeroTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

    @Test
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testSingleElementList() {
        List<Integer> l = Arrays.asList(1);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testNoPairsSumToZero() {
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testOnePairSumToZero() {
        List<Integer> l = Arrays.asList(1, 3, -2, -1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testMultiplePairsSumToZero() {
        List<Integer> l = Arrays.asList(2, 4, -5, 3, 5, -7);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testAllElementsAreZero() {
        List<Integer> l = Arrays.asList(0, 0, 0, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testAllElementsArePositive() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testAllElementsAreNegative() {
        List<Integer> l = Arrays.asList(-1, -2, -3, -4);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testMixedElements() {
        List<Integer> l = Arrays.asList(-3, 9, -1, 3, 2, 30);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    @Test
    void testMixedElements2() {
        List<Integer> l = Arrays.asList(-3, 9, -1, 4, 2, 30);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
}