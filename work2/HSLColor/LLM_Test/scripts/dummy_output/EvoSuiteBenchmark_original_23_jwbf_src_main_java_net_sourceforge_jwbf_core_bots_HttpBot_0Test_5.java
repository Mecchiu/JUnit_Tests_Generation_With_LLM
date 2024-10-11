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
	 * Gets a plain HTML or XML data e.g. from custom specialpages
	 * or xml newsfeeds.
	 */
	@Test
  void getPlain() throws Exception {
		assertNull(HttpBot.getInstance().performAction("index.php?title=Home"));
  }
	
  /**
	 * Gets a HTML data e.g. from custom specialpages
	 * or xml newsfeeds.
	 */
	@Test
  void getHtml() throws Exception {
		assertEquals("Get with text", "index.php?title=My_Page", HttpBot.getInstance().performAction("index.php?title=My_Page"));
		assertEquals("Get with plain", "index.php?title=My_Page", HttpBot.getInstance().performAction("index.php?title=My_Page"));
  }
  
  /**
	 * TODO check usage of hosturl
	 *
	 * @deprecated
	 */
	@Deprecated
	@Test
  void url() throws Exception {
		assertEquals("Test", HttpBot.getInstance().performAction("index.php?title=Test"));
  }

}

// END OF HttpBot_0Test.java