// JVCRequestContext_7Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {
		
	private static final String TAG = "JVC Request Context";
	private static final String URL = "https://www.foo.com";
	private static final String FILE_NAME = "test.txt";
	
	/**
	 * Unit tests for the {@link JVCRequestContext#makeLink(String, String)} method.
	*/
	@Test
    public void testMakeLink ( ) throws Exception {
       //createFile() throws IOException  // this is used by the servlet container
       //fileOutputStream() throws IOException  // this is used by the servlet container
	   //createFile() throws IOException  // this is used by the servlet container
	   //String fileName = createFile()  // this is used by the servlet container.
        	JVCRequestContext newTestContext = new JVCRequestContext(TAG, URL);
        	assertTrue("makeLink() returned an empty list", newTestContext.allKeys().isEmpty());
        	assertNull("makeLink() returned an empty list", newTestContext.getLink(null));
        	assertNull("makeLink() returned a null link", newTestContext.makeLink("/", "/"));
        	assertEquals("makeLink() returned wrong value", newTestContext.makeLink(null, "../../test/fileName"), "/test/fileName");
        	assertEquals("makeLink() returned wrong key for key", newTestContext.makeLink("/", "/"), "fileName");
    }
    
    @Test
    public void testAbsPath(){
    	JVCRequestContext context = new JVCRequestContext(TAG, URL);
    	assertTrue("expected null path for relative links", context.absPath(null) == null);
        assertEquals("Absolute path does not match expected path", context.absPath("/"), context.absPath("../../"));
        context.absPath(null);
    }
    
    @Test
    public void testAddKey(){
    	JVCRequestContext context = new JVCRequestContext(TAG, URL);
        assertTrue("addPathToContext() does not add the key to context", context.addPathToContext(null));
        assertEquals("addPathToContext() returned incorrect result", context.allKeys().size(), 1);
        
        for(String key : context.allKeys())
        {
            assertTrue("a key must be added", context.allKeys().contains(key));
        }
        
        assertFalse("a key is no longer added during the test", context.allKeys().contains("test_key"));
        context.addPathToContext("test_key");
        assertEquals("replace the key", 1, context.allKeys().size());
    }
    
    @Test
    public void testAddLink(){
    	JVCRequestContext context = new JVCRequestContext(TAG, URL);
        for(int i = 0; i < 5; i++) {
            context.addLink("/link1/" + i + "/link2", "/link3/" + i + "/link4");
        }
        List<Link> links = context.allLinks();
        assertEquals("addLinkToContext() did not add all links to context", links.size(), 5);
        Link link = links.get(0);
        assertTrue("a link key was not added to the context", links.contains(link));
    }
    
    @Test
    public void testAddLinkToContext(){
    	JVCRequestContext context = new JVCRequestContext(TAG, URL, null, null);
        assertFalse("addLinkToContext() added a link to context", context.allKeys().contains("test_key"));
        assertFalse("a link key was added to the context", context.allKeys().contains("test_link1"));
        context.addLink("/link1/link2", "/link3/link4");
        assertTrue("addLinkToContext() added the link to context", context.allKeys().contains("test_key"));
    }

	private String createFile(){
		File f = new File(FILE_NAME);
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL(URL + "/")
				.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type",
					"multipart/form-data; boundary=--------------------------"+"--------------------------"+"--------------------------"+"");
			conn.addRequestProperty("A-F", "Déjà été fait à partir de quelle parte.");   // don't get a 403 error
			conn.connect();
			InputStream in = conn.getInputStream();
			OutputStream out = new FileOutputStream (f);
			Streams.copy(in, out);
			in.close();
			out.close();
		} catch (Exception e)
		{
			if (e instanceof IOException)
				return "IOException";
			else
				return "Expected exception; " + e;
		}
		return FILE_NAME;
	}
}