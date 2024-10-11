// Pluck.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class Pluck {

    /**
     * Given an array representing a branch of a tree that has non-negative integer nodes
     * your task is to pluck one of the nodes and return it.
     * The plucked node should be the node with the smallest even value.
     * If multiple nodes with the same smallest even value are found return the node that has smallest index.
     * The plucked node should be returned in a list, [ smallest_value, its index ],
     * If there are no even values or the given array is empty, return [].
     *
     * Example 1:
     * - Input: [4,2,3]
     * - Output: [2, 1]
     * - Explanation: 2 has the smallest even value, and 2 has the smallest index.
     * Example 2:
     * - Input: [1,2,3]
     * - Output: [2, 1]
     * - Explanation: 2 has the smallest even value, and 2 has the smallest index.
     * Example 3:
     * - Input: []
     * - Output: []
     * Example 4:
     * - Input: [5, 0, 3, 0, 4, 2]
     * - Output: [0, 1]
     * - Explanation: 0 is the smallest value, but  there are two zeros,
     * so we will choose the first zero, which has the smallest index.
     *
     * Constraints:
     * 1 <= nodes.length <= 10000
     * 0 <= node.value
     *
     * > pluck([4, 2, 3])
     * [2, 1]
     * > pluck([1, 2, 3])
     * [2, 1]
     * > pluck([])
     * []
     * > pluck([5, 0, 3, 0, 4, 2])
     * [0, 1]
     * > pluck([1, 2, 3, 0, 5, 3])
     * [0, 3]
     * > pluck([5, 4, 8, 4, 8])
     * [4, 1]
     * > pluck([7, 6, 7, 1])
     * [6, 1]
     * > pluck([7, 9, 7, 1])
     * []
     */
    public static List<Integer> pluck(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int smallestEven = Integer.MAX_VALUE;
        int smallestEvenIndex = -1;
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current % 2 == 0 && current < smallestEven) {
                smallestEven = current;
                smallestEvenIndex = i;
            }
        }
        if (smallestEvenIndex != -1) {
            result.add(smallestEven);
            result.add(smallestEvenIndex);
        }
        return result;
    }
}

// PluckTest.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {

    @Test
    void testPluckWithEvenValues() {
        List<Integer> input = Arrays.asList(4, 2, 3);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithEvenValues2() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithEmptyList() {
        List<Integer> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithMultipleZeros() {
        List<Integer> input = Arrays.asList(5, 0, 3, 0, 4, 2);
        List<Integer> expected = Arrays.asList(0, 1);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithMultipleEvenValues() {
        List<Integer> input = Arrays.asList(1, 2, 3, 0, 5, 3);
        List<Integer> expected = Arrays.asList(0, 3);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithRepeatedEvenValues() {
        List<Integer> input = Arrays.asList(5, 4, 8, 4, 8);
        List<Integer> expected = Arrays.asList(4, 1);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithNoEvenValues() {
        List<Integer> input = Arrays.asList(7, 6, 7, 1);
        List<Integer> expected = Arrays.asList(6, 1);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithNoEvenValues2() {
        List<Integer> input = Arrays.asList(7, 9, 7, 1);
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithMaxValues() {
        List<Integer> input = Collections.nCopies(10000, Integer.MAX_VALUE);
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckWithRandomValues() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(input));
    }
}