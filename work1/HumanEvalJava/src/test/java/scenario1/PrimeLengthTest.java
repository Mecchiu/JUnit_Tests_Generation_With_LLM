// PrimeLengthTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
			// Test case 1: Empty string
    @Test
    void testEmptyString() {
        assertFalse(PrimeLength.primeLength(""));
    }

    // Test case 2: String with length 1
    @Test
    void testStringLength1() {
        assertFalse(PrimeLength.primeLength("a"));
    }

    // Test case 3: String with length 2
    @Test
    void testStringLength2() {
        assertTrue(PrimeLength.primeLength("ab"));
    }

    // Test case 4: String with length 3
    @Test
    void testStringLength3() {
        assertTrue(PrimeLength.primeLength("abc"));
    }

    // Test case 5: String with length 4
    @Test
    void testStringLength4() {
        assertFalse(PrimeLength.primeLength("abcd"));
    }

    // Test case 6: String with length 5
    @Test
    void testStringLength5() {
        assertTrue(PrimeLength.primeLength("abcde"));
    }

    // Test case 7: String with length 6
    @Test
    void testStringLength6() {
        assertFalse(PrimeLength.primeLength("abcdef"));
    }

    // Test case 8: String with length 7
    @Test
    void testStringLength7() {
        assertTrue(PrimeLength.primeLength("abcdefg"));
    }

    // Test case 9: String with length 8
    @Test
    void testStringLength8() {
        assertFalse(PrimeLength.primeLength("abcdefgh"));
    }

    // Test case 10: String with length 9
    @Test
    void testStringLength9() {
        assertFalse(PrimeLength.primeLength("abcdefghi"));
    }
}