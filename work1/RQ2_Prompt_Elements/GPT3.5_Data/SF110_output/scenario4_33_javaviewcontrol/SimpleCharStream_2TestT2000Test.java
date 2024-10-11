// Source code for SimpleCharStream_2Test.java

package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SimpleCharStream}.
 * It contains ten unit test cases for the {@link SimpleCharStream#GetImage()} method.
 */
class SimpleCharStream_2Test {

    /**
     * Test case for empty buffer.
     */
    @Test
    void testGetImageEmptyBuffer() {
        SimpleCharStream stream = new SimpleCharStream("");
        assertEquals("", stream.GetImage());
    }

    /**
     * Test case for buffer with one character.
     */
    @Test
    void testGetImageOneChar() {
        SimpleCharStream stream = new SimpleCharStream("a");
        assertEquals("a", stream.GetImage());
    }

    /**
     * Test case for buffer with multiple characters.
     */
    @Test
    void testGetImageMultipleChars() {
        SimpleCharStream stream = new SimpleCharStream("abc");
        assertEquals("abc", stream.GetImage());
    }

    /**
     * Test case for buffer with whitespace characters.
     */
    @Test
    void testGetImageWhitespace() {
        SimpleCharStream stream = new SimpleCharStream("  \t\n  ");
        assertEquals("  \t\n  ", stream.GetImage());
    }

    /**
     * Test case for buffer with special characters.
     */
    @Test
    void testGetImageSpecialChars() {
        SimpleCharStream stream = new SimpleCharStream("!@#$%^&*()");
        assertEquals("!@#$%^&*()", stream.GetImage());
    }

    /**
     * Test case for buffer with mixed characters.
     */
    @Test
    void testGetImageMixedChars() {
        SimpleCharStream stream = new SimpleCharStream("a1! ");
        assertEquals("a1! ", stream.GetImage());
    }

    /**
     * Test case for buffer with Unicode characters.
     */
    @Test
    void testGetImageUnicodeChars() {
        SimpleCharStream stream = new SimpleCharStream("こんにちは");
        assertEquals("こんにちは", stream.GetImage());
    }

    /**
     * Test case for buffer with escape characters.
     */
    @Test
    void testGetImageEscapeChars() {
        SimpleCharStream stream = new SimpleCharStream("\\n\\t\\'");
        assertEquals("\\n\\t\\'", stream.GetImage());
    }

    /**
     * Test case for buffer with null character.
     */
    @Test
    void testGetImageNullChar() {
        SimpleCharStream stream = new SimpleCharStream("\0");
        assertEquals("\0", stream.GetImage());
    }

    /**
     * Test case for buffer with mixed null and non-null characters.
     */
    @Test
    void testGetImageMixedNullChars() {
        SimpleCharStream stream = new SimpleCharStream("a\0b");
        assertEquals("a\0b", stream.GetImage());
    }
}