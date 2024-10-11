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
	* It tests the case when the given URL is null.
	*/
	@Test
	void testGetPage_NullURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> bot.getPage(null));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is empty.
	*/
	@Test
	void testGetPage_EmptyURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> bot.getPage(""));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is invalid.
	*/
	@Test
	void testGetPage_InvalidURL() {
		HttpBot bot = new HttpBot();
		assertThrows(ActionException.class, () -> bot.getPage("invalid"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL2() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL3() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/search?q=test"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL4() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/search?q=test&oq=test"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL5() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/search?q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7&sourceid=chrome&ie=UTF-8"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL6() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/search?q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7&sourceid=chrome&ie=UTF-8&q=test"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL7() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/search?q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7&sourceid=chrome&ie=UTF-8&q=test&oq=test"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL8() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/search?q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7&sourceid=chrome&ie=UTF-8&q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL9() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/search?q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7&sourceid=chrome&ie=UTF-8&q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7&sourceid=chrome"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid.
	*/
	@Test
	void testGetPage_ValidURL10() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/search?q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7&sourceid=chrome&ie=UTF-8&q=test&oq=test&aqs=chrome..69i57j69i60l3j69i65l2.4123j0j7&sourceid=chrome&ie=UTF-8"));
	}
}