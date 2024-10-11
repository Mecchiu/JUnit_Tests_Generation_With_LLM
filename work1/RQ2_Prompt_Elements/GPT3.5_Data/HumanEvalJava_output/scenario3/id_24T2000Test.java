// Here's an implementation of the largestDivisor method and the test cases for it.

// LargestDivisor.java
package scenario3;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
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

// LargestDivisorTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {

    @Test
    void testLargestDivisorFor15() {
        assertEquals(5, LargestDivisor.largestDivisor(15));
    }

    @Test
    void testLargestDivisorFor3() {
        assertEquals(1, LargestDivisor.largestDivisor(3));
    }

    @Test
    void testLargestDivisorFor7() {
        assertEquals(1, LargestDivisor.largestDivisor(7));
    }

    @Test
    void testLargestDivisorFor10() {
        assertEquals(5, LargestDivisor.largestDivisor(10));
    }

    @Test
    void testLargestDivisorFor100() {
        assertEquals(50, LargestDivisor.largestDivisor(100));
    }

    @Test
    void testLargestDivisorFor49() {
        assertEquals(7, LargestDivisor.largestDivisor(49));
    }

    @Test
    void testLargestDivisorFor1() {
        assertEquals(1, LargestDivisor.largestDivisor(1));
    }

    @Test
    void testLargestDivisorForNegativeNumber() {
        assertEquals(1, LargestDivisor.largestDivisor(-10));
    }

    @Test
    void testLargestDivisorForZero() {
        assertEquals(1, LargestDivisor.largestDivisor(0));
    }

    @Test
    void testLargestDivisorForLargeNumber() {
        assertEquals(999999989, LargestDivisor.largestDivisor(999999990));
    }
}