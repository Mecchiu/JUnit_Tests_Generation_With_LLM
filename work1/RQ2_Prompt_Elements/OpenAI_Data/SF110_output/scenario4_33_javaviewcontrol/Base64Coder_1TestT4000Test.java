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
	void testEncode_4() {
		byte[] in = {(byte)0, (byte)0, (byte)0};
		int iLen = 3;
		char[] expected = {'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with length 4.
	*/
	@Test
	void testEncode_5() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0};
		int iLen = 4;
		char[] expected = {'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with length 5.
	*/
	@Test
	void testEncode_6() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		int iLen = 5;
		char[] expected = {'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with length 6.
	*/
	@Test
	void testEncode_7() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		int iLen = 6;
		char[] expected = {'A', 'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with length 7.
	*/
	@Test
	void testEncode_8() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		int iLen = 7;
		char[] expected = {'A', 'A', 'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with length 8.
	*/
	@Test
	void testEncode_9() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		int iLen = 8;
		char[] expected = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
		char[] actual = Base64Coder.encode(in, iLen);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#encode(byte[], int)}.
	* It tests the encoding of a byte array with length 9.
	*/
	@Test
	void testEncode_10() {
		byte[] in = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		int iLen = 9;
		char[] expected = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};
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
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_3Test {
		
	/**
	* Test case for {@link Base64Coder#decode(String)}.
	* It tests the decoding of a string with length 0.
	*/
	@Test
	void testDecode_1() {
		String s = "";
		byte[] expected = new byte[0];
		byte[] actual = Base64Coder.decode(s);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#decode(String)}.
	* It tests the decoding of a string with length 1.
	*/
	@Test
	void testDecode_2() {
		String s = "A";
		byte[] expected = {(byte)0};
		byte[] actual = Base64Coder.decode(s);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#decode(String)}.
	* It tests the decoding of a string with length 2.
	*/
	@Test
	void testDecode_3() {
		String s = "AA";
		byte[] expected = {(byte)0, (byte)0};
		byte[] actual = Base64Coder.decode(s);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#decode(String)}.
	* It tests the decoding of a string with length 3.
	*/
	@Test
	void testDecode_4() {
		String s = "AAA";
		byte[] expected = {(byte)0, (byte)0, (byte)0};
		byte[] actual = Base64Coder.decode(s);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#decode(String)}.
	* It tests the decoding of a string with length 4.
	*/
	@Test
	void testDecode_5() {
		String s = "AAAA";
		byte[] expected = {(byte)0, (byte)0, (byte)0, (byte)0};
		byte[] actual = Base64Coder.decode(s);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#decode(String)}.
	* It tests the decoding of a string with length 5.
	*/
	@Test
	void testDecode_6() {
		String s = "AAAAA";
		byte[] expected = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
		byte[] actual = Base64Coder.decode(s);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Base64Coder#decode(String)}.
	* It tests the decoding of a string with length 6.
	*/
	@Test
	