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
		* Test constructor.
		* Expected result: {@code null} as char[].
		*/
		@Test
		void testNoContent() {
			Text text = new Text();
			char[] content = text.asCharArray();
			assertEquals("text content as char", null, content);
		}

		/**
		* Test constructor.
		* Expected result: {@code new char} as char.
		*/
		@Test
		void testNewChar() {
			Text text = new Text();
			text.addContent("new\u000D".toCharArray());
			char[] expectedContent = "new\r\n".toCharArray();
			assertNotNull("new char content as char", text.asCharArray());
			assertArrayEquals("char content as char", expectedContent, text.asCharArray());
		}

		/**
		* Test constructor.
		* Expected result: {@code new char[]()} as char.
		*/
		@Test
		void testNewCharArray() {
			Text text = new Text();
			text.addContent("new\u000A".toCharArray());
			char[] expectedContent = "new\u0009".toCharArray();
			assertNotNull("new char content as char[]", text.asCharArray());
			assertArrayEquals("char content as char[]", expectedContent, text.asCharArray());
		}

		/**
		* Test constructor.
		* Expected result: {@code null} as char[] with '0'.
		*/
		@Test
		void testNoNewCharArray() {
			Text text = new Text();
			text.addContent("\u000A".toCharArray());
			char[] expectedContent = null;
			assertNull("null as char[] with new char array", text.asCharArray());
			assertArrayEquals("char[] with new char array", expectedContent, text.asCharArray());
		}

		/**
		* Test constructor.
		* Expected result: {@code null} as char[] with 'x'.
		*/
		@Test
		void testNoNewCharArrayWithX() {
			Text text = new Text();
			text.addContent("\u000E".toCharArray());
			char[] expectedContent = null;
			assertNull("null as char[] with new char[] with x", text.asCharArray());
			assertArrayEquals("char[] with new char[] with x", expectedContent, text.asCharArray());
		}

		/**
		* Test constructor.
		* Expected result: {@code new char[0]} as char.
		*/
		@Test
		void testNewCharArrayWithSizeZero() {
			Text text = new Text();
			text.addContent("new\u000A".toCharArray(0));
			char[] expectedContent = "new\u0009".toCharArray();
			assertNotNull("new char content as char[] with 0", text.asCharArray());
			assertArrayEquals("char content as char[] with 0", expectedContent, text.asCharArray());
		}

		/**
		* Test constructor.
		* Expected result: {@code new char[4]}.
		*/
		@Test
		void testNewCharArrayWith4() {
			Text text = new Text();
			text.addContent("new\u000A".toCharArray(4));
			char[] expectedContent = "new\u000A".toCharArray();
			assertNotNull("new char content as char[] with 4", text.asCharArray());
			assertArrayEquals("char content as char[] with 4", expectedContent, text.asCharArray());
		}

		/**
		* Test constructor.
		* Expected result: {@code new char[7]}.
		*/
		@Test
		void testNewCharArrayWith7() {
			Text text = new Text();
			text.addContent("new\u000A".toCharArray(7));
			char[] expectedContent = "new\u000A".toCharArray();
			assertNotNull("new char content as char[] with 7", text.asCharArray());
			assertArrayEquals("char content as char[] with 7", expectedContent, text.asCharArray());
		}

		/**
		* Test constructor.
		* Expected result: {@code new char[](10,5)} as char array with content.
		*/
		@Test
		public void testNewCharArrayWithSizeAndContent() {
			Text text = new Text();
			char[] expectedContent = new char[10];
			int charSize = 10;
			for (int i = 0; i < 10; i ++) {
				text.addContent("new\u000A".toCharArray(charSize, charSize));
				expectedContent[i] = i == 7? 0 : i == 5? 1 : i == 3? 2 : i == 1? 3 : 4;
			}
			assertNotNull("new char content as char array with content", text.asCharArray());
			assertArrayEquals("char content as char array with content", expectedContent, text.asCharArray());
		}

		String output = new Text().asCharArray();
		System.out.println(new String(output.getBytes("UTF-8")));
	}
