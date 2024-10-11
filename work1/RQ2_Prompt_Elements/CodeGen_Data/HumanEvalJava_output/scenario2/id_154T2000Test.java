// CycpatternCheckTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains one unit test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
/**
		 * You are given a string "hi" and a string "lo" which have a substring in a different word a".
		 */
		@Test
		void test() {
			// Test
			assertTrue(cycpatternCheck("hi", "'lo '"));
			assertTrue(cycpatternCheck("'lo '", "'hi '"));
			assertFalse(cycpatternCheck("'lo '", "'hi '"));
			assertFalse(cycpatternCheck("'lo hi'", "'lo hi'"));
			assertFalse(cycpatternCheck("'lo hi'hi", "'lo hi hi'"));
			assertFalse(cycpatternCheck("'lo hi hi'hi", "'lo hi hi hi'"));
		}
}
