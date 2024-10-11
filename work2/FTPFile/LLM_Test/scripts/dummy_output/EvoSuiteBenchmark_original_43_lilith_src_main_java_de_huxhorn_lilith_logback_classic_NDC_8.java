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
		
    @Test
    void getContextStackShouldReturnEmptyArrayWhenStackIsEmpty() {
    	Message [] testArray = new Message[ 0 ];
		assertEquals(messageArray, new NDC().getContextStack());
    }
    
    @Test
    void getContextStackShouldReturnMessageArrayWhenTheElementOfTheStackIsAnArray() {
    	Message [] testArray = {
                new Message("message1", 5, true),
                new Message("message2", 4, false)
    	};
        assertTrue(messageArray.length > 0);
        assertEquals(testArray, new NDC().getContextStack());
    }

    /**
     * Test method.
     */
    @Test
    void isMessageStackShouldBeTrueWhenAnArrayIsProvidedInToString() {
        assertTrue(new NDC().isMessageStack());
    }
}