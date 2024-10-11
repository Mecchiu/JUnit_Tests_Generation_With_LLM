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
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
}