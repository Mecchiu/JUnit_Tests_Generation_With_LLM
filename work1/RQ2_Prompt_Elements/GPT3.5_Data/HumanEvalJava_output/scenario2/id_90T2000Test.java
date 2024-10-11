// NextSmallestTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link NextSmallest}.
 * It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
 */
class NextSmallestTest {

    @Test
    void testEmptyList() {
        List<Object> lst = Arrays.asList();
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testSingleElementList() {
        List<Object> lst = Arrays.asList(1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testTwoElementList() {
        List<Object> lst = Arrays.asList(2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testThreeElementList() {
        List<Object> lst = Arrays.asList(3, 2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testFourElementList() {
        List<Object> lst = Arrays.asList(4, 3, 2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testFiveElementList() {
        List<Object> lst = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testDuplicateElements() {
        List<Object> lst = Arrays.asList(5, 4, 3, 2, 1, 1, 2, 3, 4, 5);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNegativeElements() {
        List<Object> lst = Arrays.asList(-5, -4, -3, -2, -1);
        assertEquals(-4, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testMixedElements() {
        List<Object> lst = Arrays.asList(5, -4, 3, -2, 1);
        assertEquals(-2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testAllEqualElements() {
        List<Object> lst = Arrays.asList(1, 1, 1, 1, 1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNullElements() {
        List<Object> lst = Arrays.asList(null, 1, 2, null, 3);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }
}