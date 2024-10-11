// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		 /*
	   * @Test
	   */
	@Test
    public void testEncodeByteArray() {
        assertArrayEquals("Base64 does not match array.",
                                 new byte[16],
                                 Base64Coder.encode(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x1a, 0x1b, 0x1c, 0x1d, 0x1e, 0x1f}, 16
);
    }
    
	/*
	 * @Test
    public void testEncodeCharArray() {
        assertArrayEquals("Base64 does not match charArray.",
                                   new char[16], //the array
                                   Base64Coder.encode(new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd' }, 16));
     }
	 */
    
	@Test
	public void testEncodeString() {
		//String str = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
		String str = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";

		assertEquals("Base64 does not match base64.",
				new String(Base64Coder.encode(str.getBytes()), "UTF-8"),
				str.toString());
	}
}