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
	 * Test method for {@link GetPage#getNextMessage()}.
	 */
	@Test
	void testGetNextMessage() {
		new GetPage("/", "");
	}

	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 */
	@Test
	void testProcessReturningText() {
		assertNotNull(new GetPage("/", "").getNextMessage());
	}
	
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException for any problems
	 */
	@Test
	void testProcessReturningText() throws ProcessException {
		HttpAction a = new HttpAction("/index.php", "uft-8");

		a = new GetPage(a, "");
		assertEquals(1, a.getBody().size());
		assertTrue(a.hasMore());
		assertEquals("/index.php?title=Recentchanges&feed=rss", a.getText());
	}
	
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException for any problems
	 * @throws HttpActionException for any other error
	 */
	@Test
	void testProcessingExceptionFromMessage() throws ProcessException, HttpActionException {
		HttpAction a = new HttpAction("/index.php", "uft-8");
		
		try {
			a = new GetPage(a, "");
		}
		catch(ProcessException e) {
			assertEquals(ProcessException.UNREADCONTENT.message(), e.getMessage());
		}
	}
	
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException for any problems
	 * @throws HttpActionException for any other error
	 */
	@Test
	void testProcessingHttpExceptionFromMessage() throws ProcessException, HttpActionException {
		HttpAction a = new HttpAction("/index.php", "uft-8");
		
		try {
			a = new GetPage(a, "");
		}
		catch(ProcessException e) {
			assertEquals(ProcessException.CONTENT_READ_ERROR.message(), e.getMessage());
		}
	}
}
