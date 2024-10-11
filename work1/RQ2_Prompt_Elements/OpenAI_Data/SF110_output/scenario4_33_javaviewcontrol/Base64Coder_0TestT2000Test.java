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
	