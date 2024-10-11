// GetPageTest.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPageTest {
		
	/**
	 * Test method for {@link GetPage#hasMoreMessages()}.
	 */
	@Test
	void testHasMoreMessages() {
		GetPage gp = new GetPage();
		assertFalse(gp.hasMoreMessages());
	}
}