// MaxFill.java
package scenario1;

import java.util.List;

class MaxFill {

    /**
     * Calculates the maximum number of containers needed to fill a grid with a given capacity.
     * @param grid a list of lists representing the grid
     * @param capacity the maximum capacity of each container
     * @return the maximum number of containers needed to fill the grid
     */
    public static int maxFill(List<List<Integer>> grid, int capacity) {
        int sum = 0;
        for (List<Integer> arr : grid) {
            int sumArr = 0;
            for (Integer i : arr) {
                sumArr += i;
            }
            sum += Math.ceil((double) sumArr / capacity);
        }
        return sum;
    }
}

// MaxFillTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

    @Test
    void testEmptyGrid() {
        List<List<Integer>> grid = Arrays.asList();
        int capacity = 5;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleRow() {
        List<List<Integer>> grid = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5));
        int capacity = 5;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleColumn() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(4),
                Arrays.asList(5)
        );
        int capacity = 5;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleRowsAndColumns() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        int capacity = 5;
        int expected = 3;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testCapacityGreaterThanSum() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        int capacity = 100;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testCapacityEqualToSum() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        int capacity = 45;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testCapacityLessThanSum() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        int capacity = 10;
        int expected = 6;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeCapacity() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        int capacity = -5;
        assertThrows(IllegalArgumentException.class, () -> MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testNullGrid() {
        List<List<Integer>> grid = null;
        int capacity = 5;
        assertThrows(NullPointerException.class, () -> MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testNullRow() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                null,
                Arrays.asList(7, 8, 9)
        );
        int capacity = 5;
        assertThrows(NullPointerException.class, () -> MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testNullElement() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, null, 6),
                Arrays.asList(7, 8, 9)
        );
        int capacity = 5;
        assertThrows(NullPointerException.class, () -> MaxFill.maxFill(grid, capacity));
    }
}