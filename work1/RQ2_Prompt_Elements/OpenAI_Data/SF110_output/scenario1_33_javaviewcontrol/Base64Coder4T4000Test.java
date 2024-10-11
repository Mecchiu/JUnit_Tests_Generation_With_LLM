// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64CoderTest {

		@Test
		void testDecode() {
				assertArrayEquals(new byte[] {}, Base64Coder.decode(""));
				assertArrayEquals(new byte[] {0}, Base64Coder.decode("AA=="));
				assertArrayEquals(new byte[] {0, 0}, Base64Coder.decode("AAA="));
				assertArrayEquals(new byte[] {0, 0, 0}, Base64Coder.decode("AAAA"));
				assertArrayEquals(new byte[] {-1}, Base64Coder.decode("/w=="));
				assertArrayEquals(new byte[] {-1, -1}, Base64Coder.decode("//8="));
				assertArrayEquals(new byte[] {-1, -1, -1}, Base64Coder.decode("///"));
				assertArrayEquals(new byte[] {-1, -1, -1, -1}, Base64Coder.decode("////"));
				assertArrayEquals(new byte[] {-1, -1, -1, -1, -1}, Base64Coder.decode("/////w=="));
				assertArrayEquals(new byte[] {-1, -1, -1, -1, -1, -1}, Base64Coder.decode("//////8="));
		}
}