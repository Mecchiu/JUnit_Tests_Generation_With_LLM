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
		 * Test, whether
		 * {@link HttpBot#getPage(String)} throws an {@link ActionException} when an
		 * invalid query is provided
		*/
	@Test
	public void testGetPage_6() {
			/**
			 * test, whether a <a href="http://www.www.yourown.no")/>links</a> will
			 * return an error
			 */
		getClient().post("http://www.yourown.no", "text/html", "/", null, ContentProcessable.NO_CONTENT);

		assertThrows(ActionException.class, () -> getClient().
				getPage("text/html?href=/my/path/link/not/existing")
		);
		assertThrows(ActionException.class, () -> getClient().getPage("text/html?href=my/path/link/not/existing")
		);

		assertThrows(ActionException.class, () -> getClient().getPage("bla/bla/path/link/not/existing"));
		assertThrows(ActionException.class, () -> getClient().getPage("bla/bla/path/link/not/existing?foo"));


		HttpActionClient cc = new HttpActionClient(null, null);

		assertEquals("http://www.yourown.no", cc.getHostUrl());

		// test, whether the action returns all the expected text and body of the page
		getClient().getPage(null);
		getClient().getPage("");
		getClient().getPage("bla/bla/path/link");
		getClient().getPage("bla/bla/path");

		assertEquals("text/html",
				getClient().getPage("text/html").getContentType().getText()
		);

		String htmlBody = getClient().getPage("/").getContent();
		String html = getClient().getPage("/").toString();

		assertEquals("<base><a href=\"http://www.yourown.no\">text/html</a><br>", htmlBody);
		assertEquals("<br><i><a href=\"http://www.www.yourown.no\">text/html</a><br>", html);

		try {
			getClient().getPage("/my/path/link");
			getClient().getPage("http://www.yourown.no/my/path/link");
			getClient().getPage("http://www.yourown.no");
		} catch (ActionException e) {
			assertNull(e.getErr());
		}

		getClient().getPage("http://www.www.yourown.no/my/path");
		// test, whether the error is thrown by some other action
		// e.g. "The page of /my/path was not found"
		getClient().getPage("text/html", "bla/bla");

		File dir = new File("/home/nosthi/Downloads/").getAbsoluteFile();
		// tests:
		assertTrue(0!= HTMLFilter.test(new HTMLFilter() {
				protected void execute(String value, Map<String, Object> params) {
					assertEquals("my", value);
					assertTrue(params.containsKey("f"));
					assertEquals(new URL("http://www.yourown.no/main_page"), params.get("f"));
				}
			}));
		// tests:
		try {
			getClient().getPage("/my/path/link/not/existing");
			getClient().getPage("http://www.yourown.no/my/path");
			getClient().getPage("/my/path/link/not/existing?foo");

			fail("a test might happen");
		} catch (ProcessException | ActionException e) {
			assertNotNull(e);
		}
		assertEquals("text/html",
				getClient().getPage("text/html", "bla/bla").getContentType().getText()
		);
	}

}