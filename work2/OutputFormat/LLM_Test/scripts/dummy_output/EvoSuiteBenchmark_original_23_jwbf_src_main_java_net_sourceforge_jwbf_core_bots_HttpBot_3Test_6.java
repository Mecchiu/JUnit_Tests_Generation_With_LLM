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
		
	@Test
	public void getByteArray_NoURL_DefaultURL() throws IOException, ActionException, ProcessException {
		// arrange
		HttpBot bot = new HttpBot();
		URL target = new URL("http://www.java.net/");

		// act
		// a GET request
		byte[] bytes = bot.getBytes(null);

		// assert
		// that our test doesn't fail
		assertNotNull(bytes);
		bot.executeAction(new Get(target.toString()));
	}

	@Test
	public void getPage_NoURL_DefaultURL() throws IOException, MalformedURLException, ProcessException, ActionException {
		// arrange
		final String url = "a";
		HttpBot bot = new HttpBot(TestProperties.server);
		URL target = new URL(TestProperties.server, url);

		// act
		byte[] bytes = bot.getBytes(null);

		// assert
		// that our test doesn't fail
		bot.executeAction(new GetPage(url, target));
	}

	@Test
	public void getBytes_WithHTTP_DefaultURL() throws IOException, MalformedURLException, ProcessException {
		// arrange
		final String url = "http://www.java.net/";
		final String str = "Hello World!!!";

		// act
		// with a GET request
		final byte[] bytes = bot.getBytes(null);

		// assert
		// that our test doesn't fail
		assertNotNull(bytes);
		bot.executeAction(new Get(url + str));
	}

	@Test
	public void getBytes_WithHTTP_DefaultScheme() throws MalformedURLException, ProcessException, ActionException {
		// arrange
		final String url = "www.java.net";

		// act
		// with a GET request
		final byte[] bytes = bot.getBytes(url);

		// assert
		// that our test doesn't fail
		assertNotNull(bytes);
	}

	@Test
	public void getBytes_WithHTTP_CustomScheme() throws MalformedURLException, ProcessException, ActionException {
		// arrange
		final String url = "www.java.net/article.php";

		// act
		// with a GET request
		final byte[] bytes = bot.getBytes(url);

		// assert
		// that our test doesn't fail
		assertNotNull(bytes);
		assertTrue(bytes.length >= 18);
	}

	@Test
	public void getBytes_WithFile_DefaultFile_URL() throws IOException,
			MalformedURLException, ProcessException {
		// arrange
		final File file = new File(".");
		final String contents = "<html>My contents</html>";
		final File file2 = new File("/Users/myuser/tmp/file2.txt");
		final File file3 = new File("/var/www/Myuser/tmp/file3.txt");
		final URL fileUrl = new URL("http://www.java.net"); //
															 //

		// act
		// with a GET request
		final byte[] bytes = bot.getBytes(file);

		// assert
		// that our test doesn't fail
		assertNotNull(bytes);
		bot.executeAction(new Get(fileUrl.toString()));
	}

	@Test
	public void getPage_WithFile_DefaultFile_URL() throws IOException,
			MalformedURLException, ProcessException {
		// arrange
		final File file = new File(".");
		final String contents = "<html>My contents</html>";
		final URL fileUrl = new URL("http://www.java.net");
		final File file2 = new File("./tmp/file2.txt");

		// act
		// with a GET request
		final byte[] bytes = bot.getBytes(file2);

		// assert
		// that our test doesn't fail
		assertNotNull(bytes);
		bot.executeAction(new Get(fileUrl.toString()));
}
}