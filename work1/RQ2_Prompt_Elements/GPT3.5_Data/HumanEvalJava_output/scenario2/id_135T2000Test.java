// CanArrangeTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CanArrange}.
 * It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
 */
class CanArrangeTest {

    @Test
    void testCanArrangeWithNullList() {
        List<Object> arr = null;
        assertThrows(NullPointerException.class, () -> CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithEmptyList() {
        List<Object> arr = Arrays.asList();
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithOneElementList() {
        List<Object> arr = Arrays.asList(1);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithIncreasingList() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithDecreasingList() {
        List<Object> arr = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(0, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithRandomList() {
        List<Object> arr = Arrays.asList(1, 3, 2, 5, 4);
        assertEquals(2, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithMixedList() {
        List<Object> arr = Arrays.asList(1, "a", 2, "b", 3);
        assertEquals(2, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithMixedList2() {
        List<Object> arr = Arrays.asList("a", 1, "b", 2, "c");
        assertEquals(3, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithMixedList3() {
        List<Object> arr = Arrays.asList("a", "b", "c", 1, 2, 3);
        assertEquals(3, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrangeWithMixedList4() {
        List<Object> arr = Arrays.asList(1, "a", "b", 2, "c", 3);
        assertEquals(3, CanArrange.canArrange(arr));
    }
}