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
     * Test case to check if the same instance is returned on multiple calls to getInstance().
     */
    @Test
    void testGetInstanceSameInstance() {
        BomberClient instance1 = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertSame(instance1, instance2);
    }
    
    /**
     * Test case to check if the singleton instance is of type BomberClient.
     */
    @Test
    void testGetInstanceType() {
        BomberClient instance = BomberClient.getInstance();
        assertTrue(instance instanceof BomberClient);
    }
    
    /**
     * Test case to check if the singleton instance is created only once.
     */
    @Test
    void testGetInstanceSingleCreation() {
        BomberClient.getInstance();
        BomberClient.getInstance();
        BomberClient.getInstance();
        assertEquals(1, BomberClient.getInstanceCount());
    }
    
    /**
     * Test case to check if the singleton instance is thread-safe.
     */
    @Test
    void testGetInstanceThreadSafe() {
        Thread t1 = new Thread(() -> {
            BomberClient.getInstance();
        });
        Thread t2 = new Thread(() -> {
            BomberClient.getInstance();
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(1, BomberClient.getInstanceCount());
    }
    
    /**
     * Test case to check if the singleton instance has a non-null client name.
     */
    @Test
    void testGetInstanceClientNameNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance.getClientName());
    }
    
    /**
     * Test case to check if the singleton instance has a default client name of "client".
     */
    @Test
    void testGetInstanceDefaultClientName() {
        BomberClient instance = BomberClient.getInstance();
        assertEquals("client", instance.getClientName());
    }
    
    /**
     * Test case to check if the client name can be set and retrieved correctly.
     */
    @Test
    void testSetAndGetClientName() {
        BomberClient instance = BomberClient.getInstance();
        instance.setClientName("testClient");
        assertEquals("testClient", instance.getClientName());
    }
    
    /**
     * Test case to check if the observer list is not null after instantiation.
     */
    @Test
    void testObserverListNotNull() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance.getObserverList());
    }
    
    /**
     * Test case to check if the observer list is empty after instantiation.
     */
    @Test
    void testObserverListEmpty() {
        BomberClient instance = BomberClient.getInstance();
        assertTrue(instance.getObserverList().isEmpty());
    }
}