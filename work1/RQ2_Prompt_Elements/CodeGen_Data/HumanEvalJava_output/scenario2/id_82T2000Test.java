// PrimeLengthTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains one unit test case for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {

    /**
     * A test case for the {@link PrimeLength#primeLength(String)} method.
     */
    @Test
    public void testWithString() {
        
        PrimeLength prime1 = new PrimeLength();
        
        assertEquals(true, prime1.primeLength("abcba"));
        assertEquals(false, prime1.primeLength("bbb"));
        assertEquals(false, prime1.primeLength("aa"));
        assertEquals(false, prime1.primeLength("aaa"));
    }
}