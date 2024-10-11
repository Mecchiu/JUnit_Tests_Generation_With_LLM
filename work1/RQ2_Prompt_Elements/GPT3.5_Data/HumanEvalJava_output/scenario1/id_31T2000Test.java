// IsPrime.java
package scenario1;

public class IsPrime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// IsPrimeTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains ten unit test cases for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {
    
    @Test
    void testIsPrimeWithNegativeNumber() {
        assertFalse(IsPrime.isPrime(-5));
    }
    
    @Test
    void testIsPrimeWithZero() {
        assertFalse(IsPrime.isPrime(0));
    }
    
    @Test
    void testIsPrimeWithOne() {
        assertFalse(IsPrime.isPrime(1));
    }
    
    @Test
    void testIsPrimeWithTwo() {
        assertTrue(IsPrime.isPrime(2));
    }
    
    @Test
    void testIsPrimeWithThree() {
        assertTrue(IsPrime.isPrime(3));
    }
    
    @Test
    void testIsPrimeWithFour() {
        assertFalse(IsPrime.isPrime(4));
    }
    
    @Test
    void testIsPrimeWithLargePrimeNumber() {
        assertTrue(IsPrime.isPrime(7919));
    }
    
    @Test
    void testIsPrimeWithLargeNonPrimeNumber() {
        assertFalse(IsPrime.isPrime(7918));
    }
    
    @Test
    void testIsPrimeWithMaxIntValue() {
        assertFalse(IsPrime.isPrime(Integer.MAX_VALUE));
    }
    
    @Test
    void testIsPrimeWithMinIntValue() {
        assertFalse(IsPrime.isPrime(Integer.MIN_VALUE));
    }
}