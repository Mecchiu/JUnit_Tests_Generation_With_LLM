// SortArray1.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortArray1 {

    /**
     * Sorts the given array in ascending order and returns it.
     * If the sum of the first and last elements is even, the array is sorted in descending order.
     * @param array the array to be sorted
     * @return the sorted array
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
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        List<Object> array = new ArrayList<Object>();
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(array, sortedArray);
    }
    
    @Test
    void testSortArrayWithOneElement() {
        List<Object> array = new ArrayList<Object>();
        array.add(1);
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(array, sortedArray);
    }
    
    @Test
    void testSortArrayWithTwoElements() {
        List<Object> array = new ArrayList<Object>();
        array.add(2);
        array.add(1);
        List<Object> sortedArray = SortArray1.sortArray(array);
        List<Object> expectedArray = new ArrayList<Object>();
        expectedArray.add(1);
        expectedArray.add(2);
        assertEquals(expectedArray, sortedArray);
    }
    
    @Test
    void testSortArrayWithOddNumberOfElements() {
        List<Object> array = new ArrayList<Object>();
        array.add(3);
        array.add(2);
        array.add(1);
        List<Object> sortedArray = SortArray1.sortArray(array);
        List<Object> expectedArray = new ArrayList<Object>();
        expectedArray.add(1);
        expectedArray.add(2);
        expectedArray.add(3);
        assertEquals(expectedArray, sortedArray);
    }
    
    @Test
    void testSortArrayWithEvenNumberOfElements() {
        List<Object> array = new ArrayList<Object>();
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
        List<Object> sortedArray = SortArray1.sortArray(array);
        List<Object> expectedArray = new ArrayList<Object>();
        expectedArray.add(4);
        expectedArray.add(3);
        expectedArray.add(2);
        expectedArray.add(1);
        assertEquals(expectedArray, sortedArray);
    }
    
    @Test
    void testSortArrayWithAllElementsEqual() {
        List<Object> array = new ArrayList<Object>();
        array.add(1);
        array.add(1);
        array.add(1);
        List<Object> sortedArray = SortArray1.sortArray(array);
        assertEquals(array, sortedArray);
    }
    
    @Test
    void testSortArrayWithNegativeElements() {
        List<Object> array = new ArrayList<Object>();
        array.add(-3);
        array.add(-2);
        array.add(-1);
        List<Object> sortedArray = SortArray1.sortArray(array);
        List<Object> expectedArray = new ArrayList<Object>();
        expectedArray.add(-1);
        expectedArray.add(-2);
        expectedArray.add(-3);
        assertEquals(expectedArray, sortedArray);
    }
    
    @Test
    void testSortArrayWithMixedElements() {
        List<Object> array = new ArrayList<Object>();
        array.add(3);
        array.add(-2);
        array.add(1);
        List<Object> sortedArray = SortArray1.sortArray(array);
        List<Object> expectedArray = new ArrayList<Object>();
        expectedArray.add(-2);
        expectedArray.add(1);
        expectedArray.add(3);
        assertEquals(expectedArray, sortedArray);
    }
    
    @Test
    void testSortArrayWithSumOfFirstAndLastElementEven() {
        List<Object> array = new ArrayList<Object>();
        array.add(3);
        array.add(2);
        array.add(1);
        List<Object> sortedArray = SortArray1.sortArray(array);
        List<Object> expectedArray = new ArrayList<Object>();
        expectedArray.add(3);
        expectedArray.add(2);
        expectedArray.add(1);
        assertEquals(expectedArray, sortedArray);
    }
    
    @Test
    void testSortArrayWithSumOfFirstAndLastElementOdd() {
        List<Object> array = new ArrayList<Object>();
        array.add(3);
        array.add(2);
        array.add(1);
        array.add(4);
        List<Object> sortedArray = SortArray1.sortArray(array);
        List<Object> expectedArray = new ArrayList<Object>();
        expectedArray.add(1);
        expectedArray.add(2);
        expectedArray.add(3);
        expectedArray.add(4);
        assertEquals(expectedArray, sortedArray);
    }
}