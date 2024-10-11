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
		@Test
	    public void test() {
	        assertTrue(isWildcard("*"));
	        assertTrue(isWildcard("*;"));
	        assertTrue(isWildcard("**"));
	        assertFalse(isWildcard("*;"));

	        assertTrue(isWildcard("*.java"));
	        assertFalse(isWildcard("*.java;*.scala"));
	        assertFalse(isWildcard("*?"));
	        assertFalse(isWildcard(""));

	        assertTrue(isWildcard("/*"));

	        assertTrue(isWildcard("*/*.java"));
	        assertFalse(isWildcard("/**/*.java"));
	        assertFalse(isWildcard("/**?/"));
	        assertFalse(isWildcard("/"));
	        assertFalse(isWildcard("../**"));
	    }
}