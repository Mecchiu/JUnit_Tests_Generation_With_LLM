// WildcardTest.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class WildcardTest {

	@Test
	void testIsWildcard() {
		assertTrue(Wildcard.isWildcard("*"));
		assertTrue(Wildcard.isWildcard("a*"));
		assertTrue(Wildcard.isWildcard("*a"));
		assertTrue(Wildcard.isWildcard("a*a"));
		assertTrue(Wildcard.isWildcard("a;b"));
		assertTrue(Wildcard.isWildcard("a;b;c"));
		assertTrue(Wildcard.isWildcard("a;b*"));
		assertTrue(Wildcard.isWildcard("a;b*;c"));
		assertTrue(Wildcard.isWildcard("a;b*;c;d"));
		assertTrue(Wildcard.isWildcard("a;b*;c;d;e"));
	}
}