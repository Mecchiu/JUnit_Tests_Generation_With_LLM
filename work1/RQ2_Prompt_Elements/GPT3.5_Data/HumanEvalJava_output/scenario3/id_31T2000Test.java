// IsPrime.java
package scenario3;

class IsPrime {

    /**
     * Return true if a given number is prime, and false otherwise.
     *
     * > isPrime(6)
     * false
     * > isPrime(101)
     * true
     * > isPrime(11)
     * true
     * > isPrime(13441)
     * true
     * > isPrime(61)
     * true
     * > isPrime(4)
     * false
     * > isPrime(1)
     * false
     * > isPrime(5)
     * true
     * > isPrime(11)
     * true
     * > isPrime(17)
     * true
     * > isPrime(85)
     * false
     * > isPrime(77)
     * false
     * > isPrime(255379)
     * false
     */
    public static Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// IsPrimeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains ten unit test cases for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {
    @Test
    void testIsPrime() {
        assertFalse(IsPrime.isPrime(6));
        assertTrue(IsPrime.isPrime(101));
        assertTrue(IsPrime.isPrime(11));
        assertTrue(IsPrime.isPrime(13441));
        assertTrue(IsPrime.isPrime(61));
        assertFalse(IsPrime.isPrime(4));
        assertFalse(IsPrime.isPrime(1));
        assertTrue(IsPrime.isPrime(5));
        assertTrue(IsPrime.isPrime(11));
        assertTrue(IsPrime.isPrime(17));
        assertFalse(IsPrime.isPrime(85));
        assertFalse(IsPrime.isPrime(77));
        assertFalse(IsPrime.isPrime(255379));
    }
}