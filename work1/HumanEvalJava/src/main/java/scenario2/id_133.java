package scenario2;


import java.util.List;


class SumSquares {
    /**
     * You are given a list of numbers.
     * You need to return the sum of squared numbers in the given list,
     * round each element in the list to the upper int(Ceiling) first.
     */
    public static int sumSquares(List<Number> lst) {
        int sum = 0;
        for (Number n : lst) {
            sum += Math.pow(Math.ceil(n.doubleValue()), 2);
        }
        return sum;
    }

}