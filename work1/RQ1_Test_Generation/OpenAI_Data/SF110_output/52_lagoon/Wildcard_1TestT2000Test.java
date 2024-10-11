// Wildcard_1Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_1Test {

	/**
	 * Test case 1 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 1 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html".
	 * The method should return the empty string.
	 */
	@Test
	void testMatchWildcard_1() {
		String pattern = "*.html";
		String filename = "index.html";
		String expected = "";
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 2 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 2 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.htm".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_2() {
		String pattern = "*.html";
		String filename = "index.htm";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 3 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 3 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html.bak".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_3() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 4 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 4 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html.bak".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_4() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 5 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 5 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html.bak".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_5() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 6 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 6 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html.bak".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_6() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 7 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 7 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html.bak".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_7() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 8 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 8 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html.bak".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_8() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 9 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 9 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html.bak".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_9() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 10 for {@link Wildcard#matchWildcard(String, String)}.
	 * <p>
	 * Test case 10 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the filename is "index.html.bak".
	 * The method should return null.
	 */
	@Test
	void testMatchWildcard_10() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
}

// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {
		
	/**
	 * Test case 1 for {@link Wildcard#instantiateWildcard(String, String)}.
	 * <p>
	 * Test case 1 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the part is "index".
	 * The method should return "index.html".
	 */
	@Test
	void testInstantiateWildcard_1() {
		String pattern = "*.html";
		String part = "index";
		String expected = "index.html";
		String actual = Wildcard.instantiateWildcard(pattern, part);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 2 for {@link Wildcard#instantiateWildcard(String, String)}.
	 * <p>
	 * Test case 2 tests the method with a pattern that contains a wildcard.
	 * The pattern is "*.html" and the part is "index".
	 * The method should return "index.html".
	 */
	@Test
	void testInstantiateWildcard_2()