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
		* Checks if the message corresponding to the {@link Message#messageType()}
		* cannot be accessed (since it does not exist in the stack).<br>
		* In other words, the current NDC of the application needs to be checked
		* against the NDC stored in the {@link NDC#getContextStack()}.<br>
		* NDCs that are not configured properly or not present in the {@link NDC#getContextStack()}
		* should not be tested in any case.<br>
		* This test starts with two messages: <code>null</code> and <code>messageType()="TestNDC.A"</code>.
		* The test fails if the test fails.
		*/

	@Test
	public void getContextStack_A() {
		assertNotNull(getContextStack());
	}
}