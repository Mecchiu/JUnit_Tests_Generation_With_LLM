// NextSmallest.java
package scenario3;

import java.util.Collections;
import java.util.List;

class NextSmallest {

    /**
     * * You are given a list of integers.
     * Write a function next_smallest() that returns the 2nd smallest element of the list.
     * Return null if there is no such element.
     * Examples:
     * nextSmallest([1, 2, 3, 4, 5]) == 2
     * nextSmallest([5, 1, 4, 3, 2]) == 2
     * nextSmallest([]) == None
     * nextSmallest([1, 1]) == None
     *
     * > nextSmallest([1, 2, 3, 4, 5])
     * 2
     * > nextSmallest([5, 1, 4, 3, 2])
     * 2
     * > nextSmallest([])
     * null
     * > nextSmallest([1, 1])
     * null
     * > nextSmallest([1, 1, 1, 1, 0])
     * 1
     * > nextSmallest([1, 1])
     * null
     * > nextSmallest([-35, 34, 12, -45])
     * -35
     */
    public static Integer nextSmallest(List<Integer> lst) {
        if (lst == null || lst.size() < 2) {
            return null;
        }
        Collections.sort(lst);
        int smallest = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) != smallest) {
                return lst.get(i);
            }
        }
        return null;
    }
}

// NextSmallestTest.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

    @Test
    void testNextSmallestWithValidInput() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNextSmallestWithValidInput2() {
        List<Integer> lst = Arrays.asList(5, 1, 4, 3, 2);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNextSmallestWithEmptyList() {
        List<Integer> lst = Collections.emptyList();
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNextSmallestWithSingleElementList() {
        List<Integer> lst = Collections.singletonList(1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNextSmallestWithDuplicateElements() {
        List<Integer> lst = Arrays.asList(1, 1, 1, 1, 0);
        assertEquals(1, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNextSmallestWithDuplicateElements2() {
        List<Integer> lst = Arrays.asList(1, 1);
        assertNull(NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNextSmallestWithNegativeElements() {
        List<Integer> lst = Arrays.asList(-35, 34, 12, -45);
        assertEquals(-35, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNextSmallestWithNullInput() {
        assertNull(NextSmallest.nextSmallest(null));
    }

    @Test
    void testNextSmallestWithLargeList() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }

    @Test
    void testNextSmallestWithLargeList2() {
        List<Integer> lst = Arrays.asList(20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        assertEquals(2, NextSmallest.nextSmallest(lst));
    }
}