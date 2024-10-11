@Test
void testEncodeEmptyArray() {
    byte[] input = new byte[0];
    char[] expectedOutput = new char[0];
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeSingleByte() {
    byte[] input = new byte[]{(byte) 0x41};
    char[] expectedOutput = new char[]{'Q', '=', '=', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeTwoBytes() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42};
    char[] expectedOutput = new char[]{'Q', 'k', '=', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeThreeBytes() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43};
    char[] expectedOutput = new char[]{'Q', 'k', 'J', '='};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeFourBytes() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k'};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeFiveBytes() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'U'};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeSixBytes() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45, (byte) 0x46};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'U', 'g'};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeSevenBytes() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45, (byte) 0x46, (byte) 0x47};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'U', 'g', '3'};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeEightBytes() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45, (byte) 0x46, (byte) 0x47, (byte) 0x48};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'U', 'g', '3', 'I'};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeNineBytes() {
    byte[] input = new byte[]{(byte) 0x41, (byte) 0x42, (byte) 0x43, (byte) 0x44, (byte) 0x45, (byte) 0x46, (byte) 0x47, (byte) 0x48, (byte) 0x49};
    char[] expectedOutput = new char[]{'Q', 'k', 'N', 'k', 'U', 'g', '3', 'I', 'S'};
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}
}