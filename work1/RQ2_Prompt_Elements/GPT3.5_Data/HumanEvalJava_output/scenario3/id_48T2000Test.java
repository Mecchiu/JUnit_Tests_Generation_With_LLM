// IsPalindrome.java
package scenario3;

class IsPalindrome {

    /**
     * Checks if given string is a palindrome
     *
     * > isPalindrome("")
     * true
     * > isPalindrome("aba")
     * true
     * > isPalindrome("aaaaa")
     * true
     * > isPalindrome("zbcd")
     * false
     * > isPalindrome("xywyx")
     * true
     * > isPalindrome("xywyz")
     * false
     * > isPalindrome("xywzx")
     * false
     */
    public static Boolean isPalindrome(String text) {
        if (text == null || text.length() == 0) {
            return true;
        }
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// IsPalindromeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
    @Test
    void testEmptyString() {
        assertTrue(IsPalindrome.isPalindrome(""));
    }

    @Test
    void testSingleCharacterString() {
        assertTrue(IsPalindrome.isPalindrome("a"));
    }

    @Test
    void testPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("aba"));
    }

    @Test
    void testLongPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("aaaaa"));
    }

    @Test
    void testNonPalindromeString() {
        assertFalse(IsPalindrome.isPalindrome("zbcd"));
    }

    @Test
    void testEvenLengthPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("xyyxy"));
    }

    @Test
    void testOddLengthPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("xywyx"));
    }

    @Test
    void testNonPalindromeStringWithSameFirstAndLastCharacters() {
        assertFalse(IsPalindrome.isPalindrome("xywyz"));
    }

    @Test
    void testNonPalindromeStringWithSameFirstAndLastCharacters2() {
        assertFalse(IsPalindrome.isPalindrome("xywzx"));
    }

    @Test
    void testNullString() {
        assertTrue(IsPalindrome.isPalindrome(null));
    }
}