package scenario2;


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
     */
    public static List<Integer> minpath(List<List<Integer>> grid, int k) {
        int n = grid.size();
        int val = n * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    List<Integer> temp = new ArrayList<>();
                    if (i != 0) {
                        temp.add(grid.get(i - 1).get(j));
                    }

                    if (j != 0) {
                        temp.add(grid.get(i).get(j - 1));
                    }

                    if (i != n - 1) {
                        temp.add(grid.get(i + 1).get(j));
                    }

                    if (j != n - 1) {
                        temp.add(grid.get(i).get(j + 1));
                    }

                    val = Collections.min(temp);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                ans.add(1);
            } else {
                ans.add(val);
            }
        }
        return ans;
    }


}