// SimpleCharStream_0Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStream_0Test {
/**
		* Each iteration test case.
		* @throws java.io.IOException.
		*/
     @Test
	void eachIteration_1() throws java.io.IOException{
        SimpleCharStream stream = new SimpleCharStream(System.in);

// the 'beginToken()' call ensures that the stream has not been closed
		assertEquals("Incorrect token when beginToken() calls beginToken()",
			'b', stream.BeginToken());
		assertEquals("Incorrect token when beginToken() calls endToken()", 'e', stream.EndToken());
		assertEquals("Incorrect token when beginToken() calls flush()", 'f', stream.FlushToken());
		assertEquals("Incorrect token when beginToken() calls getChar()", 'c', stream.GetChar());
		assertEquals("Incorrect token when beginToken() calls readChar()", '\n', stream.ReadChar());
		assertFalse("Incorrect token when beginToken() calls available()", stream.Available());
		assertEquals("There should be no remaining characters when the endToken() call invokes endToken()",
				'\u0000', stream.EndToken());
	}

// The first "EachIterationIteration" test case.
    @Test
    public void EachIterationIteration() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        assertEquals("Incorrect token when endToken() calls endToken()", 'e', stream.EndToken());
        assertEquals("Incorrect token when endToken() calls flush()", 'f', stream.FlushToken());
        assertEquals("Incorrect token the beginToken() call", 'b', stream.BeginToken());
        assertEquals("Incorrect token the endToken() call", '\n', stream.EndToken());
        assertEquals("Incorrect token the flush() call", 'f', stream.FlushToken());
        assertEquals("Incorrect token the getChar() call", 'c', stream.GetChar());
        assertEquals("Incorrect token the readChar() call", '\n', stream.ReadChar());
        assertFalse("Incorrect token the available() call", stream.Available());
        assertEquals("Incorrect token the available() call", '\u0000', stream.Available());
        assertEquals("Incorrect token the readChar() call", '\n', stream.ReadChar());
        assertEquals("Incorrect token the peekChar() call", '\n', stream.PeekChar());
        assertFalse("Incorrect token peekChar() call", stream.PeekChar());
    }
    @Test
    public void EachIterationEOLFlush() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        assertFalse("Expected '\ufffd' as the last character", stream.LastChar());
        assertEquals("Incorrect token when endToken() calls endToken()", '\n',stream.EndToken());
        assertEquals("Incorrect token when endToken() calls flush()", 'f',stream.FlushToken());
        assertEquals("Incorrect token when endToken() calls getChar()", '\ufffd',stream.GetChar());
        assertEquals("Incorrect token when endToken() calls readChar()", '\n',stream.ReadChar());
        assertEquals("Incorrect token when endToken() calls peekChar()", '\ufffd',stream.PeekChar());
        assertFalse("Expected '\ufffd' as the last character", stream.PeekChar());
    }
}
