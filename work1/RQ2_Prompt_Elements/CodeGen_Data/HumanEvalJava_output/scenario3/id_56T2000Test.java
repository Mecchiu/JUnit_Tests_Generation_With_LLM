// CorrectBracketingTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains one unit test case for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {
private final String brackets = ">";

    // Getters.
    //====================================

    /**
     * Method to get the correct string brackets.
     * It returns string of brackets in specified mode.
     * @return A string of brackets.
     */
    String getBracketsString() {
        return brackets;
    }

		// Tests.
		//===================
		@Test
		public void correctBrackettingTest() {
			assertEquals(correctBracketing(""), "+");
			assertEquals(correctBracketing("<>"), "<");
			assertEquals(correctBracketing("*><"), "*");
			assertEquals(correctBracketing(">>><"), "<");
			assertEquals(correctBracketing("<<><"), "<<");
			assertEquals(correctBracketing(">>><"), ">>");
		}


    // Getters.
		//====================================

		// Private constructors.

		// Public constructors.

		// Properties.

    // Getters.
		//====================

		// Setters.
		//====================

    // Private methods.
		//=========================================
		protected void setBrackets(String openEndBrackets) {
    		brackets = openEndBrackets;
    	}
}
