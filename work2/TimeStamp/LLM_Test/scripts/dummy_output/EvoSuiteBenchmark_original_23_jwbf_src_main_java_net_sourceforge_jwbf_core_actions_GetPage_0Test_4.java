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
		 * Tests method hasMoreMessages
		 */
	@Test
    public void hasMoreMessages_NoMore() {
        GetPage msg = new GetPage(null, "uft8");
        assertFalse(msg.hasMoreMessages());
    }


		/**
		 * Tests method hasMoreMessages
		 */
	@Test
    public void hasMoreMessages_Next() {
        GetPage msg = new GetPage("", "uft5");
        System.out.println("hasMoreMessages: == " + msg.hasMoreMessages());
        assertTrue(msg.hasMoreMessages());
    }


		/**
		 * Tests method hasMoreMessages
		 */
	@Test
    public void hasMoreMessages_Too() {
        GetPage msg = new GetPage("", "");
        assertFalse(msg.hasMoreMessages());
    }


		/**
		 * Tests method getNextMessage
		 */
	@Test
    public void getNextMessage_NoMore() throws ProcessException {
        HttpAction a = msg.getNextMessage();
        assertNotNull(a);
        assertTrue(a.getContentType().contains("application/xml"));
        assertTrue(a.getDescription().contains("/index.php?feeds=rss"));
    }

        /**
		 * Tests method getNextMessage
		 */
	@Test
    public void getNextMessage_Too() throws ProcessException, ProcessException {
        HttpAction a = msg.getNextMessage();
        a.setURI(new URI("").setPath("/index.php"));
        assertNotNull(a);
        assertTrue(a.getContentType().contains("application/xml"));
        assertTrue(a.getDescription().contains("/index.php?feeds=rss"));
        assertNotNull(a.getHttpAction());
        assertEquals(new URI("").setPath("/index.php"),
            a.getHttpAction().getURI());
    }

}