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
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length zero.
	*/
	@Test
	void testAsCharArray1() {
		Text text = new Text("");
		char[] charArray = text.asCharArray();
		assertEquals(0, charArray.length);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length one.
	*/
	@Test
	void testAsCharArray2() {
		Text text = new Text("a");
		char[] charArray = text.asCharArray();
		assertEquals(1, charArray.length);
		assertEquals('a', charArray[0]);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length two.
	*/
	@Test
	void testAsCharArray3() {
		Text text = new Text("ab");
		char[] charArray = text.asCharArray();
		assertEquals(2, charArray.length);
		assertEquals('a', charArray[0]);
		assertEquals('b', charArray[1]);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length three.
	*/
	@Test
	void testAsCharArray4() {
		Text text = new Text("abc");
		char[] charArray = text.asCharArray();
		assertEquals(3, charArray.length);
		assertEquals('a', charArray[0]);
		assertEquals('b', charArray[1]);
		assertEquals('c', charArray[2]);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length four.
	*/
	@Test
	void testAsCharArray5() {
		Text text = new Text("abcd");
		char[] charArray = text.asCharArray();
		assertEquals(4, charArray.length);
		assertEquals('a', charArray[0]);
		assertEquals('b', charArray[1]);
		assertEquals('c', charArray[2]);
		assertEquals('d', charArray[3]);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length five.
	*/
	@Test
	void testAsCharArray6() {
		Text text = new Text("abcde");
		char[] charArray = text.asCharArray();
		assertEquals(5, charArray.length);
		assertEquals('a', charArray[0]);
		assertEquals('b', charArray[1]);
		assertEquals('c', charArray[2]);
		assertEquals('d', charArray[3]);
		assertEquals('e', charArray[4]);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length six.
	*/
	@Test
	void testAsCharArray7() {
		Text text = new Text("abcdef");
		char[] charArray = text.asCharArray();
		assertEquals(6, charArray.length);
		assertEquals('a', charArray[0]);
		assertEquals('b', charArray[1]);
		assertEquals('c', charArray[2]);
		assertEquals('d', charArray[3]);
		assertEquals('e', charArray[4]);
		assertEquals('f', charArray[5]);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length seven.
	*/
	@Test
	void testAsCharArray8() {
		Text text = new Text("abcdefg");
		char[] charArray = text.asCharArray();
		assertEquals(7, charArray.length);
		assertEquals('a', charArray[0]);
		assertEquals('b', charArray[1]);
		assertEquals('c', charArray[2]);
		assertEquals('d', charArray[3]);
		assertEquals('e', charArray[4]);
		assertEquals('f', charArray[5]);
		assertEquals('g', charArray[6]);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length eight.
	*/
	@Test
	void testAsCharArray9() {
		Text text = new Text("abcdefgh");
		char[] charArray = text.asCharArray();
		assertEquals(8, charArray.length);
		assertEquals('a', charArray[0]);
		assertEquals('b', charArray[1]);
		assertEquals('c', charArray[2]);
		assertEquals('d', charArray[3]);
		assertEquals('e', charArray[4]);
		assertEquals('f', charArray[5]);
		assertEquals('g', charArray[6]);
		assertEquals('h', charArray[7]);
	}
	
	/**
	* Test case for {@link Text#asCharArray()} method.
	* This test case tests the method with a string of length nine.
	*/
	@Test
	void testAsCharArray10() {
		Text text = new Text("abcdefghi");
		char[] charArray = text.asCharArray();
		assertEquals(9, charArray.length);
		assertEquals('a', charArray[0]);
		assertEquals('b', charArray[1]);
		assertEquals('c', charArray[2]);
		assertEquals('d', charArray[3]);
		assertEquals('e', charArray[4]);
		assertEquals('f', charArray[5]);
		assertEquals('g', charArray[6]);
		assertEquals('h', charArray[7]);
		assertEquals('i', charArray[8]);
	}
}