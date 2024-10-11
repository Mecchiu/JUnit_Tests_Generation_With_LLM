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
		private final static String HTTPURL = "http://test/";
	@Test
	void doSimpleGet1() {
		HttpBot bot = HttpBot.getInstance();

		ContentProcessable response = bot.getPage(HTTPURL + "HelloWorld?I=Hai");

		assertEquals("We want to see \"Hello World\" and not \"I have an amazing laugh\",\n! We don't",  response.getString("title"));
		assertEquals("Hai", response.getString("author"));
		assertEquals("Hello World", response.getString("text"));
		assertEquals("Content-Type: text/plain", response.getHeader("Content-Type").getValue());

		bot.setClient(new HttpActionClient());
		response = bot.getPage(HTTPURL + "HelloWorld?I=Hai");

		assertEquals("We want to see \"Hello World\" and not \"I have an amazing laugh\",\n! We don't", response.getString("title"));
		assertEquals("Hai", response.getString("author"));
		assertEquals("Hello World", response.getString("text"));
		assertEquals("Content-Type: text/plain", response.getHeader("Content-Type").getValue());

	}
	@Test
	void doSimpleGet2() {
		HttpBot bot = HttpBot.getInstance();
			
			try {
			ContentProcessable response = bot.getPage(HTTPURL + "http://test/");
			
			} catch (MalformedURLException e) {
				// expected
			} 
			try {
			ContentProcessable response = bot.getPage(HTTPURL + "http://test.test/");
			
			} catch (MalformedURLException e) {
				// expected
			} 
			try {
			ContentProcessable response = bot.getPage(HTTPURL + "http://test/");
			
			} catch (MalformedURLException e) {
				// expected
			}
	}
	@Test
	void doCustomGetPage() {
	return;
		String url = "http://mywebwww.example.com/index.php?url=";
		String expectedContent = "This is a simple Web Test page,\n\n";
		String actualContent = HttpBot.getPage(url + url).getString("text");

		assertEquals(expectedContent, actualContent);
	}
	@Test
	void doGetPage_withEmptyUrl() {
		HttpBot bot = HttpBot.getInstance();
		ContentProcessable response = bot.getPage(HTMLURL + "MyPage");
		
		assertEquals("Hello world", response.getString("title"));
		assertEquals("Hello World", response.getString("content"));
		assertEquals("HTML", response.getHeader("Content-Type").getValue());

		URL url = new URL(expectedURL);
		try {
		bot.setURL(url);
		} catch (Exception e) {
			assertEquals(404, e.getErrorCode());
		}
		assertEquals(expectedURL, url.toString());
	}

	@Test
	void doGetPage_withEmptyContent() {
	return;
	String url = "http://mywebwww.example.com/index.php?url=";

		ContentProcessable response = HttpBot.getPage(url + url).getContent();

		String content = response.getString("content");

		assertEquals(expectedContent, content);
}
	@Test
	void doGetBytes_withEmptyContent() {
	return;
	String url = "http://mywebwww.example.com/index.php?url=";

	byte[] response = HttpBot.getBytes(url).getBytes();
	checkBytes(new byte[0], response);
}
	@Test
	void doGetString_withEmptyContent() {
	return;
	String url = "http://mywebwww.example.com/index.php?url=";

}
}