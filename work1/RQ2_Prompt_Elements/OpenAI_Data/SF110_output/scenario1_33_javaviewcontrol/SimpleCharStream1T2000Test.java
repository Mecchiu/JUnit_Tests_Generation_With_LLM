// SimpleCharStreamTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStreamTest {

	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 0;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 0;
		
		try {
			assertEquals('a', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput2() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 1;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 0;
		
		try {
			assertEquals('b', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput3() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 2;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 0;
		
		try {
			assertEquals('c', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput4() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 0;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 1;
		
		try {
			assertEquals('b', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput5() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 1;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 1;
		
		try {
			assertEquals('c', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput6() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 2;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 1;
		
		try {
			assertEquals('a', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput7() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 0;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 2;
		
		try {
			assertEquals('c', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput8() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 1;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 2;
		
		try {
			assertEquals('a', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput9() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 2;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 2;
		
		try {
			assertEquals('b', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput10() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		simpleCharStream.buffer = new char[] {'a', 'b', 'c'};
		simpleCharStream.bufpos = 0;
		simpleCharStream.bufsize = 3;
		simpleCharStream.maxNextCharInd = 3;
		simpleCharStream.inBuf = 3;
		
		try {
			assertEquals('a', simpleCharStream.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
}