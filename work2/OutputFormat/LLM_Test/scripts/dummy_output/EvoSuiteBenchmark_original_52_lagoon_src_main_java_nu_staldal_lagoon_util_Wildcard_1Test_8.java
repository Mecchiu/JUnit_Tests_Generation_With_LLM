// Wildcard_1Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_1Test {
		private static final String[] WILDCARD = {
				"testfile.txt"
		};

// Test method for {@link Wildcard#matchWildcard(String, String)}.
    @Test
    public void matchWildcardTest() {
        final String patternString = "testfile.txt";
        for(final String wildcard : WILDCARD) {
            final String filename = matchWildcard(patternString, wildcard);
            assertEquals(patternString + " does not match: " + wildcard, patternString, filename);
        }
        for(final String wildcard : WILDCARD) {
            final String patternString = "testfile.txt" + wildcard;
            final String filename = matchWildcard(patternString, wildcard);
            assertEquals(patternString + " does not match: " + wildcard, patternString, filename);
        }
    }
}