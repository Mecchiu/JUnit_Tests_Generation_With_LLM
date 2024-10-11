// ByLength.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ByLength {

    /**
     * Sorts a list of integers in descending order and returns a list of their corresponding English word representations.
     * @param arr the list of integers to be sorted
     * @return a list of English word representations of the sorted integers
     */
    public static List<String> byLength(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<Integer>();
        for (Integer value : arr) {
            if (value >= 1 && value <= 9) {
                sorted.add(value);
            }
        }
        Collections.sort(sorted, Collections.reverseOrder());
        List<String> result = new ArrayList<String>();
        for (Integer value : sorted) {
            switch(value) {
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
package scenario1;

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
    void testEmptyList() {
        List<Integer> input = new ArrayList<Integer>();
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testSingleElementList() {
        List<Integer> input = Arrays.asList(5);
        List<String> expected = Arrays.asList("Five");
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithMultipleElements() {
        List<Integer> input = Arrays.asList(3, 9, 2, 7, 1, 5, 8, 4, 6);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithNonIntegerElements() {
        List<Integer> input = Arrays.asList(3, 9, "hello", 7, 1, 5, 8, 4, 6);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "One");
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithNegativeElements() {
        List<Integer> input = Arrays.asList(3, 9, -2, 7, 1, 5, 8, -4, 6);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Three", "One");
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithZeroElement() {
        List<Integer> input = Arrays.asList(3, 9, 0, 7, 1, 5, 8, 4, 6);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithRepeatedElements() {
        List<Integer> input = Arrays.asList(3, 9, 2, 7, 1, 5, 8, 4, 6, 9, 5, 1);
        List<String> expected = Arrays.asList("Nine", "Nine", "Eight", "Seven", "Six", "Six", "Five", "Five", "Four", "Three", "Two", "One", "One");
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithAllElementsGreaterThanNine() {
        List<Integer> input = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithAllElementsLessThanOne() {
        List<Integer> input = Arrays.asList(-3, 0, 0, -7, -1, -5, -8, -4, -6);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithNullElement() {
        List<Integer> input = Arrays.asList(3, 9, null, 7, 1, 5, 8, 4, 6);
        List<String> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "One");
        assertEquals(expected, ByLength.byLength(input));
    }

    @Test
    void testListWithAllNullElements() {
        List<Integer> input = Arrays.asList(null, null, null);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, ByLength.byLength(input));
    }
}