// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		
	private static final char[] encoded = "AeBgAuABC".toCharArray();

	/**
	 * Test case for method {@link Base64Coder#decode(char[])}.
	 */
	@Test
	public void testDecodeCharArray_ValidString() {
		String s = new String(encoded);

		char[] decoded = Base64Coder.decode(s);

		assertEquals("Succeeded with incorrect input.", encoded, decoded);
	}
	
	/**
	 * Test case for method {@link Base64Coder#decode(char[])}.
	 */
	@Test
	public void testDecodeCharArray_InvalidString() {
		String s = "Ai";

		try {
			Base64Coder.decode(s);
			fail("An exception should have been throw for invalid base64 string.");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid character encoding in string.", s, e.getMessage());
		}
	}

	/**
	 * Test case for method {@link Base64Coder#decode(char[])}.
	 */
	@Test
	public void testDecodeCharArray_InvalidBase64() {
		try {
			Base64Coder.decode(new char[100]);
			fail("An exception should have been throw for invalid base64 string.");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid character encoding in string.", "AeBgAuABC", e.getMessage());
		}
	}
}