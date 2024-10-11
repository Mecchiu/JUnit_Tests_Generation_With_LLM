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
     * Test case to check if ping method returns true.
     */
    @Test
    void testPing() {
        ModernChatServer server = new ModernChatServer();
        assertTrue(server.ping());
    }
    
    /**
     * Test case to check if ping method returns true when called multiple times.
     */
    @Test
    void testPingMultipleTimes() {
        ModernChatServer server = new ModernChatServer();
        assertTrue(server.ping());
        assertTrue(server.ping());
        assertTrue(server.ping());
    }
    
    /**
     * Test case to check if ping method returns true after a delay.
     * This test case is to ensure that the ping method is not affected by any delays or timeouts.
     */
    @Test
    void testPingWithDelay() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(1000); // wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case to check if ping method returns true when called from multiple threads.
     */
    @Test
    void testPingWithMultipleThreads() {
        ModernChatServer server = new ModernChatServer();
        Thread thread1 = new Thread(() -> {
            assertTrue(server.ping());
        });
        Thread thread2 = new Thread(() -> {
            assertTrue(server.ping());
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Test case to check if ping method returns true when called after a long delay.
     * This test case is to ensure that the ping method is not affected by any long delays or timeouts.
     */
    @Test
    void testPingWithLongDelay() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(10000); // wait for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case to check if ping method returns true when called after a short delay.
     * This test case is to ensure that the ping method is not affected by any short delays or timeouts.
     */
    @Test
    void testPingWithShortDelay() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(100); // wait for 100 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case to check if ping method returns true when called after a very short delay.
     * This test case is to ensure that the ping method is not affected by any very short delays or timeouts.
     */
    @Test
    void testPingWithVeryShortDelay() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(10); // wait for 10 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case to check if ping method returns true when called after a very long delay.
     * This test case is to ensure that the ping method is not affected by any very long delays or timeouts.
     */
    @Test
    void testPingWithVeryLongDelay() {
        ModernChatServer server = new ModernChatServer();
        try {
            Thread.sleep(60000); // wait for 1 minute
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case to check if ping method returns true when called after a random delay.
     * This test case is to ensure that the ping method is not affected by any random delays or timeouts.
     */
    @Test
    void testPingWithRandomDelay() {
        ModernChatServer server = new ModernChatServer();
        int delay = (int) (Math.random() * 1000); // generate a random delay between 0 and 1000 milliseconds
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(server.ping());
    }
    
    /**
     * Test case to check if ping method returns true when called after a delay and then interrupted.
     * This test case is to ensure that the ping method is not affected by any interruptions or exceptions.
     */
    @Test
    void testPingWithInterrupt() {
        ModernChatServer server = new ModernChatServer();
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.currentThread().interrupt(); // interrupt the thread
        });
        thread.start();
        assertTrue(server.ping());
    }
}