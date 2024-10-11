// MonotonicTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
			// Test case 1: Empty list
    @Test
    void testMonotonic1() {
        List<Integer> l = List.of();
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 2: List with one element
    @Test
    void testMonotonic2() {
        List<Integer> l = List.of(1);
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 3: List with two elements
    @Test
    void testMonotonic3() {
        List<Integer> l = List.of(1, 2);
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 4: List with three elements
    @Test
    void testMonotonic4() {
        List<Integer> l = List.of(1, 2, 3);
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 5: List with four elements
    @Test
    void testMonotonic5() {
        List<Integer> l = List.of(1, 2, 3, 4);
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 6: List with five elements
    @Test
    void testMonotonic6() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 7: List with six elements
    @Test
    void testMonotonic7() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 8: List with seven elements
    @Test
    void testMonotonic8() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 9: List with eight elements
    @Test
    void testMonotonic9() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertTrue(Monotonic.monotonic(l));
    }

    // Test case 10: List with nine elements
    @Test
    void testMonotonic10() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(Monotonic.monotonic(l));
    }
}