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
* It contains ten unit test cases for the {@link HttpBot#getPage(String)} method.
*/
class HttpBotTest {
		
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with a valid URL.
	 */
	@Test
	void testGetPageValidURL() {
		HttpBot bot = new HttpBot();
		String url = "https://www.google.com";
		String result = bot.getPage(url);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with an invalid URL.
	 */
	@Test
	void testGetPageInvalidURL() {
		HttpBot bot = new HttpBot();
		String url = "https://www.google.com/invalid";
		String result = bot.getPage(url);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with a null URL.
	 */
	@Test
	void testGetPageNullURL() {
		HttpBot bot = new HttpBot();
		String url = null;
		String result = bot.getPage(url);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with an empty URL.
	 */
	@Test
	void testGetPageEmptyURL() {
		HttpBot bot = new HttpBot();
		String url = "";
		String result = bot.getPage(url);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with a URL that contains a space.
	 */
	@Test
	void testGetPageURLWithSpace() {
		HttpBot bot = new HttpBot();
		String url = "https://www.google.com/invalid url";
		String result = bot.getPage(url);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with a URL that contains a tab.
	 */
	@Test
	void testGetPageURLWithTab() {
		HttpBot bot = new HttpBot();
		String url = "https://www.google.com/invalid\turl";
		String result = bot.getPage(url);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with a URL that contains a newline.
	 */
	@Test
	void testGetPageURLWithNewline() {
		HttpBot bot = new HttpBot();
		String url = "https://www.google.com/invalid\nurl";
		String result = bot.getPage(url);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with a URL that contains a carriage return.
	 */
	@Test
	void testGetPageURLWithCarriageReturn() {
		HttpBot bot = new HttpBot();
		String url = "https://www.google.com/invalid\rurl";
		String result = bot.getPage(url);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with a URL that contains a form feed.
	 */
	@Test
	void testGetPageURLWithFormFeed() {
		HttpBot bot = new HttpBot();
		String url = "https://www.google.com/invalid\furl";
		String result = bot.getPage(url);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link HttpBot#getPage(String)}
	 * with a URL that contains a backspace.
	 */
	@Test
	void testGetPageURLWithBackspace() {
		HttpBot bot = new HttpBot();
		String url = "https://www.google.com/invalid\burl";
		String result = bot.getPage(url);
		assertNull(result);
	}
}