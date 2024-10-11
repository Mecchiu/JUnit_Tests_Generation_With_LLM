// Source code for Wildcard_1Test.java

package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Wildcard}.
 * It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
 */
class Wildcard_1Test {

    @Test
    void testMatchWildcard() {
        String pattern = "*.txt";
        String filename = "file.txt";
        String expected = "file";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard2() {
        String pattern = "*.txt";
        String filename = "file.xml";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard3() {
        String pattern = "file*.txt";
        String filename = "file1.txt";
        String expected = "1";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard4() {
        String pattern = "file*.txt";
        String filename = "file.txt";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard5() {
        String pattern = "file*.txt;*.xml";
        String filename = "file1.txt";
        String expected = "1";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard6() {
        String pattern = "file*.txt;*.xml";
        String filename = "file.xml";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard7() {
        String pattern = "file*.txt;*.xml";
        String filename = "file2.xml";
        String expected = "2";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard8() {
        String pattern = "file*.txt;*.xml";
        String filename = "file2.txt";
        String expected = "2";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard9() {
        String pattern = "file*.txt;*.xml";
        String filename = "file3.html";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcard10() {
        String pattern = "file*.txt;*.xml";
        String filename = "file.txt.xml";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }
}