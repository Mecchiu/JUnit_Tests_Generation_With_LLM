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

    /**
     * Test the isWildcard method.
     */
	/**
     * Test the equals method.
     */
    @Test
    public void testEquals() {
        String pattern = "**";

        assertEquals(pattern, "**");
        assertNotEquals(pattern, "*");
    }

		/**
     * Test the getType method.
     */
	public void testGetType() {
        assertTrue(isWildcard("**")); // a wildcard pattern can match any filename
        assertTrue(isWildcard("a.*")); // a wildcard pattern can match any extension
        assertFalse(isWildcard("file")); // a wildcard pattern can match any file name
        assertFalse(isWildcard("file.*"));
	}

		/**
     * Test the toString method.
     */
	public void testToString() {
        assertEquals(isWildcard("file")? "**" : "file.", "**");
	}
}

