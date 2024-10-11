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
		* Test method for method BeginToken(String).
		*/
        @Test
        public void testBeginTokenString_String() {
                  //@ assertNotNull.object(new Object());
		SimpleCharStream stream = new SimpleCharStream(new StringReader(""), null);
		char[] buffer = new char[1];
		int count;

		buffer[0] ='';

		for (int i = 0, N = stream.getBeginIndex(); i <= N; i++) {
			stream.nextChar(buffer[0]);
		}
		assertEquals(' ', stream.GetChar(0));
		assertEquals(N, stream.getEndIndex());

		buffer[0] = '\n';
		for (int i = 0, N = stream.getBeginIndex(); i <= N; i++) {
			stream.nextChar(buffer[0]);
		}
		assertEquals('\n', stream.GetChar(0));
		assertEquals(N, stream.getEndIndex());

		buffer[0] = '\t';
		for (int i = 0; i < 26; i++) {
			stream.nextChar(buffer[0]);
		}
		assertEquals('0', stream.GetChar(0));
		assertEquals(27, stream.getEndIndex());

		buffer[0] = '*';
		for (int i = 0; i < 10; i++) {
			stream.nextChar(buffer[0]);
		}
		assertEquals('*', stream.GetChar(0));
		assertEquals(10, stream.getEndIndex());

		buffer[0] = '!';
		for (int i = 0; i < 10; i++) {
			stream.nextChar(buffer[0]);
		}
		assertEquals('!', stream.GetChar(0));
		assertEquals(10, stream.getEndIndex());

		buffer[0] = '"';
		for (int i = 0; i < 15; i++) {
			stream.nextChar(buffer[0]);
		}
		assertEquals('"', stream.GetChar(0));
		assertEquals(15, stream.getEndIndex());

		buffer[0] = '\'';
		for (int i = 0; i < 14; i++) {
			stream.nextChar(buffer[0]);
		}
		assertEquals('\''', stream.GetChar(0));
		assertEquals(14, stream.getEndIndex());
	}

}