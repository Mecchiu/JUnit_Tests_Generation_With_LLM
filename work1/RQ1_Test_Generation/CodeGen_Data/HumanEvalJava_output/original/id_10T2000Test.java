// MakePalindromeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains one unit test case for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {

    /**
     * This class contains one unit test case for the {@link makePalindrome(String)} method.
     * It tests the value of {@link makePalindrome(String)} method.
     */
    @Test
    public void testMakePalindrome() {
        assertEquals(makePalindrome(""), null);
        assertEquals(makePalindrome("cat"), "catac");
        assertEquals(makePalindrome("cat").length(), 3);
        assertEquals(makePalindrome("cat").toString(), "cat");
        assertEquals(makePalindrome("abc").length(), 3);
        assertEquals(makePalindrome("abc").toString(), "abc");
        assertEquals(makePalindrome("xabcx").length(), 6);
        assertEquals(makePalindrome("xabcx").toString(), "xabcx");
    }
}
