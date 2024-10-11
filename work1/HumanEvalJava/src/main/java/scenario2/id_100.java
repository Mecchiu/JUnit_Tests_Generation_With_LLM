package scenario2;


import java.util.ArrayList;
import java.util.List;


class MakeAPile {
    /**
     * * Given a positive integer n, you have to make a pile of n levels of stones.
     * The first level has n stones.
     * The number of stones in the next level is:
     * - the next odd number if n is odd.
     * - the next even number if n is even.
     * Return the number of stones in each level in a list, where element at index
     * i represents the number of stones in the level (i+1).
     */
    public static List<Integer> makeAPile(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 1;
        while (i <= n) {
            if (i == 1) {
                result.add(n);
            } else {
                if (n % 2 == 0) {
                    result.add(result.get(i - 2) + 2);
                } else {
                    result.add(result.get(i - 2) + 2);
                }
            }
            i++;
        }
        return result;
    }

}