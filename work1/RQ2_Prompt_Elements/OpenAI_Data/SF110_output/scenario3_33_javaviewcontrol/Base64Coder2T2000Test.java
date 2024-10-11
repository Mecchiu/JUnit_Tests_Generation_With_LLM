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
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of zero.
	*/
	@Test
	public void testEncode_EmptyByteArray() {
		byte[] in = new byte[0];
		int iLen = 0;
		char[] expected = new char[0];
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of one.
	*/
	@Test
	public void testEncode_ByteArrayWithOneElement() {
		byte[] in = {(byte) 0xFF};
		int iLen = 1;
		char[] expected = {'-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of two.
	*/
	@Test
	public void testEncode_ByteArrayWithTwoElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF};
		int iLen = 2;
		char[] expected = {'+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of three.
	*/
	@Test
	public void testEncode_ByteArrayWithThreeElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 3;
		char[] expected = {'+', '+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of four.
	*/
	@Test
	public void testEncode_ByteArrayWithFourElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 4;
		char[] expected = {'+', '+', '+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of five.
	*/
	@Test
	public void testEncode_ByteArrayWithFiveElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 5;
		char[] expected = {'+', '+', '+', '+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of six.
	*/
	@Test
	public void testEncode_ByteArrayWithSixElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 6;
		char[] expected = {'+', '+', '+', '+', '+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of seven.
	*/
	@Test
	public void testEncode_ByteArrayWithSevenElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 7;
		char[] expected = {'+', '+', '+', '+', '+', '+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of eight.
	*/
	@Test
	public void testEncode_ByteArrayWithEightElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 8;
		char[] expected = {'+', '+', '+', '+', '+', '+', '+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of nine.
	*/
	@Test
	public void testEncode_ByteArrayWithNineElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 9;
		char[] expected = {'+', '+', '+', '+', '+', '+', '+', '+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of ten.
	*/
	@Test
	public void testEncode_ByteArrayWithTenElements() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 10;
		char[] expected = {'+', '+', '+', '+', '+', '+', '+', '+', '+', '-'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Enc