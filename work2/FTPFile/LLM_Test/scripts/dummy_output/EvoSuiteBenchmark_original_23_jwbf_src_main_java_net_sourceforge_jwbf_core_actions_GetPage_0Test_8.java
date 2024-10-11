// GetPage_0Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains one unit test case for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_0Test {
		
	void testGetPage_0() {
		// A valid getRequest
		// A valid getResult
		// A request with null result
		// A wrong charset
		// A request with invalid result
		// A request with missing parameters
		HttpAction msg = new HttpAction("/index.php?title=Special:Recentchanges&feed=rss", null);
		boolean result = msg.isValid();
		assertTrue(result);
		assertFalse(msg.hasMoreParameters());
		assertFalse(msg.hasResultAsList());
		assertNull(msg.getParameter("charset"));
		assertNull(msg.getMessage());
		assertTrue(getNextMessage.isSelfExecuter());
	}
	
	@Test
	void testGetNextMessage_0() {
		// A valid getRequest
		// A valid getResult
		// A request with null result
		// A request with missing parameters
		final HttpAction msg = new HttpAction("/index.php?title=Special:Recentchanges&feed=rss", null);
		ProcessException pe = null;
		try {
			getNextMessage.execute(msg);
		} catch (Throwable t) {
			processException(pe);
			assertNotNull(msg.getMessage());
			assertNotNull(msg.getResult());
		} finally {
			assertNotNull(msg.getMessage());
			assertNotNull(msg.getResult());
			assertNotNull(getNextMessage.getMessage().get());
			assertNull(getNextMessage.getResult());
		}
	}
	
	@Test
	void testProcessReturningText_0() throws ProcessException {
		// a valid get request
		// a valid get result
		// a request with result
		// a wrong charset
		// a request with missing parameters
		HttpAction msg = new HttpAction("/index.php?title=Special:Recentchanges&feed=rss", null);
		ProcessException pe = null;
		try {
			msg.getResult();
		} catch (Throwable t) {
			ProcessException tmp = pe;
			pe = t;
		} finally {
			assertNotNull(msg.getResult());
			assertNotNull(msg.getMessage());
			assertNotNull(pe.get());
		}
	}
	
	@Test
	void testGetCharset_0() {
		// A valid getRequest
		// A valid getResult
		// A request with result
		// A wrong charset
		// a request with missing parameters
		// a request with wrong charset
		HttpAction msg = new HttpAction("/index.php?title=Special:Recentchanges&feed=rss", "utf-8");
		ProcessException pe = null;
		try {
			msg.getCharset();
			fail();
		} catch (Throwable t) {
			ProcessException tt = t;
			while (tt!= pe){
				tt = tt.getCause();
			}
			assertNotNull(pe);
			assertNotNull(msg.getCharset());
		}
		assertTrue(msg.hasResultAsList());
	}
	
	@Test
	void testProcessingException_0() {
		// A valid getRequest
		// a valid get result
		// a request with result
		// a wrong charset
		// a request with missing parameters
		// a request with wrong charset
		// a request with result
		HttpAction msg = new HttpAction("/index.php?title=Special:Recentchanges&feed=rss", null);
		ProcessException pe = null;
		try {
			msg.hasMoreMessages();
			fail();
		} catch (Throwable t) {
			ProcessException tt = t;
			while (tt!= pe){
				tt = tt.getCause();
			}
			assertNotNull(pe);
			assertNotNull(msg.hasMoreMessages());
		}
		assertTrue(msg.isValid());
	}
	
	@Test
	void testGetCharset_1() {
		HttpAction msg = new HttpAction("/index.php?title=Special:Recentchanges&feed=rss", "utf-8");
		assertNotNull(msg.getCharset());
	}
	
}