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
		assertEquals("", Wildcard.matchWildcard("*.html", "index.html"));
		assertEquals("", Wildcard.matchWildcard("*.html", "index.html;*.xml", ";"));
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", "index.html"));
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", "index.html;*.xml", ";"));
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", "index.html", ";"));
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", "index.html;*.xml"));
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", "index.html", ";"));
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", "index.html;*.xml"));
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", "index.html", ";"));
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", "index.html;*.xml"));
	}
}