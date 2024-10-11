// AntiShuffle.java
package scenario3;

import java.util.Arrays;

class AntiShuffle {

    /**
     * * Write a function that takes a string and returns an ordered version of it.
     * Ordered version of string, is a string where all words (separated by space)
     * are replaced by a new word where all the characters arranged in
     * ascending order based on ascii value.
     * Note: You should keep the order of words and blank spaces in the sentence.
     *
     * For example:
     * antiShuffle('Hi') returns 'Hi'
     * antiShuffle('hello') returns 'ehllo'
     * antiShuffle('Hello World!!!') returns 'Hello !!!Wdlor'
     *
     * > antiShuffle("Hi")
     * "Hi"
     * > antiShuffle("hello")
     * "ehllo"
     * > antiShuffle("number")
     * "bemnru"
     * > antiShuffle("abcd")
     * "abcd"
     * > antiShuffle("Hello World!!!")
     * "Hello !!!Wdlor"
     * > antiShuffle("")
     * ""
     * > antiShuffle("Hi. My name is Mister Robot. How are you?")
     * ".Hi My aemn is Meirst .Rboot How aer ?ouy"
     */
    public static String antiShuffle(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            sb.append(chars);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}

// AntiShuffleTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

    @Test
    void testEmptyString() {
        String s = "";
        String expected = "";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleWord() {
        String s = "Hi";
        String expected = "Hi";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleWordSorted() {
        String s = "hello";
        String expected = "ehllo";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleWords() {
        String s = "Hi. My name is Mister Robot. How are you?";
        String expected = ".Hi My aemn is Meirst .Rboot How aer ?ouy";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAllCharactersSame() {
        String s = "aaaaa";
        String expected = "aaaaa";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAllCharactersDifferent() {
        String s = "abcd";
        String expected = "abcd";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testSpecialCharacters() {
        String s = "Hello World!!!";
        String expected = "Hello !!!Wdlor";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testLeadingAndTrailingSpaces() {
        String s = "  Hello World!!!  ";
        String expected = "  Hello !!!Wdlor  ";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleSpacesBetweenWords() {
        String s = "Hello   World!!!";
        String expected = "Hello   !!!Wdlor";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testOnlySpaces() {
        String s = "   ";
        String expected = "   ";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }
}