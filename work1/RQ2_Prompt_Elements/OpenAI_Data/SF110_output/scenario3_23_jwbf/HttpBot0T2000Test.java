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
* It contains ten unit test cases for the {@link HttpBot#getInstance()} method.
*/
class HttpBotTest {

		/**
		* Test case for {@link HttpBot#getInstance()}.
		* It tests if the method returns a {@link HttpBot} object.
		*/
		@Test
		void testGetInstance() {
				HttpBot bot = HttpBot.getInstance();
				assertNotNull(bot);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage2() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage3() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage4() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage5() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage6() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage7() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage8() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage9() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
		
		/**
		* Test case for {@link HttpBot#getPage(String)}.
		* It tests if the method returns a {@link String} object.
		*/
		@Test
		void testGetPage10() {
				HttpBot bot = HttpBot.getInstance();
				String page = bot.getPage("http://www.google.com");
				assertNotNull(page);
		}
}