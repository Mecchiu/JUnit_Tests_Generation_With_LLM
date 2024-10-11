// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {

	/**
	 * Test constructor.
	 */
	@Test
	public void testConstructor1() {
		assertTrue(new Wildcard().toString().equals("[*]"));
	}
	
	/**
	* Test constructor.
	*/
	@Test
	public void testConstructor2() {
		assertTrue(new Wildcard().toString().equals("[].*"));
	}
}
