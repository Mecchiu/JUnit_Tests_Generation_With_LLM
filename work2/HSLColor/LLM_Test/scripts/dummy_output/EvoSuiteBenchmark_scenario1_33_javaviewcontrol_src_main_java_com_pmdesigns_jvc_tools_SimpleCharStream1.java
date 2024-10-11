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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 0;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 0;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('a', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 1;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 0;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('b', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 2;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 0;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('c', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 0;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 1;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('b', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 1;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 1;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('c', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 2;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 1;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('a', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 0;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 2;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('c', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 1;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 2;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('a', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 2;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 2;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('b', scs.readChar());
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
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 0;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 3;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('a', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
}