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
	* It tests the case when the text node is constructed from a char[] buffer.
	*/
	@Test
	public void testAsCharArray1() {
		char[] data = {'a', 'b', 'c'};
		Text text = new Text(data, 0, 3, false);
		assertArrayEquals(data, text.asCharArray());
	}
	
	/**
	* Test case 2 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a char[] buffer.
	*/
	@Test
	public void testAsCharArray2() {
		char[] data = {'a', 'b', 'c'};
		Text text = new Text(data, 0, 3, true);
		assertArrayEquals(data, text.asCharArray());
	}
	
	/**
	* Test case 3 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a char[] buffer.
	*/
	@Test
	public void testAsCharArray3() {
		char[] data = {'a', 'b', 'c'};
		Text text = new Text(data, 1, 2, false);
		assertArrayEquals(new char[]{'b', 'c'}, text.asCharArray());
	}
	
	/**
	* Test case 4 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a char[] buffer.
	*/
	@Test
	public void testAsCharArray4() {
		char[] data = {'a', 'b', 'c'};
		Text text = new Text(data, 1, 2, true);
		assertArrayEquals(new char[]{'b', 'c'}, text.asCharArray());
	}
	
	/**
	* Test case 5 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a String.
	*/
	@Test
	public void testAsCharArray5() {
		String value = "abc";
		Text text = new Text(value);
		assertArrayEquals(value.toCharArray(), text.asCharArray());
	}
	
	/**
	* Test case 6 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a String.
	*/
	@Test
	public void testAsCharArray6() {
		String value = "abc";
		Text text = new Text(value);
		assertArrayEquals(value.toCharArray(), text.asCharArray());
	}
	
	/**
	* Test case 7 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a String.
	*/
	@Test
	public void testAsCharArray7() {
		String value = "abc";
		Text text = new Text(value);
		assertArrayEquals(value.toCharArray(), text.asCharArray());
	}
	
	/**
	* Test case 8 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a String.
	*/
	@Test
	public void testAsCharArray8() {
		String value = "abc";
		Text text = new Text(value);
		assertArrayEquals(value.toCharArray(), text.asCharArray());
	}
	
	/**
	* Test case 9 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a String.
	*/
	@Test
	public void testAsCharArray9() {
		String value = "abc";
		Text text = new Text(value);
		assertArrayEquals(value.toCharArray(), text.asCharArray());
	}
	
	/**
	* Test case 10 for {@link Text#asCharArray()}.
	* It tests the case when the text node is constructed from a String.
	*/
	@Test
	public void testAsCharArray10() {
		String value = "abc";
		Text text = new Text(value);
		assertArrayEquals(value.toCharArray(), text.asCharArray());
	}
}