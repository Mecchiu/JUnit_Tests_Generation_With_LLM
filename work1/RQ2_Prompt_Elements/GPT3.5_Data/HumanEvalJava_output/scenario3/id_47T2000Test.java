// Median.java
package scenario3;

import java.util.Collections;
import java.util.List;

class Median {

    /**
     * Return median of elements in the list l.
     *
     * > median([3, 1, 2, 4, 5])
     * 3
     * > median([-10, 4, 6, 1000, 10, 20])
     * 8.0
     * > median([5])
     * 5
     * > median([6, 5])
     * 5.5
     * > median([8, 1, 3, 9, 9, 2, 7])
     * 7
     */
    public static Number median(List<Integer> l) {
        Collections.sort(l);
        int size = l.size();
        if (size % 2 == 0) {
            int mid = size / 2;
            return (l.get(mid - 1) + l.get(mid)) / 2.0;
        } else {
            return l.get(size / 2);
        }
    }
}

// MedianTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {

    @Test
    void testMedianWithOddNumberOfElements() {
        List<Integer> l = Arrays.asList(3, 1, 2, 4, 5);
        assertEquals(3, Median.median(l));
    }

    @Test
    void testMedianWithEvenNumberOfElements() {
        List<Integer> l = Arrays.asList(-10, 4, 6, 1000, 10, 20);
        assertEquals(8.0, Median.median(l));
    }

    @Test
    void testMedianWithSingleElement() {
        List<Integer> l = Arrays.asList(5);
        assertEquals(5, Median.median(l));
    }

    @Test
    void testMedianWithTwoElements() {
        List<Integer> l = Arrays.asList(6, 5);
        assertEquals(5.5, Median.median(l));
    }

    @Test
    void testMedianWithRepeatedElements() {
        List<Integer> l = Arrays.asList(8, 1, 3, 9, 9, 2, 7);
        assertEquals(7, Median.median(l));
    }

    @Test
    void testMedianWithEmptyList() {
        List<Integer> l = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> Median.median(l));
    }

    @Test
    void testMedianWithNullList() {
        assertThrows(NullPointerException.class, () -> Median.median(null));
    }

    @Test
    void testMedianWithMaxIntegerValue() {
        List<Integer> l = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, Median.median(l));
    }

    @Test
    void testMedianWithMinIntegerValue() {
        List<Integer> l = Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, Median.median(l));
    }

    @Test
    void testMedianWithMaxAndMinIntegerValues() {
        List<Integer> l = Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertEquals(-0.5, Median.median(l));
    }
}