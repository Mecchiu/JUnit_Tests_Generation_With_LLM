// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {

	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of zero.
	*/
	@Test
	void testEncode_1() {
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
	void testEncode_2() {
		byte[] in = {(byte) 0xFF};
		int iLen = 1;
		char[] expected = {'_'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of two.
	*/
	@Test
	void testEncode_3() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF};
		int iLen = 2;
		char[] expected = {'_', '8'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of three.
	*/
	@Test
	void testEncode_4() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 3;
		char[] expected = {'_', '8', '_'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of four.
	*/
	@Test
	void testEncode_5() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 4;
		char[] expected = {'_', '8', '_', '8'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of five.
	*/
	@Test
	void testEncode_6() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 5;
		char[] expected = {'_', '8', '_', '8', '_'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of six.
	*/
	@Test
	void testEncode_7() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 6;
		char[] expected = {'_', '8', '_', '8', '_', '8'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of seven.
	*/
	@Test
	void testEncode_8() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 7;
		char[] expected = {'_', '8', '_', '8', '_', '8', '_'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of eight.
	*/
	@Test
	void testEncode_9() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 8;
		char[] expected = {'_', '8', '_', '8', '_', '8', '_', '8'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with a length of nine.
	*/
	@Test
	void testEncode_10() {
		byte[] in = {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
		int iLen = 9;
		char[] expected = {'_', '8', '_', '8', '_', '8', '_', '8', '_'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
}

// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_3Test {
		
	/**
	* Test case for {@link Base64Coder#decode(char[])}.
	* It tests the decoding of a character array with a length of zero.
	*/
	@Test
	void testDecode_1() {
		char[] in = new char[0];
		byte[] expected = new byte[0];
		byte[] actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#decode(char[])}.
	* It tests the decoding of a character array with a length of one.
	*/
	@Test
	void testDecode_2() {
		char[] in = {'_'};
		byte[] expected = {(byte)