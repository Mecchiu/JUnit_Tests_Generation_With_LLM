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
	 * Test method {@link NDC#getContextStack()}.
	*/
	@Test
    public void testGetContextStack() {
		
		assertArrayEquals(new Object[] {}, nullContextStack);
        
	}
		
}
