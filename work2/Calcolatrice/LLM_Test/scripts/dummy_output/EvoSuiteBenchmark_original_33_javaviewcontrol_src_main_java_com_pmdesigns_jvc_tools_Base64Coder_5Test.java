package com.pmdesigns.jvc.tools;
java
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Base64Coder_5Test {

    @Test
    void testDecodeWithValidInput() {
        char[] input = "SGVsbG8gV29ybGQh".toCharArray();
        byte[] expected = "Hello World!".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithPadding() {
        char[] input = "SGVsbG8gV29ybGQh=".toCharArray();
        byte[] expected = "Hello World!".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithMultipleOfFour() {
        char[] input = "SGVsbG8gV29ybGQ=".toCharArray();
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithInvalidCharacter() {
        char[] input = "SGVsbG8gV29ybGQh$".toCharArray();
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithInvalidPadding() {
        char[] input = "SGVsbG8gV29ybGQ==".toCharArray();
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithEmptyInput() {
        char[] input = "".toCharArray();
        byte[] expected = new byte[0];
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithSingleCharacter() {
        char[] input = "S".toCharArray();
        byte[] expected = "H".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithDoubleCharacter() {
        char[] input = "SG".toCharArray();
        byte[] expected = "He".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }

    @Test
    void testDecodeWithTripleCharacter() {
        char[] input = "SGV".toCharArray();
        byte[] expected = "Hel".getBytes();
        assertArrayEquals(expected, Base64Coder.decode(input));
    }
}
