// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
    
    @Test
    void testDecodeEmptyString() {
        String input = "";
        byte[] expectedOutput = new byte[0];
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeSingleChar() {
        String input = "AQ==";
        byte[] expectedOutput = new byte[] {1};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeTwoChars() {
        String input = "AQI=";
        byte[] expectedOutput = new byte[] {1, 2};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeThreeChars() {
        String input = "AQID";
        byte[] expectedOutput = new byte[] {1, 2, 3};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeFourChars() {
        String input = "AQIDBA==";
        byte[] expectedOutput = new byte[] {1, 2, 3, 4};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeFiveChars() {
        String input = "AQIDBAU=";
        byte[] expectedOutput = new byte[] {1, 2, 3, 4, 5};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeSixChars() {
        String input = "AQIDBAUG";
        byte[] expectedOutput = new byte[] {1, 2, 3, 4, 5, 6};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeSevenChars() {
        String input = "AQIDBAUGBw==";
        byte[] expectedOutput = new byte[] {1, 2, 3, 4, 5, 6, 7};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeEightChars() {
        String input = "AQIDBAUGBwg=";
        byte[] expectedOutput = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testDecodeNineChars() {
        String input = "AQIDBAUGBwgJCQ==";
        byte[] expectedOutput = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] actualOutput = Base64Coder.decode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}