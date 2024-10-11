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
		
	private final static String TEST_MESSAGE = "Test Message";
	
	@Test
    public void testGetContextStack() {
        final NDC ndc = new NDC();

        final Message message = new Message(TEST_MESSAGE);
        
        final NDC.Message[] result = ((ndc.getContextStack() == null)? ndc.getContextStack() : new NDC.Message[0]);
        
        assertEquals("ndc.getContextStack() should return an empty array in this case.", result.length, 0);    
    }
	
}