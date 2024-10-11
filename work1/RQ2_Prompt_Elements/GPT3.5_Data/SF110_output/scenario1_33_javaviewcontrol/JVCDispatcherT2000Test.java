// JVCDispatcherTest.java
package com.pmdesigns.jvc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JVCDispatcher}.
 * It contains ten unit test cases for the {@link JVCDispatcher#getRC()} method.
 */
class JVCDispatcherTest {

    @Test
    void testGetRC() {
        // Test case 1: Test if getRC() returns null when no context is set
        assertNull(JVCDispatcher.getRC());

        // Test case 2: Test if getRC() returns the same context that was set
        JVCRequestContext context = new JVCRequestContext();
        JVCDispatcher.setRC(context);
        assertEquals(context, JVCDispatcher.getRC());

        // Test case 3: Test if getRC() returns null after context is removed
        JVCDispatcher.removeRC();
        assertNull(JVCDispatcher.getRC());

        // Test case 4: Test if getRC() returns the same context after setting it again
        JVCDispatcher.setRC(context);
        assertEquals(context, JVCDispatcher.getRC());

        // Test case 5: Test if getRC() returns null after removing it again
        JVCDispatcher.removeRC();
        assertNull(JVCDispatcher.getRC());

        // Test case 6: Test if getRC() returns the same context after setting it again
        JVCDispatcher.setRC(context);
        assertEquals(context, JVCDispatcher.getRC());

        // Test case 7: Test if getRC() returns null after clearing all contexts
        JVCDispatcher.clearRC();
        assertNull(JVCDispatcher.getRC());

        // Test case 8: Test if getRC() returns null after clearing all contexts again
        JVCDispatcher.clearRC();
        assertNull(JVCDispatcher.getRC());

        // Test case 9: Test if getRC() returns the same context after setting it again
        JVCDispatcher.setRC(context);
        assertEquals(context, JVCDispatcher.getRC());

        // Test case 10: Test if getRC() returns null after clearing all contexts
        JVCDispatcher.clearRC();
        assertNull(JVCDispatcher.getRC());
    }
}