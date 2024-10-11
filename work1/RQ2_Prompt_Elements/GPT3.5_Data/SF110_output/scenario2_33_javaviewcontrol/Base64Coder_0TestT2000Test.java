// Here's an example of how you can write unit tests for the Base64Coder class:

@Test
void testEncodeString() {
    // Test case 1: empty string
    assertEquals("", Base64Coder.encodeString(""));

    // Test case 2: string with one character
    assertEquals("MQ==", Base64Coder.encodeString("1"));

    // Test case 3: string with two characters
    assertEquals("MTI=", Base64Coder.encodeString("12"));

    // Test case 4: string with three characters
    assertEquals("MTIz", Base64Coder.encodeString("123"));

    // Test case 5: string with four characters
    assertEquals("YWJj", Base64Coder.encodeString("abc"));

    // Test case 6: string with five characters
    assertEquals("YWJjZA==", Base64Coder.encodeString("abcd"));

    // Test case 7: string with six characters
    assertEquals("YWJjZGU=", Base64Coder.encodeString("abcde"));

    // Test case 8: string with seven characters
    assertEquals("YWJjZGVm", Base64Coder.encodeString("abcdef"));

    // Test case 9: string with eight characters
    assertEquals("YWJjZGVmZw==", Base64Coder.encodeString("abcdefg"));

    // Test case 10: string with nine characters
    assertEquals("YWJjZGVmZ2g=", Base64Coder.encodeString("abcdefghi"));
}