// Digits.java
package scenario3;

class Digits {

    /**
     * Given a positive integer n, return the product of the odd digits.
     * Return 0 if all digits are even.
     * For example:
     * digits(1)  == 1
     * digits(4)  == 0
     * digits(235) == 15
     *
     * > digits(5)
     * 5
     * > digits(54)
     * 5
     * > digits(120)
     * 1
     * > digits(5014)
     * 5
     * > digits(98765)
     * 315
     * > digits(5576543)
     * 2625
     * > digits(2468)
     * 0
     */
    public static int digits(int n) {
        int product = 1;
        boolean hasOddDigit = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                product *= digit;
                hasOddDigit = true;
            }
            n /= 10;
        }
        return hasOddDigit ? product : 0;
    }
}

// DigitsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains ten unit test cases for the {@link Digits#digits(int)} method.
*/
class DigitsTest {
    
    @Test
    void testDigitsWithOneDigitNumber() {
        assertEquals(1, Digits.digits(1));
    }
    
    @Test
    void testDigitsWithEvenNumber() {
        assertEquals(0, Digits.digits(4));
    }
    
    @Test
    void testDigitsWithOddNumber() {
        assertEquals(15, Digits.digits(235));
    }
    
    @Test
    void testDigitsWithSingleOddDigit() {
        assertEquals(5, Digits.digits(5));
    }
    
    @Test
    void testDigitsWithSingleEvenDigit() {
        assertEquals(0, Digits.digits(4));
    }
    
    @Test
    void testDigitsWithAllEvenDigits() {
        assertEquals(0, Digits.digits(2468));
    }
    
    @Test
    void testDigitsWithAllOddDigits() {
        assertEquals(315, Digits.digits(98765));
    }
    
    @Test
    void testDigitsWithMixedDigits() {
        assertEquals(5, Digits.digits(5014));
        assertEquals(5, Digits.digits(54));
        assertEquals(1, Digits.digits(120));
        assertEquals(2625, Digits.digits(5576543));
    }
    
    @Test
    void testDigitsWithZero() {
        assertEquals(0, Digits.digits(0));
    }
    
    @Test
    void testDigitsWithLargeNumber() {
        assertEquals(945, Digits.digits(123456789));
    }
}