// StrangeSortList.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StrangeSortList {

    /**
     * * Given list of integers, return list in strange order.
     * Strange sorting, is when you start with the minimum value,
     * then maximum of the remaining integers, then minimum and so on.
     *
     * Examples:
     * strange_sort_list([1, 2, 3, 4]) == [1, 4, 2, 3]
     * strange_sort_list([5, 5, 5, 5]) == [5, 5, 5, 5]
     * strange_sort_list([]) == []
     *
     * > strangeSortList([1, 2, 3, 4])
     * [1, 4, 2, 3]
     * > strangeSortList([5, 6, 7, 8, 9])
     * [5, 9, 6, 8, 7]
     * > strangeSortList([1, 2, 3, 4, 5])
     * [1, 5, 2, 4, 3]
     * > strangeSortList([5, 6, 7, 8, 9, 1])
     * [1, 9, 5, 8, 6, 7]
     * > strangeSortList([5, 5, 5, 5])
     * [5, 5, 5, 5]
     * > strangeSortList([])
     * []
     * > strangeSortList([1, 2, 3, 4, 5, 6, 7, 8])
     * [1, 8, 2, 7, 3, 6, 4, 5]
     * > strangeSortList([0, 2, 2, 2, 5, 5, -5, -5])
     * [-5, 5, -5, 5, 0, 2, 2, 2]
     * > strangeSortList([111111])
     * [111111]
     */
    public static List<Integer> strangeSortList(List<Integer> lst) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(lst);
        int left = 0;
        int right = lst.size() - 1;
        while (left <= right) {
            if (left == right) {
                result.add(lst.get(left));
                break;
            }
            result.add(lst.get(left));
            result.add(lst.get(right));
            left++;
            right--;
        }
        return result;
    }
}

// StrangeSortListTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {

    @Test
    void testEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testSingleElementList() {
        List<Integer> input = Arrays.asList(111111);
        List<Integer> expected = Arrays.asList(111111);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testAllEqualElementsList() {
        List<Integer> input = Arrays.asList(5, 5, 5, 5);
        List<Integer> expected = Arrays.asList(5, 5, 5, 5);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testOddNumberOfElementsList() {
        List<Integer> input = Arrays.asList(5, 6, 7, 8, 9, 1);
        List<Integer> expected = Arrays.asList(1, 9, 5, 8, 6, 7);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testEvenNumberOfElementsList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> expected = Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testPositiveAndNegativeElementsList() {
        List<Integer> input = Arrays.asList(0, 2, 2, 2, 5, 5, -5, -5);
        List<Integer> expected = Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testAlreadySortedAscendingList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 4, 2, 3);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testAlreadySortedDescendingList() {
        List<Integer> input = Arrays.asList(4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 4, 2, 3);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testRandomOrderedList() {
        List<Integer> input = Arrays.asList(5, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(5, 9, 6, 8, 7);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }

    @Test
    void testListWithDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 5, 1, 5, 2, 4, 2, 4, 3, 3);
        assertEquals(expected, StrangeSortList.strangeSortList(input));
    }
}