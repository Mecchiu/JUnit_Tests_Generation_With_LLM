// MaxFill.java
package scenario3;

import java.util.List;

class MaxFill {

    /**
     * * You are given a rectangular grid of wells. Each row represents a single well,
     * and each 1 in a row represents a single unit of water.
     * Each well has a corresponding bucket that can be used to extract water from it,
     * and all buckets have the same capacity.
     * Your task is to use the buckets to empty the wells.
     * Output the number of times you need to lower the buckets.
     *
     * Example 1:
     * Input:
     * grid : [[0,0,1,0], [0,1,0,0], [1,1,1,1]]
     * bucket_capacity : 1
     * Output: 6
     *
     * Example 2:
     * Input:
     * grid : [[0,0,1,1], [0,0,0,0], [1,1,1,1], [0,1,1,1]]
     * bucket_capacity : 2
     * Output: 5
     *
     * Example 3:
     * Input:
     * grid : [[0,0,0], [0,0,0]]
     * bucket_capacity : 5
     * Output: 0
     *
     * Constraints:
     * * all wells have the same length
     * * 1 <= grid.length <= 10^2
     * * 1 <= grid[:,1].length <= 10^2
     * * grid[i][j] -> 0 | 1
     * * 1 <= capacity <= 10
     *
     * > maxFill([[0, 0, 1, 0], [0, 1, 0, 0], [1, 1, 1, 1]], 1)
     * 6
     * > maxFill([[0, 0, 1, 1], [0, 0, 0, 0], [1, 1, 1, 1], [0, 1, 1, 1]], 2)
     * 5
     * > maxFill([[0, 0, 0], [0, 0, 0]], 5)
     * 0
     * > maxFill([[1, 1, 1, 1], [1, 1, 1, 1]], 2)
     * 4
     * > maxFill([[1, 1, 1, 1], [1, 1, 1, 1]], 9)
     * 2
     */
    public static int maxFill(List<List<Integer>> grid, int capacity) {
        int rows = grid.size();
        int cols = grid.get(0).size();
        int totalWater = 0;
        int buckets = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid.get(i).get(j) == 1) {
                    totalWater++;
                }
            }
        }
        buckets = (int) Math.ceil((double) totalWater / capacity);
        return buckets;
    }
}

// MaxFillTest.java
package scenario3;

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
    void testMaxFill1() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 1, 0),
            Arrays.asList(0, 1, 0, 0),
            Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 1;
        int expected = 6;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFill2() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 1, 1),
            Arrays.asList(0, 0, 0, 0),
            Arrays.asList(1, 1, 1, 1),
            Arrays.asList(0, 1, 1, 1)
        );
        int capacity = 2;
        int expected = 5;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFill3() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 0)
        );
        int capacity = 5;
        int expected = 0;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFill4() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 1, 1, 1),
            Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 2;
        int expected = 4;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFill5() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 1, 1, 1),
            Arrays.asList(1, 1, 1, 1)
        );
        int capacity = 9;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFill6() {
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
    void testMaxFill7() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 1, 0),
            Arrays.asList(0, 0, 1)
        );
        int capacity = 1;
        int expected = 3;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFill8() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 1, 0),
            Arrays.asList(0, 0, 1)
        );
        int capacity = 2;
        int expected = 2;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFill9() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 1, 0),
            Arrays.asList(0, 0, 1)
        );
        int capacity = 3;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxFill10() {
        List<List<Integer>> grid = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 1, 0),
            Arrays.asList(0, 0, 1)
        );
        int capacity = 4;
        int expected = 1;
        int actual = MaxFill.maxFill(grid, capacity);
        assertEquals(expected, actual);
    }
}