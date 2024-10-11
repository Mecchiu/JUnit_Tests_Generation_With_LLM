package scenario1;


import java.util.ArrayList;
import java.util.List;


class EvenOddPalindrome {

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