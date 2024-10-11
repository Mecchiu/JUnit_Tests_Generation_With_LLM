// DigitsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains one unit test case for the {@link Digits#digits(int)} method.
*/
class DigitsTest {
// Digits.java
package scenario2;

class Digits {

    /**
     * Given a positive integer n, return the product of the odd digits.
     * Return 0 if all digits are even.
     */
    public static int digits(int n) {
        int res = 1;
        boolean hasOdd = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                res *= digit;
                hasOdd = true;
            }
            n /= 10;
        }
        return hasOdd? res : 0;
    }
}

// DigitsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains one unit test case for the {@link Digits#digits(int)} method.
*/
class DigitsTest {
		
    /**
     * Verify that all digits in the sequence 10 to 20 are non-negative.
     */
    @Test
    void testAllDigitsNonNegative() {
        assertEquals(10, 10);
        assertEquals(0, 10);
        assertEquals(1, 10);
        assertEquals(-1, 10);
        assertEquals(-1, 1);
        assertEquals(2, 10);
        assertEquals(3, 1);
        assertEquals(4, 3);
        assertEquals(5, 4);
        assertEquals(5, 3);
        assertEquals(6, 4);
        assertEquals(7, 3);
        assertEquals(8, 4);
        assertEquals(9, 3);
        assertEquals(10, 4);
    }
	
    /**
     * Verify that all digits in the sequence 10 to 19 are non-negative.
     */
    @Test
    void testAllDigitsNonNegativeSecond() {
        assertEquals(10, 10);
        assertEquals(0, 10);
        assertEquals(1, 1);
        assertEquals(-1, 1);
        assertEquals(-1, 10);
        assertEquals(-1, 2);
        assertEquals(-1, 9);
        assertEquals(-1, 8);
        assertEquals(-1, 7);
        assertEquals(-1, 6);
        assertEquals(-1, 5);
        assertEquals(-1, 4);
        assertEquals(-1, 3);
        assertEquals(-1, 2);
        assertEquals(-1, 1);
        assertEquals(0, 5);
        assertEquals(0, 4);
        assertEquals(0, 3);
        assertEquals(1, 2);
        assertEquals(1, 9);
        assertEquals(1, 8);
        assertEquals(1, 7);
        assertEquals(1, 6);
        assertEquals(1, 5);
        assertEquals(1, 4);
        assertEquals(1, 3);
        assertEquals(1, 2);
        assertEquals(1, 9);
        assertEquals(10, 5);
        assertEquals(0, 4);
        assertEquals(0, 3);
        assertEquals(1, 2);
        assertEquals(10, 5);
        assertEquals(0, 4);
        assertEquals(0, 3);
        assertEquals(1, 9);
    }
	
}
