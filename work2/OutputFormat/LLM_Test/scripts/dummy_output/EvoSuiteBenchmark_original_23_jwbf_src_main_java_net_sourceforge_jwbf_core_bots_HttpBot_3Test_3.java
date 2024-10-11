// HttpBot_3Test.java
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
* It contains one unit test case for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {
		public final static URL URL =
			new URL("http://www.yourownwiki.org/wiki/");

    private URL url = null;

	@Test
	public final void getBytes() {
		assertEquals("getBytes: wrong url", "http://www.yourownwiki.org/wiki/",
			url.toString());
	}

    /**
     * @param url
     *          a
     * @return text
     */
    public synchronized String getPage(final URL url);

    /**
     * @param u
     *          a
     * @return HTML content
     * @throws MalformedURLException
     * @throws IOException
     */
    public synchronized byte[] getBytes(final URL u) throws MalformedURLException,
        IOException {
        assertEquals("getBytes: wrong url", "http://www.yourownwiki.org/wiki/", u.toString());
        return getPage(u).getBytes();
    }

    /**
     * @param url
     *          a
     * @return text
     */
    public synchronized String getURL() {
        assertEquals("getURL: wrong url", "http://www.yourownwiki.org/wiki/", url.toString());
        return url.toString();
    }

    /**
     * @throws MalformedURLException
     * @throws IOException
     */
    @Test
    public final void getURL() throws MalformedURLException, IOException {
        this.url = new URL("http://www.yourownwiki.org/wiki/");
    }
}


/**
 * Simple method to get plain HTML or XML data e.g. from custom specialpages
 * or xml newsfeeds.
 */
class HttpBot_1Test implements ContentProcessable {

    @Override
    public ContentProcessable readContent() {
        return new Get()
           .setUrl("http://www.yourownwiki.org/wiki/")
           .setContentType("text/html");
    }
}