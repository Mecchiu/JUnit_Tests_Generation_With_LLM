// MaxFillTest.java
package scenario2;

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
    void testMaxFillWithOneWell() {
        List<List<Integer>> grid = Arrays.asList(Arrays.asList(1, 1, 1));
        int capacity = 2;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithOneBucket() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 1),
            Arrays.asList(0, 1, 0),
            Arrays.asList(1, 0, 1)
        );
        int capacity = 1;
        int expected = 6;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithLargeCapacity() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 1),
            Arrays.asList(0, 1, 0),
            Arrays.asList(1, 0, 1)
        );
        int capacity = 10;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithMultipleWells() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 1),
            Arrays.asList(0, 1, 0),
            Arrays.asList(1, 0, 1),
            Arrays.asList(0, 1, 0)
        );
        int capacity = 2;
        int expected = 5;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithAllEmptyWells() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 0)
        );
        int capacity = 1;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithAllFullWells() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1),
            Arrays.asList(1, 1, 1)
        );
        int capacity = 1;
        int expected = 9;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithUnevenWells() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 1),
            Arrays.asList(0, 1),
            Arrays.asList(1, 0, 1, 0)
        );
        int capacity = 2;
        int expected = 4;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFillWithZeroCapacity() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 1),
            Arrays.asList(0, 1, 0),
            Arrays.asList(1, 0, 1)
        );
        int capacity = 0;
        assertThrows(ArithmeticException.class, () -> MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testMaxFillWithNegativeCapacity() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 1),
            Arrays.asList(0, 1, 0),
            Arrays.asList(1, 0, 1)
        );
        int capacity = -1;
        assertThrows(ArithmeticException.class, () -> MaxFill.maxFill(grid, capacity));
    }

    @Test
    void testMaxFillWithEmptyGrid() {
        List<List<Integer>> grid = Arrays.asList();
        int capacity = 1;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
}