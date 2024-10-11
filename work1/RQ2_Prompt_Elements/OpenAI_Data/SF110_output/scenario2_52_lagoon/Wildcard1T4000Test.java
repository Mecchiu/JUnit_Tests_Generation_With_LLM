// WildcardTest.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class WildcardTest {

	/**
	* Test case 1 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains no wildcards.
	* The test case expects the method to return the empty string if the pattern matches the filename.
	*/
	@Test
	void testMatchWildcard1() {
		String pattern = "test.txt";
		String filename = "test.txt";
		String expected = "";
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains no wildcards.
	* The test case expects the method to return null if the pattern does not match the filename.
	*/
	@Test
	void testMatchWildcard2() {
		String pattern = "test.txt";
		String filename = "test.html";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains a wildcard.
	* The test case expects the method to return the empty string if the pattern matches the filename.
	*/
	@Test
	void testMatchWildcard3() {
		String pattern = "test.*";
		String filename = "test.txt";
		String expected = "";
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains a wildcard.
	* The test case expects the method to return null if the pattern does not match the filename.
	*/
	@Test
	void testMatchWildcard4() {
		String pattern = "test.*";
		String filename = "test";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains a wildcard.
	* The test case expects the method to return the empty string if the pattern matches the filename.
	*/
	@Test
	void testMatchWildcard5() {
		String pattern = "*.txt";
		String filename = "test.txt";
		String expected = "";
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains a wildcard.
	* The test case expects the method to return null if the pattern does not match the filename.
	*/
	@Test
	void testMatchWildcard6() {
		String pattern = "*.txt";
		String filename = "test.html";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains a wildcard.
	* The test case expects the method to return the empty string if the pattern matches the filename.
	*/
	@Test
	void testMatchWildcard7() {
		String pattern = "test*";
		String filename = "test.txt";
		String expected = ".txt";
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains a wildcard.
	* The test case expects the method to return null if the pattern does not match the filename.
	*/
	@Test
	void testMatchWildcard8() {
		String pattern = "test*";
		String filename = "test";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains a wildcard.
	* The test case expects the method to return the empty string if the pattern matches the filename.
	*/
	@Test
	void testMatchWildcard9() {
		String pattern = "*test";
		String filename = "test.txt";
		String expected = "test.";
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link Wildcard#matchWildcard(String, String)}.
	* The test case tests the method with a pattern that contains a wildcard.
	* The test case expects the method to return null if the pattern does not match the filename.
	*/
	@Test
	void testMatchWildcard10() {
		String pattern = "*test";
		String filename = "test";
		String expected = null;
		String actual = Wildcard.matchWildcard(pattern, filename);
		assertEquals(expected, actual);
	}
}