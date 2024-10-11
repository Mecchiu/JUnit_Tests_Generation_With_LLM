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
		assertEquals('b', stream.readChar());
		assertEquals('c', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is empty and the stream is empty.
	*/
	@Test
	void testReadChar_2() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertThrows(java.io.IOException.class, () -> stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	*/
	@Test
	void testReadChar_3() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 3);
		assertEquals('a', stream.readChar());
		assertEquals('b', stream.readChar());
		assertEquals('c', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is empty.
	*/
	@Test
	void testReadChar_4() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 3);
		assertThrows(java.io.IOException.class, () -> stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	* The buffer is filled with the stream.
	*/
	@Test
	void testReadChar_5() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		assertEquals('a', stream.readChar());
		assertEquals('b', stream.readChar());
		assertEquals('c', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is empty.
	* The buffer is filled with the stream.
	*/
	@Test
	void testReadChar_6() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertThrows(java.io.IOException.class, () -> stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	* The buffer is filled with the stream.
	*/
	@Test
	void testReadChar_7() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 3);
		assertEquals('a', stream.readChar());
		assertEquals('b', stream.readChar());
		assertEquals('c', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is empty.
	* The buffer is filled with the stream.
	*/
	@Test
	void testReadChar_8() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 3);
		assertThrows(java.io.IOException.class, () -> stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	* The buffer is filled with the stream.
	*/
	@Test
	void testReadChar_9() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		assertEquals('a', stream.readChar());
		assertEquals('b', stream.readChar());
		assertEquals('c', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the case when the buffer is not empty and the stream is empty.
	* The buffer is filled with the stream.
	*/
	@Test
	void testReadChar_10() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertThrows(java.io.IOException.class, () -> stream.readChar());
	}
	
}
/* JavaCC - OriginalChecksum=d9128cf5d82a12eb06ed3b6fa19acc59 (do not edit this line) */

// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#backup(int)} method.
*/
class SimpleCharStream_2Test {
		
	/**
	* Test case for {@link SimpleCharStream#backup(int)} method.
	* It tests the case when the buffer is empty and the stream is not empty.
	*/
	@Test
	void testBackup_1() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 1);
		assertEquals('a', stream.readChar());
		assertEquals('b', stream.readChar());
		stream.backup(1);
		assertEquals('b', stream.readChar());
		assertEquals('c', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#backup(int)} method.
	* It tests the case when the buffer is empty and the stream is empty.
	*/
	@Test
	void testBackup_2() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertThrows(java.io.IOException.class, () -> stream.readChar());
		stream.backup(1);
		assertThrows(java.io.IOException.class, () -> stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#backup(int)} method.
	* It tests the case when the buffer is not empty and the stream is not empty.
	*/
	@Test
	void testBackup_3() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("abc"), 1, 1, 3);
		assertEquals('a', stream.readChar());
		assertEquals('b', stream.readChar());
		stream.backup(1);
		assertEquals('b', stream.readChar());
		assertEquals('c', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#backup(int)} method.
	