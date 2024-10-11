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
		// A wildcard pattern consists of one or more simple patterns, separated by ';'.
		// A simple pattern may contain one '*' which match any string
		// (including the empty string).
	
		/**
		 * Test wildcard pattern match.
		 *
		 * @param pattern the wildcard pattern
		 * @param filename the filename
		 * @return the string substituted into the pattern,
		 *         or null if no match could be made
		 */
		@Test
		public String test1(String pattern, String filename)    {
			return matchWildcard(pattern, filename);
		}

		/**
		 * Test wildcard pattern match.
		 *
		 * @param pattern the wildcard pattern
		 * @return the string substituted into the pattern,
		 *         or null if no match could be made
		 */
		@Test
		public String test2(String pattern)    {
			return matchWildcard(pattern, null);
		}
}