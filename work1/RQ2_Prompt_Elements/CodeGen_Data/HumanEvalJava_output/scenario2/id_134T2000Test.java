// CheckIfLastCharIsALetterTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains one unit test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {
@Test
     public void test() {
         // As we set the test variable, one is also set for this test.
         boolean result = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(
             "ABC123DEF345");
         assertTrue(result);
     }
}
