// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
    
    @Test
    void testEncodeStringEmpty() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testEncodeStringSingleChar() {
        String input = "A";
        String expectedOutput = "QQ==";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testEncodeStringTwoChars() {
        String input = "AB";
        String expectedOutput = "QUI=";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testEncodeStringThreeChars() {
        String input = "ABC";
        String expectedOutput = "QUJD";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testEncodeStringFourChars() {
        String input = "ABCD";
        String expectedOutput = "QUJDRA==";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testEncodeStringFiveChars() {
        String input = "ABCDE";
        String expectedOutput = "QUJDREU=";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testEncodeStringSixChars() {
        String input = "ABCDEF";
        String expectedOutput = "QUJDREVGA==";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testEncodeStringLong() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.";
        String expectedOutput = "TG9yZW0gaXBzdW0gZG9sb3Igc2l0IGFtZXQsIGNvbnNlY3RldHVyIGFkaXBpc2NpbmcgZWxpdC4gU2VkIG5vbiByaXN1cy4gU3VwcG9ydGVk" +
                                "IHNlZCB0b3J0b3IsIGRpZ25pc3NzaW0gc2l0IGFtZXQsIGFjZGlzcGF0aW5nIG5lYywgdWx0cmljaWVzIHNlZCwgZG9sb3Iu";
        String actualOutput = Base64Coder.encodeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    void testEncodeStringNull() {
        String input = null;
        assertThrows(NullPointerException.class, () -> {
            Base64Coder.encodeString(input);
        });
    }
    
    @Test
    void testEncodeStringInvalidChar() {
        String input = "A\u00FFB";
        assertThrows(IllegalArgumentException.class, () -> {
            Base64Coder.encodeString(input);
        });
    }
}