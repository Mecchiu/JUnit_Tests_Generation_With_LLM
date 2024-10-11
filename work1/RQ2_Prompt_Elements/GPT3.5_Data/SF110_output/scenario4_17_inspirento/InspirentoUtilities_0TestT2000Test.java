// Here's an example of how you can test the InspirentoUtilities class using JUnit 5:

// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InspirentoUtilities_0Test {

    @Test
    void testTokenize() {
        String input = "file edit view";
        String[] expected = {"file", "edit", "view"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTokenizeWithCustomDelim() {
        String input = "file|edit|view";
        String delim = "|";
        String[] expected = {"file", "edit", "view"};
        String[] actual = InspirentoUtilities.tokenize(input, delim);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testEscapeText() {
        String input = "<html><body><h1>Hello World!</h1></body></html>";
        String expected = "&lt;html&gt;&lt;body&gt;&lt;h1&gt;Hello World!&lt;/h1&gt;&lt;/body&gt;&lt;/html&gt;";
        String actual = InspirentoUtilities.escapeText(input);
        assertEquals(expected, actual);
    }

    @Test
    void testStringReplaceAll() {
        StringBuffer source = new StringBuffer("Hello, world!");
        char token = 'o';
        String replacement = "0";
        String expected = "Hell0, w0rld!";
        String actual = InspirentoUtilities.stringReplaceAll(source, token, replacement).toString();
        assertEquals(expected, actual);
    }

    @Test
    void testTokenizeWithEmptyString() {
        String input = "";
        String[] expected = {};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTokenizeWithSingleToken() {
        String input = "file";
        String[] expected = {"file"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTokenizeWithMultipleSpaces() {
        String input = "file    edit     view";
        String[] expected = {"file", "edit", "view"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTokenizeWithLeadingAndTrailingSpaces() {
        String input = "  file edit view  ";
        String[] expected = {"file", "edit", "view"};
        String[] actual = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTokenizeWithNullInput() {
        String input = null;
        assertThrows(NullPointerException.class, () -> {
            InspirentoUtilities.tokenize(input);
        });
    }

    @Test
    void testTokenizeWithNullDelim() {
        String input = "file edit view";
        String delim = null;
        assertThrows(NullPointerException.class, () -> {
            InspirentoUtilities.tokenize(input, delim);
        });
    }
}