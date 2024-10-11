// Here's an example implementation of the Base64Coder class and its test class:

// Base64Coder.java
package com.pmdesigns.jvc.tools;

import java.util.Base64;

public class Base64Coder {

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param s a String to be encoded.
     * @return A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        byte[] bytes = s.getBytes();
        byte[] encodedBytes = Base64.getEncoder().encode(bytes);
        return new String(encodedBytes);
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {

    @Test
    void testEncodeStringWithEmptyString() {
        String encoded = Base64Coder.encodeString("");
        assertEquals("", encoded);
    }

    @Test
    void testEncodeStringWithSingleCharacter() {
        String encoded = Base64Coder.encodeString("a");
        assertEquals("YQ==", encoded);
    }

    @Test
    void testEncodeStringWithMultipleCharacters() {
        String encoded = Base64Coder.encodeString("hello world");
        assertEquals("aGVsbG8gd29ybGQ=", encoded);
    }

    @Test
    void testEncodeStringWithSpecialCharacters() {
        String encoded = Base64Coder.encodeString("!@#$%^&*()");
        assertEquals("IUAjJCVeJiooKQ==", encoded);
    }

    @Test
    void testEncodeStringWithUnicodeCharacters() {
        String encoded = Base64Coder.encodeString("こんにちは");
        assertEquals("44GC44GE44GG44GI", encoded);
    }

    @Test
    void testEncodeStringWithNull() {
        assertThrows(NullPointerException.class, () -> {
            Base64Coder.encodeString(null);
        });
    }

    @Test
    void testEncodeStringWithLongString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        String encoded = Base64Coder.encodeString(sb.toString());
        assertNotNull(encoded);
    }

    @Test
    void testEncodeStringWithWhitespace() {
        String encoded = Base64Coder.encodeString("   ");
        assertEquals("ICA=", encoded);
    }

    @Test
    void testEncodeStringWithNewline() {
        String encoded = Base64Coder.encodeString("\n");
        assertEquals("Cg==", encoded);
    }

    @Test
    void testEncodeStringWithCarriageReturn() {
        String encoded = Base64Coder.encodeString("\r");
        assertEquals("DQ==", encoded);
    }
}