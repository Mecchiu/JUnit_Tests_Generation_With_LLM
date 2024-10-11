// Here's an example implementation of the Base64Coder class and its test class:

// Base64Coder.java
package com.pmdesigns.jvc.tools;

import java.util.Base64;

public class Base64Coder {

    /**
     * Decodes a byte array from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return An array containing the decoded data bytes.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static byte[] decode(String s) {
        return Base64.getDecoder().decode(s);
    }
}

// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {

    @Test
    void testDecodeEmptyString() {
        byte[] expected = new byte[0];
        byte[] actual = Base64Coder.decode("");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDecodeSingleChar() {
        byte[] expected = new byte[]{0x66};
        byte[] actual = Base64Coder.decode("Zg==");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDecodeTwoChars() {
        byte[] expected = new byte[]{0x66, 0x6f};
        byte[] actual = Base64Coder.decode("Zm8=");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDecodeThreeChars() {
        byte[] expected = new byte[]{0x66, 0x6f, 0x6f};
        byte[] actual = Base64Coder.decode("Zm9v");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDecodeFourChars() {
        byte[] expected = new byte[]{0x66, 0x6f, 0x6f, 0x62};
        byte[] actual = Base64Coder.decode("Zm9vYg==");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDecodeFiveChars() {
        byte[] expected = new byte[]{0x66, 0x6f, 0x6f, 0x62, 0x61};
        byte[] actual = Base64Coder.decode("Zm9vYmE=");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDecodeSixChars() {
        byte[] expected = new byte[]{0x66, 0x6f, 0x6f, 0x62, 0x61, 0x72};
        byte[] actual = Base64Coder.decode("Zm9vYmFy");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDecodeInvalidChar() {
        assertThrows(IllegalArgumentException.class, () -> {
            Base64Coder.decode("Zm9vYmFy!");
        });
    }

    @Test
    void testDecodeInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            Base64Coder.decode("Zm9vYmF");
        });
    }

    @Test
    void testDecodeInvalidPadding() {
        assertThrows(IllegalArgumentException.class, () -> {
            Base64Coder.decode("Zm9vYmF=");
        });
    }
}