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
    public void getPages() throws MalformedURLException {
		final HttpBot bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
		assertNotNull(bot.getClient());
		assertNotNull(bot.getConnection());
		bot.getConnection().connect();
		bot.performAction(GetPage.getInstance());
		assertEquals("Main Page", bot.getPage(GetPage.getInstance().getStringParameter(0)));
		bot.getPage(GetPage.getInstance().getStringParameter(0)).checkAndGetByteArrayEquals(
				"<AHREF>http://www.yourOwnWiki.org/wiki/"
				+ "Index.php?title=Main_Page</AHREF>");
    }

    @Test
    public void getBytes_empty() throws MalformedURLException, ProcessException, IOException  {
		final HttpBot bot = new HttpBot("http://www.yourOwnWiki.org/wiki/");
		assertNotNull(bot.getClient());
		assertNotNull(bot.getConnection());
		bot.performAction(Get.getInstance());
		bot.getBytes(Get.getInstance().getStringParameter(0));
    }

}