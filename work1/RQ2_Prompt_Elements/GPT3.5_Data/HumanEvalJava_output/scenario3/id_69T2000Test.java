// Search.java
package scenario3;

import java.util.*;

class Search {

    /**
     * You are given a non-empty list of positive integers. Return the greatest integer that is greater than
     * zero, and has a frequency greater than or equal to the value of the integer itself.
     * The frequency of an integer is the number of times it appears in the list.
     * If no such a value exist, return -1.
     * Examples:
     * search([4, 1, 2, 2, 3, 1]) == 2
     * search([1, 2, 2, 3, 3, 3, 4, 4, 4]) == 3
     * search([5, 5, 4, 4, 4]) == -1
     *
     * > search([5, 5, 5, 5, 1])
     * 1
     * > search([4, 1, 4, 1, 4, 4])
     * 4
     * > search([3, 3])
     * -1
     * > search([8, 8, 8, 8, 8, 8, 8, 8])
     * 8
     * > search([2, 3, 3, 2, 2])
     * 2
     * > search([2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1])
     * 1
     * > search([3, 2, 8, 2])
     * 2
     * > search([6, 7, 1, 8, 8, 10, 5, 8, 5, 3, 10])
     * 1
     * > search([8, 8, 3, 6, 5, 6, 4])
     * -1
     * > search([6, 9, 6, 7, 1, 4, 7, 1, 8, 8, 9, 8, 10, 10, 8, 4, 10, 4, 10, 1, 2, 9, 5, 7, 9])
     * 1
     * > search([1, 9, 10, 1, 3])
     * 1
     * > search([6, 9, 7, 5, 8, 7, 5, 3, 7, 5, 10, 10, 3, 6, 10, 2, 8, 6, 5, 4, 9, 5, 3, 10])
     * 5
     * > search([1])
     * 1
     * > search([8, 8, 10, 6, 4, 3, 5, 8, 2, 4, 2, 8, 4, 6, 10, 4, 2, 1, 10, 2, 1, 1, 5])
     * 4
     * > search([2, 10, 4, 8, 2, 10, 5, 1, 2, 9, 5, 5, 6, 3, 8, 6, 4, 10])
     * 2
     * > search([1, 6, 10, 1, 6, 9, 10, 8, 6, 8, 7, 3])
     * 1
     * > search([9, 2, 4, 1, 5, 1, 5, 2, 5, 7, 7, 7, 3, 10, 1, 5, 4, 2, 8, 4, 1, 9, 10, 7, 10, 2, 8, 10, 9, 4])
     * 4
     * > search([2, 6, 4, 2, 8, 7, 5, 6, 4, 10, 4, 6, 3, 7, 8, 8, 3, 1, 4, 2, 2, 10, 7])
     * 4
     * > search([9, 8, 6, 10, 2, 6, 10, 2, 7, 8, 10, 3, 8, 2, 6, 2, 3, 1])
     * 2
     * > search([5, 5, 3, 9, 5, 6, 3, 2, 8, 5, 6, 10, 10, 6, 8, 4, 10, 7, 7, 10, 8])
     * -1
     * > search([10])
     * -1
     * > search([9, 7, 7, 2, 4, 7, 2, 10, 9, 7, 5, 7, 2])
     * 2
     * > search([5, 4, 10, 2, 1, 1, 10, 3, 6, 1, 8])
     * 1
     * > search([7, 9, 9, 9, 3, 4, 1, 5, 9, 1, 2, 1, 1, 10, 7, 5, 6, 7, 6, 7, 7, 6])
     * 1
     * > search([3, 10, 10, 9, 2])
     * -1
     */
    public static int search(List<Integer> lst) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : lst) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int maxNum = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (num > freq && freq > maxNum) {
                maxNum = freq;
            }
        }
        return maxNum;
    }
}

// SearchTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {
    @Test
    void testSearch1() {
        List<Integer> lst = Arrays.asList(4, 1, 2, 2, 3, 1);
        int expected = 2;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch2() {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4);
        int expected = 3;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch3() {
        List<Integer> lst = Arrays.asList(5, 5, 4, 4, 4);
        int expected = -1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch4() {
        List<Integer> lst = Arrays.asList(5, 5, 5, 5, 1);
        int expected = 1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch5() {
        List<Integer> lst = Arrays.asList(4, 1, 4, 1, 4, 4);
        int expected = 4;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch6() {
        List<Integer> lst = Arrays.asList(3, 3);
        int expected = -1;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch7() {
        List<Integer> lst = Arrays.asList(8, 8, 8, 8, 8, 8, 8, 8);
        int expected = 8;
        int actual = Search.search(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSearch8() {
        List<Integer> lst = Arrays.asList(2, 3,