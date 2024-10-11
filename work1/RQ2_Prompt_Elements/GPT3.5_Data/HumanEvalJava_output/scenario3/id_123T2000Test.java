// GetOddCollatz.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class GetOddCollatz {

    /**
     * * Given a positive integer n, return a sorted list that has the odd numbers in collatz sequence.
     *
     * The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined
     * as follows: start with any positive integer n. Then each term is obtained from the
     * previous term as follows: if the previous term is even, the next term is one half of
     * the previous term. If the previous term is odd, the next term is 3 times the previous
     * term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.
     *
     * Note:
     * 1. Collatz(1) is [1].
     * 2. returned list sorted in increasing order.
     *
     * For example:
     * getOddCollatz(5) returns [1, 5] # The collatz sequence for 5 is [5, 16, 8, 4, 2, 1], so the odd numbers are only 1, and 5.
     *
     * > getOddCollatz(14)
     * [1, 5, 7, 11, 13, 17]
     * > getOddCollatz(5)
     * [1, 5]
     * > getOddCollatz(12)
     * [1, 3, 5]
     * > getOddCollatz(1)
     * [1]
     */
    public static List<Integer> getOddCollatz(int n) {
        List<Integer> oddCollatz = new ArrayList<>();
        oddCollatz.add(1);
        if (n == 1) {
            return oddCollatz;
        }
        int num = n;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                oddCollatz.add(num);
                num = num * 3 + 1;
            }
        }
        oddCollatz.add(num);
        return oddCollatz;
    }
}

// GetOddCollatzTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
    
    @Test
    void testGetOddCollatzForOne() {
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = GetOddCollatz.getOddCollatz(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForFive() {
        List<Integer> expected = Arrays.asList(1, 5);
        List<Integer> actual = GetOddCollatz.getOddCollatz(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForTwelve() {
        List<Integer> expected = Arrays.asList(1, 3, 5);
        List<Integer> actual = GetOddCollatz.getOddCollatz(12);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForFourteen() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17);
        List<Integer> actual = GetOddCollatz.getOddCollatz(14);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForTwenty() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17, 19);
        List<Integer> actual = GetOddCollatz.getOddCollatz(20);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForThirty() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17, 19);
        List<Integer> actual = GetOddCollatz.getOddCollatz(30);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForFifty() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17, 19, 23, 27, 31, 41, 47);
        List<Integer> actual = GetOddCollatz.getOddCollatz(50);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForHundred() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17, 19, 23, 27, 31, 41, 47, 59, 71, 75, 77, 83, 87, 91, 107);
        List<Integer> actual = GetOddCollatz.getOddCollatz(100);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForThousand() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17, 19, 23, 27, 31, 41, 47, 59, 71, 75, 77, 83, 87, 91, 107, 113, 131, 149, 157, 167, 179, 191, 197, 223, 239, 251, 263, 271, 293, 311, 331, 353, 359, 383, 419, 431, 443, 479, 503, 509, 563, 587, 599, 607, 631, 643, 659, 683, 719, 727, 761, 823, 839, 863, 887, 907, 971, 983);
        List<Integer> actual = GetOddCollatz.getOddCollatz(1000);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetOddCollatzForNegativeNumber() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = GetOddCollatz.getOddCollatz(-5);
        assertEquals(expected, actual);
    }
}