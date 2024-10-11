// Test class of NonBlockingClientHandler
package org.quickserver.net.server.impl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NonBlockingClientHandlerTest {

    @Test
    void testGetWakeupSelectorAfterRegisterWrite() {
        // Test default value
        assertFalse(NonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite());

        // Test setting value to true
        NonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(true);
        assertTrue(NonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite());

        // Test setting value back to false
        NonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(false);
        assertFalse(NonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite());
    }
}