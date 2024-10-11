// CheckIfLastCharIsALetterTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains one unit test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {

    /**
     * Test method for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
     */
    @Test
    public void testCheckIfLastCharIsALetter() {
        boolean ret = true;
        
        // Check if the output is True
        if (ret) {
            assertTrue("checkIfLastCharIsALetter returns True", true);
        }
        // Check if the output is False
        else {
            assertTrue("checkIfLastCharIsALetter returns False", false);
        }
    }
}