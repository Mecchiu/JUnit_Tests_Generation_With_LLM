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
		
	@Test
	void testPerformAction() {
		int i=getPage("index.php")-1;
		
		final String result = performAction("index " + (i+1));
		final String expected = "index.php "+(i+1);
		assertEquals("content is not equal", expected, result);
	}

	@Test
	void testPerformAction() throws MalformedURLException, ActionException, IOException {
		final String hostUrl = "http://www.yourOwnWiki.org/";
		final URL url = new URL(hostUrl);
		final String result = performAction(url);
		final String expected = hostUrl;
		assertEquals("URL is not equal", expected, result);
	}

	@Test
	void testPerformAction() {
		int i=getPage("index.php")-1;
		
		final byte[] bytes = getBytes("index.php");
		final URL url = new URL(new String(bytes));
		final String result = performAction(url);
		assertEquals("URL is not equal", result, bytes);
	}
}