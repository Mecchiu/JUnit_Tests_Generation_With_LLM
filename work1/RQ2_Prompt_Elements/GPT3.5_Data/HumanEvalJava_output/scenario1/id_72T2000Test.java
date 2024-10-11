// WillItFlyTest.java
package scenario1;

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
    void testSumGreaterThanWeight() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(WillItFly.willItFly(q, 10));
    }

    @Test
    void testOddLengthPalindrome() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        assertTrue(WillItFly.willItFly(q, 10));
    }

    @Test
    void testEvenLengthPalindrome() {
        List<Integer> q = Arrays.asList(1, 2, 2, 1);
        assertTrue(WillItFly.willItFly(q, 10));
    }

    @Test
    void testOddLengthNonPalindrome() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4, 5);
        assertFalse(WillItFly.willItFly(q, 10));
    }

    @Test
    void testEvenLengthNonPalindrome() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4);
        assertFalse(WillItFly.willItFly(q, 10));
    }

    @Test
    void testAllEqual() {
        List<Integer> q = Arrays.asList(2, 2, 2, 2);
        assertTrue(WillItFly.willItFly(q, 10));
    }

    @Test
    void testAllDifferent() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4);
        assertFalse(WillItFly.willItFly(q, 10));
    }

    @Test
    void testOneElementList() {
        List<Integer> q = Arrays.asList(5);
        assertTrue(WillItFly.willItFly(q, 5));
    }

    @Test
    void testWeightEqualToSum() {
        List<Integer> q = Arrays.asList(1, 2, 3, 4);
        assertTrue(WillItFly.willItFly(q, 10));
    }
}