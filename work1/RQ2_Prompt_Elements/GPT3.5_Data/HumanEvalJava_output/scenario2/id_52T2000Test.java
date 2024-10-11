// BelowThresholdTest.java
package scenario2;

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
    void testEmptyList() {
        List<Integer> l = Arrays.asList();
        assertTrue(BelowThreshold.belowThreshold(l, 5));
    }
    
    @Test
    void testAllNumbersBelowThreshold() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        assertTrue(BelowThreshold.belowThreshold(l, 5));
    }
    
    @Test
    void testAllNumbersAboveThreshold() {
        List<Integer> l = Arrays.asList(6, 7, 8, 9);
        assertFalse(BelowThreshold.belowThreshold(l, 5));
    }
    
    @Test
    void testOneNumberEqualToThreshold() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(BelowThreshold.belowThreshold(l, 5));
    }
    
    @Test
    void testOneNumberAboveThreshold() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 6);
        assertFalse(BelowThreshold.belowThreshold(l, 5));
    }
    
    @Test
    void testOneNumberBelowThreshold() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 4);
        assertTrue(BelowThreshold.belowThreshold(l, 5));
    }
    
    @Test
    void testNegativeNumbers() {
        List<Integer> l = Arrays.asList(-4, -3, -2, -1);
        assertTrue(BelowThreshold.belowThreshold(l, 0));
    }
    
    @Test
    void testMixedNumbers() {
        List<Integer> l = Arrays.asList(-4, 0, 2, 4);
        assertTrue(BelowThreshold.belowThreshold(l, 5));
    }
    
    @Test
    void testLargeNumbers() {
        List<Integer> l = Arrays.asList(1000000, 2000000, 3000000);
        assertTrue(BelowThreshold.belowThreshold(l, 5000000));
    }
    
    @Test
    void testRepeatedNumbers() {
        List<Integer> l = Arrays.asList(1, 1, 1, 1);
        assertTrue(BelowThreshold.belowThreshold(l, 2));
    }
}