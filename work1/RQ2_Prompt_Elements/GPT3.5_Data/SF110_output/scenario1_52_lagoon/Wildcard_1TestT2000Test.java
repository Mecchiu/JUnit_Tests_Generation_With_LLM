// Source code for Wildcard_1Test.java

package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Wildcard_1Test {

    @Test
    void testMatchWildcard() {
        String pattern = "file*.txt";
        String filename = "file123.txt";
        String expected = "123";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardNoMatch() {
        String pattern = "file*.txt";
        String filename = "file123.xml";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardMultiplePatterns() {
        String pattern = "file*.txt;*.xml";
        String filename = "file123.txt";
        String expected = "123";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);

        filename = "file456.xml";
        expected = "";
        actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardEmptyPattern() {
        String pattern = "";
        String filename = "file123.txt";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardEmptyFilename() {
        String pattern = "file*.txt";
        String filename = "";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardStarAtBeginning() {
        String pattern = "*.txt";
        String filename = "file123.txt";
        String expected = "file123";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardStarAtEnd() {
        String pattern = "file*";
        String filename = "file123.txt";
        String expected = "123.txt";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardStarAtBeginningAndEnd() {
        String pattern = "*file*.txt";
        String filename = "file123.txt";
        String expected = "123";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardMultipleStars() {
        String pattern = "file*123*.txt";
        String filename = "file456123789.txt";
        String expected = "456";
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }

    @Test
    void testMatchWildcardMultipleStarsNoMatch() {
        String pattern = "file*123*.txt";
        String filename = "file456789.txt";
        String expected = null;
        String actual = Wildcard.matchWildcard(pattern, filename);
        assertEquals(expected, actual);
    }
}