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
		
	/**
	 * Unit test of {@link Wildcard#matchWildcard(String, String)}.
	 */
	@Test
	void testMatchWildcard() {
		final Object[][] values = {
				{ "a*b*", "a" },
				{ "*b*", "b" },
				{ "*/b*", "*/b" },
		};
		
		testMatchWildcard(values);
	}
	
	/**
	 * Unit test of {@link Wildcard#matchWildcard(String, String)}.
	 *
	 * @param values the given values
	 */
	private static void testMatchWildcard(final Object[][] values) {
		for(int i = 1; i < values.length-1 ; i++) {
			final String pattern = (String)(values[i][0]);
			final String filename = values[i + 1][0];

			for(final String[] pattern_parts : values[i][1]) {
				final String filename2 = matchWildcard(pattern, filename);
				getClass().assertEquals(pattern,filename2);

				String rtn = null;
				rtn = matchWildcard(pattern_parts[0], "*");
				assertNotNull(rtn);
				for(final String part : pattern_parts) {
					assertTrue(rtn.endsWith(part));
				}
				rtn = matchWildcard(pattern_parts[1], "*");
				
				assertNotNull(rtn);
			}
		}
	}
}
// Wildcard_1Test.java