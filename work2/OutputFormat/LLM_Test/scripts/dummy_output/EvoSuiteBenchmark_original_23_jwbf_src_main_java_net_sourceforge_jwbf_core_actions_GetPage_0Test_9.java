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
		public final GetPage msg;

		public GetPage_0Test(HttpAction p) {
			// Constructor: use factory
			msg = new GetPage(p);
		}

		@Test  
		public void testHasMoreMessages() throws ProcessException {
			assertTrue(msg.hasMoreMessages());
		}

}