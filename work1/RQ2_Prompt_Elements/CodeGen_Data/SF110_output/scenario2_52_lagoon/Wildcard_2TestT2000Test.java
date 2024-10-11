// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {
@Test
    public void instantiateWildcard_1Test() {
        final String pattern = ".*.txt";
        final String part = ".*.txt";

        String expected =
                "/home/.*\n" + 
                "/home/usr/.*\n" + 
                "/home/usr/a/.*\n" + 
                "/home/usr/a/.*"
        ;

        assertEquals(expected, Wildcard.instantiateWildcard(pattern, part));
    }

        @Test
    public void instantiateWildcard_2Test() {
        final String pattern = "*.*.txt";
        final String part = "*.*.txt";

        String expected =
            "/home/.*\n" + 
            "/home/usr/a.*"
        ;

        assertEquals(expected, Wildcard.instantiateWildcard(pattern, part));
    }

		@Test
    public void matchWildcard_1Test() {
        final String pattern = ".*.txt";
        final String part = ".*.txt";
        final String expected = "*";
        final String part2 = ".*.txt";

        // this is the correct value
        String actual = Wildcard.matchWildcard(pattern, part);
        assertEquals(expected, actual);
        assertEquals(part, actual);

        // this should stay the correct value
        actual = Wildcard.matchWildcard(pattern, part2);
        assertEquals(expected, actual);
        assertEquals(part2, actual);
    }

		@Test
    public void matchWildcard_2Test() {
        final String pattern = ".*\n";
        final String part = "\n";
        final String expected = "*";
        final String part2 = "\n";

             assertEquals(expected, Wildcard.matchWildcard(pattern, part));
             assertEquals(part, Wildcard.matchWildcard(pattern, part2));
    }
}