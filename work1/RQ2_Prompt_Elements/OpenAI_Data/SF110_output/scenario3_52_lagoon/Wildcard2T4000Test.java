// WildcardTest.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class WildcardTest {

	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a simple pattern.
	*/
	@Test
	void testInstantiateWildcardSimple() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard.
	*/
	@Test
	void testInstantiateWildcardWildcard() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart2() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart3() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart4() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart5() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart6() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart7() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart8() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart9() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
	
	/**
	* Test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with a pattern containing a wildcard and a part.
	*/
	@Test
	void testInstantiateWildcardWildcardPart10() {
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo*.html", ""));
	}
}