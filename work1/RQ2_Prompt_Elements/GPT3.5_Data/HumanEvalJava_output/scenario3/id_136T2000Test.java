// LargestSmallestIntegers.java
package scenario3;

import java.util.List;

class LargestSmallestIntegers {

    /**
     * * Create a function that returns a tuple (a, b), where 'a' is
     * the largest of negative integers, and 'b' is the smallest
     * of positive integers in a list.
     * If there is no negative or positive integers, return them as None.
     *
     * Examples:
     * largestSmallestIntegers([2, 4, 1, 3, 5, 7]) == (None, 1)
     * largestSmallestIntegers([]) == (None, None)
     * largestSmallestIntegers([0]) == (None, None)
     *
     * > largestSmallestIntegers([2, 4, 1, 3, 5, 7])
     * [null, 1]
     * > largestSmallestIntegers([2, 4, 1, 3, 5, 7, 0])
     * [null, 1]
     * > largestSmallestIntegers([1, 3, 2, 4, 5, 6, -2])
     * [-2, 1]
     * > largestSmallestIntegers([4, 5, 3, 6, 2, 7, -7])
     * [-7, 2]
     * > largestSmallestIntegers([7, 3, 8, 4, 9, 2, 5, -9])
     * [-9, 2]
     * > largestSmallestIntegers([])
     * [null, null]
     * > largestSmallestIntegers([0])
     * [null, null]
     * > largestSmallestIntegers([-1, -3, -5, -6])
     * [-1, null]
     * > largestSmallestIntegers([-1, -3, -5, -6, 0])
     * [-1, null]
     * > largestSmallestIntegers([-6, -4, -4, -3, 1])
     * [-3, 1]
     * > largestSmallestIntegers([-6, -4, -4, -3, -100, 1])
     * [-3, 1]
     */
    public static List<Integer> largestSmallestIntegers(List<Integer> lst) {
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        boolean hasNegative = false;
        boolean hasPositive = false;

        for (int num : lst) {
            if (num < 0) {
                hasNegative = true;
                maxNegative = Math.max(maxNegative, num);
            } else if (num > 0) {
                hasPositive = true;
                minPositive = Math.min(minPositive, num);
            }
        }

        if (!hasNegative) {
            maxNegative = null;
        }
        if (!hasPositive) {
            minPositive = null;
        }

        return List.of(maxNegative, minPositive);
    }
}

// LargestSmallestIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

    @Test
    void testEmptyList() {
        List<Integer> lst = List.of();
        List<Integer> expected = List.of(null, null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithZero() {
        List<Integer> lst = List.of(0);
        List<Integer> expected = List.of(null, null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithOnlyPositiveNumbers() {
        List<Integer> lst = List.of(2, 4, 1, 3, 5, 7);
        List<Integer> expected = List.of(null, 1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithOnlyNegativeNumbers() {
        List<Integer> lst = List.of(-1, -3, -5, -6);
        List<Integer> expected = List.of(-1, null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithBothPositiveAndNegativeNumbers() {
        List<Integer> lst = List.of(1, 3, 2, 4, 5, 6, -2);
        List<Integer> expected = List.of(-2, 1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithBothPositiveAndNegativeNumbersAndZero() {
        List<Integer> lst = List.of(2, 4, 1, 3, 5, 7, 0);
        List<Integer> expected = List.of(null, 1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithRepeatedNumbers() {
        List<Integer> lst = List.of(-6, -4, -4, -3, 1);
        List<Integer> expected = List.of(-3, 1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithRepeatedNumbersAndLargeNegativeNumber() {
        List<Integer> lst = List.of(-6, -4, -4, -3, -100, 1);
        List<Integer> expected = List.of(-3, 1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithOnlyNegativeNumbersAndZero() {
        List<Integer> lst = List.of(-1, -3, -5, -6, 0);
        List<Integer> expected = List.of(-1, null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    @Test
    void testListWithOnlyPositiveNumbersAndZero() {
        List<Integer> lst = List.of(2, 4, 1, 3, 5, 7, 0);
        List<Integer> expected = List.of(null, 1);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }
}