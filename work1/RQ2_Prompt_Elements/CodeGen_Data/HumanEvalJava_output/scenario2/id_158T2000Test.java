// FindMaxTest.java
package scenario2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains one unit test case for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {
/**
		 * Test for findMax() function.
		 */
		@Test
		void testFindMax() {
			// Test cases
			// - Test for negative numbers
			assertEquals("null", new FindMax().findMax(null));
			
			assertEquals(null, new FindMax().findMax(-1));
			assertEquals(null, new FindMax().findMax(".+"));
			assertEquals("one", new FindMax().findMax("one"));
			
			assertEquals("a", new FindMax().findMax("a."));
			assertEquals("b", new FindMax().findMax("b."));
			
			assertEquals("c", new FindMax().findMax("c"));
			
			assertEquals(
					"(a b)c", new FindMax().findMax("(((a b))))c")
		}
}
