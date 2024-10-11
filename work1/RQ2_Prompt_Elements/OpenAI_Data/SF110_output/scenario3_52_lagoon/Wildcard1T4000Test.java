// WildcardTest.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class WildcardTest {

	@Test
	void testMatchWildcard() {
		assertEquals("", Wildcard.matchWildcard("", ""));
		assertEquals("", Wildcard.matchWildcard("", "a"));
		assertEquals("", Wildcard.matchWildcard("", "abc"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak"));
		assertEquals("", Wildcard.matchWildcard("", "abc.txt.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak.bak