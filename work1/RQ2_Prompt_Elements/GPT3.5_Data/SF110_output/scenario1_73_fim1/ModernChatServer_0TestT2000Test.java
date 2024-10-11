import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModernChatServer_0Test {
    
    // Test case 1: Test if getLogger() method returns a non-null Logger object
    @Test
    void testGetLoggerNotNull() {
        assertNotNull(ModernChatServer.getLogger());
    }
    
    // Test case 2: Test if getLogger() method returns a Logger object of type Logger
    @Test
    void testGetLoggerType() {
        assertTrue(ModernChatServer.getLogger() instanceof Logger);
    }
    
    // Test case 3: Test if getLogger() method returns the same Logger object every time it is called
    @Test
    void testGetLoggerSameObject() {
        Logger logger1 = ModernChatServer.getLogger();
        Logger logger2 = ModernChatServer.getLogger();
        assertSame(logger1, logger2);
    }
    
    // Test case 4: Test if getLogger() method returns a Logger object with the correct name
    @Test
    void testGetLoggerName() {
        assertEquals("osa.ora.server.ModernChatServer", ModernChatServer.getLogger().getName());
    }
    
    // Test case 5: Test if getLogger() method returns a Logger object with the correct level
    @Test
    void testGetLoggerLevel() {
        assertEquals(Level.INFO, ModernChatServer.getLogger().getLevel());
    }
    
    // Test case 6: Test if getLogger() method returns a Logger object with a FileHandler
    @Test
    void testGetLoggerFileHandler() {
        assertTrue(ModernChatServer.getLogger().getHandlers()[0] instanceof FileHandler);
    }
    
    // Test case 7: Test if getLogger() method returns a Logger object with a SimpleFormatter
    @Test
    void testGetLoggerFormatter() {
        assertTrue(ModernChatServer.getLogger().getHandlers()[0].getFormatter() instanceof SimpleFormatter);
    }
    
    // Test case 8: Test if getLogger() method returns a Logger object with the correct log file name
    @Test
    void testGetLoggerFileName() {
        assertEquals("ModernChatServer.log", ((FileHandler)ModernChatServer.getLogger().getHandlers()[0]).getFileName());
    }
    
    // Test case 9: Test if getLogger() method returns a Logger object with append set to true
    @Test
    void testGetLoggerAppend() {
        assertTrue(((FileHandler)ModernChatServer.getLogger().getHandlers()[0]).getAppend());
    }
    
    // Test case 10: Test if getLogger() method returns a Logger object with a log limit of 50000 bytes
    @Test
    void testGetLoggerLimit() {
        assertEquals(50000, ((FileHandler)ModernChatServer.getLogger().getHandlers()[0]).getLimit());
    }
}