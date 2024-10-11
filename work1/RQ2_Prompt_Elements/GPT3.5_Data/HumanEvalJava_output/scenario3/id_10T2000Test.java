// MakePalindrome.java
package scenario3;

class MakePalindrome {

    /**
     * Find the shortest palindrome that begins with a supplied string.
     * Algorithm idea is simple:
     * - Find the longest postfix of supplied string that is a palindrome.
     * - Append to the end of the string reverse of a string prefix that comes before the palindromic suffix.
     *
     * > makePalindrome("")
     * ""
     * > makePalindrome("cat")
     * "catac"
     * > makePalindrome("cata")
     * "catac"
     * > makePalindrome("")
     * ""
     * > makePalindrome("x")
     * "x"
     * > makePalindrome("xyz")
     * "xyzyx"
     * > makePalindrome("xyx")
     * "xyx"
     * > makePalindrome("jerry")
     * "jerryrrej"
     */
    public static String makePalindrome(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        int length = string.length();
        int i = length - 1;
        while (i >= 0) {
            if (isPalindrome(string, 0, i)) {
                break;
            }
            i--;
        }
        StringBuilder sb = new StringBuilder(string);
        for (int j = i + 1; j < length; j++) {
            sb.append(string.charAt(j));
        }
        for (int j = i - 1; j >= 0; j--) {
            sb.append(string.charAt(j));
        }
        return sb.toString();
    }

    private static boolean isPalindrome(String string, int start, int end) {
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// MakePalindromeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {

    @Test
    void testEmptyString() {
        assertEquals("", MakePalindrome.makePalindrome(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals("x", MakePalindrome.makePalindrome("x"));
    }

    @Test
    void testTwoCharacterString() {
        assertEquals("xx", MakePalindrome.makePalindrome("x"));
    }

    @Test
    void testThreeCharacterString() {
        assertEquals("aba", MakePalindrome.makePalindrome("ab"));
    }

    @Test
    void testFourCharacterString() {
        assertEquals("abba", MakePalindrome.makePalindrome("ab"));
    }

    @Test
    void testFiveCharacterString() {
        assertEquals("abcba", MakePalindrome.makePalindrome("abc"));
    }

    @Test
    void testSixCharacterString() {
        assertEquals("abccba", MakePalindrome.makePalindrome("abc"));
    }

    @Test
    void testSevenCharacterString() {
        assertEquals("abcdcba", MakePalindrome.makePalindrome("abcd"));
    }

    @Test
    void testEightCharacterString() {
        assertEquals("abcddcba", MakePalindrome.makePalindrome("abcd"));
    }

    @Test
    void testLongString() {
        assertEquals("jerryrrej", MakePalindrome.makePalindrome("jerry"));
    }
}