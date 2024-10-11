// BomberClient_0Test.java
package client;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BomberClient}.
 * It contains ten unit test cases for the {@link BomberClient#getInstance()} method.
 */
class BomberClient_0Test {
    
    /**
     * Test case to check if the singleton instance is not null.
     */
    @Test
    void testGetInstanceNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance);
    }
    
    /**
     * Test case to check if the same instance is returned every time.
     */
    @Test
    void testGetInstanceSameInstance() {
        BomberClient instance1 = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertSame(instance1, instance2);
    }
    
    /**
     * Test case to check if the instance is of type BomberClient.
     */
    @Test
    void testGetInstanceType() {
        BomberClient instance = BomberClient.getInstance();
        assertTrue(instance instanceof BomberClient);
    }
    
    /**
     * Test case to check if the instance is observable.
     */
    @Test
    void testGetInstanceObservable() {
        BomberClient instance = BomberClient.getInstance();
        assertTrue(instance instanceof Observable);
    }
    
    /**
     * Test case to check if the instance has a non-null client message sender.
     */
    @Test
    void testGetInstanceClientMsgSenderNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance.getClientMsgSender());
    }
    
    /**
     * Test case to check if the instance has a non-null client message receiver.
     */
    @Test
    void testGetInstanceClientMsgReceiverNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance.getClientMsgReceiver());
    }
    
    /**
     * Test case to check if the instance has a non-null list of session details.
     */
    @Test
    void testGetInstanceSessionDetailsNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance.getSessionDetails());
    }
    
    /**
     * Test case to check if the instance has a non-null map of session players.
     */
    @Test
    void testGetInstanceSessionPlayersNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance.getSessionPlayers());
    }
    
    /**
     * Test case to check if the instance has a non-null list of available maps.
     */
    @Test
    void testGetInstanceAvailableMapsNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance.getAvailableMaps());
    }
    
    /**
     * Test case to check if the instance has a non-null start frame.
     */
    @Test
    void testGetInstanceStartFrameNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance.getStartFrame());
    }
}