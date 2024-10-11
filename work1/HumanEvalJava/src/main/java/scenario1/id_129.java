package scenario1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Minpath {

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