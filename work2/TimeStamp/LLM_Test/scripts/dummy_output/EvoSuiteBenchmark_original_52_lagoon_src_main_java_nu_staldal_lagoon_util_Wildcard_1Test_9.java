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
	 * Test method for {@link Wildcard#matchWildcard(String, String)}.
	 */
	@Test
	public void testMatchWildcard() {
		assertTrue(matchWildcard("*.*", "*.c").startsWith("*.c"));
	}

	/**
	 * Test method for {@link Wildcard#matchWildcard(String, String)}.
	 */
	@Test
	public void testMatchWildcard2() {
		// empty wildcard
		assertNull(matchWildcard("*.c", ""));
		assertNull(matchWildcard("*.c").startsWith("."));

		// wild card pattern for simple expression
		assertSatisfies(new Object[0], wildcard("*.*"), matchWildcard("*.*", "*.*"));
		assertSatisfies(new Object[] {}, wildcard("*.*"), null);
		assertSatisfies(new Object[0], wildcard("*.*", "*.*.*"), null);

		// wild card pattern for compound expression
		assertSatisfies(
			new Object[] {
				"*.c",
				"*.c",
				"*.c",
			}, 
			wildcard("*.*", "*.*.*"), 
			matchWildcard("*.*.*", "*.*.c")
		);
	}
		
}