// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64CoderTest {

		@Test
		void testDecode() {
				assertArrayEquals(new byte[] {}, Base64Coder.decode("".toCharArray()));
				assertArrayEquals(new byte[] {0}, Base64Coder.decode("AA==".toCharArray()));
				assertArrayEquals(new byte[] {0, 0}, Base64Coder.decode("AAA=".toCharArray()));
				assertArrayEquals(new byte[] {0, 0, 0}, Base64Coder.decode("AAAA".toCharArray()));
				assertArrayEquals(new byte[] {-1}, Base64Coder.decode("/w==".toCharArray()));
				assertArrayEquals(new byte[] {-1, -1}, Base64Coder.decode("//8=".toCharArray()));
				assertArrayEquals(new byte[] {-1, -1, -1}, Base64Coder.decode("///w".toCharArray()));
				assertArrayEquals(new byte[] {-1, -1, -1, -1}, Base64Coder.decode("////".toCharArray()));
				assertArrayEquals(new byte[] {-1, -1, -1, -1, -1}, Base64Coder.decode("/////w==".toCharArray()));
				assertArrayEquals(new byte[] {-1, -1, -1, -1, -1, -1}, Base64Coder.decode("//////8=".toCharArray()));
		}
		
		@Test
		void testDecodeIllegalArgumentException() {
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAA==".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=A".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AA".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAAAAAA=AAA".toCharArray()));
				