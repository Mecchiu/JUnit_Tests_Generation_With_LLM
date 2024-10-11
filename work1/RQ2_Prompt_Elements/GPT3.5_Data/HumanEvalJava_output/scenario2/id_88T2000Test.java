// SortArray1.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortArray1 {

    /**
     * Given an array of non-negative integers, return a copy of the given array after sorting,
     * you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
     * or sort it in descending order if the sum( first index value, last index value) is even.
     * <p>
     * Note:
     * don't change the given array.
     */
    public static List<Object> sortArray(List<Object> array) {
        if (array.size() <= 1) {
            return array;
        }
        int sum = (Integer) array.get(0) + (Integer) array.get(array.size() - 1);
        List<Object> sortedArray = new ArrayList<Object>(array);
        Collections.sort(sortedArray, new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                return (Integer) o1 - (Integer) o2;
            }
        });
        if (sum % 2 == 0) {
            Collections.reverse(sortedArray);
        }
        return sortedArray;
    }
}

// SortArray1Test.java
package scenario2;

import java.util.ArrayList;
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
    void testSortArrayWithEmptyList() {
        List<Object> array = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithOneElement() {
        List<Object> array = Arrays.asList(5);
        List<Object> expected = Arrays.asList(5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithTwoElements() {
        List<Object> array = Arrays.asList(5, 3);
        List<Object> expected = Arrays.asList(3, 5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithOddSum() {
        List<Object> array = Arrays.asList(5, 3, 2, 8, 1);
        List<Object> expected = Arrays.asList(1, 2, 3, 5, 8);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithEvenSum() {
        List<Object> array = Arrays.asList(5, 3, 2, 8, 1, 9);
        List<Object> expected = Arrays.asList(9, 8, 5, 3, 2, 1);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithAllEqualElements() {
        List<Object> array = Arrays.asList(5, 5, 5, 5, 5);
        List<Object> expected = Arrays.asList(5, 5, 5, 5, 5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithNegativeElements() {
        List<Object> array = Arrays.asList(-5, 3, -2, 8, -1, 9);
        List<Object> expected = Arrays.asList(9, 8, 3, -2, -1, -5);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithZeroElements() {
        List<Object> array = Arrays.asList(5, 3, 0, 8, 1, 9);
        List<Object> expected = Arrays.asList(0, 1, 3, 5, 8, 9);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithLargeElements() {
        List<Object> array = Arrays.asList(1000000, 500000, 2000000, 3000000, 1500000);
        List<Object> expected = Arrays.asList(500000, 1000000, 1500000, 2000000, 3000000);
        assertEquals(expected, SortArray1.sortArray(array));
    }

    @Test
    void testSortArrayWithDuplicateElements() {
        List<Object> array = Arrays.asList(5, 3, 2, 8, 1, 9, 2, 5, 8);
        List<Object> expected = Arrays.asList(9, 8, 8, 5, 5, 3, 2, 2, 1);
        assertEquals(expected, SortArray1.sortArray(array));
    }
}