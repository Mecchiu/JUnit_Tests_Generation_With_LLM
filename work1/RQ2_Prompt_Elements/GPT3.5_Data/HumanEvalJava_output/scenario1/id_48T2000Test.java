// IsPalindrome.java
package scenario1;

class IsPalindrome {

    public static Boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// IsPalindromeTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPalindrome}.
* It contains ten unit test cases for the {@link IsPalindrome#isPalindrome(String)} method.
*/
class IsPalindromeTest {
    
    @Test
    void testIsPalindromeWithEmptyString() {
        assertTrue(IsPalindrome.isPalindrome(""));
    }
    
    @Test
    void testIsPalindromeWithSingleCharacter() {
        assertTrue(IsPalindrome.isPalindrome("a"));
    }
    
    @Test
    void testIsPalindromeWithTwoIdenticalCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aa"));
    }
    
    @Test
    void testIsPalindromeWithTwoDifferentCharacters() {
        assertFalse(IsPalindrome.isPalindrome("ab"));
    }
    
    @Test
    void testIsPalindromeWithThreeIdenticalCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaa"));
    }
    
    @Test
    void testIsPalindromeWithThreeDifferentCharacters() {
        assertFalse(IsPalindrome.isPalindrome("abc"));
    }
    
    @Test
    void testIsPalindromeWithPalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("racecar"));
    }
    
    @Test
    void testIsPalindromeWithNonPalindromeString() {
        assertFalse(IsPalindrome.isPalindrome("hello"));
    }
    
    @Test
    void testIsPalindromeWithMixedCasePalindromeString() {
        assertTrue(IsPalindrome.isPalindrome("Racecar"));
    }
    
    @Test
    void testIsPalindromeWithMixedCaseNonPalindromeString() {
        assertFalse(IsPalindrome.isPalindrome("Hello"));
    }
}