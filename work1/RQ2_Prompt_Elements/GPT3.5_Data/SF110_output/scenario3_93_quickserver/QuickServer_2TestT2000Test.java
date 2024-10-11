// QuickServer_2Test.java
package org.quickserver.net.server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link QuickServer}.
 * It contains ten unit test cases for the {@link QuickServer#getNewLine()} method.
 */
class QuickServer_2Test {
    
    @Test
    void testGetNewLine() {
        String newLine = QuickServer.getNewLine();
        assertNotNull(newLine);
        assertTrue(newLine.equals(System.lineSeparator()));
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
    void testGetNewLineLength() {
        assertEquals(System.lineSeparator().length(), QuickServer.getNewLine().length());
    }
    
    @Test
    void testGetNewLineEqualsSystemLineSeparator() {
        assertTrue(QuickServer.getNewLine().equals(System.lineSeparator()));
    }
    
    @Test
    void testGetNewLineEqualsLineFeed() {
        assertTrue(QuickServer.getNewLine().equals("\n"));
    }
    
    @Test
    void testGetNewLineEqualsCarriageReturn() {
        assertTrue(QuickServer.getNewLine().equals("\r"));
    }
    
    @Test
    void testGetNewLineNotEqualsTab() {
        assertFalse(QuickServer.getNewLine().equals("\t"));
    }
    
    @Test
    void testGetNewLineNotEqualsSpace() {
        assertFalse(QuickServer.getNewLine().equals(" "));
    }
    
    @Test
    void testGetNewLineNotEqualsNull() {
        assertFalse(QuickServer.getNewLine().equals(null));
    }
}