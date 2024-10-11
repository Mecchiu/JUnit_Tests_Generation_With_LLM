// HttpBotTest.java
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
* It contains ten unit test cases for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBotTest {

	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link GetPage} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetPage() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage(new URL("http://www.google.com"));
		String result = bot.performAction(getPage);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link Get} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGet() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot();
		Get get = new Get(new URL("http://www.google.com"));
		String result = bot.performAction(get);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link GetPage} object and a {@link HttpActionClient} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetPageWithHttpActionClient() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot(new HttpActionClient());
		GetPage getPage = new GetPage(new URL("http://www.google.com"));
		String result = bot.performAction(getPage);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link Get} object and a {@link HttpActionClient} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetWithHttpActionClient() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot(new HttpActionClient());
		Get get = new Get(new URL("http://www.google.com"));
		String result = bot.performAction(get);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link GetPage} object and a {@link HttpActionClient} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetPageWithHttpActionClientAndUserAgent() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot(new HttpActionClient("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0"));
		GetPage getPage = new GetPage(new URL("http://www.google.com"));
		String result = bot.performAction(getPage);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link Get} object and a {@link HttpActionClient} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetWithHttpActionClientAndUserAgent() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot(new HttpActionClient("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0"));
		Get get = new Get(new URL("http://www.google.com"));
		String result = bot.performAction(get);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link GetPage} object and a {@link HttpActionClient} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetPageWithHttpActionClientAndUserAgentAndProxy() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot(new HttpActionClient("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0", "127.0.0.1", 8080));
		GetPage getPage = new GetPage(new URL("http://www.google.com"));
		String result = bot.performAction(getPage);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link Get} object and a {@link HttpActionClient} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetWithHttpActionClientAndUserAgentAndProxy() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot(new HttpActionClient("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0", "127.0.0.1", 8080));
		Get get = new Get(new URL("http://www.google.com"));
		String result = bot.performAction(get);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link GetPage} object and a {@link HttpActionClient} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetPageWithHttpActionClientAndUserAgentAndProxyAndCredentials() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot(new HttpActionClient("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0", "127.0.0.1", 8080, "username", "password"));
		GetPage getPage = new GetPage(new URL("http://www.google.com"));
		String result = bot.performAction(getPage);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#performAction(ContentProcessable)}
	 * with a {@link Get} object and a {@link HttpActionClient} object.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	public void testPerformActionGetWithHttpActionClientAndUserAgentAndProxyAndCredentials() throws MalformedURLException, IOException, ActionException, ProcessException {
		HttpBot bot = new HttpBot(new HttpActionClient("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0", "127.0.0.1", 8080, "username", "password"));
		Get get = new Get(new URL("http://www.google.com"));
		String result = bot.performAction(get);
		assertNotNull(result);
	}
}