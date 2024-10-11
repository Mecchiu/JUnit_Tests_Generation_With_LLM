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
		 * Tests NDC methods.
		 */
		@Test
		public void testGetContextStack() {
				ndcAdapter.addMessage(new Message(2, "test"));
				Message[] messages = ndcAdapter.getContextStack();

				// assertAllElementsSame(messages, "test");
				Assert.assertTrue("Incorrect message", messages[0].getIndex() == 2);
		}
}
