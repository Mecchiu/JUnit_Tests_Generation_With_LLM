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
		/**
		 * Test {@link HttpBot#getBytes(String) HTTP URL}.
		 */

		@Test
		public void testGetBytes(){
				System.out.println("getBytes");
	        // setup some special content into the httpClient

				CC cc = new CC(new CC.Config());
				cc.resetRequest();
				cc.setMethod("index.php");
	        	cc.setHeader("Accept", "");
	        	cc.setHeader("Connection", "close");
	        	cc.setHeader("Content-length", "" + 131152);
	        	cc.setHeader("Date", "" + "Tue, 11 Jul 2015 09:06:39 UTC");
				final HttpActionClient httpClient = new HttpActionClient(cc) {
					@Override
					protected byte[] getContent() throws ProcessException {
						return "asdfasdfasdfasdfasdfa".getBytes();
					}
				};
				System.out.println(httpClient.getContent());

				URL url = new URL("http://www.mywikiin.nl");

				// setup some content in the client
				File f = new File("f.txt");
				InputStream in = new FileInputStream(f);
				httpClient.setContent(new ContentProcessable(in), url);

				// perform request
				String actual = httpClient.performRequest();

				// check content from client
				assertEquals("asdfasdfasdfasdfasdfa".getBytes(), actual);

				// cleanup resources
				try {
						f.delete();
						in.close();
						f = new File("f.txt");
						in = new FileInputStream(f);
				} catch (IOException e) {
						// ignore
				}
		}

		/**
		 * A special test case for HttpBot.getPage(String).
		 */
		@Test
		public void testGetPage(){
				System.out.println("getPage");
		        // setup some special content into the httpClient

				CC cc = new CC(new CC.Config());
				cc.resetRequest();
				cc.setMethod("index.php?title=index&index.php?title=News");
	        	cc.setHeader("Accept", "");
	        	cc.setHeader("Connection", "close");
	        	cc.setHeader("Content-length", "" + 131152);
	        	cc.setHeader("Date", "" + "Tue, 11 Jul 2015 09:06:39 UTC");
				final HttpActionClient httpClient = new HttpActionClient(cc) {
					@Override
					protected String getPage(String baseUrl) throws ProcessException {
						return baseUrl + Get.PAGE_URL;
					}
				};
				String actual = httpClient.performRequest();

				URL url = new URL("http://www.mywikiin.nl");

				// setup some content in the client
				String baseUrl = "http://www.mywikiin.nl";
				URL myWikiIn;
				try {
						myWikiIn = new URL(baseUrl);
				} catch (MalformedURLException e) {
						//ignore
				}

				// check content from client
				assertEquals("asdfasdfasdfasdfasdfa".getBytes(), actual);

				// cleanup resources

				try {
						myWikiIn.getContent();
				} catch (IOException e) {
						// ignore
				}
		}
}