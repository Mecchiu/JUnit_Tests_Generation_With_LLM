// FixSpacesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains one unit test case for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
String input;

		/** The constructor. */
		FixSpacesTest(String input) {
			this.input = input;
		}

		/**
	 * Test of fixSpaces method, of class FixSpaces.
	 */
		@Test
		void test() {
			FixSpaces instance = new FixSpaces();
			assertEquals("fixSpaces: fixSpaces(" + this.input + ") is wrong.", new FixSpaces(this.input), instance.fixSpaces("fixSpaces:" + this.input));
		}
}

