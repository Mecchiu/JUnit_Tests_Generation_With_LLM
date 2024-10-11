package scenario2;


class LargestDivisor {
    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }

}