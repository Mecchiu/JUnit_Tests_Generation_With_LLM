package scenario1;


class RoundedAvg {

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