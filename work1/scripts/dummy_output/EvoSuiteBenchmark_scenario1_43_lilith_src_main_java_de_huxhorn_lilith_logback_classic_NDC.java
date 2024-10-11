// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		
	@Test
	void testGetContextStack() {
		NDC.ndcAdapter = new NDCAdapter() {
			@Override
			public Message[] getContextStack() {
				return new Message[] {
					new Message("Test1"),
					new Message("Test2"),
					new Message("Test3"),
				};
			}
		};
		Message[] result = NDC.getContextStack();
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals("Test1", result[0].getMessage());
		assertEquals("Test2", result[1].getMessage());
		assertEquals("Test3", result[2].getMessage());
	}
}