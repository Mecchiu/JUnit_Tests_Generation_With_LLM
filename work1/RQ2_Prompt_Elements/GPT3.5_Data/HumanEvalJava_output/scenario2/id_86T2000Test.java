// AntiShuffleTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

    @Test
    void testAntiShuffleWithEmptyString() {
        String s = "";
        String expected = "";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithSingleWord() {
        String s = "hello";
        String expected = "ehllo";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithMultipleWords() {
        String s = "hello world";
        String expected = "ehllo dlorw";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithRepeatedWords() {
        String s = "hello hello";
        String expected = "ehllo ehllo";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithMixedCaseWords() {
        String s = "Hello World";
        String expected = "Hllooe Wdlor";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithSpecialCharacters() {
        String s = "hello! world?";
        String expected = "!ehllo dlorw?";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithNumbers() {
        String s = "hello 123 world 456";
        String expected = "ehllo 123 dlorw 456";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithLeadingAndTrailingSpaces() {
        String s = "  hello world  ";
        String expected = "  ehllo dlorw  ";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithMultipleSpacesBetweenWords() {
        String s = "hello   world";
        String expected = "ehllo   dlorw";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleWithUnicodeCharacters() {
        String s = "こんにちは 世界";
        String expected = "いかにちお 世界";
        String actual = AntiShuffle.antiShuffle(s);
        assertEquals(expected, actual);
    }
}