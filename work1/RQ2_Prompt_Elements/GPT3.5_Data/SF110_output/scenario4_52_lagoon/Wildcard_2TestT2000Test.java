// Source code for Wildcard_2Test.java

package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Wildcard}.
 * It contains ten unit test cases for the {@link Wildcard#instantiateWildcard(String, String)} method.
 */
class Wildcard_2Test {

    @Test
    void testInstantiateWildcard() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard2() {
        String pattern = "file*.txt";
        String part = "";
        String expected = "file.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard3() {
        String pattern = "file*.txt";
        String part = "abc";
        String expected = "fileabc.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard4() {
        String pattern = "file*.txt";
        String part = null;
        String expected = null;
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard5() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard6() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard7() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard8() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard9() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard10() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }
}