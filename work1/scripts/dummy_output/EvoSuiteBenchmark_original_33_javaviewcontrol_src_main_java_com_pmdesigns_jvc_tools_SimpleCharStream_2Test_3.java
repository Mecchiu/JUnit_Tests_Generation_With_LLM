// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {
		/**
		 * Test method GetImage for zero-length input string.
		 */
		@Test
		public void testStringGetImage() {
	        {
	            /* Test input length: 0 */
	            SimpleCharStream stream = new SimpleCharStream(new StringReader(""), "ljh", 0, 0);
	            assertNull(stream.GetImage());
	        }

	        {
	            /* Test input length: 7 */
	            SimpleCharStream stream = new SimpleCharStream(new StringReader("ljh"), "ljh", 7, 0);
	            assertEquals("ljh", stream.GetImage());

	            /* Test for empty string */
//	            {
//	                SimpleCharStream stream = new SimpleCharStream(new StringReader(string));
//	                assertEquals("", stream.GetImage());
//	            }
	        }

		}
}