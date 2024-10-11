// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_0Test {
		static final String WILDCARD  = ";*";
		static final int  WILDCARD_LENGTH = 0;
		static final Set<String> INVALID = new HashSet<String>();
		static final Set<String> valid = new HashSet<String>();

		static {
				valid.add("*");
				valid.add("");
		}

		public static final Set<String> expected = new HashSet<String>(
				valid);

		/***********************************************************************************************/
          /***** Tests *****/

    static @Test
    void invalid() {
        assertFalse("Wildcard should never match the invalid case.", canMatch("a*"));
        assertFalse("Wildcard should never match the invalid case.", canMatch("*"));
        assertTrue("Wildcard should match the invalid case.", canMatch("a"));
        assertFalse("Wildcard should match the invalid case.", canMatch("a*"));
        assertFalse("Wildcard should match the invalid case.", canMatch("*"));
        assertFalse("Wildcard should not match the invalid case.", canMatch("a\\"));
    }

    static @Test
    void valid() {
        assertFalse("Wildcard should never match the valid case.", canMatch("a"));
        assertFalse("Wildcard should never match the valid case.", canMatch("*"));
        assertTrue("Wildcard should match the valid case.", canMatch("a*"));
        assertTrue("Wildcard should match the valid case.", canMatch("a"));
        assertTrue("Wildcard should match the valid case.", canMatch("a*"));
        assertTrue("Wildcard should match the valid case.", canMatch("*"));
        assertTrue("Wildcard should match the valid case.", canMatch("a\\"));
        assertTrue("Wildcard should match the valid case.", canMatch("*"));
    }

    static boolean canMatch(String ws) {
        assertNotNull("Wildcard should not be null.", ws);
        int i = ws.indexOf(WILDCARD);
        return (i > 0 && ws.toString().endsWith(WILDCARD) && ws.length() == WILDCARD_LENGTH) ||
               (i < 0 && ws.toString().startsWith(WILDCARD));
    }

}