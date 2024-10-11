// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
		
// Static fields

    /**
     * Mapping table between six bit nibbles and characters (Base64 only).
     * This table is used when the encoding algorithm used is the default.
     */
    private final static char[] BASE64_CODES = new char[128];
// Methods

    static {
        int len = BASE64_CODES.length;
        int i = 0;
        for(byte c : BASE64_CODES) {
            BASE64_CODES[i++] = c;
        }
    }
// Constructors

    private Base64Coder_0Test() {
    }

// Instance methods

    @Test
    void encodeStringIntoArray() {
        final String s = "Test ";
        final char c1 ='';
        final char c2 = '!';
        final char[] chars = c1.toCharArray();

        byte[] data = encode(s, chars);
        assertArrayEquals(encode(s, chars), data);
        byte[] data_2 = encode(s, chars);
        assertArrayEquals(data, data_2);
        byte[] data_2_2 = encode(s, chars);
        assertArrayEquals(data, data_2_2);

        data = encode(s, chars, 1, 2, 3);
        assertArrayEquals(encode(s, chars, 1, 2, 3), data);
        data_2 = encode(s, chars, 1, 2, 3);
        assertArrayEquals(data, data_2);
        data = encode(s, chars, 1, 2, 3);
        assertArrayEquals(data, data_2);

        data = encode(s + c2);
        assertArrayEquals(encode(s + c2), data);
        data = encode(s + c2, 1, 0);
        assertArrayEquals(encode(s + c2), data);
        data = encode(s + c2, 1, 3);
        assertArrayEquals(encode(s + c2), data);
    }

// Tests

    @Test
    void decodeStringIntoArray() {
        final String s = "Test ";
        final char c1 ='';
        final char c2 = '!';
        final char[] chars = c1.toCharArray();

        byte[] data = decode(encode(s, chars), chars);
        assertArrayEquals(encode(s), data);
        byte[] data_2 = decode(encode(s, chars), chars);
        assertArrayEquals(data, data_2);
        byte[] data_2_2 = decode(encode(s, chars), chars);
        assertArrayEquals(data, data_2_2);

        data = decode(encode(s + c2), chars);
        assertArrayEquals(encode(s + c2), data);
        data = decode(encode(s + c2, 0), chars);
        assertArrayEquals(encode(s + c2), data);
        data = decode(encode(s + c2, 3), chars);
        assertArrayEquals(data, data_2);

        data = decode(encode(s + c2), chars, 1, 2, 3);
        assertArrayEquals(encode(s + c2), data);
        data = decode(encode(s + c2, 1, 0, 3), chars);
        assertArrayEquals(encode(s + c2));
        data = decode(encode(s + c2), chars, 1, 2, 3);
        assertArrayEquals(data, data_2, 1, 0, 3);

        data = decode(encode(s + c2), chars, 1, 3);
        assertArrayEquals(encode(s + c2), data);

        data = decode(encode(s + c2, 0), chars, 1, 0);
        assertArrayEquals(encode(s + c2), data);
        data = decode(encode(s + c2, 3), chars, 1, 3);
        assertArrayEquals(encode(s + c2), data);
    }

// Exported symbols

/*
 * End of File
 */

// Local Variables

    private final static char[] code1 = "\u2716";
    private final static char[] code2 = "\u00DF";

// Constructors

    private Base64Coder_0Test() {
    }

// Instance methods

    static String encodeString(String s) {
        final byte[] bytes = s.getBytes();
        final char[] chars = code1.toCharArray();
        final int len = chars.length;
        String ret = "";
        for(int i = 0; i < len; i++) {
            ret = "0x" + Integer.toHexString(((char) (byte) chars[i])) + ret;
        }
        return new String(ret);
    }

}