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
		
	@Test
	void testNullPattern() {
		if(matchWildcard("", null)) {
			fail("Null pattern is acceptable.");
		} else {
		}		
	}
	
	@Test
	void testEmptyPattern() {
		if(matchWildcard("", "*")) {
			fail("Empty pattern is acceptable.");
		} else {
			assertPatternMatch("", "");
		}
	}
	
	@Test
	void testSimplePattern() {
		assertPatternMatch("*", "*"); 	
	}
	
	public void assertPatternMatch(String pattern, String part) {
		if(matchWildcard(pattern, part)) {
			return;
		}

        int i = 1;
        while(i <= 10) {
			System.out.format("Pattern: %s (i=%3d) - part=%s - is=%s\n", pattern, i, part, matchWildcard(pattern, part));
			pattern = pattern.replaceFirst("*", "");
			if(matchWildcard(pattern, part)) return;
            if(i % 3 == 0) {
				break;
			}
			i++; 		
		}

		fail("no match found.");	
	}
}