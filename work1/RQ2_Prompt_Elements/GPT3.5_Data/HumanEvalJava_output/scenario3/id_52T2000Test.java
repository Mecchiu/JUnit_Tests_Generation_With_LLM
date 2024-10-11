// BelowThreshold.java
package scenario3;

import java.util.List;

class BelowThreshold {

    /**
     * Return True if all numbers in the list l are below threshold t.
     *
     * > belowThreshold([1, 2, 4, 10], 100)
     * true
     * > belowThreshold([1, 20, 4, 10], 5)
     * false
     * > belowThreshold([1, 20, 4, 10], 21)
     * true
     * > belowThreshold([1, 20, 4, 10], 22)
     * true
     * > belowThreshold([1, 8, 4, 10], 11)
     * true
     * > belowThreshold([1, 8, 4, 10], 10)
     * false
     */
    public static Boolean belowThreshold(List<Integer> l, int t) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) >= t) {
                return false;
            }
        }
        return true;
    }
}

// BelowThresholdTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
    @Test
    void testAllNumbersBelowThreshold() {
        List<Integer> l = Arrays.asList(1, 2, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 100));
    }

    @Test
    void testSomeNumbersAboveThreshold() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        assertFalse(BelowThreshold.belowThreshold(l, 5));
    }

    @Test
    void testAllNumbersAboveThreshold() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 21));
    }

    @Test
    void testAllNumbersAboveThresholdPlusOne() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 22));
    }

    @Test
    void testSomeNumbersAboveThreshold2() {
        List<Integer> l = Arrays.asList(1, 8, 4, 10);
        assertTrue(BelowThreshold.belowThreshold(l, 11));
    }

    @Test
    void testAllNumbersEqualToThreshold() {
        List<Integer> l = Arrays.asList(1, 8, 4, 10);
        assertFalse(BelowThreshold.belowThreshold(l, 10));
    }

    @Test
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        assertTrue(BelowThreshold.belowThreshold(l, 10));
    }

    @Test
    void testSingleNumberBelowThreshold() {
        List<Integer> l = Arrays.asList(5);
        assertTrue(BelowThreshold.belowThreshold(l, 10));
    }

    @Test
    void testSingleNumberAboveThreshold() {
        List<Integer> l = Arrays.asList(15);
        assertFalse(BelowThreshold.belowThreshold(l, 10));
    }

    @Test
    void testNullList() {
        List<Integer> l = null;
        assertThrows(NullPointerException.class, () -> {
            BelowThreshold.belowThreshold(l, 10);
        });
    }
}