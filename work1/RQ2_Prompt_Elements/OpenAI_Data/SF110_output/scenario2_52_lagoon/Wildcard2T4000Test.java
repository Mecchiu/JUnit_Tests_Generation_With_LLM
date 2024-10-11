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
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "*"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "test"
	*/
	@Test
	void testInstantiateWildcard_1() {
		String pattern = "*";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("test", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "test*"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtest"
	*/
	@Test
	void testInstantiateWildcard_2() {
		String pattern = "test*";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtest", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "*test"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtest"
	*/
	@Test
	void testInstantiateWildcard_3() {
		String pattern = "*test";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtest", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "test*test"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtesttest"
	*/
	@Test
	void testInstantiateWildcard_4() {
		String pattern = "test*test";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtesttest", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "test*test*"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtesttest"
	*/
	@Test
	void testInstantiateWildcard_5() {
		String pattern = "test*test*";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtesttest", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "test*test*test"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtesttesttest"
	*/
	@Test
	void testInstantiateWildcard_6() {
		String pattern = "test*test*test";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtesttesttest", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "test*test*test*"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtesttesttest"
	*/
	@Test
	void testInstantiateWildcard_7() {
		String pattern = "test*test*test*";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtesttesttest", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "test*test*test*test"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtesttesttesttest"
	*/
	@Test
	void testInstantiateWildcard_8() {
		String pattern = "test*test*test*test";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtesttesttesttest", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "test*test*test*test*"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtesttesttesttest"
	*/
	@Test
	void testInstantiateWildcard_9() {
		String pattern = "test*test*test*test*";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtesttesttesttest", result);
	}
	
	/**
	* Test case for {@link Wildcard#instantiateWildcard(String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>pattern: "test*test*test*test*test"</li>
	* <li>part: "test"</li>
	* </ul>
	* The expected result is: "testtesttesttesttesttest"
	*/
	@Test
	void testInstantiateWildcard_10() {
		String pattern = "test*test*test*test*test";
		String part = "test";
		String result = Wildcard.instantiateWildcard(pattern, part);
		assertEquals("testtesttesttesttesttest", result);
	}
}