package scenario2;


import java.util.ArrayList;
import java.util.List;


class CountUpTo {
    /**
     * Implement a function that takes an non-negative integer and returns an array of the first n
     * integers that are prime numbers and less than n.
     */
    public static List<Object> countUpTo(int n) {
        List<Object> result = new ArrayList<Object>();
        int i = 2;
        while (i < n) {
            if (isPrime(i)) {
                result.add(i);
            }
            i++;
        }
        return result;
    }

    private static boolean isPrime(int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}