// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {
/**
		* Test method for {@link InspirentoUtilities#tokenize(java.lang.String)}.
		* Test input string, which must contain
		* {@link javax.swing.text.PlainDocument#getText(int, int)}, is:
		* {"file", "edit", "view"}
		*
		* @throws IllegalArgumentException if {@link javax.swing.text.PlainDocument#getText}
		*                           fails and throws this exception
		*/
		@Test
		public final void testTokenize() throws IllegalArgumentException {
			String input = "file edit view";
			String expected[] = {"file", "edit", "view"};
			assertArrayEquals(expected, InspirentoUtilities.tokenize(input));
		}
}
// End InspirentoUtilities_0Test.java
