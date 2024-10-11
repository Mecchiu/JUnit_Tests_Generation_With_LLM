// MedianTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    void testOddSizeList() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3, Median.median(l));
    }
    
    @Test
    void testEvenSizeList() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        assertEquals(2.5, Median.median(l));
    }
    
    @Test
    void testUnsortedList() {
        List<Integer> l = Arrays.asList(5, 3, 1, 4, 2);
        assertEquals(3, Median.median(l));
    }
    
    @Test
    void testNegativeNumbersList() {
        List<Integer> l = Arrays.asList(-5, -3, -1, -4, -2);
        assertEquals(-3, Median.median(l));
    }
    
    @Test
    void testMixedNumbersList() {
        List<Integer> l = Arrays.asList(-5, 3, 1, -4, 2);
        assertEquals(1, Median.median(l));
    }
    
    @Test
    void testDuplicateNumbersList() {
        List<Integer> l = Arrays.asList(1, 2, 3, 3, 4);
        assertEquals(3, Median.median(l));
    }
    
    @Test
    void testLargeList() {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            l.add(i);
        }
        assertEquals(500000.5, Median.median(l));
    }
    
    @Test
    void testNullList() {
        List<Integer> l = null;
        assertThrows(NullPointerException.class, () -> Median.median(l));
    }
}