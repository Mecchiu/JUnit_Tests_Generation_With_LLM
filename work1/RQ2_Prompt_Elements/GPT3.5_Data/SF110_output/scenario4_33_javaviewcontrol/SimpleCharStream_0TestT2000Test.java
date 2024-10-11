// Source code for SimpleCharStream_0Test.java

package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SimpleCharStream}.
 * It contains ten unit test cases for the {@link SimpleCharStream#BeginToken()} method.
 */
class SimpleCharStream_0Test {

    /**
     * Test case for when buffer is empty.
     */
    @Test
    void testBeginTokenEmptyBuffer() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("");
        char result = stream.BeginToken();
        assertEquals(SimpleCharStream.EOF, result);
    }

    /**
     * Test case for when buffer has only one character.
     */
    @Test
    void testBeginTokenOneCharBuffer() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("a");
        char result = stream.BeginToken();
        assertEquals('a', result);
    }

    /**
     * Test case for when buffer has multiple characters.
     */
    @Test
    void testBeginTokenMultiCharBuffer() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("abc");
        char result = stream.BeginToken();
        assertEquals('a', result);
    }

    /**
     * Test case for when buffer has multiple characters and is at the end of the buffer.
     */
    @Test
    void testBeginTokenMultiCharBufferEnd() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("abc");
        stream.bufpos = 2;
        char result = stream.BeginToken();
        assertEquals(SimpleCharStream.EOF, result);
    }

    /**
     * Test case for when buffer has multiple characters and is at the end of the buffer, but not at the end of the input stream.
     */
    @Test
    void testBeginTokenMultiCharBufferEndNotEndOfStream() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("abcd");
        stream.bufpos = 2;
        char result = stream.BeginToken();
        assertEquals('c', result);
    }

    /**
     * Test case for when buffer has multiple characters and is at the end of the buffer, but not at the end of the input stream, and the next character is a newline.
     */
    @Test
    void testBeginTokenMultiCharBufferEndNotEndOfStreamNewline() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("abc\ndef");
        stream.bufpos = 2;
        char result = stream.BeginToken();
        assertEquals('c', result);
    }

    /**
     * Test case for when buffer has multiple characters and is at the end of the buffer, but not at the end of the input stream, and the next character is a carriage return.
     */
    @Test
    void testBeginTokenMultiCharBufferEndNotEndOfStreamCarriageReturn() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("abc\rdef");
        stream.bufpos = 2;
        char result = stream.BeginToken();
        assertEquals('c', result);
    }

    /**
     * Test case for when buffer has multiple characters and is at the end of the buffer, but not at the end of the input stream, and the next character is a carriage return followed by a newline.
     */
    @Test
    void testBeginTokenMultiCharBufferEndNotEndOfStreamCarriageReturnNewline() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("abc\r\ndef");
        stream.bufpos = 2;
        char result = stream.BeginToken();
        assertEquals('c', result);
    }

    /**
     * Test case for when buffer has multiple characters and is at the end of the buffer, but not at the end of the input stream, and the next character is a newline followed by a carriage return.
     */
    @Test
    void testBeginTokenMultiCharBufferEndNotEndOfStreamNewlineCarriageReturn() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("abc\n\rdef");
        stream.bufpos = 2;
        char result = stream.BeginToken();
        assertEquals('c', result);
    }

    /**
     * Test case for when buffer has multiple characters and is at the end of the buffer, but not at the end of the input stream, and the next character is a newline followed by a carriage return, but the buffer is not big enough to hold both characters.
     */
    @Test
    void testBeginTokenMultiCharBufferEndNotEndOfStreamNewlineCarriageReturnSmallBuffer() throws Exception {
        SimpleCharStream stream = new SimpleCharStream("abc\n\rdef", 2);
        stream.bufpos = 2;
        char result = stream.BeginToken();
        assertEquals('c', result);
    }
}