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
		
	private final TestInstance testInstance = new TestInstance();

    @Test
    void assertEquals() throws Exception {
        assertNotNull(testInstance.message);
	}
	
    @Test
    void assertEqualsMessage() throws Exception {
        assertNotNull(testInstance.message);
        assertTrue(testInstance.message.message.toString().compareTo(NDC.NDC.get(testInstance.message)) == 0);
    }
}

//NDC.java