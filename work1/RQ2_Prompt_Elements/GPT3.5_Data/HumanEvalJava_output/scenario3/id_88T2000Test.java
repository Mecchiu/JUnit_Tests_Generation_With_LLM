// SortArray1.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortArray1 {

    /**
     * * Given an array of non-negative integers, return a copy of the given array after sorting,
     * you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
     * or sort it in descending order if the sum( first index value, last index value) is even.
     *
     * Note:
     * * don't change the given array.
     *
     * Examples:
     * * sort_array([]) => []
     * * sort_array([5]) => [5]
     * * sort_array([2, 4, 3, 0, 1, 5]) => [0, 1, 2, 3, 4, 5]
     * * sort_array([2, 4, 3, 0, 1, 5, 6]) => [6, 5, 4, 3, 2, 1, 0]
     *
     * > sortArray([])
     * []
     * > sortArray([5])
     * [5]
     * > sortArray([2, 4, 3, 0, 1, 5])
     * [0, 1, 2, 3, 4, 5]
     * > sortArray([2, 4, 3, 0, 1, 5, 6])
     * [6, 5, 4, 3, 2, 1, 0]
     * > sortArray([2, 1])
     * [1, 2]
     * > sortArray([15, 42, 87, 32, 11, 0])
     * [0, 11, 15, 32, 42, 87]
     * > sortArray([21, 14, 23, 11])
     * [23, 21, 14, 11]
     */
    public static List<Integer> sortArray(List<Integer> array) {
        List<Integer> sortedArray = new ArrayList<>(array);
        int sum = sortedArray.get(0) + sortedArray.get(sortedArray.size() - 1);
        if (sum % 2 == 0) {
            Collections.sort(sortedArray, Collections.reverseOrder());
        } else {
            Collections.sort(sortedArray);
        }
        return sortedArray;
    }
}

// SortArray1Test.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {

    @Test
    void testSortArrayEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArraySingleElementList() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expectedOutput = Arrays.asList(5);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArrayOddSum() {
        List<Integer> input = Arrays.asList(2, 4, 3, 0, 1, 5);
        List<Integer> expectedOutput = Arrays.asList(0, 1, 2, 3, 4, 5);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArrayEvenSum() {
        List<Integer> input = Arrays.asList(2, 4, 3, 0, 1, 5, 6);
        List<Integer> expectedOutput = Arrays.asList(6, 5, 4, 3, 2, 1, 0);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArrayTwoElements() {
        List<Integer> input = Arrays.asList(2, 1);
        List<Integer> expectedOutput = Arrays.asList(1, 2);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArrayDescendingOrder() {
        List<Integer> input = Arrays.asList(15, 42, 87, 32, 11, 0);
        List<Integer> expectedOutput = Arrays.asList(0, 11, 15, 32, 42, 87);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArrayAscendingOrder() {
        List<Integer> input = Arrays.asList(21, 14, 23, 11);
        List<Integer> expectedOutput = Arrays.asList(23, 21, 14, 11);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArrayLargeList() {
        List<Integer> input = Arrays.asList(5, 8, 2, 9, 1, 0, 3, 7, 6, 4);
        List<Integer> expectedOutput = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArrayRepeatedElements() {
        List<Integer> input = Arrays.asList(5, 8, 2, 9, 1, 0, 3, 7, 6, 4, 5, 8, 2, 9, 1, 0, 3, 7, 6, 4);
        List<Integer> expectedOutput = Arrays.asList(9, 9, 8, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1, 0, 0);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }

    @Test
    void testSortArrayAllEqualElements() {
        List<Integer> input = Arrays.asList(5, 5, 5, 5, 5, 5);
        List<Integer> expectedOutput = Arrays.asList(5, 5, 5, 5, 5, 5);
        assertEquals(expectedOutput, SortArray1.sortArray(input));
    }
}