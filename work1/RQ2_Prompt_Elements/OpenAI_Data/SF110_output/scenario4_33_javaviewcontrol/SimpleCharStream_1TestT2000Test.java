// SimpleCharStream_1Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_1Test {

	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is not empty.
	*/
	@Test
	void testReadChar_1() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	*/
	@Test
	void testReadChar_2() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		stream.readChar();
		assertEquals('b', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is empty.
	*/
	@Test
	void testReadChar_3() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertEquals('\u0000', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is empty.
	*/
	@Test
	void testReadChar_4() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.readChar();
		assertEquals('\u0000', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is not empty.
	*/
	@Test
	void testReadChar_5() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	*/
	@Test
	void testReadChar_6() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		stream.readChar();
		assertEquals('b', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is empty.
	*/
	@Test
	void testReadChar_7() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertEquals('\u0000', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is empty.
	*/
	@Test
	void testReadChar_8() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.readChar();
		assertEquals('\u0000', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is not empty.
	*/
	@Test
	void testReadChar_9() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	*/
	@Test
	void testReadChar_10() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		stream.readChar();
		assertEquals('b', stream.readChar());
	}
	
}

// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_2Test {
		
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is not empty.
	*/
	@Test
	void testReadChar_1() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	*/
	@Test
	void testReadChar_2() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		stream.readChar();
		assertEquals('b', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is empty.
	*/
	@Test
	void testReadChar_3() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertEquals('\u0000', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is empty.
	*/
	@Test
	void testReadChar_4() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.readChar();
		assertEquals('\u0000', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is not empty.
	*/
	@Test
	void testReadChar_5() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	*/
	@Test
	void testReadChar_6() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		stream.readChar();
		assertEquals('b', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is empty.
	*/
	@Test
	void testReadChar_7() throws Exception {
		SimpleChar