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
		private HttpBot bot;
		
		/**
		 * @param bot
     *      the bot to be tested.
		 */
		public HttpBot_0Test(final HttpBot bot) {
			this.bot = bot;
		}
		
        /**
        * @see #getUrl()
        */
        @Test
        public void testGetUrl() throws IOException, ContentProcessable, ActionException, MalformedURLException {
        }
}