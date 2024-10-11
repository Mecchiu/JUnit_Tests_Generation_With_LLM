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
	*/
	@Test
	void testInstantiateWildcard_1() {
		String pattern = "*.html";
		String part = "index.html";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("index.html", result);
	}
	
	/**
	* Test case 2 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_2() {
		String pattern = "*.html";
		String part = "index.htm";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("index.htm.html", result);
	}
	
	/**
	* Test case 3 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_3() {
		String pattern = "*.html";
		String part = "index";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("index.html", result);
	}
	
	/**
	* Test case 4 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_4() {
		String pattern = "*.html";
		String part = "";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals(".html", result);
	}
	
	/**
	* Test case 5 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_5() {
		String pattern = "*.html";
		String part = null;
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals(null, result);
	}
	
	/**
	* Test case 6 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_6() {
		String pattern = "*.html";
		String part = "index.html.html";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("index.html.html", result);
	}
	
	/**
	* Test case 7 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_7() {
		String pattern = "*.html";
		String part = "index.html.htm";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("index.html.htm.html", result);
	}
	
	/**
	* Test case 8 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_8() {
		String pattern = "*.html";
		String part = "index.html.html.html";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("index.html.html.html", result);
	}
	
	/**
	* Test case 9 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_9() {
		String pattern = "*.html";
		String part = "index.html.htm.html";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("index.html.htm.html", result);
	}
	
	/**
	* Test case 10 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_10() {
		String pattern = "*.html";
		String part = "index.html.html.htm";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("index.html.html.htm.html", result);
	}
}

// Wildcard_3Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_3Test {
		
	/**
	* Test case 1 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_1() {
		String pattern = "*.html";
		String filename = "index.html";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html", result);
	}
	
	/**
	* Test case 2 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_2() {
		String pattern = "*.html";
		String filename = "index.htm";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.htm", result);
	}
	
	/**
	* Test case 3 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_3() {
		String pattern = "*.html";
		String filename = "index";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index", result);
	}
	
	/**
	* Test case 4 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_4() {
		String pattern = "*.html";
		String filename = "";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("", result);
	}
	
	/**
	* Test case 5 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_5() {
		String pattern = "*.html";
		String filename = null;
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals(null, result);
	}
	
	/**
	* Test case 6 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_6() {
		String pattern = "*.html";
		String filename = "index.html.html";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html.html", result);
	}
	
	/**
	* Test case 7 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_7() {
		String pattern = "*.html";
		String filename = "index.html.htm";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html.htm", result);
	}
	
	/**
	* Test case 8 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_8() {
		String pattern = "*.html";
		String filename = "index.html.html.html";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html.html.html", result);
	}
	
	/**
	* Test case 9 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_9() {
		String pattern = "*.html";
		String filename = "index.html.htm.html";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html.htm.html", result);
	}
	
	/**
	* Test case 10 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_10() {
		String pattern = "*.html";
		String filename = "index.html.html.htm";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html.html.htm", result);
	}
}

// Wildcard_4Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_4Test {
		
	/**
	* Test case 1 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_1() {
		String pattern = "*.html";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(true, result);
	}
	
	/**
	* Test case 2 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_2() {
		String pattern = "index.html";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(false, result);
	}
	
	/**
	* Test case 3 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_3() {
		String pattern = "*.html;*.htm";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(true, result);
	}
	
	/**
	* Test case 4 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_4() {
		String pattern = "index.html;index.htm";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(false, result);
	}
	
	/**
	* Test case 5 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_5() {
		String pattern = "*.html;index.htm";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(true, result);
	}
	
	/**
	* Test case 6 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_6() {
		String pattern = "index.html;*.htm";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(true, result);
	}
	
	/**
	* Test case 7 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_7() {
		String pattern = "*.html;*.htm;*.txt";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(true, result);
	}
	
	/**
	* Test case 8 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_8() {
		String pattern = "index.html;index.htm;index.txt";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(false, result);
	}
	
	/**
	* Test case 9 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_9() {
		String pattern = "*.html;index.htm;*.txt";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(true, result);
	}
	
	/**
	* Test case 10 for {@link Wildcard#isWildcard(String)}.
	*/
	@Test
	void testIsWildcard_10() {
		String pattern = "index.html;*.htm;index.txt";
		boolean result = Wildcard.isWildcard(pattern);
		assertEquals(true, result);
	}
}

// Wildcard_5Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_5Test {
		
	/**
	* Test case 1 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_1() {
		String pattern = "*.html;*.htm";
		String filename = "index.html";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html", result);
	}
	
	/**
	* Test case 2 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_2() {
		String pattern = "*.html;*.htm";
		String filename = "index.htm";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.htm", result);
	}
	
	/**
	* Test case 3 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_3() {
		String pattern = "*.html;*.htm";
		String filename = "index";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index", result);
	}
	
	/**
	* Test case 4 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_4() {
		String pattern = "*.html;*.htm";
		String filename = "";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("", result);
	}
	
	/**
	* Test case 5 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_5() {
		String pattern = "*.html;*.htm";
		String filename = null;
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals(null, result);
	}
	
	/**
	* Test case 6 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_6() {
		String pattern = "*.html;*.htm";
		String filename = "index.html.html";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html.html", result);
	}
	
	/**
	* Test case 7 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_7() {
		String pattern = "*.html;*.htm";
		String filename = "index.html.htm";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("index.html.htm", result);
