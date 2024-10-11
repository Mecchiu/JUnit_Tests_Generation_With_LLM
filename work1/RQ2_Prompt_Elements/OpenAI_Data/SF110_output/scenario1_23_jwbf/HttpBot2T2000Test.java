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
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method returns the correct content of the given URL.
	*/
	@Test
	void testGetPage() {
		HttpBot bot = new HttpBot();
		String content = bot.getPage("https://www.google.com");
		assertTrue(content.contains("Google"));
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is malformed.
	*/
	@Test
	void testGetPageMalformedURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("https://www.google.com/test/test");
		});
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is null.
	*/
	@Test
	void testGetPageNullURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage(null);
		});
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is empty.
	*/
	@Test
	void testGetPageEmptyURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("");
		});
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not a valid URL.
	*/
	@Test
	void testGetPageInvalidURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("test");
		});
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not a valid URL.
	*/
	@Test
	void testGetPageInvalidURL2() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("test.com");
		});
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not a valid URL.
	*/
	@Test
	void testGetPageInvalidURL3() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("https://test");
		});
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not a valid URL.
	*/
	@Test
	void testGetPageInvalidURL4() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("https://test.com");
		});
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not a valid URL.
	*/
	@Test
	void testGetPageInvalidURL5() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("https://www.test");
		});
	}
	
	/**
	* Test case for the {@link HttpBot#getPage(String)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not a valid URL.
	*/
	@Test
	void testGetPageInvalidURL6() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("https://www.test.com");
		});
	}
}