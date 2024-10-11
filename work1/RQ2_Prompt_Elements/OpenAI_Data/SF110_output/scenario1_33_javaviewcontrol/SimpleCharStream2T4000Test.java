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
	* This test case tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage1() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 5;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("fghij", scs.GetImage());
	}
	
	/**
	* Test case 2 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 10.
	*/
	@Test
	void testGetImage2() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 0;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("abcdefghij", scs.GetImage());
	}
	
	/**
	* Test case 3 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 11.
	*/
	@Test
	void testGetImage3() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 0;
		scs.bufpos = 0;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("abcdefghij", scs.GetImage());
	}
	
	/**
	* Test case 4 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 9.
	*/
	@Test
	void testGetImage4() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 1;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("bcdefghij", scs.GetImage());
	}
	
	/**
	* Test case 5 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 8.
	*/
	@Test
	void testGetImage5() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 2;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("cdefghij", scs.GetImage());
	}
	
	/**
	* Test case 6 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 7.
	*/
	@Test
	void testGetImage6() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 3;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("defghij", scs.GetImage());
	}
	
	/**
	* Test case 7 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 6.
	*/
	@Test
	void testGetImage7() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 4;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("efghij", scs.GetImage());
	}
	
	/**
	* Test case 8 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 5.
	*/
	@Test
	void testGetImage8() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 5;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("fghij", scs.GetImage());
	}
	
	/**
	* Test case 9 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 4.
	*/
	@Test
	void testGetImage9() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 6;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("ghij", scs.GetImage());
	}
	
	/**
	* Test case 10 for {@link SimpleCharStream#GetImage()}.
	* This test case tests the method with a buffer of size 10 and a token of size 3.
	*/
	@Test
	void testGetImage10() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.bufsize = 10;
		scs.tokenBegin = 7;
		scs.bufpos = 9;
		scs.buffer = new char[10];
		scs.buffer[0] = 'a';
		scs.buffer[1] = 'b';
		scs.buffer[2] = 'c';
		scs.buffer[3] = 'd';
		scs.buffer[4] = 'e';
		scs.buffer[5] = 'f';
		scs.buffer[6] = 'g';
		scs.buffer[7] = 'h';
		scs.buffer[8] = 'i';
		scs.buffer[9] = 'j';
		assertEquals("hij", scs.GetImage());
	}
}