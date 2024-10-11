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
		int testcase_number = 0;

		/**
		 * Test method for {@link SimpleCharStream#SimpleCharStream(java.io.Reader, char[], int, int, int)}.
		 */
		@Test
		public void testSimpleCharStream_0() {
return;
/**
             * Test method for {@link SimpleCharStream#SimpleCharStream(java.io.Reader, String, int, int, int)}.
             */
			byte[] array_0 = { (byte)'T', (byte)'r', (byte)'i', (byte)'n', (byte)'g', (byte)'i', (byte)'e' };
			int nZeros = 15;

		}

		/**
		 * Test method for {@link SimpleCharStream#BeginToken()}.
		 */
		@Test
		public void testBeginToken() throws java.io.IOException {
				SimpleCharStream stream = new SimpleCharStream(new java.io.InputStreamReader(new java.io.FileReader(System.getProperty("test.src"))), "", 55);
				char[] buffer = new char[4];
				int nRead = stream.Read(buffer);


				assertEquals("SimpleCharStream.BeginToken failed to retrieve correct number of characters (should be 4)",4,nRead);

		}


}