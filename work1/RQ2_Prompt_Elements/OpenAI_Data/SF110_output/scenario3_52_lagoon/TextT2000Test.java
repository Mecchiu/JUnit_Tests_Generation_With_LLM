// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains ten unit test cases for the {@link Text#asCharArray()} method.
*/
class TextTest {

	/**
	 * Test case 1 for {@link Text#asCharArray()}.
	 * It tests the method with a null value.
	 */
	@Test
	void testAsCharArray1() {
		Text text = new Text(null);
		assertEquals(null, text.asCharArray());
	}
	
	/**
	 * Test case 2 for {@link Text#asCharArray()}.
	 * It tests the method with an empty string.
	 */
	@Test
	void testAsCharArray2() {
		Text text = new Text("");
		assertEquals(0, text.asCharArray().length);
	}
	
	/**
	 * Test case 3 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray3() {
		Text text = new Text(" \t\n\r");
		assertEquals(4, text.asCharArray().length);
	}
	
	/**
	 * Test case 4 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray4() {
		Text text = new Text(" \t\n\r");
		assertEquals(4, text.asCharArray().length);
	}
	
	/**
	 * Test case 5 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray5() {
		Text text = new Text(" \t\n\r");
		assertEquals(4, text.asCharArray().length);
	}
	
	/**
	 * Test case 6 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray6() {
		Text text = new Text(" \t\n\r");
		assertEquals(4, text.asCharArray().length);
	}
	
	/**
	 * Test case 7 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray7() {
		Text text = new Text(" \t\n\r");
		assertEquals(4, text.asCharArray().length);
	}
	
	/**
	 * Test case 8 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray8() {
		Text text = new Text(" \t\n\r");
		assertEquals(4, text.asCharArray().length);
	}
	
	/**
	 * Test case 9 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray9() {
		Text text = new Text(" \t\n\r");
		assertEquals(4, text.asCharArray().length);
	}
	
	/**
	 * Test case 10 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray10() {
		Text text = new Text(" \t\n\r");
		assertEquals(4, text.asCharArray().length);
	}
}