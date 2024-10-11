// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains one unit test case for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		
    /**
     * @throws Exception
     * in case of an error.
     */
    @Test
    public void testContextStack() throws Exception {
        assertNotNull(NDC.getContextStack());
    }

    /**
     * @throws Exception
     * in case of an error.
     */
    @Test
    public void testGetContextStack() throws Exception {
        Message[] messages = NDC.getContextStack();
        for (Message message : messages) {
            assertNotNull(message.getMessage());
        }
        // null value in the first element of the array indicates an error.
        assertNotNull(messages[0]);
        assertEquals(8, messages[0]);
    }
}