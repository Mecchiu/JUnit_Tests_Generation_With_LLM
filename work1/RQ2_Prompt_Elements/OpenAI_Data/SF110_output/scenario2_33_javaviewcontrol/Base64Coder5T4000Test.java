// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64CoderTest {

	/**
	* Test case for {@link Base64Coder#decode(char[])}.
	* It tests the decoding of a Base64 encoded string.
	*/
	@Test
	public void testDecode() {
		String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
		char[] c = s.toCharArray();
		byte[] b = Base64Coder.decode(c);
		assertEquals(s, new String(b));
	}
}