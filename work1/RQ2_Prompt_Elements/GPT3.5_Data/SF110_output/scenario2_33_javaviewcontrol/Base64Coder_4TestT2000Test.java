// Here's an example of how you can write unit tests for the Base64Coder class using JUnit 5:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("Zm9vYmF~"));
    }

    @Test
    void testDecodeInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("Zm9vYmF"));
    }

    @Test
    void testDecodeInvalidPadding() {
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode("Zm9vYmF="));
    }
}