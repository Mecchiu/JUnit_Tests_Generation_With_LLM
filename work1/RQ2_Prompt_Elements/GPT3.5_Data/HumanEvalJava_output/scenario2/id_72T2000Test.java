// WillItFlyTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
    
    @Test
    void testEmptyList() {
        List<Integer> q = Arrays.asList();
        assertFalse(WillItFly.willItFly(q, 10));
    }
    
    @Test
    void testSingleElementList() {
        List<Integer> q = Arrays.asList(5);
        assertTrue(WillItFly.willItFly(q, 5));
        assertFalse(WillItFly.willItFly(q, 4));
    }
    
    @Test
    void testPalindromeList() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        assertTrue(WillItFly.willItFly(q, 15));
        assertFalse(WillItFly.willItFly(q, 10));
    }
    
    @Test
    void testNonPalindromeList() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(WillItFly.willItFly(q, 15));
    }
    
    @Test
    void testOddLengthPalindromeList() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
        assertTrue(WillItFly.willItFly(q, 20));
        assertFalse(WillItFly.willItFly(q, 15));
    }
    
    @Test
    void testEvenLengthPalindromeList() {
        List<Integer> q = Arrays.asList(1, 2, 3, 3, 2, 1);
        assertTrue(WillItFly.willItFly(q, 12));
        assertFalse(WillItFly.willItFly(q, 10));
    }
    
    @Test
    void testLargeList() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q, 20));
    }
    
    @Test
    void testSumGreaterThanWeight() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(WillItFly.willItFly(q, 10));
    }
    
    @Test
    void testSumEqualToWeight() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4);
        assertTrue(WillItFly.willItFly(q, 10));
    }
    
    @Test
    void testSumLessThanWeight() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4);
        assertTrue(WillItFly.willItFly(q, 15));
    }
}