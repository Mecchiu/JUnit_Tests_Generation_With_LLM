// DigitsTest.java
package scenario2;


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
        assertEquals(1, Digits.digits(1));
    }

    // Test case 2
    @Test
    void testDigits2() {
        assertEquals(0, Digits.digits(0));
    }

    // Test case 3
    @Test
    void testDigits3() {
        assertEquals(1, Digits.digits(11));
    }

    // Test case 4
    @Test
    void testDigits4() {
        assertEquals(1, Digits.digits(12));
    }

    // Test case 5
    @Test
    void testDigits5() {
        assertEquals(3, Digits.digits(123));
    }

    // Test case 6
    @Test
    void testDigits6() {
        assertEquals(15, Digits.digits(135));
    }

    // Test case 7
    @Test
    void testDigits7() {
        assertEquals(15, Digits.digits(1357));
    }

    // Test case 8
    @Test
    void testDigits8() {
        assertEquals(0, Digits.digits(2468));
    }

    // Test case 9
    @Test
    void testDigits9() {
        assertEquals(1, Digits.digits(1001));
    }

    // Test case 10
    @Test
    void testDigits10() {
        assertEquals(1, Digits.digits(1000));
    }
}
