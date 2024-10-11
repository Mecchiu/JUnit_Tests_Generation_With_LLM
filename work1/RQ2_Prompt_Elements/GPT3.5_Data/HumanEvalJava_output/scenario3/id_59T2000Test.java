// LargestPrimeFactor.java
package scenario3;

class LargestPrimeFactor {

    /**
     * Return the largest prime factor of n. Assume n > 1 and is not a prime.
     *
     * > largestPrimeFactor(2048)
     * 2
     * > largestPrimeFactor(15)
     * 5
     * > largestPrimeFactor(27)
     * 3
     * > largestPrimeFactor(63)
     * 7
     * > largestPrimeFactor(330)
     * 11
     * > largestPrimeFactor(13195)
     * 29
     */
    public static int largestPrimeFactor(int n) {
        int largestPrime = 2;
        while (n > largestPrime) {
            if (n % largestPrime == 0) {
                n /= largestPrime;
            } else {
                largestPrime++;
            }
        }
        return largestPrime;
    }
}

// LargestPrimeFactorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
    @Test
    void testLargestPrimeFactor2048() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
    }

    @Test
    void testLargestPrimeFactor15() {
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
    }

    @Test
    void testLargestPrimeFactor27() {
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
    }

    @Test
    void testLargestPrimeFactor63() {
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
    }

    @Test
    void testLargestPrimeFactor330() {
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
    }

    @Test
    void testLargestPrimeFactor13195() {
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
    }

    @Test
    void testLargestPrimeFactor2() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
    }

    @Test
    void testLargestPrimeFactor3() {
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(3));
    }

    @Test
    void testLargestPrimeFactor4() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(4));
    }

    @Test
    void testLargestPrimeFactor5() {
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(5));
    }
}