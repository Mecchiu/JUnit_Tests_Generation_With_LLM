// Intersperse.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class Intersperse {

    /**
     * Insert a number 'delimiter' between every two consecutive elements of input list `numbers'.
     *
     * > intersperse([], 4)
     * []
     * > intersperse([1, 2, 3], 4)
     * [1, 4, 2, 4, 3]
     * > intersperse([], 7)
     * []
     * > intersperse([5, 6, 3, 2], 8)
     * [5, 8, 6, 8, 3, 8, 2]
     * > intersperse([2, 2, 2], 2)
     * [2, 2, 2, 2, 2]
     */
    public static List<Integer> intersperse(List<Integer> numbers, int delimiter) {
        List<Integer> result = new ArrayList<>();
        if (numbers == null || numbers.isEmpty()) {
            return result;
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            result.add(numbers.get(i));
            result.add(delimiter);
        }
        result.add(numbers.get(numbers.size() - 1));
        return result;
    }
}

// IntersperseTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

    @Test
    void testEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testSingleElementList() {
        List<Integer> input = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testTwoElementList() {
        List<Integer> input = Arrays.asList(1, 2);
        List<Integer> expected = Arrays.asList(1, 4, 2);
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testThreeElementList() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 4, 2, 4, 3);
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testFourElementList() {
        List<Integer> input = Arrays.asList(5, 6, 3, 2);
        List<Integer> expected = Arrays.asList(5, 8, 6, 8, 3, 8, 2);
        assertEquals(expected, Intersperse.intersperse(input, 8));
    }

    @Test
    void testAllSameElementList() {
        List<Integer> input = Arrays.asList(2, 2, 2);
        List<Integer> expected = Arrays.asList(2, 2, 2, 2, 2);
        assertEquals(expected, Intersperse.intersperse(input, 2));
    }

    @Test
    void testNullInput() {
        List<Integer> input = null;
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Intersperse.intersperse(input, 4));
    }

    @Test
    void testNegativeDelimiter() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, -4, 2, -4, 3);
        assertEquals(expected, Intersperse.intersperse(input, -4));
    }

    @Test
    void testZeroDelimiter() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 0, 2, 0, 3);
        assertEquals(expected, Intersperse.intersperse(input, 0));
    }

    @Test
    void testMaxValueDelimiter() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, Integer.MAX_VALUE, 2, Integer.MAX_VALUE, 3);
        assertEquals(expected, Intersperse.intersperse(input, Integer.MAX_VALUE));
    }
}