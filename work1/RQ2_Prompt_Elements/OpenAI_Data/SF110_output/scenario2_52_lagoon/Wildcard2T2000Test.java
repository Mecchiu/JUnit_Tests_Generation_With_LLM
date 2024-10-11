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
	*/
	@Test
	void testInstantiateWildcard() {
		assertEquals("", Wildcard.instantiateWildcard("", ""));
		assertEquals("", Wildcard.instantiateWildcard("*", ""));
		assertEquals("", Wildcard.instantiateWildcard("**", ""));
		assertEquals("", Wildcard.instantiateWildcard("***", ""));
		assertEquals("", Wildcard.instantiateWildcard("****", ""));
		assertEquals("", Wildcard.instantiateWildcard("*****", ""));
		assertEquals("", Wildcard.instantiateWildcard("******", ""));
		assertEquals("", Wildcard.instantiateWildcard("*******", ""));
		assertEquals("", Wildcard.instantiateWildcard("********", ""));
		assertEquals("", Wildcard.instantiateWildcard("*********", ""));
	}
}