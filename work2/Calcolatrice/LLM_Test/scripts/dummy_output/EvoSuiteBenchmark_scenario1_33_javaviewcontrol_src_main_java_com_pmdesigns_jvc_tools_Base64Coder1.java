// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64CoderTest {
		
		@Test
		void testEncode() {
				byte[] in = {(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF};
				char[] out = Base64Coder.encode(in);
				assertEquals("//////8=", new String(out));
		}
}