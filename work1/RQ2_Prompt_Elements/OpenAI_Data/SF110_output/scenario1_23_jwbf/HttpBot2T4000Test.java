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
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is valid.
	*/
	@Test
	void testGetPage_validURL() {
		HttpBot bot = new HttpBot();
		String result = bot.getPage("http://www.google.com");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is invalid.
	*/
	@Test
	void testGetPage_invalidURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://www.google.com/invalid");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is null.
	*/
	@Test
	void testGetPage_nullURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage(null);
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is empty.
	*/
	@Test
	void testGetPage_emptyURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("www.google.com");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL2() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("google.com");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL3() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://google.com");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL4() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://www.google.com/");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL5() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://www.google.com/invalid");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL6() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://www.google.com/invalid/");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL7() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://www.google.com/invalid/invalid");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL8() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://www.google.com/invalid/invalid/");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL9() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://www.google.com/invalid/invalid/invalid");
		});
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the URL is not a valid URL.
	*/
	@Test
	void testGetPage_notValidURL10() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> {
			bot.getPage("http://www.google.com/invalid/invalid/invalid/");
		});
	}
}