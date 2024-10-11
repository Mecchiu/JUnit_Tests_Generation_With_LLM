// SimpleCharStreamTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStreamTest {

	/**
	* Test case 1 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage1() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 5;
		scs.buffer = new char[10];
		assertEquals("", scs.GetImage());
	}
	
	/**
	* Test case 2 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage2() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 6;
		scs.buffer = new char[10];
		assertEquals("a", scs.GetImage());
	}
	
	/**
	* Test case 3 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage3() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		assertEquals("abcd", scs.GetImage());
	}
	
	/**
	* Test case 4 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage4() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 0;
		scs.buffer = new char[10];
		assertEquals("abcdefghij", scs.GetImage());
	}
	
	/**
	* Test case 5 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage5() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 1;
		scs.buffer = new char[10];
		assertEquals("abcdefghij", scs.GetImage());
	}
	
	/**
	* Test case 6 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage6() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 2;
		scs.buffer = new char[10];
		assertEquals("abcdefghij", scs.GetImage());
	}
	
	/**
	* Test case 7 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage7() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 3;
		scs.buffer = new char[10];
		assertEquals("abcdefghij", scs.GetImage());
	}
	
	/**
	* Test case 8 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage8() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 4;
		scs.buffer = new char[10];
		assertEquals("abcdefghij", scs.GetImage());
	}
	
	/**
	* Test case 9 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage9() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 5;
		scs.buffer = new char[10];
		assertEquals("", scs.GetImage());
	}
	
	/**
	* Test case 10 for {@link SimpleCharStream#GetImage()}.
	* It tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage10() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 6;
		scs.buffer = new char[10];
		assertEquals("a", scs.GetImage());
	}
}