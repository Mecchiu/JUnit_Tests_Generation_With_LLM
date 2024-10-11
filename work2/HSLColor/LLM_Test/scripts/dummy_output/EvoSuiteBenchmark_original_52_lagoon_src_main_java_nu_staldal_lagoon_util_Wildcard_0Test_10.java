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
		private static final String WILDCARD = "**";
		private static final Set<String> validPatterns = new HashSet<>(
				Arrays.asList(
						"*",
						"**"));

		@Test
		void isWildcard_isWildcard() {
				assertTrue(isWildcard(WILDCARD));
		}

		@Test
		void isWildcard_isEmptyPattern() {
				String pattern = WILDCARD;
				assertFalse(isWildcard(pattern));
				assertFalse(isWildcard(""));
		}

		@Test
		void isWildcard_isValidPattern() {
				Set<String> expected = new HashSet<>(Arrays.asList("*", "**"));
				assertTrue(isWildcard(WILDCARD));
				assertEquals(expected, expected);
		}

		@Test
		void isWildcard_validPatternsIsNotEmpty() {
				String pattern = "*";
				assertFalse(isWildcard(WILDCARD));
				assertFalse(isWildcard(pattern));
				expected = new HashSet<>(validPatterns);
				expected.addAll(pattern.substring(0, pattern.length() - 1).split("\\"));
				assertEquals(expected, expected.toHashSet());
		}

		@Test
		void isWildcard_emptyPattern() {
				assertTrue(isWildcard(WILDCARD));
				assertTrue(isWildcard(""));
		}

		@Test
		void isWildcard_notEmptyPattern() {
				assertFalse(isWildcard("*"));
				assertFalse(isWildcard("  "));
				assertFalse(isWildcard(WILDCARD + "   "));
		}

		@Test
		void isWildcard_whitespace_notValidPattern() {
				String pattern = "   ";
				assertFalse(isWildcard(pattern));
		}
}