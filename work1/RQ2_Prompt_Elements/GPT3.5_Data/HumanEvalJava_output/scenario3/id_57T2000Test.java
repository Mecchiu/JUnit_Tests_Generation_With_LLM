// Monotonic.java
package scenario3;

import java.util.List;

class Monotonic {

    /**
     * Return True is list elements are monotonically increasing or decreasing.
     *
     * > monotonic([1, 2, 4, 10])
     * true
     * > monotonic([1, 2, 4, 20])
     * true
     * > monotonic([1, 20, 4, 10])
     * false
     * > monotonic([4, 1, 0, -10])
     * true
     * > monotonic([4, 1, 1, 0])
     * true
     * > monotonic([1, 2, 3, 2, 5, 60])
     * false
     * > monotonic([1, 2, 3, 4, 5, 60])
     * true
     * > monotonic([9, 9, 9, 9])
     * true
     */
    public static Boolean monotonic(List<Integer> l) {
        if (l.size() <= 1) {
            return true;
        }
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) > l.get(i - 1)) {
                decreasing = false;
            } else if (l.get(i) < l.get(i - 1)) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}

// MonotonicTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
    @Test
    void testMonotonic1() {
        List<Integer> l = Arrays.asList(1, 2, 4, 10);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic2() {
        List<Integer> l = Arrays.asList(1, 2, 4, 20);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic3() {
        List<Integer> l = Arrays.asList(1, 20, 4, 10);
        assertFalse(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic4() {
        List<Integer> l = Arrays.asList(4, 1, 0, -10);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic5() {
        List<Integer> l = Arrays.asList(4, 1, 1, 0);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic6() {
        List<Integer> l = Arrays.asList(1, 2, 3, 2, 5, 60);
        assertFalse(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic7() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 60);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic8() {
        List<Integer> l = Arrays.asList(9, 9, 9, 9);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic9() {
        List<Integer> l = Arrays.asList(1);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic10() {
        List<Integer> l = Arrays.asList();
        assertTrue(Monotonic.monotonic(l));
    }
}