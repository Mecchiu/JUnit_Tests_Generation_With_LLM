// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains one unit test case for the {@link Text#asCharArray()} method.
*/
class TextTest {
		private final String s = "This is a very long text for testing purposes with some test content.  Here is the <s> content of <b>this is a very long text in testing</b>:.";
		private final String s2 = "" + (char)0xff;
		private final boolean b = true;

		@Test 
		void s() {
			//noinspection ConvertToLoopVariableUseOfConstantVariable
			assertEquals(s, Text.asCharArray());
		}

		@Test 
		void s2() {
			assertEquals(s2, Text.asCharArray());
		}

		@Test 
		void b() {
			assertEquals(b, Text.asCharArray().length() > 0);
		}
}