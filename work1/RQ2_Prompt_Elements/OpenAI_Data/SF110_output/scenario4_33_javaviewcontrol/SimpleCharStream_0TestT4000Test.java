// SimpleCharStream_0Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStream_0Test {

	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_0() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertEquals('\u0000', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_1() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		assertEquals('a', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_2() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		assertEquals('a', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_3() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		assertEquals('a', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_4() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		assertEquals('a', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_5() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		assertEquals('a', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_6() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		stream.maxNextCharInd = 0;
		assertEquals('a', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_7() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		stream.maxNextCharInd = 0;
		stream.inBuf = 0;
		assertEquals('a', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_8() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		stream.maxNextCharInd = 0;
		stream.inBuf = 0;
		stream.tabSize = 8;
		assertEquals('a', stream.BeginToken());
	}
	
	/**
	* Test case for {@link SimpleCharStream#BeginToken()}.
	*/
	@Test
	void testBeginToken_9() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		stream.maxNextCharInd = 0;
		stream.inBuf = 0;
		stream.tabSize = 8;
		stream.tokenBegin = 0;
		assertEquals('a', stream.BeginToken());
	}
	
}

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
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_0() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		assertEquals('\u0000', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_1() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_2() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_3() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_4() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_5() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_6() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		stream.maxNextCharInd = 0;
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_7() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		stream.maxNextCharInd = 0;
		stream.inBuf = 0;
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_8() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		stream.maxNextCharInd = 0;
		stream.inBuf = 0;
		stream.tabSize = 8;
		assertEquals('a', stream.readChar());
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()}.
	*/
	@Test
	void testReadChar_9() throws Exception {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1, 1);
		stream.bufpos = 0;
		stream.available = 1;
		stream.buffer = new char[] {'a'};
		stream.bufline[0] = 1;
		stream.bufcolumn[0] = 1;
		stream.column = 1;
		stream.line = 1;
		stream.prevCharIsCR = true;
		stream.prevCharIsLF = true;
		stream.inputStream = new java.io.StringReader("");
		stream.maxNextCharInd = 0;
		stream.inBuf = 0;
		stream.tabSize = 8;
		stream.tokenBegin = 0;
		assertEquals('a', stream.readChar());
	}
	
}

// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.