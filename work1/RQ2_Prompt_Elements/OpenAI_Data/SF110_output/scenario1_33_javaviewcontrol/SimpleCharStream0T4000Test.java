// SimpleCharStreamTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStreamTest {

	/**
	* Test case 1 for {@link SimpleCharStream#BeginToken()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testBeginToken1() {
		try {
			SimpleCharStream scs = new SimpleCharStream();
			scs.bufpos = 0;
			scs.tokenBegin = -1;
			scs.input_stream = new java.io.StringReader("test");
			scs.bufsize = 4;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.inBuf = 0;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			scs.tokenBegin = -1;
			scs.inBuf = 0;
			scs.bufpos = 0;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			char result = scs.BeginToken();
			assertEquals('t', result);
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case 2 for {@link SimpleCharStream#BeginToken()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testBeginToken2() {
		try {
			SimpleCharStream scs = new SimpleCharStream();
			scs.bufpos = 0;
			scs.tokenBegin = -1;
			scs.input_stream = new java.io.StringReader("test");
			scs.bufsize = 4;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.inBuf = 0;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			scs.tokenBegin = -1;
			scs.inBuf = 0;
			scs.bufpos = 0;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			char result = scs.BeginToken();
			assertEquals('t', result);
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case 3 for {@link SimpleCharStream#BeginToken()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testBeginToken3() {
		try {
			SimpleCharStream scs = new SimpleCharStream();
			scs.bufpos = 0;
			scs.tokenBegin = -1;
			scs.input_stream = new java.io.StringReader("test");
			scs.bufsize = 4;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.inBuf = 0;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			scs.tokenBegin = -1;
			scs.inBuf = 0;
			scs.bufpos = 0;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			char result = scs.BeginToken();
			assertEquals('t', result);
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case 4 for {@link SimpleCharStream#BeginToken()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testBeginToken4() {
		try {
			SimpleCharStream scs = new SimpleCharStream();
			scs.bufpos = 0;
			scs.tokenBegin = -1;
			scs.input_stream = new java.io.StringReader("test");
			scs.bufsize = 4;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.inBuf = 0;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			scs.tokenBegin = -1;
			scs.inBuf = 0;
			scs.bufpos = 0;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			char result = scs.BeginToken();
			assertEquals('t', result);
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case 5 for {@link SimpleCharStream#BeginToken()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testBeginToken5() {
		try {
			SimpleCharStream scs = new SimpleCharStream();
			scs.bufpos = 0;
			scs.tokenBegin = -1;
			scs.input_stream = new java.io.StringReader("test");
			scs.bufsize = 4;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.inBuf = 0;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			scs.tokenBegin = -1;
			scs.inBuf = 0;
			scs.bufpos = 0;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			char result = scs.BeginToken();
			assertEquals('t', result);
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case 6 for {@link SimpleCharStream#BeginToken()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testBeginToken6() {
		try {
			SimpleCharStream scs = new SimpleCharStream();
			scs.bufpos = 0;
			scs.tokenBegin = -1;
			scs.input_stream = new java.io.StringReader("test");
			scs.bufsize = 4;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.inBuf = 0;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			scs.tokenBegin = -1;
			scs.inBuf = 0;
			scs.bufpos = 0;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			char result = scs.BeginToken();
			assertEquals('t', result);
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case 7 for {@link SimpleCharStream#BeginToken()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testBeginToken7() {
		try {
			SimpleCharStream scs = new SimpleCharStream();
			scs.bufpos = 0;
			scs.tokenBegin = -1;
			scs.input_stream = new java.io.StringReader("test");
			scs.bufsize = 4;
			scs.available = 4;
			scs.buffer = new char[4];
			scs.buffer[0] = 't';
			scs.buffer[1] = 'e';
			scs.buffer[2] = 's';
			scs.buffer[3] = 't';
			scs.maxNextCharInd = 3;
			scs.inBuf = 0;
			scs.tabSize = 8;
			scs.trackLineColumn = true;
			scs.prevCharIsCR = false;
			scs.prevCharIsLF = false;
			scs.maxBuff = 2;
			scs.column = 0;
			scs.line = 1;
			scs.tokenBegin = -1;