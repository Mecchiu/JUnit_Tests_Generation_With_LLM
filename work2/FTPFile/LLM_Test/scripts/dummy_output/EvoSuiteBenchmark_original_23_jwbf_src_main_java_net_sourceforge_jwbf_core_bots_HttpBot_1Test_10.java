// HttpBot_1Test.java
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
* It contains one unit test case for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {
		 /**
		* @see {@link HttpBot#performAction(ContentProcessable)}
		* @throws MalformedURLException
		* @throws IOException
		* @throws ProcessException
		*/
	@Test
	public void test() throws MalformedURLException, IOException, ProcessException {
		assertNotNull("Should not return null if no connection was set", HttpBot.getConnection());
		final String url = "http://www.yourownwiki.org/wiki/";
		final HttpBot httpbot = HttpBot.getInstance();

		final GetPage response =  httpbot.performAction(new Get(url));
		assertNotNull("Get should not throw any exception if successed", response.get());
		final byte[] content = response.get();
		assertNotNull("Content is null", content);
		System.out.println("Got content in wiki page response:");
		System.out.println(new String(content));

		final ContentProcessable contentPage = new Get(url + response.getContentId()).get();
		assertNotNull("ContentPage is null", contentPage.get());
		System.out.println("Got content page in wiki page response:");
		System.out.println(contentPage.get().get());
		assertNotNull("Did not get ContentPage but ContentProcessable", contentPage);
		final ContentProcessable getPage = new Get(url + "content.php").get();
		System.out.println("Successful get, and page");
		assertNotNull("Did not get page but ContentProcessable", getPage);
		final ContentProcessable resultPage = contentPage.get();
		assertNotNull("Did not get page but ContentProcessable", resultPage);
		assertTrue("Should get page but ContentProcessable", resultPage instanceof GetPage);
		final GetPage getPageResult = (GetPage) resultPage;
		assertSame("Request was not same object", contentPage, getPageResult.get());
		final ContentProcessable resultContent = contentPage.get();
		assertNotNull("Did not get content but ContentProcessable", resultContent);
		assertTrue("Should get content but ContentProcessable", resultContent instanceof GetPage);

		// TODO test result content also
	}
}