// Wildcard_1Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_1Test {
		
    @Test
	public void matchWildcard() {		

		assertTrue(matchWildcard("*.a", "a"));
		assertTrue(matchWildcard("*.b", "b"));
		assertTrue(matchWildcard("*.c", "c"));
		assertTrue(matchWildcard("*.d", "d"));
		assertTrue(matchWildcard("*.*.e", "e"));

		assertFalse(matchWildcard("*.e", "e"));
				
    }	
}