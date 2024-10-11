// MediaWiki_1Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link MediaWiki}.
 * It contains ten unit test cases for the {@link MediaWiki#encode(String)} method.
 */
class MediaWiki_1Test {

    @Test
    void testEncode_emptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncode_space() {
        String input = " ";
        String expectedOutput = "%20";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncode_lowercaseLetters() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expectedOutput = "abcdefghijklmnopqrstuvwxyz";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncode_uppercaseLetters() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expectedOutput = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncode_numbers() {
        String input = "0123456789";
        String expectedOutput = "0123456789";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncode_specialCharacters() {
        String input = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String expectedOutput = "%21%22%23%24%25%26%27%28%29%2A%2B%2C-.%2F%3A%3B%3C%3D%3E%3F%40%5B%5C%5D%5E_%60%7B%7C%7D%7E";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncode_nonAsciiCharacters() {
        String input = "äöüß";
        String expectedOutput = "%C3%A4%C3%B6%C3%BC%C3%9F";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEncode_null() {
        String input = null;
        assertThrows(NullPointerException.class, () -> MediaWiki.encode(input));
    }

    @Test
    void testEncode_unsupportedEncodingException() {
        String input = "test";
        MediaWiki.CHARSET = "unsupportedCharset";
        assertThrows(UnsupportedEncodingException.class, () -> MediaWiki.encode(input));
    }

    @Test
    void testEncode_url() {
        String input = "https://www.wikipedia.org/";
        String expectedOutput = "https%3A%2F%2Fwww.wikipedia.org%2F";
        String actualOutput = MediaWiki.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }
}