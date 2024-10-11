// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
		
	
	/**
	 * Test case for {@link Base64Coder#encodeString(String)}.
	 * <b>Explanation: the method should return an array containing the specified bytes.</b>
	 * @see Base64Coder#encodeString(String)
	 */
	@Test
	public void testEncodeString_01() {
		String in = "Hello, world!";
		byte[] out = Base64Coder.encode(in);
		byte[] out1 = Base64Coder.encode(out);
		assertTrue(out1.length == in.length());
		for (int i = 0; i < out.length; i++) {
			assertTrue(out1[i] == out[i]);
		}
		
		in = "Hello, world!";
		byte[] out1b = Base64Coder.encode(in);

		assertTrue(out1b.length == in.length());
		for (int i = 0; i < out1b.length; i++) {
			assertTrue(out1b[i] == out[i]);
		}
		
		assertFalse(out1b.length == 0);
		
}
}