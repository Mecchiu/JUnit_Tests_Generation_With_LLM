package scenario2;


class LargestPrimeFactor {
    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     */
    public static int largestPrimeFactor(int n) {
        int max = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                max = i;
                n /= i;
                i--;
            }
        }
        return max;
    }

}