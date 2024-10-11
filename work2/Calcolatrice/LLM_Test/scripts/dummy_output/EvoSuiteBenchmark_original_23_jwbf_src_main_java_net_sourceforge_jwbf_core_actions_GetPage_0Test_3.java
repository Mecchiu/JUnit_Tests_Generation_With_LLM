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
		 * @param hasMore
		 */
		public GetPage_0Test(boolean hasMore) {
				this();
		}
		final static String url = "/index.php?title=Special:Recentchanges;rss";
		final static String expected = "";
		/**
		 * @see GetPage#hasMoreMessages()
		*/
		@Test
		public void testHasMoreMessages() {
				if (hasMore) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
		}
		/**
		 * @see GetPage#processReturningText(String, HttpAction)
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		public void testProcessReturningText() throws ProcessException {
				String text = null;
				HttpAction httpAction = null;
				try {
						httpAction = new HttpAction(url);
						text = httpAction.processReturningText(expected, httpAction);
				} catch (ProcessException e) {
						fail("Unexpected exception: " + e);
				}
				assertEquals(expected.replaceFirst(":rss", ":news"), text);
		}
}