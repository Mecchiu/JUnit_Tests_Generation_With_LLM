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
		 * Unit test for {@link NDC#getContextStack()} method.
		 */
		@Test
		public void getContextStack() {
			NDC _ctx = new NDC();
			assertArrayEquals(_ctx.getContextStack(), new Message[] {});
		}
}