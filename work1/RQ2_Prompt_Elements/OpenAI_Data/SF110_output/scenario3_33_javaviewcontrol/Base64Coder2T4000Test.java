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
     * Encodes a byte array into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param in an array containing the data bytes to be encoded.
     * @param iLen number of bytes to process in <code>in</code>.
     * @return A character array with the Base64 encoded data.
     */
    public static char[] encode(byte[] in, int iLen) {
        int oDataLen = (iLen * 4 + 2) / 3;       // output length without padding
        int oLen = ((iLen + 2) / 3) * 4;         // output length including padding
        char[] out = new char[oLen];
        int ip = 0;
        int op = 0;
        while (ip < iLen) {
            int i0 = in[ip++] & 0xff;
            int i1 = ip < iLen ? in[ip++] & 0xff : 0;
            int i2 = ip < iLen ? in[ip++] & 0xff : 0;
            int o0 = i0 >>> 2;
            int o1 = ((i0 & 3) << 4) | (i1 >>> 4);
            int o2 = ((i1 & 0xf) << 2) | (i2 >>> 6);
            int o3 = i2 & 0x3F;
            out[op++] = map1[o0];
            out[op++] = map1[o1];
            out[op] = op < oDataLen ? map1[o2] : '-';
            op++;
            out[op] = op < oDataLen ? map1[o3] : '-';
            op++;
        }
        return out;
    }
}

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
		char[]