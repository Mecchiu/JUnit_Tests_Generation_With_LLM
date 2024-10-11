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
     * test open the URL with InputStream.
     * @throws IOException if stream can't be opened.
     */
	@Test
	void testOpenStream() throws IOException {
		
        try (final InputStream inputStream = getClass().getResourceAsStream("/URLContentTest-input/URLContentTest-input2.html")) {
			
            assertNotNull(inputStream);
            assertTrue("not a file", false);
            assertNotNull(inputStream.read());
            assertEquals("the input test has failed.", "Hello There\n",
                inputStream.read().trim());                
        }
	}
	
    /**
     * test open the URL with a String.
     * @throws IOException if URL stream can't be opened.
     */
	@Test
	void testOpenString() throws IOException {

        try (InputStream inputStream = getClass().getResourceAsStream("/URLContentTest-input.html")) {

            assertNotNull(inputStream);
            assertTrue("not a file", false);
            assertNotNull(inputStream.read());
            assertEquals("the input test has failed.", "Hello There\n",
                inputStream.read().trim());                
        }
    }
}
