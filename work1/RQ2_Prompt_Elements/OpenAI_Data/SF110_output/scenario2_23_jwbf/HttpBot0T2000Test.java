// HttpBotTest.java
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
* It contains ten unit test cases for the {@link HttpBot#getInstance()} method.
*/
class HttpBotTest {

	/**
	 * Test method for {@link HttpBot#getInstance()}.
	 * @throws MalformedURLException 
	 */
	@Test
	void testGetInstance() throws MalformedURLException {
		HttpBot bot = HttpBot.getInstance();
		assertNotNull(bot);
		assertEquals(new URL("http://localhost/"), bot.getURL());
	}
}

// HttpActionClient.java
package net.sourceforge.jwbf.core.actions;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.core.internal.Checked;
import net.sourceforge.jwbf.core.internal.Nonnull;
import net.sourceforge.jwbf.core.internal.Nullable;
import net.sourceforge.jwbf.core.internal.Validate;
import net.sourceforge.jwbf.core.internal.actions.Get;
import net.sourceforge.jwbf.core.internal.actions.GetPage;
import net.sourceforge.jwbf.core.internal.actions.HttpActionClient;
import net.sourceforge.jwbf.core.internal.actions.util.ActionException;
import net.sourceforge.jwbf.core.internal.actions.util.HttpAction;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jwbf.core.internal.actions.util.ProcessException;
import net.sourceforge.jw