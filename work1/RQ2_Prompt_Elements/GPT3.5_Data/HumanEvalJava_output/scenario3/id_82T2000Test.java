// PrimeLength.java
package scenario3;

class PrimeLength {

    /**
     * Write a function that takes a string and returns True if the string
     * length is a prime number or False otherwise
     * Examples
     * primeLength('Hello') == True
     * primeLength('abcdcba') == True
     * primeLength('kittens') == True
     * primeLength('orange') == False
     *
     * > primeLength("Hello")
     * true
     * > primeLength("abcdcba")
     * true
     * > primeLength("kittens")
     * true
     * > primeLength("orange")
     * false
     * > primeLength("wow")
     * true
     * > primeLength("world")
     * true
     * > primeLength("MadaM")
     * true
     * > primeLength("Wow")
     * true
     * > primeLength("")
     * false
     * > primeLength("HI")
     * true
     * > primeLength("go")
     * true
     * > primeLength("gogo")
     * false
     * > primeLength("aaaaaaaaaaaaaaa")
     * false
     * > primeLength("Madam")
     * true
     * > primeLength("M")
     * false
     * > primeLength("0")
     * false
     */
    public static Boolean primeLength(String string) {
        int length = string.length();
        if (length < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(length); i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// PrimeLengthTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains ten unit test cases for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {
    @Test
    void testPrimeLength() {
        assertTrue(PrimeLength.primeLength("Hello"));
        assertTrue(PrimeLength.primeLength("abcdcba"));
        assertTrue(PrimeLength.primeLength("kittens"));
        assertFalse(PrimeLength.primeLength("orange"));
        assertTrue(PrimeLength.primeLength("wow"));
        assertTrue(PrimeLength.primeLength("world"));
        assertTrue(PrimeLength.primeLength("MadaM"));
        assertTrue(PrimeLength.primeLength("Wow"));
        assertFalse(PrimeLength.primeLength(""));
        assertTrue(PrimeLength.primeLength("HI"));
        assertTrue(PrimeLength.primeLength("go"));
        assertFalse(PrimeLength.primeLength("gogo"));
        assertFalse(PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
        assertTrue(PrimeLength.primeLength("Madam"));
        assertFalse(PrimeLength.primeLength("M"));
        assertFalse(PrimeLength.primeLength("0"));
    }
}