// Here's the source code for the MakePalindromeTest class:

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MakePalindrome}.
 * It contains ten unit test cases for the {@link MakePalindrome#makePalindrome(String)} method.
 */
class MakePalindromeTest {

    @Test
    void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleCharacterString() {
        String input = "a";
        String expectedOutput = "a";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testTwoCharacterPalindrome() {
        String input = "aa";
        String expectedOutput = "aa";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testTwoCharacterNonPalindrome() {
        String input = "ab";
        String expectedOutput = "aba";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testThreeCharacterPalindrome() {
        String input = "aba";
        String expectedOutput = "aba";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testThreeCharacterNonPalindrome() {
        String input = "abc";
        String expectedOutput = "abcba";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFourCharacterPalindrome() {
        String input = "abba";
        String expectedOutput = "abba";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFourCharacterNonPalindrome() {
        String input = "abcd";
        String expectedOutput = "abcddcba";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testLongerPalindrome() {
        String input = "racecar";
        String expectedOutput = "racecar";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testLongerNonPalindrome() {
        String input = "hello";
        String expectedOutput = "helloleh";
        String actualOutput = MakePalindrome.makePalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }
}