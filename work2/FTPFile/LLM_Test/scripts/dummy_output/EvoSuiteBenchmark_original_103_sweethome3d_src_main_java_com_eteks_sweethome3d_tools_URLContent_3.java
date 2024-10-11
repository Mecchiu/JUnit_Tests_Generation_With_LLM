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
		@Test
	public void testOpenStream() throws MalformedURLException, IOException {
    	URL url = new URL("some url");
    	URLContent urlContent = new URLContent(url);
    	int expectedStream = 1;
    	InputStream stream = urlContent.openStream();
    	assertEquals(expectedStream, stream.available());
    }

  @Test
  public void testJAREntry() throws Exception {
    	URL url = new URL("http://www.eteks.com/files/test.html");
    	URLContent urlContent = new URLContent(url);
    	Content content = urlContent.openStream(new URLContent.JAREntry());
    	assertEquals("eteks", content.getURL().path);
  	}
}