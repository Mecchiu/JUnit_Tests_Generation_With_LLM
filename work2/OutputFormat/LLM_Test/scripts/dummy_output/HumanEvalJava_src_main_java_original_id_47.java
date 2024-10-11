// MedianTest.java
package original;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains ten unit test cases for the {@link Median#median(List)} method.
*/
class MedianTest {
			// Test case 1: median of an empty list
    @Test
    void testMedianEmptyList() {
        List<Integer> l = Collections.emptyList();
        Number result = Median.median(l);
        assertEquals(null, result);
    }

    // Test case 2: median of a list with one element
    @Test
    void testMedianOneElement() {
        List<Integer> l = Collections.singletonList(5);
        Number result = Median.median(l);
        assertEquals(5, result);
    }

    // Test case 3: median of a list with two elements
    @Test
    void testMedianTwoElements() {
        List<Integer> l = List.of(6, 5);
        Number result = Median.median(l);
        assertEquals(5.5, result);
    }

    // Test case 4: median of a list with odd number of elements
    @Test
    void testMedianOddElements() {
        List<Integer> l = List.of(8, 1, 3, 9, 9, 2, 7);
        Number result = Median.median(l);
        assertEquals(7, result);
    }

    // Test case 5: median of a list with even number of elements
    @Test
    void testMedianEvenElements() {
        List<Integer> l = List.of(3, 1, 2, 4, 5);
        Number result = Median.median(l);
        assertEquals(3, result);
    }

    // Test case 6: median of a list with negative elements
    @Test
    void testMedianNegativeElements() {
        List<Integer> l = List.of(-10, 4, 6, 1000, 10, 20);
        Number result = Median.median(l);
        assertEquals(8.0, result);
    }

    // Test case 7: median of a list with duplicate elements
    @Test
    void testMedianDuplicateElements() {
        List<Integer> l = List.of(8, 1, 3, 9, 9, 2, 7);
        Number result = Median.median(l);
        assertEquals(7, result);
    }

    // Test case 8: median of a list with elements in descending order
    @Test
    void testMedianDescendingOrder() {
        List<Integer> l = List.of(5, 4, 3, 2, 1);
        Number result = Median.median(l);
        assertEquals(3, result);
    }

    // Test case 9: median of a list with elements in ascending order
    @Test
    void testMedianAscendingOrder() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        Number result = Median.median(l);
        assertEquals(3, result);
    }

    // Test case 10: median of a list with null elements
    @Test
    void testMedianNullElements() {
        List<Integer> l = List.of(1, null, 3, null, 5);
        Number result = Median.median(l);
        assertEquals(null, result);
    }
}