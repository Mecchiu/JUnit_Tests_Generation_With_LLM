// Minpath.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Minpath {

    /**
     * * Given a grid with N rows and N columns (N >= 2) and a positive integer k,
     * each cell of the grid contains a value. Every integer in the range [1, N * N]
     * inclusive appears exactly once on the cells of the grid.
     *
     * You have to find the minimum path of length k in the grid. You can start
     * from any cell, and in each step you can move to any of the neighbor cells,
     * in other words, you can go to cells which share an edge with you current
     * cell.
     * Please note that a path of length k means visiting exactly k cells (not
     * necessarily distinct).
     * You CANNOT go off the grid.
     * A path A (of length k) is considered less than a path B (of length k) if
     * after making the ordered lists of the values on the cells that A and B go
     * through (let's call them lst_A and lst_B), lst_A is lexicographically less
     * than lst_B, in other words, there exist an integer index i (1 <= i <= k)
     * such that lst_A[i] < lst_B[i] and for any j (1 <= j < i) we have
     * lst_A[j] = lst_B[j].
     * It is guaranteed that the answer is unique.
     * Return an ordered list of the values on the cells that the minimum path go through.
     *
     * Examples:
     *
     * Input: grid = [ [1,2,3], [4,5,6], [7,8,9]], k = 3
     * Output: [1, 2, 1]
     *
     * Input: grid = [ [5,9,3], [4,1,6], [7,8,2]], k = 1
     * Output: [1]
     *
     * > minpath([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 3)
     * [1, 2, 1]
     * > minpath([[5, 9, 3], [4, 1, 6], [7, 8, 2]], 1)
     * [1]
     * > minpath([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], 4)
     * [1, 2, 1, 2]
     * > minpath([[6, 4, 13, 10], [5, 7, 12, 1], [3, 16, 11, 15], [8, 14, 9, 2]], 7)
     * [1, 10, 1, 10, 1, 10, 1]
     * > minpath([[8, 14, 9, 2], [6, 4, 13, 15], [5, 7, 1, 12], [3, 10, 11, 16]], 5)
     * [1, 7, 1, 7, 1]
     * > minpath([[11, 8, 7, 2], [5, 16, 14, 4], [9, 3, 15, 6], [12, 13, 10, 1]], 9)
     * [1, 6, 1, 6, 1, 6, 1, 6, 1]
     * > minpath([[12, 13, 10, 1], [9, 3, 15, 6], [5, 16, 14, 4], [11, 8, 7, 2]], 12)
     * [1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6]
     * > minpath([[2, 7, 4], [3, 1, 5], [6, 8, 9]], 8)
     * [1, 3, 1, 3, 1, 3, 1, 3]
     * > minpath([[6, 1, 5], [3, 8, 9], [2, 7, 4]], 8)
     * [1, 5, 1, 5, 1, 5, 1, 5]
     * > minpath([[1, 2], [3, 4]], 10)
     * [1, 2, 1, 2, 1, 2, 1, 2, 1, 2]
     * > minpath([[1, 3], [3, 2]], 10)
     * [1, 3, 1, 3, 1, 3, 1, 3, 1, 3]
     */
    public static List<Integer> minpath(List<List<Integer>> grid, int k) {
        int n = grid.size();
        int[][] visited = new int[n][n];
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dfs(grid, visited, path, i, j, k);
            }
        }
        return path;
    }

    private static void dfs(List<List<Integer>> grid, int[][] visited, List<Integer> path, int i, int j, int k) {
        if (i < 0 || i >= grid.size() || j < 0 || j >= grid.size() || visited[i][j] == 1) {
            return;
        }
        visited[i][j] = 1;
        path.add(grid.get(i).get(j));
        if (path.size() == k) {
            return;
        }
        dfs(grid, visited, path, i + 1, j, k);
        dfs(grid, visited, path, i - 1, j, k);
        dfs(grid, visited, path, i, j + 1, k);
        dfs(grid, visited, path, i, j - 1, k);
        path.remove(path.size() - 1);
        visited[i][j] = 0;
    }
}

// MinpathTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains ten unit test cases for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {

    @Test
    void testMinpath1() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> expected = Arrays.asList(1, 2, 1);
        List<Integer> actual = Minpath.minpath(grid, 3);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath2() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(5, 9, 3),
                Arrays.asList(4, 1, 6),
                Arrays.asList(7, 8, 2)
        );
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = Minpath.minpath(grid, 1);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath3() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12),
                Arrays.asList(13, 14, 15, 16)
        );
        List<Integer> expected = Arrays.asList(1, 2, 1, 2);
        List<Integer> actual = Minpath.minpath(grid, 4);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath4() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(6, 4, 13, 10),
                Arrays.asList(5, 7, 12, 1),
                Arrays.asList(3, 16, 11, 15),
                Arrays.asList(8, 14, 9, 2)
        );
        List<Integer> expected = Arrays.asList(1, 10, 1, 10, 1, 10, 1);
        List<Integer> actual = Minpath.minpath(grid, 7);
        assertEquals(expected, actual);
    }

    @Test
    void testMinpath5() {
        List<List<Integer