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
     * Test case for getting the request context from a new thread.
     */
    @Test
    void testGetRCNewThread() {
        assertNull(JVCDispatcher.getRC());
        Thread thread = new Thread(() -> {
            assertNotNull(JVCDispatcher.getRC());
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context from the same thread.
     */
    @Test
    void testGetRCSameThread() {
        assertNull(JVCDispatcher.getRC());
        JVCRequestContext context = new JVCRequestContext();
        JVCDispatcher.setRC(context);
        assertEquals(context, JVCDispatcher.getRC());
        JVCDispatcher.removeRC();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context from a different thread.
     */
    @Test
    void testGetRCDifferentThread() {
        assertNull(JVCDispatcher.getRC());
        JVCRequestContext context = new JVCRequestContext();
        Thread thread = new Thread(() -> {
            JVCDispatcher.setRC(context);
            assertNotNull(JVCDispatcher.getRC());
            JVCDispatcher.removeRC();
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for setting the request context in a new thread.
     */
    @Test
    void testSetRCNewThread() {
        assertNull(JVCDispatcher.getRC());
        Thread thread = new Thread(() -> {
            JVCRequestContext context = new JVCRequestContext();
            JVCDispatcher.setRC(context);
            assertEquals(context, JVCDispatcher.getRC());
            JVCDispatcher.removeRC();
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for setting the request context in the same thread.
     */
    @Test
    void testSetRCSameThread() {
        assertNull(JVCDispatcher.getRC());
        JVCRequestContext context1 = new JVCRequestContext();
        JVCDispatcher.setRC(context1);
        assertEquals(context1, JVCDispatcher.getRC());
        JVCRequestContext context2 = new JVCRequestContext();
        JVCDispatcher.setRC(context2);
        assertEquals(context2, JVCDispatcher.getRC());
        JVCDispatcher.removeRC();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for setting the request context in a different thread.
     */
    @Test
    void testSetRCDifferentThread() {
        assertNull(JVCDispatcher.getRC());
        JVCRequestContext context1 = new JVCRequestContext();
        Thread thread = new Thread(() -> {
            JVCRequestContext context2 = new JVCRequestContext();
            JVCDispatcher.setRC(context2);
            assertEquals(context2, JVCDispatcher.getRC());
            JVCDispatcher.removeRC();
        });
        thread.start();
        JVCDispatcher.setRC(context1);
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(context1, JVCDispatcher.getRC());
        JVCDispatcher.removeRC();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for removing the request context from a new thread.
     */
    @Test
    void testRemoveRCNewThread() {
        assertNull(JVCDispatcher.getRC());
        Thread thread = new Thread(() -> {
            JVCRequestContext context = new JVCRequestContext();
            JVCDispatcher.setRC(context);
            assertEquals(context, JVCDispatcher.getRC());
            JVCDispatcher.removeRC();
            assertNull(JVCDispatcher.getRC());
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for removing the request context from the same thread.
     */
    @Test
    void testRemoveRCSameThread() {
        assertNull(JVCDispatcher.getRC());
        JVCRequestContext context = new JVCRequestContext();
        JVCDispatcher.setRC(context);
        assertEquals(context, JVCDispatcher.getRC());
        JVCDispatcher.removeRC();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for removing the request context from a different thread.
     */
    @Test
    void testRemoveRCDifferentThread() {
        assertNull(JVCDispatcher.getRC());
        JVCRequestContext context = new JVCRequestContext();
        Thread thread = new Thread(() -> {
            JVCDispatcher.setRC(context);
            assertEquals(context, JVCDispatcher.getRC());
            JVCDispatcher.removeRC();
            assertNull(JVCDispatcher.getRC());
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertNull(JVCDispatcher.getRC());
    }
}