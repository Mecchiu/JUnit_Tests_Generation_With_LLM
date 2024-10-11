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
		@Test
		void hasMoreMessagesAlwaysReturnsTrue() {
				GetPage msg = new GetPage(HtmlAction.create(1), "UTF-8");
				assertEquals(! hasMore, msg.hasMoreMessages());
		}
		@Test
		void alwaysReturnsTrue() {
				GetPage msg = new GetPage();
				assertEquals(true, msg.hasMoreMessages());
		}
}