// GetPage_1Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains one unit test case for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_1Test {

	/**
	 * Test method for
	 * {@link GetPage#getReturningText(String, HttpAction)}.
	 * @throws ProcessException throws any problem inside the method
	 */
	@Test public void testGetReturningText() throws ProcessException {
		final String rText = HttpAction.GET.doGet();
		assertNotNull(rText);
	}
}