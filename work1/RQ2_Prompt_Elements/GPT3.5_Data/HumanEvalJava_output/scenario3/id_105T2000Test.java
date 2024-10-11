// ByLength.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ByLength {

    /**
     * * Given an array of integers, sort the integers that are between 1 and 9 inclusive,
     * reverse the resulting array, and then replace each digit by its corresponding name from
     * "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".
     *
     * For example:
     * arr = [2, 1, 1, 4, 5, 8, 2, 3]
     * -> sort arr -> [1, 1, 2, 2, 3, 4, 5, 8]
     * -> reverse arr -> [8, 5, 4, 3, 2, 2, 1, 1]
     * return ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
     *
     * If the array is empty, return an empty array:
     * arr = []
     * return []
     *
     * If the array has any strange number ignore it:
     * arr = [1, -1 , 55]
     * -> sort arr -> [-1, 1, 55]
     * -> reverse arr -> [55, 1, -1]
     * return = ['One']
     *
     * > byLength([2, 1, 1, 4, 5, 8, 2, 3])
     * ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
     * > byLength([])
     * []
     * > byLength([1, -1, 55])
     * ["One"]
     * > byLength([1, -1, 3, 2])
     * ["Three", "Two", "One"]
     * > byLength([9, 4, 8])
     * ["Nine", "Eight", "Four"]
     */
    public static List<String> byLength(List<Integer> arr) {
        List<String> result = new ArrayList<>();
        List<Integer> validNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num >= 1 && num <= 9) {
                validNumbers.add(num);
            }
        }
        Collections.sort(validNumbers);
        Collections.reverse(validNumbers);
        for (int num : validNumbers) {
            switch (num) {
                case 1:
                    result.add("One");
                    break;
                case 2:
                    result.add("Two");
                    break;
                case 3:
                    result.add("Three");
                    break;
                case 4:
                    result.add("Four");
                    break;
                case 5:
                    result.add("Five");
                    break;
                case 6:
                    result.add("Six");
                    break;
                case 7:
                    result.add("Seven");
                    break;
                case 8:
                    result.add("Eight");
                    break;
                case 9:
                    result.add("Nine");
                    break;
            }
        }
        return result;
    }
}

// ByLengthTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

    @Test
    void testEmptyArray() {
        List<Integer> arr = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithStrangeNumbers() {
        List<Integer> arr = Arrays.asList(1, -1, 55);
        List<String> expected = Arrays.asList("One");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithValidNumbers() {
        List<Integer> arr = Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3);
        List<String> expected = Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithValidNumbersInDescendingOrder() {
        List<Integer> arr = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithValidNumbersInAscendingOrder() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithOnlyOneValidNumber() {
        List<Integer> arr = Arrays.asList(5);
        List<String> expected = Arrays.asList("Five");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithNoValidNumbers() {
        List<Integer> arr = Arrays.asList(10, 11, 12, 13);
        List<String> expected = new ArrayList<>();
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithRepeatedValidNumbers() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        List<String> expected = Arrays.asList("Three", "Two", "Two", "One", "One");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithValidAndStrangeNumbers() {
        List<Integer> arr = Arrays.asList(1, 2, -1, 3, 4, 55, 5, 6, 7, 8, 9);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithValidAndStrangeNumbersInDescendingOrder() {
        List<Integer> arr = Arrays.asList(9, 8, 7, 6, 5, 4, 3, -1, 2, 1, 55);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }

    @Test
    void testArrayWithValidAndStrangeNumbersInAscendingOrder() {
        List<Integer> arr = Arrays.asList(-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 55);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        List<String> result = ByLength.byLength(arr);
        assertEquals(expected, result);
    }
}