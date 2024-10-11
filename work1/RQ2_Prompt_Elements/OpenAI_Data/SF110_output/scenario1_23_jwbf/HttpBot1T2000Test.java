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
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method returns the correct content of a given URL.
	*/
	@Test
	void testPerformAction() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com");
		String content = bot.performAction(getPage);
		assertTrue(content.contains("<title>Google</title>"));
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL2() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL3() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL4() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL5() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL6() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL7() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL8() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL9() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
	
	/**
	* Test case for {@link HttpBot#performAction(ContentProcessable)} method.
	* It tests if the method throws an {@link ActionException} if the given URL is not valid.
	*/
	@Test
	void testPerformActionInvalidURL10() {
		HttpBot bot = new HttpBot();
		GetPage getPage = new GetPage("http://www.google.com/invalid");
		assertThrows(ActionException.class, () -> {
			bot.performAction(getPage);
		});
	}
}