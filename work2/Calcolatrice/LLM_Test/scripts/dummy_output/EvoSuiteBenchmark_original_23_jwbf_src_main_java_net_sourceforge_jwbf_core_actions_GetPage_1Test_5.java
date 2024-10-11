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
		GetPage() {
			//TestCase.assertNoOutbox();
		}

		void testProcessReturningText() throws ProcessException {
			assertEquals("test", getText());
//			HttpAction hm = HttpAction.makeDelete();
//      hm.addInputParam("title", "title.html");
//      hm.addInputParam("href", "/index.php?title=Special:Recentchanges&feed=rss");
//			hm = HttpAction.makePost();
//			hm.addInputParam("html", getText());
//      getNextAction().returningText(hm, null);
//			assertEquals("special", getNextAction().request().getUrlParameter("title"));
//      getNextAction().returningText(hm, null);
//			assertNull(getNextAction().request().getUrlParameter("title"));
//      //getNextAction().returningText(hm, null);
//    }

		HttpAction getNextAction() {
			return new HttpAction();
		}

		GetPage getThis() {
			return new GetPage();
		}

}