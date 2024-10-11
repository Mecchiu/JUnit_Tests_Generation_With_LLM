// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {
    
    @Test
    void testEncodeEmptyArray() {
        byte[] input = new byte[0];
        char[] expectedOutput = new char[0];
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeSingleByte() {
        byte[] input = new byte[] {0x41};
        char[] expectedOutput = new char[] {'Q', '=', '=', '='};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeTwoBytes() {
        byte[] input = new byte[] {0x41, 0x42};
        char[] expectedOutput = new char[] {'Q', 'U', '=', '='};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeThreeBytes() {
        byte[] input = new byte[] {0x41, 0x42, 0x43};
        char[] expectedOutput = new char[] {'Q', 'U', 'J', '='};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeFourBytes() {
        byte[] input = new byte[] {0x41, 0x42, 0x43, 0x44};
        char[] expectedOutput = new char[] {'Q', 'U', 'J', 'D'};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeFiveBytes() {
        byte[] input = new byte[] {0x41, 0x42, 0x43, 0x44, 0x45};
        char[] expectedOutput = new char[] {'Q', 'U', 'J', 'D', 'R', '='};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeSixBytes() {
        byte[] input = new byte[] {0x41, 0x42, 0x43, 0x44, 0x45, 0x46};
        char[] expectedOutput = new char[] {'Q', 'U', 'J', 'D', 'R', 'E'};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeSevenBytes() {
        byte[] input = new byte[] {0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47};
        char[] expectedOutput = new char[] {'Q', 'U', 'J', 'D', 'R', 'E', 'w', '='};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeEightBytes() {
        byte[] input = new byte[] {0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48};
        char[] expectedOutput = new char[] {'Q', 'U', 'J', 'D', 'R', 'E', 'E', 'A'};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
    
    @Test
    void testEncodeNineBytes() {
        byte[] input = new byte[] {0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49};
        char[] expectedOutput = new char[] {'Q', 'U', 'J', 'D', 'R', 'E', 'E', 'S', 'Q', '='};
        assertArrayEquals(expectedOutput, Base64Coder.encode(input));
    }
}