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
     * Test case for when the input stream is empty.
     * Expected result: IOException is thrown.
     */
    @Test
    void testBeginTokenEmptyStream() {
        SimpleCharStream stream = new SimpleCharStream("");
        assertThrows(java.io.IOException.class, stream::BeginToken);
    }

    /**
     * Test case for when the input stream has only one character.
     * Expected result: The character is returned and the stream pointer is moved to the end of the stream.
     */
    @Test
    void testBeginTokenSingleCharStream() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("a");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertTrue(stream.isEOF());
    }

    /**
     * Test case for when the input stream has multiple characters.
     * Expected result: The first character is returned and the stream pointer is moved to the next character.
     */
    @Test
    void testBeginTokenMultiCharStream() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("abc");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertFalse(stream.isEOF());
        result = stream.BeginToken();
        assertEquals('b', result);
        assertFalse(stream.isEOF());
    }

    /**
     * Test case for when the input stream has whitespace characters before the first token.
     * Expected result: The first non-whitespace character is returned and the stream pointer is moved to the next character.
     */
    @Test
    void testBeginTokenLeadingWhitespace() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("  \t\na");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertFalse(stream.isEOF());
    }

    /**
     * Test case for when the input stream has whitespace characters after the first token.
     * Expected result: The first non-whitespace character after the token is returned and the stream pointer is moved to the next character.
     */
    @Test
    void testBeginTokenTrailingWhitespace() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("a  \t\nb");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertFalse(stream.isEOF());
        result = stream.BeginToken();
        assertEquals('b', result);
        assertFalse(stream.isEOF());
    }

    /**
     * Test case for when the input stream has a token followed by whitespace characters and then another token.
     * Expected result: The first token is returned and the stream pointer is moved to the next character after the whitespace.
     */
    @Test
    void testBeginTokenTokenWhitespaceToken() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("a  \t\nb");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertFalse(stream.isEOF());
        result = stream.BeginToken();
        assertEquals('b', result);
        assertFalse(stream.isEOF());
    }

    /**
     * Test case for when the input stream has a token followed by non-whitespace characters and then another token.
     * Expected result: The first token is returned and the stream pointer is moved to the next character after the non-whitespace.
     */
    @Test
    void testBeginTokenTokenNonWhitespaceToken() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("a,b");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertFalse(stream.isEOF());
        result = stream.BeginToken();
        assertEquals(',', result);
        assertFalse(stream.isEOF());
        result = stream.BeginToken();
        assertEquals('b', result);
        assertTrue(stream.isEOF());
    }

    /**
     * Test case for when the input stream has a token followed by a comment.
     * Expected result: The first token is returned and the stream pointer is moved to the next character after the comment.
     */
    @Test
    void testBeginTokenTokenComment() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("a/*comment*/b");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertFalse(stream.isEOF());
        result = stream.BeginToken();
        assertEquals('b', result);
        assertTrue(stream.isEOF());
    }

    /**
     * Test case for when the input stream has a token followed by a string literal.
     * Expected result: The first token is returned and the stream pointer is moved to the next character after the string literal.
     */
    @Test
    void testBeginTokenTokenStringLiteral() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("a\"string\"b");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertFalse(stream.isEOF());
        result = stream.BeginToken();
        assertEquals('b', result);
        assertTrue(stream.isEOF());
    }

    /**
     * Test case for when the input stream has a token followed by a character literal.
     * Expected result: The first token is returned and the stream pointer is moved to the next character after the character literal.
     */
    @Test
    void testBeginTokenTokenCharLiteral() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream("a'c'b");
        char result = stream.BeginToken();
        assertEquals('a', result);
        assertFalse(stream.isEOF());
        result = stream.BeginToken();
        assertEquals('b', result);
        assertTrue(stream.isEOF());
    }
}