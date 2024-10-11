java
package osa.ora.server;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class ModernChatServer_0Test {

    @Test
    void testGetLoggerNotNull() {
        Logger logger = ModernChatServer.getLogger();
        assertNotNull(logger);
    }

    @Test
    void testGetLoggerSameInstance() {
        Logger logger1 = ModernChatServer.getLogger();
        Logger logger2 = ModernChatServer.getLogger();
        assertSame(logger1, logger2);
    }

    @Test
    void testGetLoggerName() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals("ModernChatServer", logger.getName());
    }

    @Test
    void testGetLoggerParent() {
        Logger logger = ModernChatServer.getLogger();
        assertNull(logger.getParent());
    }

    @Test
    void testGetLoggerLevel() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals(null, logger.getLevel());
    }

    @Test
    void testGetLoggerUseParentHandlers() {
        Logger logger = ModernChatServer.getLogger();
        assertTrue(logger.getUseParentHandlers());
    }

    @Test
    void testGetLoggerAddHandler() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals(1, logger.getHandlers().length);
    }

    @Test
    void testGetLoggerHandlerName() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals("java.util.logging.ConsoleHandler", logger.getHandlers()[0].getClass().getName());
    }

    @Test
    void testGetLoggerHandlerLevel() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals(null, logger.getHandlers()[0].getLevel());
    }

    @Test
    void testGetLoggerHandlerFormatter() {
        Logger logger = ModernChatServer.getLogger();
        assertEquals("java.util.logging.SimpleFormatter", logger.getHandlers()[0].getFormatter().getClass().getName());
    }
}
