package scenario2;


class Solve1 {
    /**
     * Given a positive integer N, return the total sum of its digits in binary.
     *
     * Variables:
     *
     * @N integer
     * Constraints: 0 ≤ N ≤ 10000.
     * Output:
     * a string of binary number
     */
    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }

}