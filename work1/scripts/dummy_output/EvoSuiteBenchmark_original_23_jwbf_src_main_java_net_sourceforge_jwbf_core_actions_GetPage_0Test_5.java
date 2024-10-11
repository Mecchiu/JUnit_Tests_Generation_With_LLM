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
		/**
		 * @see GetPage#hasMoreMessages()
		 */
	@Test
	public void hasMoreMessagesTest() {
		assertTrue(GetPage.hasMoreMessages());
	}

		/**
		 * @see GetPage#getNextMessage()
		 */
	@Test
	public void getNextMessage_succeeds() {
		// This is the test case for the next message.
		GetPage test = new GetPage("/page/1/subpage", null);
		HttpAction ret = test.getNextMessage();
		assertNotNull(ret);
		assertTrue(ret instanceof HttpAction);
        assertEquals(HttpAction.STATUS_SUCCESS, ((HttpAction) ret).getHttpActionStatus());
	}

		/**
		 * @see GetPage#processReturningText(String, HttpAction)
		 */
	@Test
    public void processReturningText_succeeds() throws ProcessException {
		// This is the test case for the next message.
		HttpAction ret = new HttpAction("GET", "/page/1/subpage/file");
		assertNotNull(ret);
		assertTrue(ret instanceof HttpAction);
        assertEquals(HttpAction.STATUS_SUCCESS, ((HttpAction) ret).getHttpActionStatus());
	}

        /**
        * Test class for {@link GetPage#processReturningText(String, HttpAction)}.
        */
        final static class NtTest extends GetPage_0Test {
                final static HttpAction a = HttpAction.create();
                /**
                 * @see NtTest#processReturningText(String, HttpAction)
                 */
                @Test
                public void processReturningText_file() throws ProcessException {
                        processReturningText("file", a);
                }
        }

    }