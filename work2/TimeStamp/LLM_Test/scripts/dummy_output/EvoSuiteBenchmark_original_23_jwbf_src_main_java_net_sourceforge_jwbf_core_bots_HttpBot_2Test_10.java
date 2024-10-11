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
		
		/**
		 * test
		*
		* @throws MalformedURLException
		* @throws IOException ioexception
		* @throws ProcessException processexception
		*/
	@Test
	void test() throws MalformedURLException, IOException, ProcessException {
			
		
		String url = "http://www.yourownWiki.org/wiki/";
		// String url = "http://www.yourOwnWiki.org/wiki/";
		
		HTTPClient.setUrl(url);
		HttpActionClient b = HTTPClient.getClient();
		
		// test
		String page = URLDecoder.decode(b.getPage(url), "utf-8");
		
		// error
		try {
				page = URLDecoder.decode(b.getPage("http://"), "utf-8");
		} catch (ActionException e) {
				fail(b.getExceptionMessage(e));
		} catch (ProcessException pe) {
				fail(b.getExceptionMessage(pe));
		}
		
		// result
		assertEquals("Not found",getResponseStatus());
		
		boolean found =  b.getExpectedResult("404");
		assertTrue(found);

		
		
		
		
		
		
		
		// test
		page = URLDecoder.decode(page, "utf-8");
		assertTrue(page.endsWith("Main_Page"));
		
		
		
		
	}

}

/*

* TODO test
{@link HttpBot#getPage(String)}

* test

{@link HttpBot#getURL()}
{@link HttpBot#getPage(String)}

* test

* test

*/