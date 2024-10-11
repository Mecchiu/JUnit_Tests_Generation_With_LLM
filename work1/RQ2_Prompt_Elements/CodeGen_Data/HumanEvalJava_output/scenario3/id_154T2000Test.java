// CycpatternCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains one unit test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {

	/**
	 * Test the getter for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
	 */
	@Test
	void testMethodReturnsCylcpatternCheckString() {
		assertEquals("False", new CycpatternCheck().cycpatternCheck("ab", "ab"));
		assertEquals("True", new CycpatternCheck().cycpatternCheck("a", "ab"));
	}
	
	/**
	 * Test the getter for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
	 */
	@Test
	void testMethodReturnsCylcpatternCheckString2() {
		String first = new CycpatternCheck().cycpatternCheck("ab", "ab");
		String second = new CycpatternCheck().cycpatternCheck("ab", "ab");
		assertEquals("False", first);
		assertEquals("False", second);
	}	
}