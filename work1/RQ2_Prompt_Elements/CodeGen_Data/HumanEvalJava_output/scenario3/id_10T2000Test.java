// MakePalindromeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains one unit test case for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {
/**
		* Test unit test method to makePalindrome.
		*/
     @Test
    public void testMakePalindrome() {
        String string = "catac";
        assertEquals("catac", makePalindrome(string));
    }
}