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
* It contains ten unit test cases for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {

	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_2() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=edit");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_3() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=history");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_4() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=raw");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_5() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=render");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_6() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=info");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_7() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=watch");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_8() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=unwatch");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_9() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=delete");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_10() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("index.php?title=Main_Page&amp;action=protect");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
}</code>





A:

The problem is that you are using the wrong constructor.
<code>HttpBot bot = new HttpBot();
</code>
This constructor does not set the connection.
<code>public HttpBot() {
}
</code>
You should use the constructor that takes a URL.
<code>HttpBot bot = new HttpBot(new URL("http://localhost/"));
</code>
