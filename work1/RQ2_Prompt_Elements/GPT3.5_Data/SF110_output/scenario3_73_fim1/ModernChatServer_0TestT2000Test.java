// ModernChatServer_0Test.java
package osa.ora.server;

import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModernChatServer}.
 * It contains ten unit test cases for the {@link ModernChatServer#getLogger()} method.
 */
class ModernChatServer_0Test {

    /**
     * Test case for checking if the logger is not null.
     */
    @Test
    void testGetLoggerNotNull() {
        Logger logger = ModernChatServer.getLogger();
        assertNotNull(logger);
    }

    /**
     * Test case for checking if the logger name is "osa.ora.server.ModernChatServer".
     */
    @Test
    void testGetLoggerName() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals("osa.ora.server.ModernChatServer", logger.getName());
    }

    /**
     * Test case for checking if the logger level is set to Level.INFO.
     */
    @Test
    void testGetLoggerLevel() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals(Level.INFO, logger.getLevel());
    }

    /**
     * Test case for checking if the logger parent is not null.
     */
    @Test
    void testGetLoggerParentNotNull() {
        Logger logger = ModernChatServer.getLogger();
        assertNotNull(logger.getParent());
    }

    /**
     * Test case for checking if the logger parent name is "osa.ora.server".
     */
    @Test
    void testGetLoggerParentName() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals("osa.ora.server", logger.getParent().getName());
    }

    /**
     * Test case for checking if the logger parent level is set to Level.INFO.
     */
    @Test
    void testGetLoggerParentLevel() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals(Level.INFO, logger.getParent().getLevel());
    }

    /**
     * Test case for checking if the logger parent parent is not null.
     */
    @Test
    void testGetLoggerParentParentNotNull() {
        Logger logger = ModernChatServer.getLogger();
        assertNotNull(logger.getParent().getParent());
    }

    /**
     * Test case for checking if the logger parent parent name is "osa.ora".
     */
    @Test
    void testGetLoggerParentParentName() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals("osa.ora", logger.getParent().getParent().getName());
    }

    /**
     * Test case for checking if the logger parent parent level is set to Level.INFO.
     */
    @Test
    void testGetLoggerParentParentLevel() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals(Level.INFO, logger.getParent().getParent().getLevel());
    }
}