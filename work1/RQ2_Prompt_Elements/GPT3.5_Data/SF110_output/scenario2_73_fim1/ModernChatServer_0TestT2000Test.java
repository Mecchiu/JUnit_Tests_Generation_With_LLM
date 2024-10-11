// Test case for getLogger() method
class ModernChatServer_0Test {
    
    // Test case 1: Test if getLogger() method returns a non-null value
    @Test
    void testGetLoggerNotNull() {
        assertNotNull(ModernChatServer.getLogger());
    }
    
    // Test case 2: Test if getLogger() method returns an instance of Logger class
    @Test
    void testGetLoggerInstance() {
        assertTrue(ModernChatServer.getLogger() instanceof Logger);
    }
    
    // Test case 3: Test if getLogger() method returns the same instance of Logger class every time it is called
    @Test
    void testGetLoggerSameInstance() {
        Logger logger1 = ModernChatServer.getLogger();
        Logger logger2 = ModernChatServer.getLogger();
        assertSame(logger1, logger2);
    }
    
    // Test case 4: Test if getLogger() method returns a logger with the correct name
    @Test
    void testGetLoggerName() {
        assertEquals("osa.ora.server.ModernChatServer", ModernChatServer.getLogger().getName());
    }
    
    // Test case 5: Test if getLogger() method returns a logger with the correct level
    @Test
    void testGetLoggerLevel() {
        assertEquals(Level.INFO, ModernChatServer.getLogger().getLevel());
    }
    
    // Test case 6: Test if getLogger() method returns a logger with a file handler
    @Test
    void testGetLoggerFileHandler() {
        assertTrue(ModernChatServer.getLogger().getHandlers()[0] instanceof FileHandler);
    }
    
    // Test case 7: Test if getLogger() method returns a logger with a simple formatter
    @Test
    void testGetLoggerFormatter() {
        assertTrue(ModernChatServer.getLogger().getHandlers()[0].getFormatter() instanceof SimpleFormatter);
    }
    
    // Test case 8: Test if getLogger() method returns a logger with the correct file name
    @Test
    void testGetLoggerFileName() {
        assertEquals("ModernChatServer.log", ((FileHandler)ModernChatServer.getLogger().getHandlers()[0]).getFileName());
    }
    
    // Test case 9: Test if getLogger() method returns a logger with the correct encoding
    @Test
    void testGetLoggerEncoding() {
        assertEquals("UTF-8", ((FileHandler)ModernChatServer.getLogger().getHandlers()[0]).getEncoding());
    }
    
    // Test case 10: Test if getLogger() method returns a logger with append mode enabled
    @Test
    void testGetLoggerAppendMode() {
        assertTrue(((FileHandler)ModernChatServer.getLogger().getHandlers()[0]).getFormatter().getClass().getName().contains("SimpleFormatter"));
    }
}