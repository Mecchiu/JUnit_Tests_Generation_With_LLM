// JVCDispatcherTest.java
package com.pmdesigns.jvc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JVCDispatcher}.
 * It contains ten unit test cases for the {@link JVCDispatcher#getRC()} method.
 */
class JVCDispatcherTest {

    /**
     * Test case to check if getRC() returns null when no request context is set.
     */
    @Test
    void testGetRCReturnsNullWhenNoRequestContextSet() {
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case to check if getRC() returns the correct request context after it has been set.
     */
    @Test
    void testGetRCReturnsCorrectRequestContextAfterSet() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        assertEquals(rc, JVCDispatcher.getRC());
    }

    /**
     * Test case to check if getRC() returns null after a request context has been set and cleared.
     */
    @Test
    void testGetRCReturnsNullAfterRequestContextSetAndCleared() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        JVCDispatcher.clearRC();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case to check if getRC() returns the correct request context after multiple have been set.
     */
    @Test
    void testGetRCReturnsCorrectRequestContextAfterMultipleSet() {
        JVCRequestContext rc1 = new JVCRequestContext();
        JVCRequestContext rc2 = new JVCRequestContext();
        JVCDispatcher.setRC(rc1);
        JVCDispatcher.setRC(rc2);
        assertEquals(rc2, JVCDispatcher.getRC());
    }

    /**
     * Test case to check if getRC() returns the correct request context after it has been set and cleared multiple times.
     */
    @Test
    void testGetRCReturnsCorrectRequestContextAfterSetAndClearedMultipleTimes() {
        JVCRequestContext rc1 = new JVCRequestContext();
        JVCRequestContext rc2 = new JVCRequestContext();
        JVCDispatcher.setRC(rc1);
        JVCDispatcher.clearRC();
        JVCDispatcher.setRC(rc2);
        assertEquals(rc2, JVCDispatcher.getRC());
    }

    /**
     * Test case to check if getRC() returns null after a request context has been set and cleared multiple times.
     */
    @Test
    void testGetRCReturnsNullAfterRequestContextSetAndClearedMultipleTimes() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        JVCDispatcher.clearRC();
        JVCDispatcher.setRC(rc);
        JVCDispatcher.clearRC();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case to check if getRC() returns the correct request context in a multi-threaded environment.
     */
    @Test
    void testGetRCReturnsCorrectRequestContextInMultiThreadedEnvironment() throws InterruptedException {
        JVCRequestContext rc1 = new JVCRequestContext();
        JVCRequestContext rc2 = new JVCRequestContext();
        Thread t1 = new Thread(() -> {
            JVCDispatcher.setRC(rc1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assertEquals(rc1, JVCDispatcher.getRC());
            JVCDispatcher.clearRC();
        });
        Thread t2 = new Thread(() -> {
            JVCDispatcher.setRC(rc2);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assertEquals(rc2, JVCDispatcher.getRC());
            JVCDispatcher.clearRC();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case to check if getRC() returns null after a request context has been set and cleared in a multi-threaded environment.
     */
    @Test
    void testGetRCReturnsNullAfterRequestContextSetAndClearedInMultiThreadedEnvironment() throws InterruptedException {
        JVCRequestContext rc = new JVCRequestContext();
        Thread t1 = new Thread(() -> {
            JVCDispatcher.setRC(rc);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            JVCDispatcher.clearRC();
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assertNull(JVCDispatcher.getRC());
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}