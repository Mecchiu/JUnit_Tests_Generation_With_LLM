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
	void testGetPage() {
		String url = "http://get.wikipedia.org";
		ContentProcessable c = new GetPage(url);
		HttpActionClient cc = new HttpActionClient();
		String result = cc.performAction(c);
		assertEquals("Test for "+(UrlParser._.getServerName(url)+":"+UrlParser._.getServerPort(url)) +" is correct.",
		"<pre>Welcome to the " +UrlParser._.getServerName(url)+":"+UrlParser._.getServerPort(url)+" wiki.</pre>", result);
		assertTrue("URL isn't correct.",!url.contains("http://"));
	}

	@Test
	void testGetContent() {
		String url = "http://www.my.wikipedia.org/";
		ContentProcessable c = new Get(url);
		HttpActionClient cc = new HttpActionClient();
		String result = cc.performAction(c);
		assertEquals("Test for "+(UrlParser._.getServerName(url)+":"+UrlParser._.getServerPort(url)) +" is correct.",
		"<pre>Welcome to the " +UrlParser._.getServerName(url)+":"+UrlParser._.getServerPort(url)+" wiki.</pre>", result);
		assertTrue("URL isn't correct.",!url.contains("http://"));
	}

	@Test
	void testPostContent() {
		String url = "http://get.wiktionary.org/";
		ContentProcessable c = new Get(url);
		c.setValue(url);
		HttpActionClient cc = new HttpActionClient();
		String result = cc.performAction(c);
		assertEquals("Test for "+(UrlParser._.getServerName(url)+":"+UrlParser._.getServerPort(url)) +" is correct.",
		"<pre>Welcome to the " +UrlParser._.getServerName(url)+":"+UrlParser._.getServerPort(url)+" wiki.</pre>", result);
		assertTrue("URL isn't correct.",!url.contains("http://"));
	}

	@Test(expected = ActionException.class)
	void testPostPage() throws MalformedURLException,
					  ProcessException {
		String url = "http://wiki.wiktionary.org/";
		ContentProcessable c = new GetPage(url);
		HttpActionClient cc = new HttpActionClient();
		cc.performAction(c, null);
	}

}