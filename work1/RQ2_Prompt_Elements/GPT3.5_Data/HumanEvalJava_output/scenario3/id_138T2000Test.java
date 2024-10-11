// Here's an implementation of the IsEqualToSumEven class and its test cases:

// IsEqualToSumEven.java
package scenario3;

class IsEqualToSumEven {

    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
     * Example
     * isEqualToSumEven(4) == False
     * isEqualToSumEven(6) == False
     * isEqualToSumEven(8) == True
     *
     * > isEqualToSumEven(4)
     * false
     * > isEqualToSumEven(6)
     * false
     * > isEqualToSumEven(8)
     * true
     * > isEqualToSumEven(10)
     * true
     * > isEqualToSumEven(11)
     * false
     * > isEqualToSumEven(12)
     * true
     * > isEqualToSumEven(13)
     * false
     * > isEqualToSumEven(16)
     * true
     */
    public static Boolean isEqualToSumEven(int n) {
        // Check if n is less than 8 or odd
        if (n < 8 || n % 2 != 0) {
            return false;
        }
        
        // Check if n can be written as the sum of 4 positive even numbers
        for (int i = 2; i <= n / 2; i += 2) {
            for (int j = 2; j <= n / 2; j += 2) {
                for (int k = 2; k <= n / 2; k += 2) {
                    for (int l = 2; l <= n / 2; l += 2) {
                        if (i + j + k + l == n) {
                            return true;
                        }
                    }
                }
            }
        }
        
        return false;
    }
}

// IsEqualToSumEvenTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
    @Test
    void testIsEqualToSumEven_4() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
    }
    
    @Test
    void testIsEqualToSumEven_6() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
    }
    
    @Test
    void testIsEqualToSumEven_8() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
    }
    
    @Test
    void testIsEqualToSumEven_10() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(10));
    }
    
    @Test
    void testIsEqualToSumEven_11() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(11));
    }
    
    @Test
    void testIsEqualToSumEven_12() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(12));
    }
    
    @Test
    void testIsEqualToSumEven_13() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(13));
    }
    
    @Test
    void testIsEqualToSumEven_16() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(16));
    }
    
    @Test
    void testIsEqualToSumEven_18() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(18));
    }
    
    @Test
    void testIsEqualToSumEven_20() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(20));
    }
}