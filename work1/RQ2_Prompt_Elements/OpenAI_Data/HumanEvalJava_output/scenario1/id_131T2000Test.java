// DigitsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains ten unit test cases for the {@link Digits#digits(int)} method.
*/
class DigitsTest {
	// Test case 1
    @Test
    void testDigits1() {
        int n = 0;
        int expResult = 0;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testDigits2() {
        int n = 1;
        int expResult = 1;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testDigits3() {
        int n = 2;
        int expResult = 0;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testDigits4() {
        int n = 3;
        int expResult = 3;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testDigits5() {
        int n = 4;
        int expResult = 0;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testDigits6() {
        int n = 5;
        int expResult = 5;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testDigits7() {
        int n = 6;
        int expResult = 0;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testDigits8() {
        int n = 7;
        int expResult = 7;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testDigits9() {
        int n = 8;
        int expResult = 0;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testDigits10() {
        int n = 9;
        int expResult = 9;
        int result = Digits.digits(n);
        assertEquals(expResult, result);
    }
}
