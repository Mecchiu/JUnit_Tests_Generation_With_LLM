// ModernChatServer_1Test.java
package osa.ora.server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModernChatServer}.
* It contains ten unit test cases for the {@link ModernChatServer#ping()} method.
*/
class ModernChatServer_1Test {
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is up and running.
     */
    @Test
    void testPingServerUp() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = true;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is down.
     */
    @Test
    void testPingServerDown() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = false;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is overloaded.
     */
    @Test
    void testPingServerOverloaded() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = true;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is under maintenance.
     */
    @Test
    void testPingServerUnderMaintenance() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = false;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is experiencing network issues.
     */
    @Test
    void testPingServerNetworkIssues() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = false;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is being attacked.
     */
    @Test
    void testPingServerBeingAttacked() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = false;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is being updated.
     */
    @Test
    void testPingServerBeingUpdated() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = false;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is being restarted.
     */
    @Test
    void testPingServerBeingRestarted() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = false;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is being shut down.
     */
    @Test
    void testPingServerBeingShutDown() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = false;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of ping method, of class ModernChatServer.
     * Test case when the server is overloaded and under maintenance.
     */
    @Test
    void testPingServerOverloadedAndUnderMaintenance() {
        ModernChatServer instance = new ModernChatServer();
        boolean expResult = true;
        boolean result = instance.ping();
        assertEquals(expResult, result);
    }
}