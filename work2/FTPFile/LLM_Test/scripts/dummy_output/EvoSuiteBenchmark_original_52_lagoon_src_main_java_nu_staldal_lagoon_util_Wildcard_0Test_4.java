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
		Vector<String> v;

/**
* Test method for {@link Wildcard#isWildcard(String)}.
*/
@Test
public void testIsWildcard() {
    v = new Vector<String>();
    v.add("*");
    assertEquals(false, Wildcard.isWildcard(null)); // null
    assertEquals(false, Wildcard.isWildcard("*")); // non-existing string
    assertEquals(true, Wildcard.isWildcard(".*")); // all string
    assertEquals(true, Wildcard.isWildcard("..")); // one path
    assertEquals(true, Wildcard.isWildcard(".")); // all path
    assertEquals(true, Wildcard.isWildcard("")); // an empty path
    assertEquals(true, Wildcard.isWildcard("*.*")); // wildcard pattern contains dot
    assertEquals(true, Wildcard.isWildcard("**")); // wildcard pattern contains star
    assertEquals(true, Wildcard.isWildcard("*")); // wildcard pattern contains one path
    assertEquals(true, Wildcard.isWildcard("*.foo")); // wildcard pattern contains a simple pattern
    assertEquals(true, Wildcard.isWildcard("*.java")); // wildcard pattern contains a simple pattern
    assertEquals(true, Wildcard.isWildcard("*.java.jspfile")); // wildcard pattern contains a simple pattern
    assertEquals(true, Wildcard.isWildcard("foo*.jsp")); // wildcard pattern contains '*' and a simple pattern
    assertEquals(true, Wildcard.isWildcard("foo/*.jsp")); // wildcard pattern contains '*'
    assertEquals(true, Wildcard.isWildcard("foo/")); // wildcard pattern starts with a slash
    assertEquals(true, Wildcard.isWildcard("foo.*")); // wildcard pattern starts with a dot
    assertEquals(true, Wildcard.isWildcard("foo/**")); // wildcard pattern starts with a star
    assertEquals(true, Wildcard.isWildcard("/*foo")); // wildcard pattern starts with a dot
    assertEquals(true, Wildcard.isWildcard("*.\"foo")); // wildcard pattern starts with a dot
    assertEquals(true, Wildcard.isWildcard("foo.java")); // wildcard pattern starts with a single dot
    assertEquals(true, Wildcard.isWildcard("foo.java\\*.jsp")); // wildcard pattern starts with a double dot
    assertEquals(true, Wildcard.isWildcard("foo.java/foo.jsp*.jsp")); // wildcard pattern includes one path element
    assertEquals(true, Wildcard.isWildcard("foo.java.jsp")); // wildcard pattern includes one path
 }
}