// FizzBuzzTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains one unit test case for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {

    /**
     * Test of fizzBuzz method, of class FizzBuzz.
     */
    @Test
    public void of_fizzBuzz() {
        
        int n = 1; 

        assertEquals(13, FizzBuzz.fizzBuzz(n)); 
        
    }

}
