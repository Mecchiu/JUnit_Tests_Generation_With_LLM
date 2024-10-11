// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
    
    @Test
    void testDecodeValidInput() {
        char[] input = "SGVsbG8gV29ybGQh".toCharArray();
        byte[] expectedOutput = "Hello World!".getBytes();
        assertArrayEquals(expectedOutput, Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeInvalidInput() {
        char[] input = "SGVsbG8gV29ybGQh!".toCharArray();
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeInputWithPadding() {
        char[] input = "SGVsbG8gV29ybGQ=".toCharArray();
        byte[] expectedOutput = "Hello World".getBytes();
        assertArrayEquals(expectedOutput, Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeInputWithDoublePadding() {
        char[] input = "SGVsbG8gV29ybGQ==".toCharArray();
        byte[] expectedOutput = "Hello World".getBytes();
        assertArrayEquals(expectedOutput, Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeInputWithTriplePadding() {
        char[] input = "SGVsbG8gV29ybGQ===".toCharArray();
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeInputWithLineBreaks() {
        char[] input = "SGVsbG8g\nV29ybGQh".toCharArray();
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeInputWithBlanks() {
        char[] input = "SGVsbG8g V29ybGQh".toCharArray();
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeInputWithNonAsciiCharacters() {
        char[] input = "SGVsbG8gV29ybGQh你好".toCharArray();
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeInputWithInvalidCharacters() {
        char[] input = "SGVsbG8gV29ybGQh~".toCharArray();
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decode(input));
    }
    
    @Test
    void testDecodeEmptyInput() {
        char[] input = "".toCharArray();
        byte[] expectedOutput = new byte[0];
        assertArrayEquals(expectedOutput, Base64Coder.decode(input));
    }
}