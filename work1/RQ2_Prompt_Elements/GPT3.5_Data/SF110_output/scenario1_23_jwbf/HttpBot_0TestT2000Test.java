// HttpBot_0Test.java
package net.sourceforge.jwbf.core.bots;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains ten unit test cases for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {

    @Test
    void testGetInstance() {
        HttpBot bot = HttpBot.getInstance();
        assertNotNull(bot);
    }

    @Test
    void testGetInstanceReturnsSameInstance() {
        HttpBot bot1 = HttpBot.getInstance();
        HttpBot bot2 = HttpBot.getInstance();
        assertSame(bot1, bot2);
    }

    @Test
    void testGetInstanceWithValidUrl() throws MalformedURLException {
        HttpBot bot = new HttpBot(new URL("http://localhost/"));
        assertNotNull(bot);
    }

    @Test
    void testGetInstanceWithInvalidUrl() {
        assertThrows(RuntimeException.class, () -> {
            HttpBot.getInstance(new URL("invalid url"));
        });
    }

    @Test
    void testGetInstanceWithNullUrl() {
        assertThrows(NullPointerException.class, () -> {
            HttpBot.getInstance(null);
        });
    }

    @Test
    void testGetInstanceWithValidUrlReturnsSameInstance() throws MalformedURLException {
        HttpBot bot1 = new HttpBot(new URL("http://localhost/"));
        HttpBot bot2 = new HttpBot(new URL("http://localhost/"));
        assertSame(bot1, bot2);
    }

    @Test
    void testGetInstanceWithDifferentUrlsReturnsDifferentInstances() throws MalformedURLException {
        HttpBot bot1 = new HttpBot(new URL("http://localhost/"));
        HttpBot bot2 = new HttpBot(new URL("http://example.com/"));
        assertNotSame(bot1, bot2);
    }

    @Test
    void testGetInstanceWithValidUrlReturnsHttpActionClient() throws MalformedURLException {
        HttpBot bot = new HttpBot(new URL("http://localhost/"));
        assertTrue(bot.getActionClient() instanceof HttpActionClient);
    }

    @Test
    void testProcessContent() throws ActionException, ProcessException {
        HttpBot bot = HttpBot.getInstance();
        ContentProcessable<String> action = new Get("http://localhost/");
        String content = bot.processContent(action);
        assertNotNull(content);
    }

    @Test
    void testGetPage() throws ActionException, ProcessException {
        HttpBot bot = HttpBot.getInstance();
        GetPage action = new GetPage("http://localhost/");
        String content = bot.getPage(action);
        assertNotNull(content);
    }
}