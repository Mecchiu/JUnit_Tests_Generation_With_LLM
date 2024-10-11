// Here's an example of how you can test the Base64Coder class using JUnit 5:

@Test
void testEncode() {
    // Test case 1: empty input
    byte[] input1 = new byte[0];
    char[] expectedOutput1 = new char[0];
    assertArrayEquals(expectedOutput1, Base64Coder.encode(input1, input1.length));

    // Test case 2: input with one byte
    byte[] input2 = new byte[] { 0x41 };
    char[] expectedOutput2 = new char[] { 'Q', 'Q', '=', '=' };
    assertArrayEquals(expectedOutput2, Base64Coder.encode(input2, input2.length));

    // Test case 3: input with two bytes
    byte[] input3 = new byte[] { 0x41, 0x42 };
    char[] expectedOutput3 = new char[] { 'Q', 'U', 'I', '=' };
    assertArrayEquals(expectedOutput3, Base64Coder.encode(input3, input3.length));

    // Test case 4: input with three bytes
    byte[] input4 = new byte[] { 0x41, 0x42, 0x43 };
    char[] expectedOutput4 = new char[] { 'Q', 'U', 'J', 'D' };
    assertArrayEquals(expectedOutput4, Base64Coder.encode(input4, input4.length));

    // Test case 5: input with four bytes
    byte[] input5 = new byte[] { 0x41, 0x42, 0x43, 0x44 };
    char[] expectedOutput5 = new char[] { 'Q', 'U', 'J', 'D', 'R', 'A', '=', '=' };
    assertArrayEquals(expectedOutput5, Base64Coder.encode(input5, input5.length));

    // Test case 6: input with five bytes
    byte[] input6 = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45 };
    char[] expectedOutput6 = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', '=', '=' };
    assertArrayEquals(expectedOutput6, Base64Coder.encode(input6, input6.length));

    // Test case 7: input with six bytes
    byte[] input7 = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46 };
    char[] expectedOutput7 = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', '=' };
    assertArrayEquals(expectedOutput7, Base64Coder.encode(input7, input7.length));

    // Test case 8: input with seven bytes
    byte[] input8 = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47 };
    char[] expectedOutput8 = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'R' };
    assertArrayEquals(expectedOutput8, Base64Coder.encode(input8, input8.length));

    // Test case 9: input with eight bytes
    byte[] input9 = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48 };
    char[] expectedOutput9 = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'S', 'A', '=' };
    assertArrayEquals(expectedOutput9, Base64Coder.encode(input9, input9.length));

    // Test case 10: input with nine bytes
    byte[] input10 = new byte[] { 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49 };
    char[] expectedOutput10 = new char[] { 'Q', 'U', 'J', 'D', 'R', 'E', 'U', 'S', 'B', 'J' };
    assertArrayEquals(expectedOutput10, Base64Coder.encode(input10, input10.length));
}