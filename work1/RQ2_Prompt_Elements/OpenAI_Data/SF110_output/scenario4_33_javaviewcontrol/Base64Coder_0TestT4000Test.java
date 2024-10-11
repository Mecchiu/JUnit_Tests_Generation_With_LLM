// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {

	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a null string.
	*/
	@Test
	void testEncodeString_0() {
		String s = null;
		String result = Base64Coder.encodeString(s);
		assertNull(result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with an empty string.
	*/
	@Test
	void testEncodeString_1() {
		String s = "";
		String result = Base64Coder.encodeString(s);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a string containing only one character.
	*/
	@Test
	void testEncodeString_2() {
		String s = "a";
		String result = Base64Coder.encodeString(s);
		assertEquals("YQ==", result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a string containing only two characters.
	*/
	@Test
	void testEncodeString_3() {
		String s = "ab";
		String result = Base64Coder.encodeString(s);
		assertEquals("YWI=", result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a string containing only three characters.
	*/
	@Test
	void testEncodeString_4() {
		String s = "abc";
		String result = Base64Coder.encodeString(s);
		assertEquals("YWJj", result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a string containing only four characters.
	*/
	@Test
	void testEncodeString_5() {
		String s = "abcd";
		String result = Base64Coder.encodeString(s);
		assertEquals("YWJjZA==", result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a string containing only five characters.
	*/
	@Test
	void testEncodeString_6() {
		String s = "abcde";
		String result = Base64Coder.encodeString(s);
		assertEquals("YWJjZGU=", result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a string containing only six characters.
	*/
	@Test
	void testEncodeString_7() {
		String s = "abcdef";
		String result = Base64Coder.encodeString(s);
		assertEquals("YWJjZGVm", result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a string containing only seven characters.
	*/
	@Test
	void testEncodeString_8() {
		String s = "abcdefg";
		String result = Base64Coder.encodeString(s);
		assertEquals("YWJjZGVmZw==", result);
	}
	
	/**
	* Test case for {@link Base64Coder#encodeString(String)}.
	* It tests the method with a string containing only eight characters.
	*/
	@Test
	void testEncodeString_9() {
		String s = "abcdefgh";
		String result = Base64Coder.encodeString(s);
		assertEquals("YWJjZGVmZ2g=", result);
	}
	
}

// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_1Test {
		
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a null string.
	*/
	@Test
	void testDecodeString_0() {
		String s = null;
		String result = Base64Coder.decodeString(s);
		assertNull(result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with an empty string.
	*/
	@Test
	void testDecodeString_1() {
		String s = "";
		String result = Base64Coder.decodeString(s);
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a string containing only one character.
	*/
	@Test
	void testDecodeString_2() {
		String s = "YQ==";
		String result = Base64Coder.decodeString(s);
		assertEquals("a", result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a string containing only two characters.
	*/
	@Test
	void testDecodeString_3() {
		String s = "YWI=";
		String result = Base64Coder.decodeString(s);
		assertEquals("ab", result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a string containing only three characters.
	*/
	@Test
	void testDecodeString_4() {
		String s = "YWJj";
		String result = Base64Coder.decodeString(s);
		assertEquals("abc", result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a string containing only four characters.
	*/
	@Test
	void testDecodeString_5() {
		String s = "YWJjZA==";
		String result = Base64Coder.decodeString(s);
		assertEquals("abcd", result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a string containing only five characters.
	*/
	@Test
	void testDecodeString_6() {
		String s = "YWJjZGU=";
		String result = Base64Coder.decodeString(s);
		assertEquals("abcde", result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a string containing only six characters.
	*/
	@Test
	void testDecodeString_7() {
		String s = "YWJjZGVm";
		String result = Base64Coder.decodeString(s);
		assertEquals("abcdef", result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a string containing only seven characters.
	*/
	@Test
	void testDecodeString_8() {
		String s = "YWJjZGVmZw==";
		String result = Base64Coder.decodeString(s);
		assertEquals("abcdefg", result);
	}
	
	/**
	* Test case for {@link Base64Coder#decodeString(String)}.
	* It tests the method with a string containing only eight characters.
	*/
	@Test
	void testDecodeString_9() {
		String s = "YWJjZGVmZ2g=";
		String result = Base64Coder.decodeString(s);
		assertEquals("abcdefgh", result);
	}
	
}

// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_2Test {
		
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with a null array.
	*/
	@Test
	void testEncode_0() {
		byte[] in = null;
		char[] result = Base64Coder.encode(in);
		assertNull(result);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an empty array.
	*/
	@Test
	void testEncode_1() {
		byte[] in = new byte[0];
		char[] result = Base64Coder.encode(in);
		assertEquals(0, result.length);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an array containing only one byte.
	*/
	@Test
	void testEncode_2() {
		byte[] in = new byte[] {97};
		char[] result = Base64Coder.encode(in);
		assertEquals(4, result.length);
		assertEquals('Y', result[0]);
		assertEquals('Q', result[1]);
		assertEquals('=', result[2]);
		assertEquals('=', result[3]);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an array containing only two bytes.
	*/
	@Test
	void testEncode_3() {
		byte[] in = new byte[] {97, 98};
		char[] result = Base64Coder.encode(in);
		assertEquals(4, result.length);
		assertEquals('Y', result[0]);
		assertEquals('W', result[1]);
		assertEquals('I', result[2]);
		assertEquals('=', result[3]);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an array containing only three bytes.
	*/
	@Test
	void testEncode_4() {
		byte[] in = new byte[] {97, 98, 99};
		char[] result = Base64Coder.encode(in);
		assertEquals(4, result.length);
		assertEquals('Y', result[0]);
		assertEquals('W', result[1]);
		assertEquals('J', result[2]);
		assertEquals('j', result[3]);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an array containing only four bytes.
	*/
	@Test
	void testEncode_5() {
		byte[] in = new byte[] {97, 98, 99, 100};
		char[] result = Base64Coder.encode(in);
		assertEquals(8, result.length);
		assertEquals('Y', result[0]);
		assertEquals('W', result[1]);
		assertEquals('J', result[2]);
		assertEquals('j', result[3]);
		assertEquals('Z', result[4]);
		assertEquals('A', result[5]);
		assertEquals('=', result[6]);
		assertEquals('=', result[7]);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an array containing only five bytes.
	*/
	@Test
	void testEncode_6() {
		byte[] in = new byte[] {97, 98, 99, 100, 101};
		char[] result = Base64Coder.encode(in);
		assertEquals(8, result.length);
		assertEquals('Y', result[0]);
		assertEquals('W', result[1]);
		assertEquals('J', result[2]);
		assertEquals('j', result[3]);
		assertEquals('Z', result[4]);
		assertEquals('G', result[5]);
		assertEquals('U', result[6]);
		assertEquals('=', result[7]);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an array containing only six bytes.
	*/
	@Test
	void testEncode_7() {
		byte[] in = new byte[] {97, 98, 99, 100, 101, 102};
		char[] result = Base64Coder.encode(in);
		assertEquals(8, result.length);
		assertEquals('Y', result[0]);
		assertEquals('W', result[1]);
		assertEquals('J', result[2]);
		assertEquals('j', result[3]);
		assertEquals('Z', result[4]);
		assertEquals('G', result[5]);
		assertEquals('V', result[6]);
		assertEquals('m', result[7]);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an array containing only seven bytes.
	*/
	@Test
	void testEncode_8() {
		byte[] in = new byte[] {97, 98, 99, 100, 101, 102, 103};
		char[] result = Base64Coder.encode(in);
		assertEquals(12, result.length);
		assertEquals('Y', result[0]);
		assertEquals('W', result[1]);
		assertEquals('J', result[2]);
		assertEquals('j', result[3]);
		assertEquals('Z', result[4]);
		assertEquals('G', result[5]);
		assertEquals('V', result[6]);
		assertEquals('m', result[7]);
		assertEquals('Z', result[8]);
		assertEquals('w', result[9]);
		assertEquals('=', result[10]);
		assertEquals('=', result[11]);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the method with an array containing only eight bytes.
	*/
	@Test
	void testEncode_9() {
		byte[] in = new byte[] {97, 98, 99, 100, 101, 102, 103, 104};
		char[] result = Base64Coder.encode(in);
		assertEquals(12, result.length);
		assertEquals('Y', result