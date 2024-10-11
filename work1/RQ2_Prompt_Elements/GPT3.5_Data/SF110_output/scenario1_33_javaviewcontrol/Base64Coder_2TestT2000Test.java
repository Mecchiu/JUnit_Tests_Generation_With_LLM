// Here's an example of how you can write unit tests for the Base64Coder class using JUnit 5:

@Test
void testEncodeEmptyArray() {
    byte[] input = new byte[0];
    char[] expectedOutput = new char[0];
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeSingleByte() {
    byte[] input = new byte[] { 0x41 };
    char[] expectedOutput = new char[] { 'Q', 'Q', '=', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeTwoBytes() {
    byte[] input = new byte[] { 0x41, 0x42 };
    char[] expectedOutput = new char[] { 'Q', 'U', 'I', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeThreeBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43 };
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeFourBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44 };
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D', 'R', 'A', '=', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeFiveBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45 };
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', '=', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeSixBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46 };
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'g', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeSevenBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47 };
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'x', 'w', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeEightBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48 };
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'x', '4', 'A', 'A', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}

@Test
void testEncodeNineBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49 };
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'x', '4', 'S', 'S', 'A', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input, input.length));
}