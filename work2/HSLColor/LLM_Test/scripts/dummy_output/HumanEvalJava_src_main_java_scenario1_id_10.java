// MakePalindromeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakePalindrome}.
* It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
*/
class MakePalindromeTest {
			// Test case 1: Empty string
    @Test
    void testEmptyString() {
        String string = "";
        String expected = "";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 2: String with length 1
    @Test
    void testStringWithLength1() {
        String string = "a";
        String expected = "a";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 3: String with length 2
    @Test
    void testStringWithLength2() {
        String string = "ab";
        String expected = "aba";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 4: String with length 3
    @Test
    void testStringWithLength3() {
        String string = "abc";
        String expected = "abcba";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 5: String with length 4
    @Test
    void testStringWithLength4() {
        String string = "abcd";
        String expected = "abcdcba";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 6: String with length 5
    @Test
    void testStringWithLength5() {
        String string = "abcde";
        String expected = "abcdedcba";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 7: String with length 6
    @Test
    void testStringWithLength6() {
        String string = "abcdef";
        String expected = "abcdefedcba";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 8: String with length 7
    @Test
    void testStringWithLength7() {
        String string = "abcdefg";
        String expected = "abcdefgfedcba";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 9: String with length 8
    @Test
    void testStringWithLength8() {
        String string = "abcdefgh";
        String expected = "abcdefghgfedcba";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }

    // Test case 10: String with length 9
    @Test
    void testStringWithLength9() {
        String string = "abcdefghi";
        String expected = "abcdefghihgfedcba";
        String actual = MakePalindrome.makePalindrome(string);
        assertEquals(expected, actual);
    }
}