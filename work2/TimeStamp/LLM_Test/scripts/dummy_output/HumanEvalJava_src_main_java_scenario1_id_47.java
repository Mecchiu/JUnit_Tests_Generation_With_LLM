// MedianTest.java
package scenario1;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {
			// Test case 1: Test median of an empty list
    @Test
    void testMedianEmptyList() {
        List<Integer> l = Collections.emptyList();
        Number median = Median.median(l);
        assertNull(median);
    }

    // Test case 2: Test median of a list with one element
    @Test
    void testMedianOneElementList() {
        List<Integer> l = Collections.singletonList(1);
        Number median = Median.median(l);
        assertEquals(1, median);
    }

    // Test case 3: Test median of a list with two elements
    @Test
    void testMedianTwoElementsList() {
        List<Integer> l = List.of(1, 2);
        Number median = Median.median(l);
        assertEquals(1.5, median);
    }

    // Test case 4: Test median of a list with odd number of elements
    @Test
    void testMedianOddNumberOfElementsList() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        Number median = Median.median(l);
        assertEquals(3, median);
    }

    // Test case 5: Test median of a list with even number of elements
    @Test
    void testMedianEvenNumberOfElementsList() {
        List<Integer> l = List.of(1, 2, 3, 4);
        Number median = Median.median(l);
        assertEquals(2.5, median);
    }

    // Test case 6: Test median of a list with duplicate elements
    @Test
    void testMedianDuplicateElementsList() {
        List<Integer> l = List.of(1, 2, 3, 3, 4);
        Number median = Median.median(l);
        assertEquals(3, median);
    }

    // Test case 7: Test median of a list with negative elements
    @Test
    void testMedianNegativeElementsList() {
        List<Integer> l = List.of(-1, -2, -3, -4, -5);
        Number median = Median.median(l);
        assertEquals(-3, median);
    }

    // Test case 8: Test median of a list with positive and negative elements
    @Test
    void testMedianPositiveAndNegativeElementsList() {
        List<Integer> l = List.of(-1, -2, 3, 4, 5);
        Number median = Median.median(l);
        assertEquals(3, median);
    }

    // Test case 9: Test median of a list with zero elements
    @Test
    void testMedianZeroElementsList() {
        List<Integer> l = List.of(0, 0, 0, 0, 0);
        Number median = Median.median(l);
        assertEquals(0, median);
    }

    // Test case 10: Test median of a list with null elements
    @Test
    void testMedianNullElementsList() {
        List<Integer> l = List.of(null, null, null, null, null);
        Number median = Median.median(l);
        assertNull(median);
    }
}