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
		public URLContentTest() {
		}

        @Test
		public void testOpenStream() throws MalformedURLException, IOException {
            URLContent testContent =    new URLContent( new URL("https://www.google.com"), "java-http://content.open.javadoc.org");
            final String result = testContent.openStream().toString();
			// check result
	        assertTrue("Expecting text to be a URL", result.toLowerCase().contains("http"));
	        assertTrue("Expecting text to be a URL", result.toLowerCase().contains("java-http"));
	        assertTrue("Expecting text to be a URL", result.toLowerCase().contains("content.open.javadoc"));
	        assertTrue("Expecting text to be a URL", result.toLowerCase().contains("java-http"));
            // check error result
	        assertFalse("Expecting this to fail", testContent.exists());
	        try {
	        	testContent.openStream();
	        	fail("Expecting an exception for a URL that isn't readable.");
	        } catch (IOException ex) {
	        	// expected
	        }
        }
        
}