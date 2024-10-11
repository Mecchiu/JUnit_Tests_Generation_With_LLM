// HttpBot_1Test.java
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
* It contains one unit test case for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {
		
    /**
     * Tests for {@link #performAction(ContentProcessable)}.
     */
    @Test
    void performActionTest() {
        HttpBot bot = new HttpBot();
        assertTrue(bot.performAction(null) instanceof ContentProcessable,
                "Null content should be a ContentProcessable instance");
        assertTrue(bot.performAction(new Get()) instanceof ContentProcessable,
                "Numeric value of Get.get() should be a ContentProcessable instance");
        ContentProcessable get = bot.performAction(new GetPage());
        assertNotNull(get, "No GetProcessable result provided");

        assertTrue(bot.performAction(new Get()) instanceof httpActionClient.GetContentProcessable
               , "ContentProcessable should be a result object");

        assertTrue(bot.performAction(new ContentProcessable()) instanceof httpActionClient.PageProcessable
               , "Empty result object was not created");
    }

    /**
     * Test content.
     */
    @Test
    void contentTest() {
        HttpBot bot = new HttpBot();
        assertEquals(getBytes("http://www.wikipedia.org/"), bot.performAction(Get.fromString(new Get("http://www.wikipedia.org/"))).getBytes()
               , "Data should be equal");
        assertTrue(getBytes("http://www.wikipedia.org/").length // must not be the same, might be an exception (no character)
               , getBytes("http://www.wikipedia.org/").length // must be different
        );
    }

    /**
     * Test content with a url. Test a request with an url of a file on a different
     * wiki.
     */
    @Test
    void urlTest() {
        HttpBot bot = new HttpBot();
        assertEquals(getPage(new Get("wiki/Main_Page")), bot.performAction(Get.fromString(new Get("/wiki/"))).getBytes()
               , "Content url should be equal");
        assertTrue(getPage(new Get("wiki/Main_Page")).length // must not be the same, might be an exceptions
               , getPage(new Get("wiki/Main_Page")).length // must be different
        );
    }

    /**
     * Test action with an url.
     */
    @Test
    void customUrlTest() {
        HttpBot bot = new HttpBot();
        assertEquals(getBytes("http://www.wikisource.org"), bot.performAction(Get.fromString(new Get("http://www.wikisource.org/"))).getBytes()
               , "No result is available based on a url");
}
}