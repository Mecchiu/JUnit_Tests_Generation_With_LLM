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
		String pattern = "";
		String part = "";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("", result);
	}
	
	/**
	* Test case 2 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_2() {
		String pattern = "*";
		String part = "";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("", result);
	}
	
	/**
	* Test case 3 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_3() {
		String pattern = "*";
		String part = "a";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("a", result);
	}
	
	/**
	* Test case 4 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_4() {
		String pattern = "a*";
		String part = "";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("a", result);
	}
	
	/**
	* Test case 5 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_5() {
		String pattern = "a*";
		String part = "b";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("ab", result);
	}
	
	/**
	* Test case 6 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_6() {
		String pattern = "*a";
		String part = "";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("a", result);
	}
	
	/**
	* Test case 7 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_7() {
		String pattern = "*a";
		String part = "b";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("ba", result);
	}
	
	/**
	* Test case 8 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_8() {
		String pattern = "a*b";
		String part = "";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("ab", result);
	}
	
	/**
	* Test case 9 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_9() {
		String pattern = "a*b";
		String part = "c";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("acb", result);
	}
	
	/**
	* Test case 10 for {@link Wildcard#instantiateWildcard(String, String)}.
	*/
	@Test
	void testInstantiateWildcard_10() {
		String pattern = "a*b*c";
		String part = "d";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("adb*c", result);
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
		String pattern = "";
		String filename = "";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("", result);
	}
	
	/**
	* Test case 2 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_2() {
		String pattern = "";
		String filename = "a";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 3 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_3() {
		String pattern = "a";
		String filename = "";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 4 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_4() {
		String pattern = "a";
		String filename = "a";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("", result);
	}
	
	/**
	* Test case 5 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_5() {
		String pattern = "a";
		String filename = "b";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 6 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_6() {
		String pattern = "*";
		String filename = "";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("", result);
	}
	
	/**
	* Test case 7 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_7() {
		String pattern = "*";
		String filename = "a";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("a", result);
	}
	
	/**
	* Test case 8 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_8() {
		String pattern = "a*";
		String filename = "";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertNull(result);
	}
	
	/**
	* Test case 9 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_9() {
		String pattern = "a*";
		String filename = "a";
		String result = Wildcard.matchWildcard(pattern, filename);
		assertEquals("", result);
	}
	
	/**
	* Test case 10 for {@link Wildcard#matchWildcard(String, String)}.
	*/
	@Test
	void testMatchWildcard_10() {
		String pattern = "a*";
		String filename = "