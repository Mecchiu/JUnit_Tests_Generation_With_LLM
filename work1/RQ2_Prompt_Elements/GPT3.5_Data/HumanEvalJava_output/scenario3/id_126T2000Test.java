// IsSorted.java
package scenario3;

import java.util.List;

class IsSorted {

    /**
     * * Given a list of numbers, return whether or not they are sorted
     * in ascending order. If list has more than 1 duplicate of the same
     * number, return False. Assume no negative numbers and only integers.
     *
     * Examples
     * isSorted([5]) ➞ True
     * isSorted([1, 2, 3, 4, 5]) ➞ True
     * isSorted([1, 3, 2, 4, 5]) ➞ False
     * isSorted([1, 2, 3, 4, 5, 6]) ➞ True
     * isSorted([1, 2, 3, 4, 5, 6, 7]) ➞ True
     * isSorted([1, 3, 2, 4, 5, 6, 7]) ➞ False
     * isSorted([1, 2, 2, 3, 3, 4]) ➞ True
     * isSorted([1, 2, 2, 2, 3, 4]) ➞ False
     *
     * > isSorted([5])
     * true
     * > isSorted([1, 2, 3, 4, 5])
     * true
     * > isSorted([1, 3, 2, 4, 5])
     * false
     * > isSorted([1, 2, 3, 4, 5, 6])
     * true
     * > isSorted([1, 2, 3, 4, 5, 6, 7])
     * true
     * > isSorted([1, 3, 2, 4, 5, 6, 7])
     * false
     * > isSorted([])
     * true
     * > isSorted([1])
     * true
     * > isSorted([3, 2, 1])
     * false
     * > isSorted([1, 2, 2, 2, 3, 4])
     * false
     * > isSorted([1, 2, 3, 3, 3, 4])
     * false
     * > isSorted([1, 2, 2, 3, 3, 4])
     * true
     * > isSorted([1, 2, 3, 4])
     * true
     */
    public static Boolean isSorted(List<Integer> lst) {
        if (lst.size() <= 1) {
            return true;
        }
        int prev = lst.get(0);
        boolean hasDuplicate = false;
        for (int i = 1; i < lst.size(); i++) {
            int curr = lst.get(i);
            if (curr < prev) {
                return false;
            } else if (curr == prev) {
                if (hasDuplicate) {
                    return false;
                } else {
                    hasDuplicate = true;
                }
            } else {
                hasDuplicate = false;
            }
            prev = curr;
        }
        return true;
    }
}

// IsSortedTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    @Test
    void testEmptyList() {
        List<Integer> lst = Arrays.asList();
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSingleElementList() {
        List<Integer> lst = Arrays.asList(5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedAscendingList() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testUnsortedList() {
        List<Integer> lst = Arrays.asList(1, 3, 2, 4, 5);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithDuplicate() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 4);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testUnsortedListWithDuplicate() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 2, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithMultipleDuplicates() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testUnsortedListWithMultipleDuplicates() {
        List<Integer> lst = Arrays.asList(1, 3, 2, 4, 5, 6, 7);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testSortedListWithMultipleDuplicatesAndSingleDuplicate() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 4, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testDescendingList() {
        List<Integer> lst = Arrays.asList(3, 2, 1);
        assertFalse(IsSorted.isSorted(lst));
    }
}