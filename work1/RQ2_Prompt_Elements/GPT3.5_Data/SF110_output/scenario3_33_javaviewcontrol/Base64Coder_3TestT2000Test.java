// Here's an example implementation of the Base64Coder class and its test class:

// Base64Coder.java
package com.pmdesigns.jvc.tools;

import java.util.Base64;

public class Base64Coder {

    /**
     * Decodes a string from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return A String containing the decoded data.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static String decodeString(String s) {
        byte[] decodedBytes = Base64.getDecoder().decode(s);
        return new String(decodedBytes);
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64CoderTest {

    @Test
    void testDecodeString() {
        // Test case 1: Empty string
        assertEquals("", Base64Coder.decodeString(""));

        // Test case 2: Single character
        assertEquals("A", Base64Coder.decodeString("QQ=="));

        // Test case 3: Multiple characters
        assertEquals("Hello, world!", Base64Coder.decodeString("SGVsbG8sIHdvcmxkIQ=="));

        // Test case 4: Invalid input (not Base64 encoded)
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("Hello, world!"));

        // Test case 5: Invalid input (truncated Base64 encoded)
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("SGVsbG8sIHdvcmxk"));

        // Test case 6: Invalid input (padding character in wrong position)
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("SGVsbG8sIHdvcmxkI==="));

        // Test case 7: Invalid input (padding character missing)
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("SGVsbG8sIHdvcmxkIQ"));

        // Test case 8: Invalid input (non-ASCII characters)
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("4pyTIMOgIGxhIG1vZGU="));

        // Test case 9: Invalid input (non-UTF-8 characters)
        assertThrows(IllegalArgumentException.class, () -> Base64Coder.decodeString("w4TDtsO8"));

        // Test case 10: Large input
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("Hello, world!");
        }
        String encodedString = Base64.getEncoder().encodeToString(sb.toString().getBytes());
        assertEquals(sb.toString(), Base64Coder.decodeString(encodedString));
    }
}