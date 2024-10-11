// HttpBot_2Test.java
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
* It contains one unit test case for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {
		
	@Test
	void doSimpleRequest() throws MalformedURLException, IOException, ActionException {
		final String hostUrl = "http://www.yourOwnWiki.org/wiki/";

		final HttpBot bot = new HttpBot(hostUrl);

		final URL url = new URL(hostUrl + "index.php?title=Main_Page");

		final byte[] bytes = new byte[0];

		final ContentProcessable processable = new GetPage(url, bytes);

		final String text = bot.getPage(processable);

		assertNotNull(text);
	}

}