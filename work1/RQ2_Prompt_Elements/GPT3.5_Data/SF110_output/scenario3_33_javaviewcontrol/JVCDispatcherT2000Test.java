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
        new Thread(() -> {
            assertNotNull(JVCDispatcher.getRC());
        }).start();
    }

    /**
     * Test case for getting the request context from the same thread.
     */
    @Test
    void testGetRCSameThread() {
        assertNotNull(JVCDispatcher.getRC());
        assertSame(JVCDispatcher.getRC(), JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context after setting it.
     */
    @Test
    void testGetRCSet() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        assertSame(rc, JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context after setting it in a new thread.
     */
    @Test
    void testGetRCSetNewThread() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        new Thread(() -> {
            assertSame(rc, JVCDispatcher.getRC());
        }).start();
    }

    /**
     * Test case for getting the request context after setting it in a different thread.
     */
    @Test
    void testGetRCSetDifferentThread() {
        JVCRequestContext rc1 = new JVCRequestContext();
        JVCRequestContext rc2 = new JVCRequestContext();
        JVCDispatcher.setRC(rc1);
        new Thread(() -> {
            JVCDispatcher.setRC(rc2);
        }).start();
        assertSame(rc1, JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context after unsetting it.
     */
    @Test
    void testGetRCUnset() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        JVCDispatcher.unsetRC();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context after unsetting it in a new thread.
     */
    @Test
    void testGetRCUnsetNewThread() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        new Thread(() -> {
            JVCDispatcher.unsetRC();
        }).start();
        assertSame(rc, JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context after unsetting it in a different thread.
     */
    @Test
    void testGetRCUnsetDifferentThread() {
        JVCRequestContext rc1 = new JVCRequestContext();
        JVCRequestContext rc2 = new JVCRequestContext();
        JVCDispatcher.setRC(rc1);
        new Thread(() -> {
            JVCDispatcher.unsetRC();
        }).start();
        JVCDispatcher.setRC(rc2);
        assertSame(rc2, JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context after unsetting it multiple times.
     */
    @Test
    void testGetRCUnsetMultiple() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        JVCDispatcher.unsetRC();
        JVCDispatcher.unsetRC();
        assertNull(JVCDispatcher.getRC());
    }

    /**
     * Test case for getting the request context after unsetting it multiple times in a new thread.
     */
    @Test
    void testGetRCUnsetMultipleNewThread() {
        JVCRequestContext rc = new JVCRequestContext();
        JVCDispatcher.setRC(rc);
        new Thread(() -> {
            JVCDispatcher.unsetRC();
            JVCDispatcher.unsetRC();
        }).start();
        assertSame(rc, JVCDispatcher.getRC());
    }
}