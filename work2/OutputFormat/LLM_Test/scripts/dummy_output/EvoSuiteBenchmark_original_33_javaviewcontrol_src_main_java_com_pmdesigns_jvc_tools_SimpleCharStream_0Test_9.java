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
		* Test method for method BeginToken()
		*/
		@Test
		public void testBeginToken()
		{
				final SimpleCharStream jjtheader = new SimpleCharStream(new java.io.StringReader(""), 0, 0);
				final SimpleCharStream jjth = SimpleCharStream.beginToken();
				assertEquals("beginToken", jjth.next());
				assertEquals("beginToken", jjth.next());
				assertEquals("beginToken", jjth.next());
				assertEquals("end of input", jjtheader.begin());
				assertEquals("end of input", jjtheader.end());
				assertEquals("begin token", jjtheader.beginToken());
				assertEquals("end token", jjtheader.endToken());
				assertEquals("", jjtheader.input);
				assertEquals("", jjtheader.buffer);
				assertEquals("end of input", jjtheader.input);
				assertEquals("end of input", jjtheader.buffer);
		}

		/**
		* Test method for method nextToken()
		*/
		@Test
		public void testNextToken()
		{
				final SimpleCharStream jjtheader = new SimpleCharStream(new java.io.StringReader(""), 0, 0);
				final SimpleCharStream.TokenScanner jjtheader$src;
				String token;
				jjtheader = SimpleCharStream.beginToken();
				jjtheader$src = new jjtheader.TokenScanner(System.out);
				do
				{
						token = jjtheader$.src.nextToken();
						if (jjtheader.nextTokenMatch(SimpleCharStream.EOF))
						{
								break;
						}
						assertNull(token);
						assertNull(jjtheader$src.nextToken());
				}
				while (true);
		}
}