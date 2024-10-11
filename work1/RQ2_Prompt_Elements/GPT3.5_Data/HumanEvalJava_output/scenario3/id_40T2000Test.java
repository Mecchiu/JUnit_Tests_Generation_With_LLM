// TriplesSumToZero.java
package scenario3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class TriplesSumToZero {

    /**
     * triplesSumToZero takes a list of integers as an input.
     * it returns True if there are three distinct elements in the list that
     * sum to zero, and False otherwise.
     *
     * > triplesSumToZero([1, 3, 5, 0])
     * false
     * > triplesSumToZero([1, 3, 5, -1])
     * false
     * > triplesSumToZero([1, 3, -2, 1])
     * true
     * > triplesSumToZero([1, 2, 3, 7])
     * false
     * > triplesSumToZero([1, 2, 5, 7])
     * false
     * > triplesSumToZero([2, 4, -5, 3, 9, 7])
     * true
     * > triplesSumToZero([1])
     * false
     * > triplesSumToZero([1, 3, 5, -100])
     * false
     * > triplesSumToZero([100, 3, 5, -100])
     * false
     */
    public static Boolean triplesSumToZero(List<Integer> l) {
        Set<Integer> set = new HashSet<>(l);
        for (int i = 0; i < l.size() - 1; i++) {
            for (int j = i + 1; j < l.size(); j++) {
                int sum = l.get(i) + l.get(j);
                if (set.contains(-sum)) {
                    return true;
                }
            }
        }
        return false;
    }
}

// TriplesSumToZeroTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
    @Test
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testSingleElementList() {
        List<Integer> l = Arrays.asList(1);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testNoTripleSumToZero() {
        List<Integer> l = Arrays.asList(1, 3, 5, 0);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testNoTripleSumToZero2() {
        List<Integer> l = Arrays.asList(1, 3, 5, -1);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testNoTripleSumToZero3() {
        List<Integer> l = Arrays.asList(1, 2, 3, 7);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testNoTripleSumToZero4() {
        List<Integer> l = Arrays.asList(1, 2, 5, 7);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testNoTripleSumToZero5() {
        List<Integer> l = Arrays.asList(1, 3, 5, -100);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testNoTripleSumToZero6() {
        List<Integer> l = Arrays.asList(100, 3, 5, -100);
        assertFalse(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testTripleSumToZero() {
        List<Integer> l = Arrays.asList(1, 3, -2, 1);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }

    @Test
    void testTripleSumToZero2() {
        List<Integer> l = Arrays.asList(2, 4, -5, 3, 9, 7);
        assertTrue(TriplesSumToZero.triplesSumToZero(l));
    }
}