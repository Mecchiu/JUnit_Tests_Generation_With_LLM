// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_0Test {
		// The constructor call.
		public Wildcard_0Test() {}

		// Check if a wildcard pattern can possibly match more than one filename.
		@Test
		public void check_0 () {
			assertTrue (isWildcard ("a"). and! isWildcard("aa"));
			assertTrue (isWildcard ("aaa"));
			assertTrue (isWildcard ("AAA"));
			assertTrue (isWildcard ("a.*"));
			assertTrue (isWildcard ("aa.*"));
			assertTrue (isWildcard ("a.*"));
			assertFalse (isWildcard("e*e"));
		}
}