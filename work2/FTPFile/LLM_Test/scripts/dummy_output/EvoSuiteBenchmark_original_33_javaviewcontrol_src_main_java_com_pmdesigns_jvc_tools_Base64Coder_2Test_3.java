// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		
	// Test Cases
	
	/**
	 * Base 64 encode of a single byte String.
	 * @param  in     String to be encoded.
	 * @return     a String containing the Base64 encoded data.
	 */
	@Test
	void testEncodeByteStringSingleByte(String in) {
		assertEquals("Y", Base64.encodeBase64String(in.getBytes()));
	}
	
	/**
	 * Base 64 encode of an array of bytes.
	 * @param  in     Array of bytes to be encoded.
	 * @return     a character array containing the Base64 encoded data.
	 */
	@Test
	void testEncodeCharArray(char[] in) {
		assertEquals("Y", Base64.encodeBase64String(in));
	}
}