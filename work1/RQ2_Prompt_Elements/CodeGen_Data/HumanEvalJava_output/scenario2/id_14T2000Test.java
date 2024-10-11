// AllPrefixesTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains one unit test case for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {
/**
		* Creates a new instance of <i>AllPrefixesTest</i> with default parameter values.
		*/
	@Test
    public void allPrefixesTest() {
		// Test default parameter values:
		List<Object> allPrefixes = new ArrayList<Object>();
		allPrefixes.add("abc");
		allPrefixes.add("cd");
		allPrefixes.add("");
		allPrefixes.add("abc");
		allPrefixes.add("def");

		assertEquals("Incorrect return value", "def", allPrefixes.get(0));
		assertEquals("Incorrect return value", "def", allPrefixes.get(1));
		assertEquals("Incorrect return value", "", allPrefixes.get(2));
    }
	/**
  * Test method for {@link AllPrefixes#allPrefixes(String)}.
  */
	@Test
	public void allPrefixesAllPrefixesTest() {
		// Test with empty string
		List<Object> allPrefixes = AllPrefixes.allPrefixes("");

		assertEquals("Incorrect return value", "", allPrefixes.get(0));
		assertEquals("Incorrect return value", "", allPrefixes.get(1));
		assertEquals("Incorrect return value", "", allPrefixes.get(2));

		// Test with non-empty string
		allPrefixes = AllPrefixes.allPrefixes("abc");
		assertEquals("Incorrect return value", "abc", allPrefixes.get(0));
		assertEquals("Incorrect return value", "cde", allPrefixes.get(1));
		assertEquals("Incorrect return value", "", allPrefixes.get(2));
        
		allPrefixes = AllPrefixes.allPrefixes("abc");
		assertEquals("Incorrect return value", "abc", allPrefixes.get(0));
		assertEquals("Incorrect return value", "cd", allPrefixes.get(1));
		assertEquals("Incorrect return value", "", allPrefixes.get(2));

		// Test with non-empty string:
		allPrefixes = AllPrefixes.allPrefixes("abc");
        assertEquals("Incorrect return value", "abc", allPrefixes.get(0));
        assertEquals("Incorrect return value", "a", allPrefixes.get(1));
        assertEquals("Incorrect return value", "bc", allPrefixes.get(2));
        
        allPrefixes = AllPrefixes.allPrefixes("bc");
        assertEquals("Incorrect return value", "ab", allPrefixes.get(0));
        assertEquals("Incorrect return value", "bc", allPrefixes.get(1));
        
	}
}
