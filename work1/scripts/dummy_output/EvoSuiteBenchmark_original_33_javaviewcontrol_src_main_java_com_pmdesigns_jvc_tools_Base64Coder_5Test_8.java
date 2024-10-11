// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		/**
		* @throws IOException if an IOException occurs.
		* @throws Exception   if an Exception occurs.
		* @version 1.0
		* @since 1.0
		*/
	@Test
	public void testDecodeNullString() throws Exception {
		char[] data = null;
		Base64Coder.decode(data);
		assertThrows(NullPointerException.class, () -> Base64Coder.decode(new char[0]));
	}
		/**
		* @throws Exception if an Exception occurs.
		* @version 1.0
		* @since 1.0
		*/
	@Test
	public void testEncodeNullString() throws Exception {
		char[] data = null;
		Base64Coder.encode(data);
		assertThrows(NullPointerException.class, () -> Base64Coder.encode(new char[0]));
	}
		/**
		* @throws Exception if an Exception occurs.
		* @version 1.0
		* @since 1.0
		*/
	@Test
	public void testDecodeString() throws Exception {
		String s = "";
		assertEquals(s, Base64Coder.decodeString(s));
	}

	/**
	* @throws Exception if an Exception occurs.
	* @version 1.0
	* @since 1.0
	*/
	@Test
	public void testEncodeString() throws Exception {
		String s = "";
		assertEquals(s, Base64Coder.encodeString(s));
	}
}