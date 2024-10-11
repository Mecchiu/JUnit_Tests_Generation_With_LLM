// Here's an example implementation of the Base64Coder class and its test class:

// Base64Coder.java
package com.pmdesigns.jvc.tools;

import java.util.Base64;

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
        byte[] encodedBytes = Base64.getEncoder().encode(in);
        char[] encodedChars = new char[encodedBytes.length];
        for (int i = 0; i < encodedBytes.length; i++) {
            encodedChars[i] = (char) encodedBytes[i];
        }
        return encodedChars;
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

    @Test
    void testEncodeEmptyArray() {
        byte[] in = new byte[0];
        char[] expected = new char[0];
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeSingleByte() {
        byte[] in = new byte[] { 0x41 };
        char[] expected = new char[] { 'Q', 'Q', '=', '=' };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeTwoBytes() {
        byte[] in = new byte[] { 0x41, 0x42 };
        char[] expected = new char[] { 'Q', 'U', 'I', '=', };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeThreeBytes() {
        byte[] in = new byte[] { 0x41, 0x42, 0x43 };
        char[] expected = new char[] { 'Q', 'U', 'J', 'B' };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeFourBytes() {
        byte[] in = new byte[] { 0x41, 0x42, 0x43, 0x44 };
        char[] expected = new char[] { 'Q', 'U', 'J', 'D' };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeFiveBytes() {
        byte[] in = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45 };
        char[] expected = new char[] { 'Q', 'U', 'J', 'D', 'R', 'A', '=' };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeSixBytes() {
        byte[] in = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46 };
        char[] expected = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', '=' };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeSevenBytes() {
        byte[] in = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47 };
        char[] expected = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'w', '=' };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeEightBytes() {
        byte[] in = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48 };
        char[] expected = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'h' };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

    @Test
    void testEncodeNineBytes() {
        byte[] in = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49 };
        char[] expected = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'h', 'J', 'A', '=' };
        assertArrayEquals(expected, Base64Coder.encode(in, in.length));
    }

}