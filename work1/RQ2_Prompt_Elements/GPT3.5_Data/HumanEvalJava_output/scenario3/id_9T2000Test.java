// RollingMax.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class RollingMax {

    /**
     * From a given list of integers, generate a list of rolling maximum element found until given moment
     * in the sequence.
     *
     * > rollingMax([1, 2, 3, 2, 3, 4, 2])
     * [1, 2, 3, 3, 3, 4, 4]
     * > rollingMax([])
     * []
     * > rollingMax([1, 2, 3, 4])
     * [1, 2, 3, 4]
     * > rollingMax([4, 3, 2, 1])
     * [4, 4, 4, 4]
     * > rollingMax([3, 2, 3, 100, 3])
     * [3, 3, 3, 100, 100]
     */
    public static List<Integer> rollingMax(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            max = Math.max(max, numbers.get(i));
            result.add(max);
        }
        return result;
    }
}

// RollingMaxTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

    @Test
    void testEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testSingleElementList() {
        List<Integer> input = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testIncreasingList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testDecreasingList() {
        List<Integer> input = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(5, 5, 5, 5, 5);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testRandomList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 3, 4, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 3, 3, 4, 4);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testListWithDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 3, 3, 2, 2);
        List<Integer> expected = Arrays.asList(1, 2, 2, 3, 3, 3, 3, 3);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testListWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, -2, -3, -2, -3, -4, -2);
        List<Integer> expected = Arrays.asList(-1, -1, -1, -1, -1, -1, -1);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testListWithZero() {
        List<Integer> input = Arrays.asList(1, 2, 3, 0, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 3, 4, 5);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testListWithMaxValue() {
        List<Integer> input = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2);
        List<Integer> expected = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(expected, RollingMax.rollingMax(input));
    }

    @Test
    void testListWithMinValue() {
        List<Integer> input = Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2);
        List<Integer> expected = Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2);
        assertEquals(expected, RollingMax.rollingMax(input));
    }
}