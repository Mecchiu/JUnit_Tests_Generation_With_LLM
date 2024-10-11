package scenario1;


import java.util.List;


class MaxFill {

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