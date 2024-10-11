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
     * Test case for checking if the ping method returns true.
     */
    @Test
    void testPing() {
        ModernChatServer server = new ModernChatServer();
        assertTrue(server.ping());
    }
    
    /**
     * Test case for checking if the ping method returns true multiple times.
     */
    @Test
    void testMultiplePing() {
        ModernChatServer server = new ModernChatServer();
        for(int i=0; i<10; i++) {
            assertTrue(server.ping());
        }
    }
    
    /**
     * Test case for checking if the ping method returns true after a delay.
     * This test case is to ensure that the ping method is not affected by any delays or timeouts.
     */
    @Test
    void testDelayedPing() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case for checking if the ping method returns true when called from multiple threads.
     */
    @Test
    void testConcurrentPing() {
        ModernChatServer server = new ModernChatServer();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                assertTrue(server.ping());
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                assertTrue(server.ping());
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Test case for checking if the ping method returns true when called after a long delay.
     * This test case is to ensure that the ping method is not affected by any long delays or timeouts.
     */
    @Test
    void testLongDelayedPing() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case for checking if the ping method returns true when called after a short delay.
     * This test case is to ensure that the ping method is not affected by any short delays or timeouts.
     */
    @Test
    void testShortDelayedPing() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case for checking if the ping method returns true when called after a random delay.
     * This test case is to ensure that the ping method is not affected by any random delays or timeouts.
     */
    @Test
    void testRandomDelayedPing() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case for checking if the ping method returns true when called after a very long delay.
     * This test case is to ensure that the ping method is not affected by any very long delays or timeouts.
     */
    @Test
    void testVeryLongDelayedPing() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case for checking if the ping method returns true when called after a very short delay.
     * This test case is to ensure that the ping method is not affected by any very short delays or timeouts.
     */
    @Test
    void testVeryShortDelayedPing() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case for checking if the ping method returns true when called after a medium delay.
     * This test case is to ensure that the ping method is not affected by any medium delays or timeouts.
     */
    @Test
    void testMediumDelayedPing() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
}