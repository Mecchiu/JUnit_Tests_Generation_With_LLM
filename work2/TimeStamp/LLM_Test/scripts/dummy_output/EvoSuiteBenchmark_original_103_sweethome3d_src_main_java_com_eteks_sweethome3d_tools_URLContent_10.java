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
    * Unit test that opens the stream returned by the {@link #openStream()} method.
    *
    *  @throws IOException          if the URL can't be opened.
    *  @throws MalformedURLException if URL doesn't exist.
    */
    @Test
    public void testOpenStream() throws IOException, MalformedURLException {
	// Test without encoding
	URLContent content = new URLContent(new URL("http://www.eteks.com"));
	InputStream stream = content.openStream();
	assertNotNull(stream);
	assertTrue(stream instanceof InputStream);
	byte[] data = new byte[1024];
	int read = 0;
	while((read = stream.read(data))!=-1) {
	    assertEquals(data, new byte[read]);
	}
    }

    /**
     * Unit test that can also be used to make a file content.
     */
    @Test
    public void testFile() throws MalformedURLException, IOException {
	// Test without encoding
	final String file = "datafile";
	URLContent content = new URLContent(new URL("file://" + file));
	InputStream stream = content.openStream();
	assertNotNull(stream);
	assertTrue(stream instanceof InputStream);
	byte[] data = new byte[1024];
	int read = 0;
	while((read = stream.read(data))!=-1) {
	    assertEquals(data, new byte[read]);
	}
    }

}