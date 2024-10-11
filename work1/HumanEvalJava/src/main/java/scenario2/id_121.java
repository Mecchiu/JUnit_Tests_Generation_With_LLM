package scenario2;


import java.util.List;


class Solution {
    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0 && lst.get(i) % 2 == 1) {
                sum += lst.get(i);
            }
        }
        return sum;
    }

}