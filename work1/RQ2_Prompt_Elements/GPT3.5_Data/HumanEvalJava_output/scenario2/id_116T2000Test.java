// SortArray.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortArray {

    /**
     * * In this Kata, you have to sort an array of non-negative integers according to
     * number of ones in their binary representation in ascending order.
     * For similar number of ones, sort based on decimal value.
     */
    public static List<Object> sortArray(List<Object> arr) {
        List<Object> sorted = new ArrayList<Object>();
        for (int i = 0; i < arr.size(); i++) {
            int num = ((Number) arr.get(i)).intValue();
            int ones = 0;
            while (num > 0) {
                ones += num % 2;
                num /= 2;
            }
            sorted.add(new int[] { ones, ((Number) arr.get(i)).intValue() });
        }
        Collections.sort(sorted, new Comparator<Object>() {

            public int compare(Object o1, Object o2) {
                int[] a1 = (int[]) o1;
                int[] a2 = (int[]) o2;
                if (a1[0] == a2[0]) {
                    return a1[1] - a2[1];
                }
                return a1[0] - a2[0];
            }
        });
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < sorted.size(); i++) {
            result.add(((int[]) sorted.get(i))[1]);
        }
        return result;
    }
}

// SortArrayTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
    
    @Test
    void testSortArray() {
        List<Object> arr = new ArrayList<Object>(Arrays.asList(3, 2, 1, 4, 5, 6, 7, 8, 9, 10));
        List<Object> expected = new ArrayList<Object>(Arrays.asList(1, 2, 4, 8, 3, 5, 6, 9, 10, 7));
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithZeros() {
        List<Object> arr = new ArrayList<Object>(Arrays.asList(0, 3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 0));
        List<Object> expected = new ArrayList<Object>(Arrays.asList(0, 0, 1, 2, 4, 8, 3, 5, 6, 9, 10, 7));
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithDuplicates() {
        List<Object> arr = new ArrayList<Object>(Arrays.asList(3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 3, 2, 1, 4, 5, 6, 7, 8, 9, 10));
        List<Object> expected = new ArrayList<Object>(Arrays.asList(1, 2, 4, 8, 1, 2, 4, 8, 3, 5, 6, 9, 10, 3, 5, 6, 9, 10, 7, 7));
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithLargeNumbers() {
        List<Object> arr = new ArrayList<Object>(Arrays.asList(1000000, 1000001, 1000002, 1000003, 1000004, 1000005, 1000006, 1000007, 1000008, 1000009));
        List<Object> expected = new ArrayList<Object>(Arrays.asList(1000000, 1000001, 1000002, 1000004, 1000008, 1000003, 1000005, 1000006, 1000009, 1000007));
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithSingleElement() {
        List<Object> arr = new ArrayList<Object>(Arrays.asList(5));
        List<Object> expected = new ArrayList<Object>(Arrays.asList(5));
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithEmptyList() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithNull() {
        List<Object> arr = null;
        assertThrows(NullPointerException.class, () -> {
            SortArray.sortArray(arr);
        });
    }
    
    @Test
    void testSortArrayWithMixedTypes() {
        List<Object> arr = new ArrayList<Object>(Arrays.asList(3, 2, 1, "4", 5, 6, 7, 8, 9, 10));
        assertThrows(ClassCastException.class, () -> {
            SortArray.sortArray(arr);
        });
    }
    
    @Test
    void testSortArrayWithNegativeNumbers() {
        List<Object> arr = new ArrayList<Object>(Arrays.asList(-3, -2, -1, 0, 1, 2, 3));
        List<Object> expected = new ArrayList<Object>(Arrays.asList(0, -1, -2, 1, 2, -3, 3));
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testSortArrayWithMaxValue() {
        List<Object> arr = new ArrayList<Object>(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 3, Integer.MAX_VALUE - 4));
        List<Object> expected = new ArrayList<Object>(Arrays.asList(Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 3, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 1, Integer.MAX_VALUE));
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
}