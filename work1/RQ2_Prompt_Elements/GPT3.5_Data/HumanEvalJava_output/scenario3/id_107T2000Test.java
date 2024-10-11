// EvenOddPalindrome.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class EvenOddPalindrome {

    /**
     * * Given a positive integer n, return a tuple that has the number of even and odd
     * integer palindromes that fall within the range(1, n), inclusive.
     *
     * Example 1:
     *
     * Input: 3
     * Output: (1, 2)
     * Explanation:
     * Integer palindrome are 1, 2, 3. one of them is even, and two of them are odd.
     *
     * Example 2:
     *
     * Input: 12
     * Output: (4, 6)
     * Explanation:
     * Integer palindrome are 1, 2, 3, 4, 5, 6, 7, 8, 9, 11. four of them are even, and 6 of them are odd.
     *
     * Note:
     * 1. 1 <= n <= 10^3
     * 2. returned tuple has the number of even and odd integer palindromes respectively.
     *
     * > evenOddPalindrome(123)
     * [8, 13]
     * > evenOddPalindrome(12)
     * [4, 6]
     * > evenOddPalindrome(3)
     * [1, 2]
     * > evenOddPalindrome(63)
     * [6, 8]
     * > evenOddPalindrome(25)
     * [5, 6]
     * > evenOddPalindrome(19)
     * [4, 6]
     * > evenOddPalindrome(9)
     * [4, 5]
     * > evenOddPalindrome(1)
     * [0, 1]
     */
    public static List<Integer> evenOddPalindrome(int n) {
        List<Integer> result = new ArrayList<>();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                if (i % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        result.add(evenCount);
        result.add(oddCount);
        return result;
    }

    /**
     * * Given an integer n, return true if it is a palindrome.
     *
     * Example 1:
     *
     * Input: 121
     * Output: true
     *
     * Example 2:
     *
     * Input: -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     *
     * Example 3:
     *
     * Input: 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     *
     * Note:
     * 1. -2^31 <= x <= 2^31 - 1
     *
     * > isPalindrome(121)
     * true
     * > isPalindrome(-121)
     * false
     * > isPalindrome(10)
     * false
     */
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int reversed = 0;
        int original = n;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
}

// EvenOddPalindromeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains ten unit test cases for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {

    @Test
    void testEvenOddPalindrome1() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(123);
        assertEquals(8, result.get(0));
        assertEquals(13, result.get(1));
    }

    @Test
    void testEvenOddPalindrome2() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(12);
        assertEquals(4, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void testEvenOddPalindrome3() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(3);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void testEvenOddPalindrome4() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(63);
        assertEquals(6, result.get(0));
        assertEquals(8, result.get(1));
    }

    @Test
    void testEvenOddPalindrome5() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(25);
        assertEquals(5, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void testEvenOddPalindrome6() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(19);
        assertEquals(4, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void testEvenOddPalindrome7() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(9);
        assertEquals(4, result.get(0));
        assertEquals(5, result.get(1));
    }

    @Test
    void testEvenOddPalindrome8() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(1);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testEvenOddPalindrome9() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(1000);
        assertEquals(45, result.get(0));
        assertEquals(55, result.get(1));
    }

    @Test
    void testEvenOddPalindrome10() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(100);
        assertEquals(9, result.get(0));
        assertEquals(11, result.get(1));
    }
}