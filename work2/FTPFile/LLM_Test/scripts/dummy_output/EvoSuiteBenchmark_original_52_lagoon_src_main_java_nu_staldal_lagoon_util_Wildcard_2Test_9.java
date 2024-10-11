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
		public final static Map<String, Boolean> VALUES = new HashMap<String, Boolean>();

		{
				VALUES.put("*", Boolean.TRUE);
				VALUES.put("", Boolean.FALSE);
				VALUES.put("*.*", Boolean.TRUE);
				VALUES.put("**", Boolean.FALSE);
				VALUES.put("[]", Boolean.FALSE);

		}

		@Test
		void test() {
				//Test if wildcard pattern matched 1 pattern
				if (VALUES.get("*")==Boolean.FALSE)) {
						System.out.println("wildcard matched");
				}
				//Test if wildcard pattern matched nothing
				else if (VALUES.get("")==Boolean.FALSE) {
						System.out.println("wildcard did not match anything");
				}
				//Test if wildcard pattern matched nothing
				else if (VALUES.get("")==Boolean.FALSE) {
						System.out.println("wildcard matches nothing");
				}
				//Test if wildcard pattern matched nothing
				else if (VALUES.get("*.*")==Boolean.FALSE) {
						System.out.println("wildcard matched nothing");
				}
				// test for regex pattern match
				else if (VALUES.get("**")==Boolean.TRUE) {
						System.out.println("regex pattern matched");
				}
				else if (VALUES.get("")==Boolean.TRUE) {
						System.out.println("no wildcard pattern");
				}
				// test and return as expected
				else {
										System.out.println("empty wildcard pattern");
						assertEquals(Boolean.FALSE, VALUES.get(""));
						assertEquals(Boolean.FALSE, VALUES.get("*"));
						assertEquals(Boolean.FALSE, VALUES.get(""));
						assertEquals(Boolean.FALSE, VALUES.get("*.*"));
						assertEquals(Boolean.FALSE, VALUES.get("**"));
						assertEquals(Boolean.FALSE, VALUES.get(""));
				}
		}
}