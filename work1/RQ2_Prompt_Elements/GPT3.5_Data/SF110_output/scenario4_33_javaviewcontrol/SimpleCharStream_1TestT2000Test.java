// Source code for SimpleCharStream_1Test.java

package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SimpleCharStream}.
 * It contains ten unit test cases for the {@link SimpleCharStream#readChar()} method.
 */
class SimpleCharStream_1Test {

    /**
     * Test case for reading a single character.
     */
    @Test
    void testReadChar_singleChar() throws Exception {
        String input = "a";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected = 'a';
        char actual = stream.readChar();
        assertEquals(expected, actual);
    }

    /**
     * Test case for reading multiple characters.
     */
    @Test
    void testReadChar_multipleChars() throws Exception {
        String input = "abc";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char expected2 = 'b';
        char expected3 = 'c';
        char actual1 = stream.readChar();
        char actual2 = stream.readChar();
        char actual3 = stream.readChar();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    /**
     * Test case for reading a newline character.
     */
    @Test
    void testReadChar_newline() throws Exception {
        String input = "a\nb";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char expected2 = '\n';
        char expected3 = 'b';
        char actual1 = stream.readChar();
        char actual2 = stream.readChar();
        char actual3 = stream.readChar();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    /**
     * Test case for reading a carriage return character.
     */
    @Test
    void testReadChar_carriageReturn() throws Exception {
        String input = "a\rb";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char expected2 = '\r';
        char expected3 = 'b';
        char actual1 = stream.readChar();
        char actual2 = stream.readChar();
        char actual3 = stream.readChar();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    /**
     * Test case for reading a tab character.
     */
    @Test
    void testReadChar_tab() throws Exception {
        String input = "a\tb";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char expected2 = '\t';
        char expected3 = 'b';
        char actual1 = stream.readChar();
        char actual2 = stream.readChar();
        char actual3 = stream.readChar();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    /**
     * Test case for reading a space character.
     */
    @Test
    void testReadChar_space() throws Exception {
        String input = "a b";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char expected2 = ' ';
        char expected3 = 'b';
        char actual1 = stream.readChar();
        char actual2 = stream.readChar();
        char actual3 = stream.readChar();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    /**
     * Test case for reading an empty input.
     */
    @Test
    void testReadChar_emptyInput() throws Exception {
        String input = "";
        SimpleCharStream stream = new SimpleCharStream(input);
        assertThrows(java.io.IOException.class, () -> {
            stream.readChar();
        });
    }

    /**
     * Test case for reading past the end of input.
     */
    @Test
    void testReadChar_pastEnd() throws Exception {
        String input = "a";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char actual1 = stream.readChar();
        assertEquals(expected1, actual1);
        assertThrows(java.io.IOException.class, () -> {
            stream.readChar();
        });
    }

    /**
     * Test case for backing up a single character.
     */
    @Test
    void testBackup_singleChar() throws Exception {
        String input = "a";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char actual1 = stream.readChar();
        assertEquals(expected1, actual1);
        stream.backup(1);
        char expected2 = 'a';
        char actual2 = stream.readChar();
        assertEquals(expected2, actual2);
    }

    /**
     * Test case for backing up multiple characters.
     */
    @Test
    void testBackup_multipleChars() throws Exception {
        String input = "abc";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char expected2 = 'b';
        char actual1 = stream.readChar();
        char actual2 = stream.readChar();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        stream.backup(2);
        char expected3 = 'a';
        char expected4 = 'b';
        char actual3 = stream.readChar();
        char actual4 = stream.readChar();
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
    }

    /**
     * Test case for backing up past the beginning of input.
     */
    @Test
    void testBackup_pastBeginning() throws Exception {
        String input = "a";
        SimpleCharStream stream = new SimpleCharStream(input);
        char expected1 = 'a';
        char actual1 = stream.readChar();
        assertEquals(expected1, actual1);
        stream.backup(1);
        char expected2 = 'a';
        char actual2 = stream.readChar();
        assertEquals(expected2, actual2);
        assertThrows(java.io.IOException.class, () -> {
            stream.backup(1);
        });
    }
}