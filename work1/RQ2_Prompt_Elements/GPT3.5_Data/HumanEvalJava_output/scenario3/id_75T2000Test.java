// IsMultiplyPrime.java
package scenario3;

import java.util.ArrayList;

class IsMultiplyPrime {

    /**
     * Write a function that returns true if the given number is the multiplication of 3 prime numbers
     * and false otherwise.
     * Knowing that (a) is less than 100.
     * Example:
     * isMultiplyPrime(30) == true
     * 30 = 2 * 3 * 5
     *
     * > isMultiplyPrime(5)
     * false
     * > isMultiplyPrime(30)
     * true
     * > isMultiplyPrime(8)
     * true
     * > isMultiplyPrime(10)
     * false
     * > isMultiplyPrime(125)
     * true
     * > isMultiplyPrime(105)
     * true
     * > isMultiplyPrime(126)
     * false
     * > isMultiplyPrime(729)
     * false
     * > isMultiplyPrime(891)
     * false
     * > isMultiplyPrime(1001)
     * true
     */
    public static Boolean isMultiplyPrime(int a) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= a; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        int count = 0;
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i + 1; j < primes.size(); j++) {
                for (int k = j + 1; k < primes.size(); k++) {
                    if (primes.get(i) * primes.get(j) * primes.get(k) == a) {
                        count++;
                    }
                }
            }
        }
        return count == 1;
    }
}

// IsMultiplyPrimeTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {
    @Test
    void testIsMultiplyPrime1() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
    }

    @Test
    void testIsMultiplyPrime2() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
    }

    @Test
    void testIsMultiplyPrime3() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
    }

    @Test
    void testIsMultiplyPrime4() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
    }

    @Test
    void testIsMultiplyPrime5() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
    }

    @Test
    void testIsMultiplyPrime6() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
    }

    @Test
    void testIsMultiplyPrime7() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
    }

    @Test
    void testIsMultiplyPrime8() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
    }

    @Test
    void testIsMultiplyPrime9() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
    }

    @Test
    void testIsMultiplyPrime10() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
    }
}