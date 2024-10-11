// MonotonicTest.java
package scenario2;

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
    void testMonotonicIncreasing() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicDecreasing() {
        List<Integer> l = Arrays.asList(5, 4, 3, 2, 1);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicEqual() {
        List<Integer> l = Arrays.asList(1, 1, 1, 1, 1);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicIncreasingAndEqual() {
        List<Integer> l = Arrays.asList(1, 1, 2, 2, 3);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicDecreasingAndEqual() {
        List<Integer> l = Arrays.asList(3, 3, 2, 2, 1);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicIncreasingAndDecreasing() {
        List<Integer> l = Arrays.asList(1, 2, 3, 2, 1);
        assertFalse(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicDecreasingAndIncreasing() {
        List<Integer> l = Arrays.asList(3, 2, 1, 2, 3);
        assertFalse(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicSingleElement() {
        List<Integer> l = Arrays.asList(1);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicTwoElementsIncreasing() {
        List<Integer> l = Arrays.asList(1, 2);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonicTwoElementsDecreasing() {
        List<Integer> l = Arrays.asList(2, 1);
        assertTrue(Monotonic.monotonic(l));
    }
}