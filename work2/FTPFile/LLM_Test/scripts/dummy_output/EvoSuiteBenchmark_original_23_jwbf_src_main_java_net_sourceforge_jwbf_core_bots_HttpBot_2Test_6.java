// HttpBot_2Test.java
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
* It contains one unit test case for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {
		private ContentProcessable c;
		private HttpActionClient cc;

		/**
		* Initialize a new HttpBot with the given parameters.
		*
		* @param url
		* @param isDebug
		*/
		public HttpBot_2Test(String url, boolean isDebug) {
			this.c = new GetPage(url);
			this.cc = new HttpActionClient(new URL(url));
		}

		/**
		* Initialize a new HttpBot with the given URL and credentials.
		*
		* @param url
		* @param username
		* @param password
		*/
		public HttpBot_2Test(String url, String username, String password) {
			this.c = new GetPage(url);
			this.cc = new HttpActionClient(new URL(url), username, password);
		}

		/**
		* Gets a plain HTML or XML content from the given URL.
		*
		* @param u
		* @return
		*/
		public String getPage(String u) throws MalformedURLException, IOException, ActionException,
			ProcessException, ContentProcessable {
			return this.cc.doGet(u, (byte[]) null);
		}

		/**
		* @param b
		*/
		public String getBytes(String u) throws MalformedURLException, IOException,
			ActionException, ContentProcessable, ProcessException, ContentProcessable {
			return this.cc.doGet(u);
		}

		/**
		* The test method for getting a plain HTML or XML content from the given URL with the default httpaction
		* client.
		*/
		@Test
		public final void simpleTest1() throws MalformedURLException, IOException, ActionException,
			ContentProcessable, ProcessException, ContentProcessable {
			// TODO: add tests for parameters

			this.c.process("This is your first GET request.");

			// get 1 byte from url in bytes
			assertEquals("1", new String(this.getBytes(this.c.doActionGet("index.php?title=Main_Page"))));

			// get 1 byte from url in bytes
			this.getBytes(this.c.doActionGet("index.php?title=Main_Page"));
		}

		/**
		* The test method for simple get page method.
		*/
		@Test
		public final void simpleTest2() throws MalformedURLException, IOException, ActionException,
			ContentProcessable, ProcessException, ContentProcessable, ProcessException {
			// TODO: add tests for params

			this.cc.doGet(this.c.doActionGet("wiki.php"));
		}
}