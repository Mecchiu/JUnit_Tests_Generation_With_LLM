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
	 * Test case 1 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard1() {
		assertTrue(Wildcard.isWildcard("*.java"));
	}
	
	/**
	 * Test case 2 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard2() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml"));
	}
	
	/**
	 * Test case 3 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard3() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml;*.txt"));
	}
	
	/**
	 * Test case 4 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard4() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml;*.txt;*.html"));
	}
	
	/**
	 * Test case 5 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard5() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml;*.txt;*.html;*.css"));
	}
	
	/**
	 * Test case 6 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard6() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml;*.txt;*.html;*.css;*.js"));
	}
	
	/**
	 * Test case 7 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard7() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml;*.txt;*.html;*.css;*.js;*.jsp"));
	}
	
	/**
	 * Test case 8 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard8() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml;*.txt;*.html;*.css;*.js;*.jsp;*.jspf"));
	}
	
	/**
	 * Test case 9 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard9() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml;*.txt;*.html;*.css;*.js;*.jsp;*.jspf;*.properties"));
	}
	
	/**
	 * Test case 10 for {@link Wildcard#isWildcard(String)}.
	 * It tests the method with a wildcard pattern.
	 */
	@Test
	void testIsWildcard10() {
		assertTrue(Wildcard.isWildcard("*.java;*.xml;*.txt;*.html;*.css;*.js;*.jsp;*.jspf;*.properties;*.xsl"));
	}
}