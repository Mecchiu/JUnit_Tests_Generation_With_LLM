// SimpleCharStream_1Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_1Test {
		/**
		* Test method for {@link SimpleCharStream#readChar()}
		*/
		@Test
		public void testReadChar() {
				SimpleCharStream stream = new SimpleCharStream (
				new java.io.InputStreamReader (
				null), "UTF-8");
				char c;

				c= stream.readChar();
				assertEquals('\0', c);

				c= stream.readChar();
				assertEquals('@', c);

				c= stream.readChar();
				assertEquals('1', c);

   				c= stream.readChar();
				assertEquals('2', c);
}

}