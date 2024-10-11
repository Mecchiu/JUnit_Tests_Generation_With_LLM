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
		HttpBot_1Test() {
		}

		@Test
		public void performActionNullAction() {
			final HttpBot bot = new HttpBot(null);
			try {
				final byte[] htmlData = "{\"HTML\":\"<div>Lorem ipsum</div></Lorem.gif" + new String("</div><p>Lorem ipsum</p>\"".getBytes("utf-8"));
				final byte[] xmlData = new byte[]{'o', 'l', 'e','s','', 'a', 'n', 'p', (byte) 0x00, 0x00, 0x00, (byte) 0xC0, 'o', 'n', 'v', 'e', 'r', 'i','s','', '"'};
				final GetPage page = new GetPage("http://www.yourOwnWiki.org/wiki/", htmlData);

				final ContentProcessable actionResult = bot.getPage(page);

				if (!actionResult.equals(page)) {
					System.err.println(page.getHeader() + " == " + actionResult);
					fail("Expected page to be getPage(\"http://www.yourOwnWiki.org/wiki/\",\"HTML\")");
				}
			} catch (final ProcessException e) {
				fail("Exception thrown");
			}
		}
}