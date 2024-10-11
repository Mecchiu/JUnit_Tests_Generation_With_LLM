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
	 * Returns the url of the URL content class.
	 * @throws MalformedURLException if this object can't be opened.
	*/
	@Test
    public void testConstructor() throws MalformedURLException {
		URLContent classAsURLContent = new URLContent(URLContent.class.getURL());

		assertNotNull(classAsURLContent);

		assertEquals(URLContent.class.getName(), classAsURLContent.getClass().getName());
    	assertEquals(classAsURLContent.uri(), classAsURLContent.getURL().toString()); 
        assertEquals(classAsURLContent.getURL(), classAsURLContent.openStream());              
	}
	
	/**
	 * Test method for {@link  URLContent#getURL()}.
	 */
    @Test
    public void testGetURL() throws MalformedURLException {

        URLContent classAsURLContent = new URLContent(URLContent.class.getURL());
        
		// Check the value obtained by calling openStream()
        URI uri = classAsURLContent.getURL();
        
        URL url = ClassLoader.getSystemResource(uri.getPath());
        
        assertNotNull(url);
		
        // check the URI:
        assertTrue(url.toString().matches("^[a-zA-Z0-9][a-zA-Z0-9\\-]*://" + uri.toString()));
		
        // Check the value obtained by calling getJAREntryURL()
        URI jarentryUri = classAsURLContent.getJAREntryURL();
        
        assertEquals("jarentry", jarentryUri.getPath());
        assertEquals("jarentry.html", jarentryUri.getPath().substring(0, uri.toString().length() - 1));
        
        // Check the value obtained by calling getJAREntryName()
        URI jarentryNameUri = classAsURLContent.getJAREntryName();
        
        assertEquals("jarentry.html", jarentryNameUri.getPath().substring(uri.toString().length() - 1, uri.toString().length()));
    }

    /**
	 * Test method for {@link  URLContent#equals(Object)}.
	 */
    @Test    
    public void testEquals() throws MalformedURLException {
    		URLContent classAsURLContent1 = new URLContent(URLContent.class.getURL());
    		URLContent classAsURLContent2 = new URLContent(URLContent.class);
    		
    		assertEquals(classAsURLContent1, classAsURLContent2);
    		
    		assertFalse(classAsURLContent1.equals(new URLContent(null)));       		        		
    }
    
    
	/**
	 * Test method for {@link URLContent#toString()}.
	 */
    @Test
    public void testToString() throws MalformedURLException {
    		URLContent classAsURLContent1 = new URLContent(URLContent.class);
    		String result = classAsURLContent1.toString();
    		
    		URLCaptionURI uri = new URLCaptionURI(classAsURLContent1.getURL());

    		URL expectedURL;
    		
    		System.out.printf("Existe URI %s \\\n\t", uri);
    		expectedURL = "URI:";
    		
    		expectedURL = new URL("http://www.eteks.com/foo");
    		
    		System.out.printf("%s\t, %s\n", expectedURL.toString(), result);
    		
    		expectedURL = new URL("http://example.com/foo.html#bar");
    		
    		System.out.println(result);
    		
    		expectedURL = new URL("http://example.com/foo");
    		
    		System.out.println(result);
    		
    		expectedURL = new URL("http://www.example.com/foo#bar");
    		
    		System.out.println(result);

    		expectedURL = new URL("http://abcxyz.com/foo");
    		
    		System.out.println(result);
    		
    		expectedURL = new URL("http://example.com/foo:bar/");
    		
    		System.out.println(result);

    		expectedURL = new URL("http://example.com:123/foo/");
    		
    		System.out.println(result);
    }
}