// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
private final String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		private final byte[] bytes = string.getBytes(java.nio.charset.StandardCharsets.UTF_8);
//		private final String hexStr = "0123456789abcdef"; // hex string of byte[] in hex

	@Test
		public void test_Base64Coder_15BytesEncodeString() {
			final String s = encodeString(string);
			assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", s);
		}


	@Test
		public void test_Base64Coder_10BytesEncodeString() {
			String s = new String(encode(bytes));
			assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", s);
		}

	@Test
		public void test_Base64Coder_15BytesDecodeString() {
			String s = new String(decode(encode(bytes)));
			assertEquals(string, s);
		}

	@Test
		public void test_Base64Coder_10BytesDecodeString() {
			String s = new String(decode(encode(bytes)));
			assertEquals(string, s);
		}


}