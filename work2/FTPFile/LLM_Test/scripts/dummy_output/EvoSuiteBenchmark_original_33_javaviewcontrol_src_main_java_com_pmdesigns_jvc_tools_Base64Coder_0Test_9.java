// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
		
	private static byte[] data = { -97, 119, -54, 109, 105, 98, 122, 69, 120, -98, -107, 84, -125, -76, -114, 108,
			-77, 78, -77, 66, 111};

	
	/**
	 * Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#encode(byte[])}.
	 */
	@Test
	void testEncodeByteArr() {
		System.out.println("Test method Base64Coder_0Test.testEncodeByteArr");
		for (byte b : data) {
			System.out.println("Test encoded byte " + b);
			b = (byte)(b + 61);
			System.out.println("Test encoded converted byte: " + b);
			byte res = Base64Coder.encode(b);
			System.out.println("Test expected converted byte: " + res);
			assertEquals("Base64Coder_0Test.testEncodeByteArr", res, b);
		}
	}

	/**
	 * Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(byte[])}.
	 */
	@Test
	void testDecodeByteArr() {
		System.out.println("Test method Base64Coder_0Test.testDecodeByteArr");
		for (byte b : data) {
			System.out.println("Test decoded byte " + b);
			byte bd = Base64Coder.decode(b);
			assertEquals("Base64Coder_0Test.testDecodeByteArr", b, bd);
		}
	}

}