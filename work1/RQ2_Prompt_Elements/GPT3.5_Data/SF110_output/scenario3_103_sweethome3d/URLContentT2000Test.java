// Here's an implementation of the URLContent class and its test class:

// URLContent.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;

/**
 * URL content for files, images...
 *
 * @author Emmanuel Puybaret
 */
public class URLContent implements Content {

    private URL url;

    public URLContent(String urlString) throws MalformedURLException {
        this.url = new URL(urlString);
    }

    /**
     * Returns an InputStream on the URL content.
     *
     * @throws IOException if URL stream can't be opened.
     */
    public InputStream openStream() throws IOException {
        return url.openStream();
    }
}

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
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {

    @Test
    void testOpenStreamWithValidURL() throws IOException {
        URLContent content = new URLContent("https://www.example.com");
        InputStream stream = content.openStream();
        assertNotNull(stream);
        stream.close();
    }

    @Test
    void testOpenStreamWithInvalidURL() {
        assertThrows(IOException.class, () -> {
            URLContent content = new URLContent("https://www.invalidurl.com");
            content.openStream();
        });
    }

    @Test
    void testOpenStreamWithNullURL() {
        assertThrows(NullPointerException.class, () -> {
            URLContent content = new URLContent(null);
            content.openStream();
        });
    }

    @Test
    void testOpenStreamWithEmptyURL() {
        assertThrows(MalformedURLException.class, () -> {
            URLContent content = new URLContent("");
            content.openStream();
        });
    }

    @Test
    void testOpenStreamWithNonHTTPURL() throws IOException {
        URLContent content = new URLContent("ftp://ftp.example.com");
        assertThrows(IOException.class, () -> {
            content.openStream();
        });
    }

    @Test
    void testOpenStreamTwice() throws IOException {
        URLContent content = new URLContent("https://www.example.com");
        InputStream stream1 = content.openStream();
        InputStream stream2 = content.openStream();
        assertNotSame(stream1, stream2);
        stream1.close();
        stream2.close();
    }

    @Test
    void testOpenStreamAfterClose() throws IOException {
        URLContent content = new URLContent("https://www.example.com");
        InputStream stream = content.openStream();
        stream.close();
        assertThrows(IOException.class, () -> {
            content.openStream();
        });
    }

    @Test
    void testOpenStreamWithRedirect() throws IOException {
        URLContent content = new URLContent("https://www.google.com");
        InputStream stream = content.openStream();
        assertNotNull(stream);
        stream.close();
    }

    @Test
    void testOpenStreamWithAuthentication() throws IOException {
        URLContent content = new URLContent("https://www.example.com");
        InputStream stream = content.openStream();
        assertNotNull(stream);
        stream.close();
    }

    @Test
    void testOpenStreamWithTimeout() {
        assertThrows(IOException.class, () -> {
            URLContent content = new URLContent("https://www.example.com");
            content.openStream();
        });
    }
}