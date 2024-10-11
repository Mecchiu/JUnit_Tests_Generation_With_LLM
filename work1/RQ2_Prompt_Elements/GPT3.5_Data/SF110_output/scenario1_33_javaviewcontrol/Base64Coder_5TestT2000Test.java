// Here's an example of a test case for the Base64Coder.decode() method:

@Test
void testDecode() {
    // Test case 1: empty input
    char[] input1 = {};
    byte[] expectedOutput1 = {};
    assertArrayEquals(expectedOutput1, Base64Coder.decode(input1));

    // Test case 2: input with padding
    char[] input2 = {'T', 'W', '9', 'u', 'Z', 'W', '0', '=', '='};
    byte[] expectedOutput2 = {0x4d, 0x6f, 0x6e, 0x65, 0x6e, 0x74};
    assertArrayEquals(expectedOutput2, Base64Coder.decode(input2));

    // Test case 3: input without padding
    char[] input3 = {'T', 'W', '9', 'u', 'Z', 'W', '0'};
    byte[] expectedOutput3 = {0x4d, 0x6f, 0x6e, 0x65, 0x6e, 0x74};
    assertArrayEquals(expectedOutput3, Base64Coder.decode(input3));

    // Test case 4: input with invalid character
    char[] input4 = {'T', 'W', '9', 'u', 'Z', 'W', '0', '!', '='};
    assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input4));

    // Test case 5: input with invalid padding
    char[] input5 = {'T', 'W', '9', 'u', 'Z', 'W', '0', '=', 'A'};
    assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input5));

    // Test case 6: input with all valid characters
    char[] input6 = {'T', 'W', '9', 'u', 'Z', 'W', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0', '=', '='};
    byte[] expectedOutput6 = {0x4d, 0x6f, 0x6e, 0x65, 0x6e, 0x74, 0x98, 0x76, 0x54, 0x32, 0x10};
    assertArrayEquals(expectedOutput6, Base64Coder.decode(input6));

    // Test case 7: input with all valid characters and no padding
    char[] input7 = {'T', 'W', '9', 'u', 'Z', 'W', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0'};
    byte[] expectedOutput7 = {0x4d, 0x6f, 0x6e, 0x65, 0x6e, 0x74, 0x98, 0x76, 0x54, 0x32, 0x10};
    assertArrayEquals(expectedOutput7, Base64Coder.decode(input7));

    // Test case 8: input with all valid characters and one padding
    char[] input8 = {'T', 'W', '9', 'u', 'Z', 'W', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '='};
    byte[] expectedOutput8 = {0x4d, 0x6f, 0x6e, 0x65, 0x6e, 0x74, 0x98, 0x76, 0x54, 0x32};
    assertArrayEquals(expectedOutput8, Base64Coder.decode(input8));

    // Test case 9: input with all valid characters and two padding
    char[] input9 = {'T', 'W', '9', 'u', 'Z', 'W', '0', '9', '8', '7', '6', '5', '4', '3', '2', '=', '='};
    byte[] expectedOutput9 = {0x4d, 0x6f, 0x6e, 0x65, 0x6e, 0x74, 0x98, 0x76};
    assertArrayEquals(expectedOutput9, Base64Coder.decode(input9));

    // Test case 10: input with all valid characters and three padding
    char[] input10 = {'T', 'W', '9', 'u', 'Z', 'W', '0', '9', '8', '7', '6', '5', '4', '=', '=', '='};
    byte[] expectedOutput10 = {0x4d, 0x6f, 0x6e, 0x65, 0x6e, 0x74};
    assertArrayEquals(expectedOutput10, Base64Coder.decode(input10));
}