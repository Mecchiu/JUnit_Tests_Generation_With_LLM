// HttpBot_0Test.java
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
* It contains one unit test case for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {
		static {
//	Set<String> set = new HashSet<String>();
//	set.add("http://www.yourOwnWiki.org/wiki/");
//	set.add("http://www.yourOwnWiki.org/wiki/");
//	HttpBot.setSet(set);
	}
	/**
	 * {@link HttpBot} can be used directly.
	 */
	// public static HttpBots getInstance() {
	// return new HttpBots();
	// }
	private static final int TOTAL_PAGE = 10;
	private static final String PAGE_NAME = "http://www.yourOwnWiki.org/wiki/index.php?title=Main_Page";

	private static final String REPO_URL = "http://www.myOwnWiki.org";

	/**
	 * Test method for {@link #performAction(net.sourceforge.jwbf.core.actions.ContentProcessable}
	 *.
	 *
	 * @throws Exception
	 * @deprecated use testAction(...)
	 */
	@Deprecated
	@Test
	public void testAction() throws Exception {
		HttpBot bot = HttpBot.getInstance();

		HttpActionClient c = bot.getClient();
		String result = c.getActionResultAsString("/page?page=1");
		assertEquals(c.getFormattedActionResult(), PAGE_NAME);
		assertEquals("index.php?title=Main_Page", result);
	}

	/**
	 * Test method for {@link #getUrl()}.
	 *
	 * @throws MalformedURLException
	 */
	@Test
	public void testGetUrl() throws MalformedURLException {
		HttpBot bot = HttpBot.getInstance();

		URL url = new URL(REPO_URL);
		String result = bot.getUrl(url);

		assertEquals(CMD.toString(), url.toString());
		assertEquals(REPO_URL, result);
	}

	/**
	 * Test method for {@link #getBytes(String)}.
	 *
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws MalformedURLException
	 */
	@Test
	public void testGetBytes_1() throws IOException, InterruptedException, ActionException, MalformedURLException {
		String result = HttpBot.getInstance().getBytes("index.php?title=Main_Page");
		assertEquals("index.php?title=Main_Page", result);
	}

	/**
	 * Test method for {@link HttpBot#getUrl(URL)}.
	 *
	 * @throws MalformedURLException
	 */
	@Test
	public void testGetUrl_2() throws MalformedURLException {
		String result = HttpBot.getInstance().getUrl(REPO_URL).toString();
		assertEquals(PAGE_NAME, result);
	}

	/**
	 * Test method for {@link HttpBot#performAction(net.sourceforge.jwbf.core.actions.ContentProcessable)}.
	 *
	 * @throws Exception
	 */
	@Test
	public void testPerformAction() throws Exception {
		HttpBot bot = HttpBot.getInstance();

		HttpActionClient c = bot.getClient();
		String content = c.performGetAction(new Get());

		assertEquals(URL.newInstance(REPO_URL).openStream().read(), content.length());
		// assertArrayEquals(new String[] { PAGE_NAME }, Arrays.asList(c.getActionResultAsString(urlToString(c.getActionResult(url))).split("\\r?\\n")));
		assertArrayEquals(new String[] { PAGE_NAME }, Arrays.asList(content));
	}

	/** Test method for {@link HttpBot#performAction(ContentProcessable)}. */
}