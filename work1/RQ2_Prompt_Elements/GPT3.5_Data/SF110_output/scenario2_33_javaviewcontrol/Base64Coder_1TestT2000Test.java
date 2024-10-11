// Here's an example of how you can write unit tests for the Base64Coder class using JUnit 5:

@Test
void testEncodeEmptyArray() {
    byte[] input = new byte[0];
    char[] expectedOutput = new char[0];
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeSingleByte() {
    byte[] input = new byte[] { 0x41 }; // 'A'
    char[] expectedOutput = new char[] { 'Q', 'Q', '=', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeTwoBytes() {
    byte[] input = new byte[] { 0x41, 0x42 }; // 'AB'
    char[] expectedOutput = new char[] { 'Q', 'U', 'I', '=', };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeThreeBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43 }; // 'ABC'
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'B' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeFourBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44 }; // 'ABCD'
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeFiveBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45 }; // 'ABCDE'
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D', 'R', '=' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeSixBytes() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46 }; // 'ABCDEF'
    char[] expectedOutput = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E' };
    assertArrayEquals(expectedOutput, Base64Coder.encode(input));
}

@Test
void testEncodeMaxBytes() {
    byte[] input = new byte[32767]; // maximum input size
    char[] expectedOutput = new char[43690]; // expected output size
    // fill input with random data
    new Random().nextBytes(input);
    // encode input and measure time
    long startTime = System.currentTimeMillis();
    char[] output = Base64Coder.encode(input);
    long endTime = System.currentTimeMillis();
    // check output size and content
    assertEquals(expectedOutput.length, output.length);
    assertArrayEquals(expectedOutput, output);
    // check encoding time (should be less than 1 second)
    assertTrue(endTime - startTime < 1000);
}

@Test
void testEncodeNull() {
    assertThrows(NullPointerException.class, () -> {
        Base64Coder.encode(null);
    });
}

@Test
void testEncodeNegativeLength() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43 }; // 'ABC'
    assertThrows(IllegalArgumentException.class, () -> {
        Base64Coder.encode(input, -1);
    });
}

@Test
void testEncodeExcessiveLength() {
    byte[] input = new byte[] { 0x41, 0x42, 0x43 }; // 'ABC'
    assertThrows(IllegalArgumentException.class, () -> {
        Base64Coder.encode(input, 4);
    });
}