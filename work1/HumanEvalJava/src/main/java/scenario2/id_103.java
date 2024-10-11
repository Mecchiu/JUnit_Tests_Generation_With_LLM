package scenario2;


class RoundedAvg {
    /**
     * You are given two positive integers n and m, and your task is to compute the
     * average of the integers from n through m (including n and m).
     * Round the answer to the nearest integer and convert that to binary.
     * If n is greater than m, return -1.
     */
    public static Object roundedAvg(int n, int m) {
        if (n > m) {
            return -1;
        }
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        double avg = (sum * 1.0) / (m - n + 1);
        int roundedAvg = (int) Math.rint(avg);
        return "0b" + Integer.toBinaryString(roundedAvg);
    }

}