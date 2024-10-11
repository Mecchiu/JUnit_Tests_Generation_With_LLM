// WillItFlyTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
			// Test case 1
    @Test
    void testWillItFly1() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 10;
        Boolean expResult = true;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testWillItFly2() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 5;
        Boolean expResult = false;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testWillItFly3() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 15;
        Boolean expResult = false;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testWillItFly4() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 0;
        Boolean expResult = true;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testWillItFly5() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 6;
        Boolean expResult = false;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testWillItFly6() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 11;
        Boolean expResult = false;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testWillItFly7() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 16;
        Boolean expResult = false;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testWillItFly8() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 1;
        Boolean expResult = true;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testWillItFly9() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 2;
        Boolean expResult = false;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testWillItFly10() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 3;
        Boolean expResult = false;
        Boolean result = WillItFly.willItFly(q, w);
        assertEquals(expResult, result);
    }
}