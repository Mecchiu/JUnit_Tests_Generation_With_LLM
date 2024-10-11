// PrimeLengthTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains one unit test case for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {

		 /**
     * The name of test.
     */
    @Test
    void test() {
        assertEquals(true, primeLength("Hello").s);
        assertEquals(false, primeLength("abcdcba").s);
        assertEquals(true, primeLength("kittens").s);
        assertEquals(false, primeLength("orange").s);
        assertEquals(true, primeLength("wow").s);
        assertEquals(true, primeLength("world").s);
        assertEquals(true, primeLength("MadaM").s);
        assertEquals(true, primeLength("Wow").s);
    }
}
