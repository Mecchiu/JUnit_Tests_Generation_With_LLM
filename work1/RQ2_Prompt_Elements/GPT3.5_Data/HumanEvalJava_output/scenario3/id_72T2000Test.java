// WillItFly.java
package scenario3;

import java.util.List;

class WillItFly {

    /**
     * * Write a function that returns True if the object q will fly, and False otherwise.
     * The object q will fly if it's balanced (it is a palindromic list) and the sum of its elements is less than or equal the maximum possible weight w.
     *
     * Example:
     * willItFly([1, 2], 5) ➞ False
     * # 1+2 is less than the maximum possible weight, but it's unbalanced.
     *
     * willItFly([3, 2, 3], 1) ➞ False
     * # it's balanced, but 3+2+3 is more than the maximum possible weight.
     *
     * willItFly([3, 2, 3], 9) ➞ True
     * # 3+2+3 is less than the maximum possible weight, and it's balanced.
     *
     * willItFly([3], 5) ➞ True
     * # 3 is less than the maximum possible weight, and it's balanced.
     *
     * > willItFly([3, 2, 3], 9)
     * true
     * > willItFly([1, 2], 5)
     * false
     * > willItFly([3], 5)
     * true
     * > willItFly([3, 2, 3], 1)
     * false
     * > willItFly([1, 2, 3], 6)
     * false
     * > willItFly([5], 5)
     * true
     */
    public static Boolean willItFly(List<Integer> q, int w) {
        int sum = 0;
        for (int i = 0; i < q.size(); i++) {
            sum += q.get(i);
        }
        if (sum > w) {
            return false;
        }
        for (int i = 0; i < q.size() / 2; i++) {
            if (!q.get(i).equals(q.get(q.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}

// WillItFlyTest.java
package scenario3;

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
    void testWillItFly1() {
        List<Integer> q = Arrays.asList(3, 2, 3);
        int w = 9;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly2() {
        List<Integer> q = Arrays.asList(1, 2);
        int w = 5;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly3() {
        List<Integer> q = Arrays.asList(3);
        int w = 5;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly4() {
        List<Integer> q = Arrays.asList(3, 2, 3);
        int w = 1;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly5() {
        List<Integer> q = Arrays.asList(1, 2, 3);
        int w = 6;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly6() {
        List<Integer> q = Arrays.asList(5);
        int w = 5;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly7() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 10;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly8() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 9;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly9() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 11;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly10() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 12;
        assertTrue(WillItFly.willItFly(q, w));
    }
}