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
     * The test method to call before each unit test case of this
     * class.
     * @see java.lang.Object#finalize()
     */
    @Test
    public void testPublicConstructor() {
        //System.out.println(getClass().getSimpleName() + " - " + this.getClass().getSimpleName() + " - " + getClass().getSimpleName() + ": public Constructor");
    }

    /**
     * The test method to call after each unit test case.
     * @see java.lang.Object#finalize()
     */
    @Test
    public void testFinalize() {
        // System.out.println(getClass().getSimpleName() + " - " + this.getClass().getSimpleName() + " - " + getClass().getSimpleName() +
         // ": public Finalize");
    }

    /**
     * Returns an empty string for content.
     * @throws IOException if URLstream doesn't contain enough data.
     */
    @Test
    public void testEmptyInputStream() throws IOException {
        //System.out.println(getClass().getSimpleName() + " - " + this.getClass().getSimpleName() + ": public Test");
        try {
            assertEquals("The expected class name is", URLContent.class.getCanonicalName(), getClass().getCanonicalName());
            assertEquals("The expected name is", "", getClass().getName());
        } catch (ClassNotFoundException ignored) {
        }
        
        URL url = new URL("http://www.www.example.com/");
        InputStream in = new Content(null).openStream();
        Content expectedContent = new Content();
        expectedContent.setURL(url);

        assertNotSame("The expected result is different from the actual one", expectedContent, new Content());

//        System.out.println(getTestName() + ": openStream => " + url);
        assertTrue("The URL should be correctly open", in.ready());
    }

    /**
     * Gets the name of the test. This method is only used in the unit test
     * class.
     */
    public String getTestName() {
        return url.toString();
    }
	
}