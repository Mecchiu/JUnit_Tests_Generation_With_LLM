// HttpBot_3Test.java
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
* It contains one unit test case for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {
		 static final String TEST_JOURNAL_DIR = "test.html";
		 static final String TEST_FILENAME = "test.html";
		 HttpBot bot;

		 {
		   URL url = HTTPRule.newURL("http://localhost:" + TEST_PORT + "/" + TEST_FILENAME);
		 }

		 @Test
		 void emptyServerHostNoParams() {
			 final URL url = HTTPRule.newURL("http://localhost:8080/");
			 final String page = bot.getPage(url);
			 assertNull("Should throw exception for empty host", page);
		 }

		 @Test
		 void invalidHTTPAddressing() {
			 /*
			 String host = "http://localhost";
			 String file = "index.php?title=";
			 */
			 final URL url = HTTPRule.newURL("http://localhost:" + TEST_PORT + "/");
			 final String page = bot.getPage(url);
			 final String msg = "Invalid content";
			 assertEquals(msg, page);
			 assertTrue(url.getContent().length() > 0);
		 }

		 @Test
		 void invalidHTTPAddressingNoParams() {
			 /*
			 URL url = HTTPRule.newURL("http://localhost:" + "8080/");
			 String page = bot.getPage(url);
			 assertNull(page);
			 */
			 final URL url = HTTPRule.newURL("http://localhost:8080/");
			 final String page = bot.getPage(url);
			 final String msg = "Invalid content";
			 assertEquals(msg, page);
			 assertTrue(url.getContent().length() > 0);
		 }

		 /**
		 * @throws OperationException
		 *          if it fails
		 */
		 @Test
		 void badHost() {
			 final URL url = HTTPRule.newURL("http://localhost");
			 try {
				 final String page = bot.getPage(url);
				 assertNull(page);
			 } catch (OperationException ce) {
				 assertEquals("Unable to get the page url", ce.getMessage());
			 }
		 }

		 @Test
		 void badParams()
				throws IOException {
         final String page = HTTPRule.newPage(new URL("http://localhost"), 0);
         assertNull(page);
         final String page2 = HTTPRule.newPage(new URL("http://localhost:0"), 0);
         assertNull(page2);
         final String page3 = HTTPRule.newPage(new URL("http://localhost:8000/"), 0);
         assertNull(page3);
		 }
}