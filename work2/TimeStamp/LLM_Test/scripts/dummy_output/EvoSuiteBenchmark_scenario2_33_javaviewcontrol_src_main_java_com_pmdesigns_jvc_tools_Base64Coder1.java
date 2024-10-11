// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64CoderTest {
		
	/**
	* Test case for {@link Base64Coder#encode(byte[])} method.
	* It tests the encoding of a byte array with a length of zero.
	*/
	@Test
	public void testEncodeByteArrayLengthZero() {
		byte[] in = new byte[0];
		char[] expected = new char[0];
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
}