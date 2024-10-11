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

	@Test
	public void testBeginToken() throws java.io.IOException {
		SimpleCharStream   stream = new SimpleCharStream();
		String     s = "";
		int     i = stream.beginToken();
		assertEquals("BeginToken", 0, i);
		assertEquals("ReadChar", -1, stream.readChar());
	}
	
	@Test
	public void testPeekChar() throws java.io.IOException {
		SimpleCharStream   stream = new SimpleCharStream();
		stream.BeginToken();
		assertEquals("PeekChar", -1, stream.peekChar());
	}	
	
	@Test
	public void testEOF() throws java.io.IOException {
		SimpleCharStream   stream = new SimpleCharStream();
		assertEquals("EOF", -1, stream.EOF());
	}
	
}
