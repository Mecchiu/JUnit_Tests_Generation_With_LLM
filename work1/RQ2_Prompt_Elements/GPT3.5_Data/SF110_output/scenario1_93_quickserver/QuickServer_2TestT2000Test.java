// JUnit test class for QuickServer.java
package org.quickserver.net.server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link QuickServer}.
 * It contains ten unit test cases for the {@link QuickServer#getNewLine()} method.
 */
class QuickServerTest {

    @Test
    void testGetNewLine() {
        String newLine = QuickServer.getNewLine();
        assertNotNull(newLine);
        assertTrue(newLine.equals("\n") || newLine.equals("\r\n"));
    }

    @Test
    void testGetNewLineNotNull() {
        assertNotNull(QuickServer.getNewLine());
    }

    @Test
    void testGetNewLineNotEmpty() {
        assertFalse(QuickServer.getNewLine().isEmpty());
    }

    @Test
    void testGetNewLineNotWhitespace() {
        assertFalse(QuickServer.getNewLine().isBlank());
    }

    @Test
    void testGetNewLineLength() {
        assertTrue(QuickServer.getNewLine().length() > 0);
    }

    @Test
    void testGetNewLineEquals() {
        assertTrue(QuickServer.getNewLine().equals(System.lineSeparator()));
    }

    @Test
    void testGetNewLineNotEquals() {
        assertFalse(QuickServer.getNewLine().equals("\r"));
    }

    @Test
    void testGetNewLineContains() {
        assertTrue(QuickServer.getNewLine().contains("\n"));
    }

    @Test
    void testGetNewLineNotContains() {
        assertFalse(QuickServer.getNewLine().contains("\r"));
    }

    @Test
    void testGetNewLineStartsWith() {
        assertTrue(QuickServer.getNewLine().startsWith("\n"));
    }
}