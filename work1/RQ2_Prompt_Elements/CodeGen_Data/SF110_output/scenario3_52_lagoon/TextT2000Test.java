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
		 * Constructor Test.
		 */

		public TextTest() {
			super();
		}

		/**
		 * Is the test pass?
		 */
		@Test
		public void testIsValid() {
			Text text = new Text();
			assertTrue(text.isValid());
		}

		/**
		 * Is the test pass?
		 */
		@Test
		public void testLength() {
			Text text = new Text();
			assertEquals(0, text.length());
		}

		/**
		 * Set the text content. String "Hello" will be set as the char[][],
		 * while for int "2" will be converted to an int[].
		 */
		@Test
		public void testSetString() {
			Text text = new Text();
			CharSequence s = "Hello";
			text.set(s);
			assertEquals("[Hello]", text.toString());
		}

		/**
		 * Is the test pass?
		 */
		@Test
		public void testSetInt() {
			Text text = new Text();
			int[] iArray = new int[5];
			iArray[0] = 10;
			iArray[1] = 20;
			iArray[2] = 30;
			iArray[3] = 40;
			iArray[4] = 50;
			text.set(iArray);
			assertEquals(50, text.toInt());
		}

		/**
		 * Is the test fail?
		 */
		@Test
		public void testSetInt2() {
			Text text = new Text();
			int[] iArray = new int[5];
			iArray[0] = 10;
			iArray[1] = 20;
			iArray[2] = 30;
			iArray[3] = 40;
			iArray[4] = 50;
			try {
				text.set(iArray);
			} catch (org.xml.sax.SAXException e) {
				assertTrue(e.getMessage().equals("XML-DECLARATION-EXCEPTION"));
				return;
			}
			fail("Expected XML-DECLARATION-EXCEPTION");
		}

		/**
		 * Is the test fail?
		 */
		@Test
		public void testSetChar() {
			Text text = new Text();
			char[] cs = "Hello";//.toCharArray();
			iArray[] iArray = new int[5];
			iArray[0] = 10;
			iArray[1] = 20;
			iArray[2] = 30;
			iArray[3] = 40;
			iArray[4] = 50;
			text.set(cs);
			assertEquals(50, text.toInt());
		}

		/**
		 * Is the test pass?
		 */
		@Test
		public void testSetChar2() {
			Text text = new Text();
			char[] cs = "Hello";//.toCharArray();
			int[] iArray = new int[5];
			iArray[0] = 10;
			iArray[1] = 20;
			iArray[2] = 30;
			iArray[3] = 40;
			iArray[4] = 50;
			text.set(cs);
			assertEquals(50, text.toInt());
		}

	}