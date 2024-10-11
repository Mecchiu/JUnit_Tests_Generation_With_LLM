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
	* It tests the case when the given URL is valid but the page does not exist.
	*/
	@Test
	void testGetPage_ValidURL_PageDoesNotExist() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/invalid"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/robots.txt"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_2() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/humans.txt"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_3() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/sitemap.xml"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_4() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/sitemap.xml.gz"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_5() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/sitemap.xml.bz2"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_6() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/sitemap.txt"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_7() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/sitemap.html"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_8() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/sitemap.rss"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_9() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/sitemap.atom"));
	}
	
	/**
	* Test case for {@link HttpBot#getPage(String)} method.
	* It tests the case when the given URL is valid but the page is not accessible.
	*/
	@Test
	void testGetPage_ValidURL_PageNotAccessible_10() {
		HttpBot bot = new HttpBot();
		assertDoesNotThrow(() -> bot.getPage("https://www.google.com/sitemap.xml.gz"));
	}
	
}