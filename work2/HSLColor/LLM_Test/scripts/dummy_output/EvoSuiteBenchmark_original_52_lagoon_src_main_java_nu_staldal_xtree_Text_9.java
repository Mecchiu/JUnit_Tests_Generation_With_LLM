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
		 * Test of the getCharArray method. 
		 */
		@Test
		public void testGetCharArray() {
			Text text = new Text();
			text.setString(String.valueOf(""));
			assertSame("Test Text value as an empty Char Array.", text.asCharArray(), ((char[]) null));
			text.setString(String.valueOf("abc"));
			assertSame("Test Text value as an empty Char Array.", text.asCharArray(), ((char[]) null));
			text.setString(String.valueOf("ABC"));
			assertSame("Test Text value as an empty Char Array.", text.asCharArray(), ((char[]) null));
			text.setString(String.valueOf("a"));
			assertSame("Test Text value as a character.", text.asCharArray(), ((char[])(new char[] {'a'})));
			text.setString(String.valueOf("ABC"));
			assertSame("Test Text value as a character.", text.asCharArray(), ((char[])(new char[] {'a', 'c'})));
			text.setString(String.valueOf("A B C"));
			assertSame("Test Text value as a character.", text.asCharArray(), ((char[])(new char[] {'a', 'b', 'c'})));
		}
}
// TextTest.java end