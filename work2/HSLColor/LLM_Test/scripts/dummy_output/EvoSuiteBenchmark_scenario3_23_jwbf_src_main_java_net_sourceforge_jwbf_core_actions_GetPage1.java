// GetPageTest.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPageTest {
		
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException on any problems with inner browser
	 */
	@Test
	void testProcessReturningText() throws ProcessException {
		GetPage gp = new GetPage();
		assertEquals("", gp.processReturningText("", null));
		assertEquals("", gp.processReturningText(null, null));
		assertEquals("", gp.processReturningText("", new HttpAction()));
		assertEquals("", gp.processReturningText(null, new HttpAction()));
		assertEquals("", gp.processReturningText("", new HttpAction()));
		assertEquals("", gp.processReturningText(null, new HttpAction()));
		assertEquals("", gp.processReturningText("", new HttpAction()));
		assertEquals("", gp.processReturningText(null, new HttpAction()));
		assertEquals("", gp.processReturningText("", new HttpAction()));
		assertEquals("", gp.processReturningText(null, new HttpAction()));
	}
}