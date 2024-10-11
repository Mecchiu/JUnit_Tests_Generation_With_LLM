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
	* Empty wildcard test.
	*/
	private final String pattern = "";

		/**
	* One pattern containing '*' is present.
	* @exception InvalidWildcardException always throws
	*/
	@Test(expected=InvalidWildcardException.class)
	public void test_exception() throws InvalidWildcardException {
		Wildcard.instantiateWildcard(pattern, "test_);");
	}
}