// Source code for Wildcard_2Test.java

package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Wildcard_2Test {

    @Test
    void testInstantiateWildcard_noWildcard() {
        String pattern = "file.txt";
        String part = "123";
        String expected = "file.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_oneWildcard() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_oneWildcard_emptyPart() {
        String pattern = "file*.txt";
        String part = "";
        String expected = "file.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_oneWildcard_multipleParts() {
        String pattern = "file*.txt";
        String part = "123;456";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_multipleWildcards() {
        String pattern = "file*part*.txt";
        String part = "123";
        String expected = "file123part.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_multipleWildcards_emptyPart() {
        String pattern = "file*part*.txt";
        String part = "";
        String expected = "filepart.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_multipleWildcards_multipleParts() {
        String pattern = "file*part*.txt";
        String part = "123;456";
        String expected = "file123part456.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_onlyWildcard() {
        String pattern = "*";
        String part = "123";
        String expected = "123";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_onlyWildcard_emptyPart() {
        String pattern = "*";
        String part = "";
        String expected = "";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_onlyWildcard_multipleParts() {
        String pattern = "*";
        String part = "123;456";
        String expected = "123";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }
}