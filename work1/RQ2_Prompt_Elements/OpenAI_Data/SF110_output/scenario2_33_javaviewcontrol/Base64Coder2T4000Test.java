// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64CoderTest {

	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 0.
	*/
	@Test
	void testEncode_EmptyByteArray() {
		byte[] in = new byte[0];
		char[] expected = new char[0];
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 1.
	*/
	@Test
	void testEncode_ByteArrayWithLength1() {
		byte[] in = {(byte) 0xFF};
		char[] expected = {'-'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 2.
	*/
	@Test
	void testEncode_ByteArrayWithLength2() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 3.
	*/
	@Test
	void testEncode_ByteArrayWithLength3() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 4.
	*/
	@Test
	void testEncode_ByteArrayWithLength4() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+', '+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 5.
	*/
	@Test
	void testEncode_ByteArrayWithLength5() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+', '+', '+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 6.
	*/
	@Test
	void testEncode_ByteArrayWithLength6() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+', '+', '+', '+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 7.
	*/
	@Test
	void testEncode_ByteArrayWithLength7() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+', '+', '+', '+', '+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 8.
	*/
	@Test
	void testEncode_ByteArrayWithLength8() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+', '+', '+', '+', '+', '+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 9.
	*/
	@Test
	void testEncode_ByteArrayWithLength9() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+', '+', '+', '+', '+', '+', '+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)} method.
	* It tests the encoding of a byte array with length 10.
	*/
	@Test
	void testEncode_ByteArrayWithLength10() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		char[] expected = {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'};
		char[] actual = Base64Coder.encode(in, in.length);
		assertArrayEquals(expected, actual);
	}
}