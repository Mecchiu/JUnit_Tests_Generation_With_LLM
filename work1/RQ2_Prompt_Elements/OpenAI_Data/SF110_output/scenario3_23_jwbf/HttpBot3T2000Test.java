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
* It contains ten unit test cases for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBotTest {

	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is null.
	 * Expected result: {@link NullPointerException}
	 */
	@Test
	void testGetBytes_NullURL() {
		HttpBot bot = new HttpBot();
		assertThrows(NullPointerException.class, () -> {
			bot.getBytes(null);
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is empty.
	 * Expected result: {@link IllegalArgumentException}
	 */
	@Test
	void testGetBytes_EmptyURL() {
		HttpBot bot = new HttpBot();
		assertThrows(IllegalArgumentException.class, () -> {
			bot.getBytes("");
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is not valid.
	 * Expected result: {@link MalformedURLException}
	 */
	@Test
	void testGetBytes_InvalidURL() {
		HttpBot bot = new HttpBot();
		assertThrows(MalformedURLException.class, () -> {
			bot.getBytes("invalid url");
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is valid but the server is not available.
	 * Expected result: {@link IOException}
	 */
	@Test
	void testGetBytes_ValidURL_ServerNotAvailable() {
		HttpBot bot = new HttpBot();
		assertThrows(IOException.class, () -> {
			bot.getBytes("http://localhost:8080/");
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is valid and the server is available but the page is not found.
	 * Expected result: {@link IOException}
	 */
	@Test
	void testGetBytes_ValidURL_ServerAvailable_PageNotFound() {
		HttpBot bot = new HttpBot();
		assertThrows(IOException.class, () -> {
			bot.getBytes("http://www.google.com/notfound");
		});
	}
	
	/**
	 * Test case for {@link HttpBot#getBytes(String)} method.
	 * It tests the case when the given URL is valid and the server is available but the page is not found.
	 * Expected result: {@link IOException}
	 */
	@Test
	void testGetBytes_ValidURL_ServerAvailable_PageFound() {
		HttpBot bot = new HttpBot();
		assertNotNull(bot.getBytes("http://www.google.com/"));
	}
}

// HttpActionClient.java
package net.sourceforge.jwbf.core.actions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.actions.util.Throttle;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
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
import net.sourceforge.jwbf.core.internal.actions.util.Throttle;
import net.sourceforge.jwbf.core.internal.bots.HttpBot;
import net.sourceforge.jwbf.core.internal.bots.util.JwbfException;
import net.sourceforge.jwbf.core.internal.contentRep.Article;
import net.sourceforge.jwbf.core.internal.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.internal.contentRep.Userinfo;
import net.sourceforge.jwbf.core.internal.util.Checked;
import net.sourceforge.jwbf.core.internal.util.Nonnull;
import net.sourceforge.jwbf.core.internal.util.Nullable;
import net.sourceforge.jwbf.core.internal.util.Validate;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is the main class for all http actions.
 *
 * @author Thomas Stock
 */
@Slf4j
public class HttpActionClient {

  private static final Logger log = LoggerFactory.getLogger(HttpActionClient.class);

  private static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 200;
  private static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 20;
  private static final int DEFAULT_CONNECTION_TIMEOUT = 5000;
  private static final int DEFAULT_SOCKET_TIMEOUT = 5000;
  private static final int DEFAULT_RETRY_COUNT = 3;
  private static final int DEFAULT_RETRY_INTERVAL = 1000