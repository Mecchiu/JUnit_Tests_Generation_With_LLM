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
		
	final String baseURL = "http://www.yourOwnWiki.org/";
	final URL url = new URL(baseURL);
		
	final HttpActionClient client;
	final HttpBot bot;
	
	HttpBot_3Test() {
		client = new HttpActionClient(url);
		bot = new HttpBot(client);
	}
	
	@Test
	void testGetBytes() throws IOException {
		final Byte[] data = new Byte[3];
		String s = "";
		System.out.println("GET " + baseURL +"/index.php?title=Main_Page");
		bot.doMethod(Get.class, new Get(baseURL +"/index.php?title=Main_Page"), new ContentProcessable<byte[]>() {
				public byte[] getContent() throws ActionException {
					return s.getBytes();
				}
				public ContentProcessable<byte[]> setContent(final byte[] data) throws ActionException {
					System.out.println(data);
					s = new String(data);
					return this;	
				}});
		final ContentProcessable[] dataP = new ContentProcessable[3];
		s = new String(data);
		for(int i = 0;i < dataP.length;i++) {
			assertEquals(data.length +1,dataP[i].getContent().length);
			assertEquals("Hello from I!", dataP[i].getContent());
			dataP[i] = new ContentProcessable<byte[]> () {
				public byte[] getContent() throws ActionException {
					return data.clone();
				}
				public ContentProcessable<byte[]> setContent(final byte[] data) throws ActionException {
					System.out.println(data);
					return this;	
				}};
		}
	}

	@Test
	void testGetURL() throws MalformedURLException {
		String s = new URL(baseURL + "/index.php?title=Main_Page").toString();
		System.out.println(s);
		assertEquals("http://www.yourOwnWiki.org/wiki/index.php?title=Main_Page", s);
		bot.doMethod(Get.class, new Get(baseURL + "/index.php?title=Main_Page&name=Title"), new ContentProcessable<String>() {
				public String getContent() throws ActionException {
					return getString(baseURL + "/index.php?title=Main_Page&name=Title");
				}
				public ContentProcessable<String> setContent(final String s) throws ActionException {
					System.out.println(s);
					return this;	
				}});
		s = new URL(baseURL + "/index.php?title=Main_Page").toString();
		System.out.println(s);
		assertEquals("http://www.yourOwnWiki.org/wiki/index.php?title=Main_Page", s);
	}
	@Test
	void testGetPage() throws ContentProcessableException {
		String s = new URL(baseURL + "/index.php?title=Main%20Page&name=title").toString();
		System.out.println(s);
		bot.doMethod(Get.class, new Get(baseURL + "/index.php?title=Main%20Page"), new ContentProcessable<String>() {
				public String getContent() throws ContentProcessableException {
					return getString(baseURL + "/index.php?title=Main%20Page&name=title");
				}
				public ContentProcessable<String> setContent(final String s) throws ContentProcessableException {
					System.out.println(s);
					return this;	
				}});
	}
	
	/**
	 * @param name
	 *          the name of the page
	 * @return a {@link ContentProcessable} which can be used to create HTML- or XML-data
	 */
	public ContentProcessable<byte[]> getString(final String name) {
}
}