// WillItFlyTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
			// Test case 1: q is null
    @Test
    void testWillItFly1() {
        List<Integer> q = null;
        int w = 10;
        Boolean result = WillItFly.willItFly(q, w);
        assertFalse(result);
    }

    // Test case 2: q is empty
    @Test
    void testWillItFly2() {
        List<Integer> q = List.of();
        int w = 10;
        Boolean result = WillItFly.willItFly(q, w);
        assertFalse(result);
    }

    // Test case 3: q is not balanced
    @Test
    void testWillItFly3() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 10;
        Boolean result = WillItFly.willItFly(q, w);
        assertFalse(result);
    }

    // Test case 4: q is balanced and sum of elements is greater than w
    @Test
    void testWillItFly4() {
        List<Integer> q = List.of(1, 2, 3, 2, 1);
        int w = 10;
        Boolean result = WillItFly.willItFly(q, w);
        assertFalse(result);
    }

    // Test case 5: q is balanced and sum of elements is equal to w
    @Test
    void testWillItFly5() {
        List<Integer> q = List.of(1, 2, 3, 2, 1);
        int w = 9;
        Boolean result = WillItFly.willItFly(q, w);
        assertTrue(result);
    }

    // Test case 6: q is balanced and sum of elements is less than w
    @Test
    void testWillItFly6() {
        List<Integer> q = List.of(1, 2, 3, 2, 1);
        int w = 11;
        Boolean result = WillItFly.willItFly(q, w);
        assertTrue(result);
    }

    // Test case 7: q is balanced and sum of elements is equal to 0
    @Test
    void testWillItFly7() {
        List<Integer> q = List.of(0, 0, 0, 0, 0);
        int w = 0;
        Boolean result = WillItFly.willItFly(q, w);
        assertTrue(result);
    }

    // Test case 8: q is balanced and sum of elements is equal to w
    @Test
    void testWillItFly8() {
        List<Integer> q = List.of(1, 2, 3, 2, 1);
        int w = 9;
        Boolean result = WillItFly.willItFly(q, w);
        assertTrue(result);
    }

    // Test case 9: q is balanced and sum of elements is less than w
    @Test
    void testWillItFly9() {
        List<Integer> q = List.of(1, 2, 3, 2, 1);
        int w = 11;
        Boolean result = WillItFly.willItFly(q, w);
        assertTrue(result);
    }

    // Test case 10: q is balanced and sum of elements is greater than w
    @Test
    void testWillItFly10() {
        List<Integer> q = List.of(1, 2, 3, 2, 1);
        int w = 10;
        Boolean result = WillItFly.willItFly(q, w);
        assertFalse(result);
    }
}