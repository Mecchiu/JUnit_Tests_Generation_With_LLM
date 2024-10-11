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
     * Test of the openStream method, of class URLContent.
     */
    @Test
    void testOpenStream() {
        System.out.println("openStream");
        URL url = null;
        try {
            url = new URL("http://foobar.com/foobar.txt");
        } catch (MalformedURLException e) {
            fail("MalformedURLException expected");
        }
        InputStream in = null;
        try {	
            in = url.openStream();		
        } catch (IOException e) {
            fail("IOException expected");
        }

        assertTrue(url.equals(new URL("http://foobar.com/foobar.txt")));
		
        assertTrue(in.read() == 0);
        try {	
            in.close();
        } catch (IOException e) {
            fail("IOException expected");
        }
    }
}
