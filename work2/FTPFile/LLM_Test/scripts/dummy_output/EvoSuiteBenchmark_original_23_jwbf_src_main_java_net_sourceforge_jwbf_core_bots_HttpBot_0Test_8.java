// HttpBot_0Test.java
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
* It contains one unit test case for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {
		/**
		 * @throws MalformedURLException
		 * @throws IOException
		 */
  @Test
  public void test() throws MalformedURLException, IOException {
  	HttpBot bot = getInstance();
    String textPage = "Hello World!";
    String plainHtmlContent = "Hello 'World'!";
    String jcrContent = null;
    assertEquals(textPage, bot.performAction(new Get(new String[] {"title"}, new String[] {"text"}, new String[] {plainHtmlContent}, new String[] {jcrContent})));
  }

    /**
     * @throws MalformedURLException
     * @throws IOException
     */
  @Test
  public void testWithUrl() throws MalformedURLException, IOException {
  	String textPage = "Hello World!";
    String plainHtmlContent = "Hello 'World'!";
    String jcrContent = null;
    assertEquals(textPage, getPage(new URL("./myurl?title=Main_Page")));
  }

    @Test
    public void testNoUrl() throws MalformedURLException {
	    try {
	    	HttpBot bot = getInstance();
	    	BotContent c = (BotContent) bot.performAction(new Get(null));
	    	fail("There should be no url here.");
	    } catch (ProcessException e) {
	      assertEquals(e.getMessageId(), 400);
	    }
  }
}