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
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo.html", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("*.html", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo.*", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("*.*", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo.*;*.html", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("*.html;foo.*", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("foo.*;*.html;*.htm", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("*.html;foo.*;*.htm", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("*.html;*.htm;foo.*", "foo.html"));
		assertEquals("foo.html", Wildcard.instantiateWildcard("*.htm;*.html;foo.*", "foo.html"));
	}
}