// Test case 1: Test decoding of empty array
@Test
void testDecodeEmptyArray() {
    byte[] expected = new byte[0];
    byte[] actual = Base64Coder.decode(new char[0]);
    assertArrayEquals(expected, actual);
}

// Test case 2: Test decoding of single character array
@Test
void testDecodeSingleChar() {
    byte[] expected = new byte[]{(byte) 0x6d};
    byte[] actual = Base64Coder.decode(new char[]{'b', 'W', '0', '=', '=', '='});
    assertArrayEquals(expected, actual);
}

// Test case 3: Test decoding of two character array
@Test
void testDecodeTwoChars() {
    byte[] expected = new byte[]{(byte) 0xd9, (byte) 0x2c};
    byte[] actual = Base64Coder.decode(new char[]{'2', 'S', 'w', '=', '=', '='});
    assertArrayEquals(expected, actual);
}

// Test case 4: Test decoding of three character array
@Test
void testDecodeThreeChars() {
    byte[] expected = new byte[]{(byte) 0x6d, (byte) 0x61, (byte) 0x6e};
    byte[] actual = Base64Coder.decode(new char[]{'b', 'W', '5', 'u', '=', '='});
    assertArrayEquals(expected, actual);
}

// Test case 5: Test decoding of four character array
@Test
void testDecodeFourChars() {
    byte[] expected = new byte[]{(byte) 0x6d, (byte) 0x61, (byte) 0x6e, (byte) 0x64};
    byte[] actual = Base64Coder.decode(new char[]{'b', 'W', '5', 'u', 'Z', 'A', '='});
    assertArrayEquals(expected, actual);
}

// Test case 6: Test decoding of five character array
@Test
void testDecodeFiveChars() {
    byte[] expected = new byte[]{(byte) 0xd9, (byte) 0x2c, (byte) 0x6d, (byte) 0x61, (byte) 0x6e};
    byte[] actual = Base64Coder.decode(new char[]{'2', 'S', 'w', 'b', 'm', '5', '='});
    assertArrayEquals(expected, actual);
}

// Test case 7: Test decoding of six character array
@Test
void testDecodeSixChars() {
    byte[] expected = new byte[]{(byte) 0xd9, (byte) 0x2c, (byte) 0x6d, (byte) 0x61, (byte) 0x6e, (byte) 0x64};
    byte[] actual = Base64Coder.decode(new char[]{'2', 'S', 'w', 'b', 'm', '5', 'k', '='});
    assertArrayEquals(expected, actual);
}

// Test case 8: Test decoding of seven character array
@Test
void testDecodeSevenChars() {
    byte[] expected = new byte[]{(byte) 0xd9, (byte) 0x2c, (byte) 0x6d, (byte) 0x61, (byte) 0x6e, (byte) 0x64, (byte) 0x65};
    byte[] actual = Base64Coder.decode(new char[]{'2', 'S', 'w', 'b', 'm', '5', 'k', 'Z', 'Q', '='});
    assertArrayEquals(expected, actual);
}

// Test case 9: Test decoding of eight character array
@Test
void testDecodeEightChars() {
    byte[] expected = new byte[]{(byte) 0xd9, (byte) 0x2c, (byte) 0x6d, (byte) 0x61, (byte) 0x6e, (byte) 0x64, (byte) 0x65, (byte) 0x6c};
    byte[] actual = Base64Coder.decode(new char[]{'2', 'S', 'w', 'b', 'm', '5', 'k', 'Z', 'W', 'w', '='});
    assertArrayEquals(expected, actual);
}

// Test case 10: Test decoding of nine character array
@Test
void testDecodeNineChars() {
    byte[] expected = new byte[]{(byte) 0xd9, (byte) 0x2c, (byte) 0x6d, (byte) 0x61, (byte) 0x6e, (byte) 0x64, (byte) 0x65, (byte) 0x6c, (byte) 0x69};
    byte[] actual = Base64Coder.decode(new char[]{'2', 'S', 'w', 'b', 'm', '5', 'k', 'Z', 'W', 'x', 'p', '='});
    assertArrayEquals(expected, actual);
}