// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {

	// Instance member variables.
	private byte[] in;
	private boolean initialized;
	private int in_strlens;
	private int in_stroffset;
	
	// Constructor Test
	public Base64Coder_4Test() {
		initialized = false;
		in = null;
		in_strlens = -1;
		in_stroffset = -1;
	}

	// Tests
	
	@Test void testEncodeString() {
		String s = "abcdefghijklmnopqrstuvwxyz";
		int str_len;
		int offset;
		int i;
		
		// Construct byte array
		in = new byte[64];
		in_strlens = s.length();
		in_stroffset = 0;
	
		// Test encode
		String result;
		result = Base64Coder_4Test.encode(s.toCharArray(), in_strlens, in_stroffset);
		if (!initialized) {
			// Test invalid input
			assertThrows(Exception.class, result::equals);
		}
		s = Base64Coder_4Test.decodeString(result);
		str_len = s.length();
		offset = 64;
		assertEquals("Encoded string length must be 64.", str_len, result.length());
		
		// Test valid encode
		result = Base64Coder_4Test.encode(new byte[] {1,2,3,4}, 0, result.length());
		
		// Test input length
		str_len = 0;
		offset = 0;
		result = Base64Coder_4Test.decodeString(result);
		assertEquals("Unable to process input string with data in the encode call",
				s, result);
		
		// Test correct output of encode string
		s = "YmNoZ";
		result = Base64Coder_4Test.encode(s.toCharArray(), in_strlens, in_stroffset);
		if (!initialized) {
			// Test invalid input
			assertThrows(Exception.class, result::equals);
		}
		str_len = s.length();
		in = null;
		for (i=0; i<str_len; i++) {
			in[offsets[i]] = (byte)s.charAt(i);
		}
		offset = s.length();
		result = Base64Coder_4Test.encode(s.toCharArray(), in_strlens, in_stroffset);
		
		// Test valid output of encode string
		s = "YmNoZ";
		byte resultB[] = Base64Coder_4Test.encode(s.toCharArray(), in_strlens, in_stroffset);
		int len = result.length();
		assertEquals("Unexpected result length",result.length(), len);
		assertEquals("Unexpected result offset",0, resultB[offsets[0]]*256, 5);
		for (i=1; i<result.length(); i++) {
			assertEquals("Unexpected result char at offset "+i, result.charAt(i-1), resultB[offsets[i]]);
		}
		
	}
	
	@Test void testDecodeString( ) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		// Test valid decode string
		String orig = s;
		int result_len;
		int i;
		result_len = 0;
		byte buf[] = null;
		while (result_len < in.length) {
			buf = new byte[in.length - result_len];
			System.arraycopy(in, result_len, buf, 0, buf.length);
			result_len += buf.length;
			decodeString(new String(buf, "UTF-8"));
		}
		
		// Test error handling when the length of the encoded string is not multiple of 4
		result = Base64Coder_4Test.decodeString(orig.substring(0,128));
		assertThrows(Exception.class, result::equals);
		
		// Test error handling when the input is not 16 bytes long
		String invalid_in = "QlGjk3N1bGVjNzJ3ZWIyYmF4yVXRlbnQtRiZqb3J0";
		invalid_in += "lZrVjdmNyZWV0dG9uYmF4cGVlVHJhY3RvcmFyYXJyYWJsZXN0dG9u";
		
		// Test error handling when the length of the encoded string is not multiple of 4
		result = Base64Coder_4Test.decodeString(invalid_in);
		assertThrows(Exception.class, result::equals);
	}
	
}
