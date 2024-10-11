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
		// ----------------------------------------------------------- Constructors

		// ---

		// --- Other Methods

		// ----------------------------------------------------------- Individual Tests

		/**
		 * Test method instantiateWildcard(String, String).
		 */
		@Test
        public void test_instantiateWildcard() {
			final String pattern = "/something.*file", part = "a";

			assertTrue(instantiateWildcard(pattern, part));
		}

		/**
		 * Test method instantiateWildcard(String, String).
		 */
		@Test
        public void test_matchWildcard() {
			final String pattern = "/something[^/]file", part = "a";

			assertTrue(instantiateWildcard(pattern, part));
		}

		/**
		 * Test method matchWildcard(String, String).
		 */
		@Test
        public void test_matchWildcard0() {
			final String pattern = "/something[^/]file", part = "a";
			final boolean result = "/something(?:.*file)?".equals(matchWildcard(pattern, part));

			assertEquals(result, result);
		}

		/**
		 * Test method matchWildcard(String, String).
		 */
		@Test
        public void test_matchWildcard1() {
			final String pattern = "/something[^/]file", part = "other1";
			final boolean result = "/something(?:.*file)?".equals(matchWildcard(pattern, part));

			assertTrue(result);
		}

		/**
		 * Test method matchWildcard(String, String).
		 */
		@Test
        public void test_matchWildcard2() {
			final String pattern = "/something[^/*]file", part = "other";
			final boolean result = "/something(?:.*file)?".equals(matchWildcard(pattern, part));

			assertTrue(result);
		}

		/**
		 * Test method matchWildcard(String, String).
		 */
		@Test
        public void test_matchWildcard3() {
			final String pattern = "/something[^/]/*file", part = "other";
			final boolean result = "/something(?:.*file)?".equals(matchWildcard(pattern, part));

			assertTrue(result);
		}

		/**
		 * Test method matchWildcard(String, String).
		 */
		@Test
        public void test_matchWildcard4() {
			final String pattern = "/something[^a-z]/*file", part = "unknown";
			final boolean result = "/something(?:.*file)?".equals(matchWildcard(pattern, part));

			assertTrue(result);
		}

		// ----------------------------------------------------------- Tests

		// ---------------------------- Private Methods

		// --------------------------------------------------------- Constructors

//		@Test
        public void test_constructor() {
			final String pattern = "";
			final String part = "";
			final Wildcard wildcard = new Wildcard(pattern, part);

			assertNotNull(wildcard);
			assertTrue(wildcard.matches(pattern, part));
			assertFalse(wildcard.matches(pattern));
			assertFalse(wildcard.matches(pattern));
		}

		@Test
        public void test_substituematchWildcard() {
			final String pattern = "/.*file", part = "a";
			final Wildcard wildcard = new Wildcard(pattern, part);

			assertTrue(wildcard.matches(pattern, part));
		}

	}