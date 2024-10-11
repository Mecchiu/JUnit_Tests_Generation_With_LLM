package scenario2;


import java.util.ArrayList;
import java.util.List;


class EvenOddPalindrome {
    /**
     * * Given a positive integer n, return a tuple that has the number of even and odd
     * integer palindromes that fall within the range(1, n), inclusive.
     *
     *
     * Note:
     * 1. 1 <= n <= 10^3
     * 2. returned tuple has the number of even and odd integer palindromes respectively.
     */
    public static List<Integer> evenOddPalindrome(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        result.add(even);
        result.add(odd);
        return result;
    }

    private static boolean isPalindrome(int n) {
        int m = n;
        int reversed = 0;
        while (m > 0) {
            reversed = reversed * 10 + m % 10;
            m /= 10;
        }
        return n == reversed;
    }

}