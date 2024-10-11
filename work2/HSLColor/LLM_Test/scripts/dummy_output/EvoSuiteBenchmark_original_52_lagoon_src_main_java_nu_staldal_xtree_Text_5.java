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
		/**
		 * Test if {@link Text#asCharArray()} has same content as {@link Text#asCharArray()}.
		 */
		@Test
		void asCharArray() {
			Text text = new Text();
            assertSame(text.asCharArray(), text.asCharArray());
		}
}