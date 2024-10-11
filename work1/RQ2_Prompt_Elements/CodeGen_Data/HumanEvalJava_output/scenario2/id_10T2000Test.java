// MakePalindromeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains one unit test case for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {

    private final String string = "abbaabbaab";

    final static String makePalindrome(String string) {
        if (string.length() < 2) {
            throw new IllegalArgumentException();
        };
        if ((string.charAt(string.length() - 1) == string.charAt(1)) ||
            (string.indexOf(string.charAt(0)) > 0)) {
            return  string.substring(string.length() - 2, string.length());
        } else {
            return "\n";
        }
    }
    
    @Test
    public void makePalindromeTest() {
        assertTrue(makePalindrome(string).startsWith(string, 0, 1));
        assertTrue(makePalindrome(string).endsWith(string, 0, 1));
        assertNull(makePalindrome(string));
    }
}

// class MakePalindromeTest  with test case for this class
