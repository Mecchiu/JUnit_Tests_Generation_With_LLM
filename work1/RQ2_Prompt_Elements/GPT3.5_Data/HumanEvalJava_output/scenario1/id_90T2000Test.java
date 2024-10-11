// NextSmallest.java
package scenario1;

import java.util.List;

class NextSmallest {

    /**
     * Returns the next smallest integer in the given list.
     * If there is no next smallest integer, returns null.
     *
     * @param lst the list of integers
     * @return the next smallest integer or null
     */
    public static Integer nextSmallest(List<Object> lst) {
        if (lst.size() <= 1) {
            return null;
        }
        Integer smallest = (Integer) lst.get(0);
        Integer nextSmallest = null;
        for (int i = 1; i < lst.size(); i++) {
            Integer current = (Integer) lst.get(i);
            if (current < smallest) {
                nextSmallest = smallest;
                smallest = current;
            } else if (nextSmallest == null || current < nextSmallest) {
                if (current != smallest)
                    nextSmallest = current;
            }
        }
        return nextSmallest;
    }
}

// NextSmallestTest.java
package scenario1;

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
        List<Object> lst = List.of();
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testSingleElementList() {
        List<Object> lst = List.of(1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testTwoElementList() {
        List<Object> lst = List.of(2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testTwoEqualElementList() {
        List<Object> lst = List.of(1, 1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testThreeElementList() {
        List<Object> lst = List.of(3, 2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testThreeEqualElementList() {
        List<Object> lst = List.of(1, 1, 1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testThreeElementListWithDuplicates() {
        List<Object> lst = List.of(3, 2, 2);
        assertEquals(3, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testFourElementList() {
        List<Object> lst = List.of(4, 3, 2, 1);
        assertEquals(3, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testFourEqualElementList() {
        List<Object> lst = List.of(1, 1, 1, 1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testFourElementListWithDuplicates() {
        List<Object> lst = List.of(4, 3, 2, 2);
        assertEquals(3, NextSmallest.nextSmallest(lst));
    }
}