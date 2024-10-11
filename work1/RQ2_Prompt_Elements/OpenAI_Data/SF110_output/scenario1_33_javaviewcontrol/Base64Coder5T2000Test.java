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
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("AB".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABC".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCD".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDE".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEF".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFG".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGH".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHI".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJ".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJK".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKL".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLM".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMN".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNO".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOP".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQ".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQR".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRS".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRST".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTU".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUV".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVW".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWX".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXY".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZa".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZab".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabc".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabcd".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabcde".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdef".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefg".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefgh".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghij".toCharArray()));
				assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("ABCDEFGHIJKLMNOPQRSTU