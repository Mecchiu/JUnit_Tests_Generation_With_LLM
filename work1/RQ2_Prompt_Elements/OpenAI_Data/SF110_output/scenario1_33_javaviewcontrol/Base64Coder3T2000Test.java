// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64CoderTest {

	@Test
	void testDecodeString() {
		assertEquals("", Base64Coder.decodeString(""));
		assertEquals("f", Base64Coder.decodeString("Zg=="));
		assertEquals("fo", Base64Coder.decodeString("Zm8="));
		assertEquals("foo", Base64Coder.decodeString("Zm9v"));
		assertEquals("foob", Base64Coder.decodeString("Zm9vYg=="));
		assertEquals("fooba", Base64Coder.decodeString("Zm9vYmE="));
		assertEquals("foobar", Base64Coder.decodeString("Zm9vYmFy"));
		assertEquals("foobarb", Base64Coder.decodeString("Zm9vYmFyYg=="));
		assertEquals("foobarba", Base64Coder.decodeString("Zm9vYmFyYmE="));
		assertEquals("foobarbaz", Base64Coder.decodeString("Zm9vYmFyYmF6"));
	}
}