// Source code for Wildcard_0Test.java

package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Wildcard_0Test {

    @Test
    void testIsWildcard_singlePattern() {
        assertFalse(Wildcard.isWildcard("filename.txt"));
    }

    @Test
    void testIsWildcard_singlePatternWithStar() {
        assertTrue(Wildcard.isWildcard("file*.txt"));
    }

    @Test
    void testIsWildcard_singlePatternWithSemicolon() {
        assertFalse(Wildcard.isWildcard("file;name.txt"));
    }

    @Test
    void testIsWildcard_multiplePatterns() {
        assertTrue(Wildcard.isWildcard("file*.txt;*.xml"));
    }

    @Test
    void testIsWildcard_multiplePatternsNoStar() {
        assertTrue(Wildcard.isWildcard("filename.txt;otherfile.xml"));
    }

    @Test
    void testIsWildcard_multiplePatternsNoSemicolon() {
        assertFalse(Wildcard.isWildcard("file*.txt otherfile.xml"));
    }

    @Test
    void testIsWildcard_emptyPattern() {
        assertFalse(Wildcard.isWildcard(""));
    }

    @Test
    void testIsWildcard_starOnly() {
        assertTrue(Wildcard.isWildcard("*"));
    }

    @Test
    void testIsWildcard_starOnlyWithSemicolon() {
        assertTrue(Wildcard.isWildcard("*;*.txt"));
    }

    @Test
    void testIsWildcard_starOnlyWithMultipleSemicolons() {
        assertTrue(Wildcard.isWildcard("*;;;*"));
    }
}