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
		* Test of begin token method, of class SimpleCharStream.
		*/
		@Test
		public void test_begin_token_1() {
			int startLine = 2;
			int startColumn = 12;
			int i2 = 0;
			int i1 = 0;
			int i = 0;
			SimpleCharStream stream_from_string = new SimpleCharStream(new java.io.StringReader(""), "SCCS", startLine, startColumn);
			SimpleCharStream stream_from_commstring = new SimpleCharStream(new java.io.StringReader(""), "SCCS", startLine, startColumn);
			int i4 = stream_from_string.BeginToken();
			assertEquals("Token value mismatch.", i4, stream_from_string.token);
			i2 = stream_from_string.Available();
			assertEquals("Token value mismatch.", i2, i4);
			i1 = stream_from_string.getBeginColumn();
			assertEquals("Token value mismatch.", i1, stream_from_string.getBeginColumn());
			i = stream_from_string.getBeginLine();
			assertEquals("Token value mismatch.", i, stream_from_string.getBeginLine());
		}

}