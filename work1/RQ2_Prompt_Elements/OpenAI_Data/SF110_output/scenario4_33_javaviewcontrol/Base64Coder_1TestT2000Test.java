// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {

	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 0.
	*/
	@Test
	void testEncode_1() {
		byte[] in = new byte[0];
		char[] expected = new char[0];
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 1.
	*/
	@Test
	void testEncode_2() {
		byte[] in = {(byte)0};
		char[] expected = {'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 2.
	*/
	@Test
	void testEncode_3() {
		byte[] in = {(byte)0, (byte)0};
		char[] expected = {'A', 'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 3.
	*/
	@Test
	void testEncode_4() {
		byte[] in = {(byte)0, (byte)0, (byte)0};
		char[] expected = {'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 4.
	*/
	@Test
	void testEncode_5() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0};
		char[] expected = {'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 5.
	*/
	@Test
	void testEncode_6() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		char[] expected = {'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 6.
	*/
	@Test
	void testEncode_7() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		char[] expected = {'A', 'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 7.
	*/
	@Test
	void testEncode_8() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		char[] expected = {'A', 'A', 'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 8.
	*/
	@Test
	void testEncode_9() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		char[] expected = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[])}.
	* It tests the encoding of a byte array with length 9.
	*/
	@Test
	void testEncode_10() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		char[] expected = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in);
		assertArrayEquals(expected, actual);
	}
}

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
	* It tests the encoding of a byte array with length 0.
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
	* It tests the encoding of a byte array with length 1.
	*/
	@Test
	void testEncode_2() {
		byte[] in = {(byte)0};
		int iLen = 1;
		char[] expected = {'A'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with length 2.
	*/
	@Test
	void testEncode_3() {
		byte[] in = {(byte)0, (byte)0};
		int iLen = 2;
		char[] expected = {'A', 'A'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with length 3.
	*/
	@Test
	void test