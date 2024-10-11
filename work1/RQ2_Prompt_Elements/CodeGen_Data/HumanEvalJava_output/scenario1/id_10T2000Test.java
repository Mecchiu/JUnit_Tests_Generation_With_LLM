// MakePalindromeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains one unit test case for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {
public static String testString = "Hello, there!";
		@Test
        public void testConstructor() {
            String expectedString = "Hello, there!";
            String actualString = MakePalindrome.makePalindrome(testString);
            assertEquals(expectedString, actualString);
        }

}
class MakePalindromeTest2 {
    private String testString = "Hello, there!";
    public String makePalindrome(String testString) {
        MakePalindrome makePalindrome = new MakePalindrome();
        return makePalindrome.makePalindrome(testString);
    }

    @Test
        public void testConstructor() {
            String expectedString = "Hello, there!";
            String actualString = MakePalindrome.makePalindrome(testString);
            assertEquals(expectedString, actualString);
        }
    
}
