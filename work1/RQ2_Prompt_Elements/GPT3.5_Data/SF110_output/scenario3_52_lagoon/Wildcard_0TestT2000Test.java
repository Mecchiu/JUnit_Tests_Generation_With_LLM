// Here's an example implementation of the Wildcard class and a test class for its isWildcard method:

// Wildcard.java
package nu.staldal.lagoon.util;

import java.util.*;

/**
 * Wildcard processing methods. All methods in this class are static.
 *
 * A wildcard pattern consists of one or more simple patterns, separated by ';'.
 * A simple pattern may contain one '*' which match any string
 * (including the empty string).
 */
public final class Wildcard {

    /**
     * Check if a wildcard pattern can possibly match more than one filename.
     *
     * @param pattern the wildcard pattern to test
     */
    public static boolean isWildcard(String pattern) {
        return pattern.contains("*") && !pattern.endsWith("*");
    }
}

// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_0Test {

    @Test
    void testEmptyString() {
        assertFalse(Wildcard.isWildcard(""));
    }

    @Test
    void testNoWildcard() {
        assertFalse(Wildcard.isWildcard("hello"));
    }

    @Test
    void testSingleWildcard() {
        assertTrue(Wildcard.isWildcard("*.txt"));
    }

    @Test
    void testMultipleWildcards() {
        assertTrue(Wildcard.isWildcard("*.txt;*.xml"));
    }

    @Test
    void testWildcardAtBeginning() {
        assertTrue(Wildcard.isWildcard("*.txt;hello.txt"));
    }

    @Test
    void testWildcardAtEnd() {
        assertFalse(Wildcard.isWildcard("hello.txt;*.txt"));
    }

    @Test
    void testMultipleWildcardsWithSameExtension() {
        assertTrue(Wildcard.isWildcard("*.txt;hello*.txt"));
    }

    @Test
    void testMultipleWildcardsWithDifferentExtensions() {
        assertTrue(Wildcard.isWildcard("*.txt;hello*.xml"));
    }

    @Test
    void testMultipleWildcardsWithSamePrefix() {
        assertTrue(Wildcard.isWildcard("hello*;hello*.txt"));
    }

    @Test
    void testMultipleWildcardsWithDifferentPrefixes() {
        assertTrue(Wildcard.isWildcard("hello*;world*.txt"));
    }
}