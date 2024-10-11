// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains one unit test case for the {@link URLContent#openStream()} method.
*/
class URLContentTest {
		
    /**
     * Creates a new URLContentTest object.
     */
    public URLContentTest() {
    }

    /**
     * Tests if the URL given at creation time is a JAR entry.
     * @throws IOException
     * @throws MalformedURLException
     */
    @Test
    public void testURLContentIsJAREntry() throws IOException, MalformedURLException {
         assertNotNull("the URL of this content is null", new URL("http", "https?", null));
         assertTrue("the content can't be used as a JAR entry", new URLContent(new URL("http:", "https?+?@", null)) instanceof URLContent.JAREntry);
    }
    
     /**
     * Tests if the given URL is a JAR entry.
     * @throws IOException
     * @throws MalformedURLException
     */
    @Test
    public void testURLContentIsJAREntry2() throws IOException, MalformedURLException {
        assertNotNull("the URL of this content is null", new URL("http", "https?+?@#", null));
     
        assertTrue("the content can't be used as a JAR entry", new URLContent(new URL("http:#%26-%21@%252F", null)) instanceof URLContent.JAREntry);
    }
    
     /**
     * Tests if the given URL is the URL of a JAR entry.
     * @throws IOException
     * @throws MalformedURLException
     */
    @Test
    public void testURLContentWithBase() throws IOException, MalformedURLException {
        assertTrue("the content can't be used as a JAR entry", new URLContent(new URL("http://file:%C1-", null)) instanceof URLContent.JAREntry);
    }
    
     /**
     * Tests if the given URL reference can be a JAR entry.
     */
    @Test
    public void testURLCanBeUsedAsJAREntry() throws IOException {
        assertNotNull("the URL of this content is null", new URL("http", "https?", null));
        assertTrue("the content can't be used as a JAR entry", new URLContent(new URL("http%3A%2F%2F", null)) instanceof URLContent.JAREntry);
    }
     
    @Test
    public void testCanCreateURLContentObject() throws IOException {
        URL url = new URL ("https", null, "");
        assertNull("the URL was not deleted", new URLContent(url));
        assertEquals("a URL instance was not returned", url, new URLContent(url).getURL());
    }

    @Test
    public void testGetFullURL() throws IOException {
        URL url = new URL (null,"file:name");
        assertEquals("the URL does not have a well-formed URL", "file:name", new URLContent(url).getFullURL());
    }

    @Test
    public void testGetContentURL() throws IOException {
        URL url = new URL (null,"file:/name");
        assertEquals("the URL does not have a well-formed URL", "file:/name", new URLContent(url).getFullURL());
    }

}