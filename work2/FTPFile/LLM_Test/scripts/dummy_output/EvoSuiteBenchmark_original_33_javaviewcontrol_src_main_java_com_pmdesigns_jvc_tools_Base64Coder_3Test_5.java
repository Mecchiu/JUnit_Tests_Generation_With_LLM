// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {
		/**
		* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decodeString(String)}.
		* Assert that the output character array contains the same data as the input.
		*/
	@Test
	public void testDecodeString()
				throws IllegalArgumentException {
	  	String s = "Hello World, the characters is 8";
	  	char[] out = Base64Coder.decodeString(s);
	  	assertArrayEquals(s.toCharArray(), out);
	}
}