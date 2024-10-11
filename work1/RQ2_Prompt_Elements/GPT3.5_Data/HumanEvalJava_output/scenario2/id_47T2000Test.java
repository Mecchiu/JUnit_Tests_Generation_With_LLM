// Here's the source code for the MedianTest class:

package scenario2;

import java.util.ArrayList;
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
    void testEmptyList() {
        List<Integer> l = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> Median.median(l));
    }

    @Test
    void testSingleElementList() {
        List<Integer> l = Arrays.asList(1);
        assertEquals(1, Median.median(l));
    }

    @Test
    void testOddNumberOfElements() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3, Median.median(l));
    }

    @Test
    void testEvenNumberOfElements() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        assertEquals(2.5, Median.median(l));
    }

    @Test
    void testUnsortedList() {
        List<Integer> l = Arrays.asList(5, 3, 1, 4, 2);
        assertEquals(3, Median.median(l));
    }

    @Test
    void testListWithDuplicates() {
        List<Integer> l = Arrays.asList(1, 2, 3, 3, 4);
        assertEquals(3, Median.median(l));
    }

    @Test
    void testListWithNegativeNumbers() {
        List<Integer> l = Arrays.asList(-5, -3, -1, -4, -2);
        assertEquals(-3, Median.median(l));
    }

    @Test
    void testListWithMixedNumbers() {
        List<Integer> l = Arrays.asList(-5, 3, 1, -4, 2);
        assertEquals(1, Median.median(l));
    }

    @Test
    void testListWithZero() {
        List<Integer> l = Arrays.asList(1, 2, 0, 4);
        assertEquals(1.5, Median.median(l));
    }

    @Test
    void testListWithMaxValue() {
        List<Integer> l = Arrays.asList(1, 2, Integer.MAX_VALUE, 4);
        assertEquals((2 + Integer.MAX_VALUE) / 2.0, Median.median(l));
    }
}