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
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_1() {
		String pattern = "*.html";
		String filename = "index.html";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index", result);
	}
	
	/**
	* Test case 2 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_2() {
		String pattern = "*.html";
		String filename = "index.htm";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 3 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_3() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 4 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_4() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 5 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_5() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 6 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_6() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 7 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_7() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak.bak.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 8 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_8() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak.bak.bak.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 9 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_9() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak.bak.bak.bak.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 10 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_10() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak.bak.bak.bak.bak.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
}

// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_2Test {
		
	/**
	* Test case 1 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_1() {
		String pattern = "*.html";
		String filename = "index.html";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index", result);
	}
	
	/**
	* Test case 2 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_2() {
		String pattern = "*.html";
		String filename = "index.htm";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 3 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_3() {
		String pattern = "*.html";
		String filename = "index.html.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 4 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_4() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 5 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_5() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 6 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a simple pattern.
	*/
	@Test
	void testMatchWildcard_6() {
		String pattern = "*.html";
		String filename = "index.html.bak.bak.bak.bak";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 7 for {@