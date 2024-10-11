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
* It contains ten unit test cases for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBotTest {
		
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is null.
	 * Expected result: {@link NullPointerException}
	 */
	@Test
	void testGetBytes_NullURL() {
		HttpBot bot = new HttpBot();
		assertThrows(NullPointerException.class, () -> {
			bot.getBytes(null);
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is empty.
	 * Expected result: {@link IllegalArgumentException}
	 */
	@Test
	void testGetBytes_EmptyURL() {
		HttpBot bot = new HttpBot();
		assertThrows(IllegalArgumentException.class, () -> {
			bot.getBytes("");
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is not valid.
	 * Expected result: {@link MalformedURLException}
	 */
	@Test
	void testGetBytes_InvalidURL() {
		HttpBot bot = new HttpBot();
		assertThrows(MalformedURLException.class, () -> {
			bot.getBytes("invalid url");
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is valid but the server is not available.
	 * Expected result: {@link IOException}
	 */
	@Test
	void testGetBytes_ValidURL_ServerNotAvailable() {
		HttpBot bot = new HttpBot();
		assertThrows(IOException.class, () -> {
			bot.getBytes("http://localhost:8080/");
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is valid and the server is available but the page is not found.
	 * Expected result: {@link IOException}
	 */
	@Test
	void testGetBytes_ValidURL_ServerAvailable_PageNotFound() {
		HttpBot bot = new HttpBot();
		assertThrows(IOException.class, () -> {
			bot.getBytes("http://www.google.com/notfound");
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is valid and the server is available but the page is not found.
	 * Expected result: {@link IOException}
	 */
	@Test
	void testGetBytes_ValidURL_ServerAvailable_PageFound() {
		HttpBot bot = new HttpBot();
		assertNotNull(bot.getBytes("http://www.google.com/"));
	}
}