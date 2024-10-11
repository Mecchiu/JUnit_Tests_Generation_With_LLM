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
		
	/**
	 * Tests a simple wildcard pattern which always matches everything.
	 */
	@Test
	public void testSimpleWildcard() {
	      
	      // The pattern is a '*'.
	      assertEquals("", Wildcard.instantiateWildcard("*", ""));
	      assertEquals("test", Wildcard.instantiateWildcard("*", "__TEST__"));
	      assertEquals("test1",
		      Wildcard.instantiateWildcard("*", "@TRUE__"));
	      assertEquals("test1@TRUE__", 
		      Wildcard.instantiateWildcard("*", "@TRUE__", "@TRUE"));
	      
	      final String[] parts = new String[] {"test1", "test", "test1!*"};
	     
	      assertEquals("test1!test", 
		      Wildcard.instantiateWildcard("test", "*", parts));
	      
	      assertEquals("test1!*test", 
		      Wildcard.instantiateWildcard("test", "*", parts));
	      assertEquals("test!*test", 
		      Wildcard.instantiateWildcard("test", "*", parts));
	}
	
	/**
	 * Tests a wildcard pattern consisting of two or more simple patterns.
	 * The first pattern is the part after the first '$' (as returned from {@link #instantiateWildcard(String, String)}
	 * followed by the second '$' (as returned from {@link #instantiateWildcard(String, String)})).
	 */
	@Test
	public void testTwoSimpleWildcards() {
	      
	      final String pattern0 = "test%$_\ntest";
	      final String[] parts0 = new String[] {"test", "test$_"};
	      final String pattern1 = "test$_\ntest";
	      final String[] parts1 = new String[] {"test"};
	      
	      // The two wildcard pattern which may start with a ${} before the first one can match anything.
	      final StringBuilder expected = new StringBuilder("(?<=\\${)\n");
	      final String expectedPattern = "\\$'([^'@]*)'";
	      final String expectedParts[] = {pattern0, pattern1, "test",pattern1};
	      
}
}