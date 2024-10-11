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
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.extern.slf4j.Slf4j;
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
import net.sourceforge.jwbf.core.internal.actions.Post;
import net.sourceforge.jwbf.core.internal.actions.RequestBuilder;
import net.sourceforge.jwbf.core.internal.actions.util.ActionWrapper;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactory;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder1;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder2;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder3;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder4;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder5;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder6;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder7;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder8;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder9;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder10;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder11;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder12;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder13;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder14;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder15;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder16;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder17;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder18;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder19;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder20;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder21;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder22;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder23;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder24;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder25;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder26;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder27;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder28;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder29;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder30;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder31;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder32;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder33;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder34;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder35;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder36;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder37;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder38;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder39;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder40;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder41;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder42;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder43;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder44;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder45;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder46;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder47;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder48;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder49;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder50;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder51;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder52;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder53;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder54;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder55;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder56;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder57;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder58;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder59;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder60;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder61;
import net.sourceforge.jwbf.core.internal.actions.util.HttpActionClientImpl.HttpClientFactoryImpl.HttpClientFactoryImplBuilder.HttpClientFactoryImplBuilder62;
import net.sourceforge.jwbf.core