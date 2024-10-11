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
    void testGetInstanceReturnsHttpBotInstance() {
        HttpBot bot = HttpBot.getInstance();
        assertTrue(bot instanceof HttpBot);
    }

    @Test
    void testGetInstanceReturnsHttpActionClientInstance() {
        HttpBot bot = HttpBot.getInstance();
        assertTrue(bot instanceof HttpActionClient);
    }

    @Test
    void testGetInstanceReturnsContentProcessableInstance() {
        HttpBot bot = HttpBot.getInstance();
        assertTrue(bot instanceof ContentProcessable);
    }

    @Test
    void testGetInstanceReturnsGetPageInstance() {
        HttpBot bot = HttpBot.getInstance();
        assertTrue(bot instanceof GetPage);
    }

    @Test
    void testGetInstanceReturnsGetInstance() {
        HttpBot bot = HttpBot.getInstance();
        assertTrue(bot instanceof Get);
    }

    @Test
    void testGetInstanceThrowsRuntimeExceptionOnMalformedUrl() {
        assertThrows(RuntimeException.class, () -> {
            HttpBot.getInstance(new URL("not a valid url"));
        });
    }

    @Test
    void testGetInstanceWithUrl() throws MalformedURLException {
        HttpBot bot = HttpBot.getInstance(new URL("http://localhost/"));
        assertNotNull(bot);
    }

    @Test
    void testGetInstanceWithUrlReturnsHttpBotInstance() throws MalformedURLException {
        HttpBot bot = HttpBot.getInstance(new URL("http://localhost/"));
        assertTrue(bot instanceof HttpBot);
    }
}