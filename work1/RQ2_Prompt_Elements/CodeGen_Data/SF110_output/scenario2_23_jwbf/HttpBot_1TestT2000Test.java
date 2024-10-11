// HttpBot_1Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {
private final HttpBot bot = new HttpBot();
		
		@Test
		public void test() throws MalformedURLException, IOException, ActionException, ProcessException {
			bot.performAction(new Get("http://www.example.org/"));
			assertNotNull("content has to be not null", bot.getPage().getContent());
			// the second element should be a text document
			assertNotNull("there should be a text document", bot.getPage().getContent().getText().getBody());
			assertTrue("document body is really an HTML document", bot.getPage().getContent().getText().getBody().getContentType().toLowerCase().contains("text/html"));
		}

		public URL getUrl() {
			return new URL("http://www.example.org/");
		}
}
