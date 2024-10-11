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
		
	/**
	 * Tests if a wildcard pattern can possibly match more than one filename.
	 */

	@Test
	void isWildcard() {
    assertEquals("wildcard-1-0-0 test-result", true, isWildcard("wildcard - 1 - 0 - 0"));
    assertEquals("wildcard-1-0-0 test-result", false, isWildcard("wildcard 3 - 3 + 3"));
		}
	}