package com.pmdesigns.jvc.tools;
java
class Base64Coder_1Test {

    @Test
    void testEncodeEmptyArray() {
        byte[] input = new byte[0];
        char[] expected = new char[0];
        assertArrayEquals(expected, Base64Coder.encode(input));
    }

    @Test
    void testEncodeSingleByte() {
        byte[] input = {65}; // 'A'
        char[] expected = {'Q', 'Q', '='};
        assertArrayEquals(expected, Base64Coder.encode(input));
    }

    @Test
    void testEncodeTwoBytes() {
        byte[] input = {65, 66}; // 'AB'
        char[] expected = {'Q', 'U', 'I', '='};
        assertArrayEquals(expected, Base64Coder.encode(input));
    }

    @Test
    void testEncodeThreeBytes() {
        byte[] input = {65, 66, 67}; // 'ABC'
        char[] expected = {'Q', 'U', 'J', 'D'};
        assertArrayEquals(expected, Base64Coder.encode(input));
    }

    @Test
    void testEncodeFourBytes() {
        byte[] input = {65, 66, 67, 68}; // 'ABCD'
        char[] expected = {'Q', 'U', 'J', 'E'};
        assertArrayEquals(expected, Base64Coder.encode(input));
    }

    @Test
    void testEncodeLongArray() {
        byte[] input = "Hello, World!".getBytes();
        char[] expected = {'S', 'G', 'V', 's', 'b', 'G', '8', 's', 'L', 'C', 'w', 'b', '3', 'I', 'g', '='};
        assertArrayEquals(expected, Base64Coder.encode(input));
    }

    @Test
    void testEncodePadding() {
        byte[] input = {65, 66, 67}; // 'ABC'
        char[] expected = {'Q', 'U', 'J', '='};
        assertArrayEquals(expected, Base64Coder.encode(input, 3));
    }

    @Test
    void testEncodePartialArray() {
        byte[] input = {65, 66, 67, 68}; // 'ABCD'
        char[] expected = {'Q', 'U', 'J', 'E'};
        assertArrayEquals(expected, Base64Coder.encode(input, 3));
    }

    @Test
    void testEncodeFullArray() {
        byte[] input = {65, 66, 67, 68}; // 'ABCD'
        char[] expected = {'Q', 'U', 'J', 'E'};
        assertArrayEquals(expected, Base64Coder.encode(input, 4));
    }

    @Test
    void testEncodeInvalidInput() {
        byte[] input = {65, 66, 67, 128}; // 'ABC' + invalid byte
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.encode(input));
    }
}
