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
        String expected = System.getProperty("line.separator");
        String actual = QuickServer.getNewLine();
        assertEquals(expected, actual);
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
        assertEquals(System.lineSeparator(), QuickServer.getNewLine());
    }
    
    @Test
    void testGetNewLineEqualsSystemPropertyLineSeparator() {
        assertEquals(System.getProperty("line.separator"), QuickServer.getNewLine());
    }
    
    @Test
    void testGetNewLineEqualsN() {
        assertEquals("\n", QuickServer.getNewLine());
    }
    
    @Test
    void testGetNewLineEqualsRN() {
        assertEquals("\r\n", QuickServer.getNewLine());
    }
    
    @Test
    void testGetNewLineEqualsR() {
        assertEquals("\r", QuickServer.getNewLine());
    }
    
    @Test
    void testGetNewLineNotEqualsTab() {
        assertNotEquals("\t", QuickServer.getNewLine());
    }
}