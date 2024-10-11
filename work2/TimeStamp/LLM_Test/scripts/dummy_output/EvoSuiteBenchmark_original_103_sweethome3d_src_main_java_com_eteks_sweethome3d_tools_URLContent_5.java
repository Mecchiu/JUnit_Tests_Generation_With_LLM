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
    public void testConstructor() {
        String s1 = "name";
        String s2 = "name" + "  ";
        String s3 = "name" + "/";
        String s4 = "name" + "  /";

        //
        URLContent content = new URLContent(s1) {
            @Override
            public URL getURL() {
                return s2;
            }
        };
        assertEquals(s1, content.getJAREntryURL().getName());

        //
        content = new URLContent(s2) {
            @Override
            public URL getURL() {
                return s3;
            }
        };
        assertEquals(s2, content.getJAREntryURL().getName());

        //
        content = new URLContent(s4) {
            @Override
            public URL getURL() {
                return s2;
            }
        };
        assertEquals(s4, content.getJAREntryURL().getName());
    }



}