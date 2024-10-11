// WildcardTest.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class WildcardTest {

	/**
	 * Test case 1 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is null.
	 */
	@Test
	void testIsWildcard_1() {
		assertFalse(Wildcard.isWildcard(null));
	}
	
	/**
	 * Test case 2 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is empty.
	 */
	@Test
	void testIsWildcard_2() {
		assertFalse(Wildcard.isWildcard(""));
	}
	
	/**
	 * Test case 3 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testIsWildcard_3() {
		assertFalse(Wildcard.isWildcard("a"));
	}
	
	/**
	 * Test case 4 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is a single character with a wildcard.
	 */
	@Test
	void testIsWildcard_4() {
		assertTrue(Wildcard.isWildcard("*"));
	}
	
	/**
	 * Test case 5 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is a single character with a wildcard.
	 */
	@Test
	void testIsWildcard_5() {
		assertTrue(Wildcard.isWildcard("a*"));
	}
	
	/**
	 * Test case 6 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is a single character with a wildcard.
	 */
	@Test
	void testIsWildcard_6() {
		assertTrue(Wildcard.isWildcard("*a"));
	}
	
	/**
	 * Test case 7 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is a single character with a wildcard.
	 */
	@Test
	void testIsWildcard_7() {
		assertTrue(Wildcard.isWildcard("a*a"));
	}
	
	/**
	 * Test case 8 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is a single character with a wildcard.
	 */
	@Test
	void testIsWildcard_8() {
		assertTrue(Wildcard.isWildcard("a*a*a"));
	}
	
	/**
	 * Test case 9 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is a single character with a wildcard.
	 */
	@Test
	void testIsWildcard_9() {
		assertTrue(Wildcard.isWildcard("a*a*a*a"));
	}
	
	/**
	 * Test case 10 for {@link Wildcard#isWildcard(String)} method.
	 * It tests the case when the input string is a single character with a wildcard.
	 */
	@Test
	void testIsWildcard_10() {
		assertTrue(Wildcard.isWildcard("a*a*a*a*a"));
	}
}