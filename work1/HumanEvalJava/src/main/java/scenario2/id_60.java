package scenario2;


class SumToN {
    /**
     * sum_to_n is a function that sums numbers from 1 to n.
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}