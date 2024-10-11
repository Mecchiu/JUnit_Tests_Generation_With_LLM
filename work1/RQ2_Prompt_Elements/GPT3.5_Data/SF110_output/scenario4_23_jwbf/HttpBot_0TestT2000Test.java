// HttpBot.java
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

/**
 * This class represents an HTTP bot that can perform various actions on a website.
 */
public class HttpBot {

    private HttpActionClient cc;
    private String url;

    /**
     * Creates a new instance of HttpBot.
     */
    public HttpBot() {
    }

    /**
     * Creates a new instance of HttpBot with the specified URL.
     *
     * @param url the URL of the website to connect to
     */
    public HttpBot(final String url) {
    }

    /**
     * Creates a new instance of HttpBot with the specified HttpActionClient.
     *
     * @param cc the HttpActionClient to use for performing actions
     */
    public HttpBot(HttpActionClient cc) {
    }

    /**
     * Creates a new instance of HttpBot with the specified URL.
     *
     * @param url the URL of the website to connect to
     */
    public HttpBot(final URL url) {
    }

    /**
     * Returns a {@link HttpBot} which supports only its basic methods. Use
     * {@link #getPage(String)} for a basic read of content.
     *
     * @deprecated do not use this
     * @return a new instance of HttpBot
     */
    @Deprecated
    public static HttpBot getInstance() {
        return new HttpBot();
    }

    /**
     * Sets the HttpActionClient to use for performing actions.
     *
     * @param client the HttpActionClient to use
     */
    public final void setConnection(final HttpActionClient client) {
        this.cc = client;
    }

    /**
     * Returns the URL of the website being accessed by this HttpBot.
     *
     * @return the URL of the website
     */
    public final String getHostUrl() {
        return url;
    }

    /**
     * Performs the specified ContentProcessable action and returns the result as a String.
     *
     * @param a the ContentProcessable action to perform
     * @return the result of the action as a String
     * @throws ActionException if an error occurs while performing the action
     * @throws ProcessException if an error occurs while processing the result of the action
     */
    public synchronized String performAction(final ContentProcessable a) throws ActionException, ProcessException {
        return cc.performAction(a).getText();
    }

    /**
     * Sets the URL of the website to connect to.
     *
     * @param hostUrl the base URL of the website to connect to
     */
    public final void setConnection(final String hostUrl) {
        try {
            this.url = hostUrl;
            this.cc = new HttpActionClient(new URL(hostUrl));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid URL: " + hostUrl, e);
        }
    }

    /**
     * Retrieves the content of the specified page as a String.
     *
     * @param u the URL of the page to retrieve
     * @return the content of the page as a String
     * @throws IOException if an error occurs while retrieving the page
     */
    public final String getPage(String u) throws IOException {
        return new GetPage(u).process(cc).getText();
    }

    /**
     * Retrieves the content of the specified page as a byte array.
     *
     * @param u the URL of the page to retrieve
     * @return the content of the page as a byte array
     * @throws IOException if an error occurs while retrieving the page
     */
    public final byte[] getBytes(String u) throws IOException {
        return new Get(u).process(cc).getByteData();
    }

    /**
     * Returns the HttpActionClient being used by this HttpBot.
     *
     * @return the HttpActionClient being used
     */
    public final HttpActionClient getClient() {
        return cc;
    }

    /**
     * Sets the URL of the website to connect to.
     *
     * @param hostUrl the URL of the website to connect to
     */
    public final void setConnection(final URL hostUrl) {
        this.url = hostUrl.toString();
        this.cc = new HttpActionClient(hostUrl);
    }

    /**
     * Returns the URL of the website being accessed by this HttpBot.
     *
     * @return the URL of the website
     * @deprecated use getHostUrl() instead
     */
    @Deprecated
    public String getUrl() {
        return url;
    }
}

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
 * It contains ten unit test cases for the {@link HttpBot#getInstance()} method.
 */
class HttpBot_0Test {

    /**
     * Tests that getInstance() returns a non-null HttpBot object.
     */
    @Test
    void testGetInstance() {
        HttpBot bot = HttpBot.getInstance();
        assertNotNull(bot);
    }

    /**
     * Tests that setConnection(HttpActionClient) sets the HttpActionClient correctly.
     */
    @Test
    void testSetConnectionWithClient() {
        HttpActionClient client = new HttpActionClient();
        HttpBot bot = new HttpBot();
        bot.setConnection(client);
        assertEquals(client, bot.getClient());
    }

    /**
     * Tests that setConnection(String) sets the URL and HttpActionClient correctly.
     */
    @Test
    void testSetConnectionWithString() {
        String url = "http://www.example.com/";
        HttpBot bot = new HttpBot();
        bot.setConnection(url);
        assertEquals(url, bot.getHostUrl());
        assertNotNull(bot.getClient());
    }

    /**
     * Tests that setConnection(URL) sets the URL and HttpActionClient correctly.
     */
    @Test
    void testSetConnectionWithURL() throws MalformedURLException {
        URL url = new URL("http://www.example.com/");
        HttpBot bot = new HttpBot();
        bot.setConnection(url);
        assertEquals(url.toString(), bot.getHostUrl());
        assertNotNull(bot.getClient());
    }

    /**
     * Tests that getPage(String) retrieves the correct content.
     */
    @Test
    void testGetPage() throws IOException {
        HttpBot bot = new HttpBot();
        bot.setConnection("http://www.example.com/");
        String content = bot.getPage("");
        assertTrue(content.contains("<html"));
    }

    /**
     * Tests that getBytes(String) retrieves the correct content.
     */
    @Test
    void testGetBytes() throws IOException {
        HttpBot bot = new HttpBot();
        bot.setConnection("http://www.example.com/");
        byte[] content = bot.getBytes("");
        assertTrue(content.length > 0);
    }

    /**
     * Tests that performAction(ContentProcessable) returns the correct result.
     */
    @Test
    void testPerformAction() throws ActionException, ProcessException {
        HttpBot bot = new HttpBot();
        bot.setConnection("http://www.example.com/");
        String content = bot.performAction(new GetPage(""));
        assertTrue(content.contains("<html"));
    }

    /**
     * Tests that getHostUrl() returns the correct URL.
     */
    @Test
    void testGetHostUrl() {
        HttpBot bot = new HttpBot();
        bot.setConnection("http://www.example.com/");
        assertEquals("http://www.example.com/", bot.getHostUrl());
    }

    /**
     * Tests that getClient() returns the correct HttpActionClient.
     */
    @Test
    void testGetClient() {
        HttpBot bot = new HttpBot();
        HttpActionClient client = new HttpActionClient();
        bot.setConnection(client);
        assertEquals(client, bot.getClient());
    }

    /**
     * Tests that getUrl() returns the correct URL.
     */
    @Test
    void testGetUrl() {
        HttpBot bot = new HttpBot();
        bot.setConnection("http://www.example.com/");
        assertEquals("http://www.example.com/", bot.getUrl());
    }
}