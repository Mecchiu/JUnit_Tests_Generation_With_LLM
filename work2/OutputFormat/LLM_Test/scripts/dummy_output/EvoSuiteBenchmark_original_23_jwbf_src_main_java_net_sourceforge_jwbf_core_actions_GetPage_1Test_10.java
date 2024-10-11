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
		 * @throws Exception
		 */
		@Test
		public void test() throws Exception {
			try (ContentProcessable<HttpAction> cpr2 = new GetPage("http://localhost");) {
			}
		}

		/**
		 * @throws Exception
		 * @see ProcessActionTest#test()
		 */
		@Test
		public void test() throws Exception {
			try (ContentProcessable<HttpAction> cpr = new GetPage("http://localhost");) {
			}
		}
}