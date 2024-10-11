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
		assertNull(text.asCharArray());
	}
	
	/**
	 * Test case 2 for {@link Text#asCharArray()}.
	 * It tests the method with an empty string.
	 */
	@Test
	void testAsCharArray2() {
		Text text = new Text("");
		assertArrayEquals(new char[] {}, text.asCharArray());
	}
	
	/**
	 * Test case 3 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only whitespace.
	 */
	@Test
	void testAsCharArray3() {
		Text text = new Text(" \t\n\r");
		assertArrayEquals(new char[] {' ', '\t', '\n', '\r'}, text.asCharArray());
	}
	
	/**
	 * Test case 4 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing only non-whitespace.
	 */
	@Test
	void testAsCharArray4() {
		Text text = new Text("abc");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, text.asCharArray());
	}
	
	/**
	 * Test case 5 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing whitespace and non-whitespace.
	 */
	@Test
	void testAsCharArray5() {
		Text text = new Text("a b c");
		assertArrayEquals(new char[] {'a', ' ', 'b', ' ', 'c'}, text.asCharArray());
	}
	
	/**
	 * Test case 6 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing non-whitespace and whitespace.
	 */
	@Test
	void testAsCharArray6() {
		Text text = new Text("a\tb\tc");
		assertArrayEquals(new char[] {'a', '\t', 'b', '\t', 'c'}, text.asCharArray());
	}
	
	/**
	 * Test case 7 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing whitespace and non-whitespace and whitespace.
	 */
	@Test
	void testAsCharArray7() {
		Text text = new Text("a b c ");
		assertArrayEquals(new char[] {'a', ' ', 'b', ' ', 'c', ' '}, text.asCharArray());
	}
	
	/**
	 * Test case 8 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing non-whitespace and whitespace and non-whitespace.
	 */
	@Test
	void testAsCharArray8() {
		Text text = new Text("a\tb\tc\t");
		assertArrayEquals(new char[] {'a', '\t', 'b', '\t', 'c', '\t'}, text.asCharArray());
	}
	
	/**
	 * Test case 9 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing whitespace and non-whitespace and whitespace and non-whitespace.
	 */
	@Test
	void testAsCharArray9() {
		Text text = new Text("a b c\t");
		assertArrayEquals(new char[] {'a', ' ', 'b', ' ', 'c', '\t'}, text.asCharArray());
	}
	
	/**
	 * Test case 10 for {@link Text#asCharArray()}.
	 * It tests the method with a string containing non-whitespace and whitespace and non-whitespace and whitespace.
	 */
	@Test
	void testAsCharArray10() {
		Text text = new Text("a\tb\tc ");
		assertArrayEquals(new char[] {'a', '\t', 'b', '\t', 'c', ' '}, text.asCharArray());
	}
}