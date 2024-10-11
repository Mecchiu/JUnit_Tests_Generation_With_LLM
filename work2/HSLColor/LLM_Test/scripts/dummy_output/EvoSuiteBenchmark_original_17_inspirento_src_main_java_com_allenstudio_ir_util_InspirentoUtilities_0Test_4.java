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
		 * Test the tokenize constructor which accepts a String instance.
		 * @throws Exception if a problem occurs.
		 */
		@Test
		void tokenizeConstant_String() throws Exception {
			assertEquals(tokenize("File"), new Vector<String>());
			assertEquals(tokenize("File\\n"), new Vector<String>());
			assertEquals(tokenize("File"), new Vector<String>());
			assertEquals(tokenize("File"), new Vector<String>());
			assertEquals(tokenize("File\\n"), new Vector<String>());
			assertEquals(tokenize("File"), new Vector<String>());
			assertEquals(tokenize("File"), new Vector<String>());
		}
}