// PrimeLengthTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains one unit test case for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {

    /**
     * Test the class of {@link PrimeLength#primeLength(String)} method
     * with null input.
     * @throws Exception if the test fails.
     */
    @Test
    void nullInputTest() throws Exception {
        assertEquals(PrimeLength.primeLength(""), null);
    }
    
    /**
     * Test the class of {@link PrimeLength#primitiveLengthForString(String)} method with null string input.
     * @throws Exception if the test fails.
     */
    @Test
    void nullArgumentTest() throws Exception { 
        assertEquals(PrimeLength.primitiveLengthForString(""), null);
    }
    
    /**
     * Test the class of {@link PrimeLength#primitiveLengthForString(String)} method with null input.
     * @throws Exception if the test fails.
     */
    @Test
    void primalityTest(){
        assertEquals(PrimeLength.primitiveLengthForString("1"), 1);
        assertEquals(PrimeLength.primitiveLengthForString("11"), 11);
        assertEquals(PrimeLength.primitiveLengthForString("123"), 123);
    }
}    
