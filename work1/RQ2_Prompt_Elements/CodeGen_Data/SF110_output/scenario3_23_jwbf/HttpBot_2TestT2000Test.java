// HttpBot_2Test.java
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
* It contains one unit test case for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {

    @Test
    void testGetPage() throws MalformedURLException, IOException {
        // simple test
        assertEquals("Hello World!", HttpBot.getPage("http://localhost:8888/content/Main_Page/text"));
        
        // URL-based test
        String page =
            HttpBot.getPage(
() -> new URL(
                "http://www.google.com?q=hello%20");
            )
           .trim()
           .replace("<", "&lt;");
        
        assertEquals("Hello World!", page);
    }
     
    @Test
    void testGetPageWithSpecialCharacter() throws MalformedURLException, IOException {
        String url = "http://www.google.com?q=hello+world!";
        
        // test simple URL
        assertEquals("Hello World!", HttpBot.getPage(url));

        // test URL-based URL
        String page =
            HttpBot.getPage(
() -> new URL(
                "http://www.google.com?q=hello+world!"));
        
        assertEquals("Hello World!", page);
    }

        
    @Test
    void testGetPage_noUrl() throws MalformedURLException, IOException {
        // simple test
        assertEquals("Hello World!", HttpBot.getPage("http://localhost:8888/content/Main_Page/text"));
        
        // URL-based test
        String page =
            HttpBot.getPage(
() -> new URL(
                "http://www.google.com?q=hello%20"));
        
        assertEquals("Hello World!", page);
    }

    @Test
    void testGetPage_withSpecialCharacter() throws MalformedURLException, IOException {
        String url = "http://www.google.com?q=hello+world!";
        
        // test URL-based URL
        assertEquals("Hello World!", HttpBot.getPage(url));

        // test URL-based URL
        try {
            HttpBot.getPage(new URL(
                    "http://www.google.com?q=hello+world!"));
            fail("Should have failed");
        } catch (ProcessException ex) {}
    }
    
    @Test
    void testGetPage_URLString() throws MalformedURLException, IOException {
        // simple test
        assertEquals("Hello World!", getPage(
                "http://www.google.com?q=hello%20"));
        assertEquals("Hello World!", getPage(
                "http://www.google.com?q=hello+world!"));       
        assertEquals("Hello World!", getPage(
                "http://www.google.com?q=hello+world%20!"));
        
    }
    @Test
    void testGetPage_URLStringWithSpecialCharacter() throws MalformedURLException, IOException {
        String url = "http://www.google.com?q=hello+world!";
        
        // test empty string
        assertEquals("Hello World!", getPage(
                new URL(
                    "http://www.google.com?q=hello+world!")));
        
        // test URL-based string
        assertEquals(
"Hello World!",
getPage(new URL("http://www.google.com?q=hello+world!")));
        
        assertEquals("Hello World!", getPage(new URL(
                "http://www.google.com?q=hello+world%20!")));
    }
        
    @Test
    void testGetPageWithSpecialCharacter() throws MalformedURLException, IOException {
        String url = "http://www.google.com?q=hello+%20world!";
        
        String page = getPage(new URL(url));
        System.out.println(page);
        assertNotEquals(page,"Hello World!");

        // test URL-based URL
        page = getPage(new URL("http://www.google.com?q=hello+%20world!"));
        assertEquals(page, "Hello World!");
        
        page = getPage(new URL("http://www.google.com?q=hello+%20world%20!"));
        assertEquals(page, "Hello World!");
    }


}
