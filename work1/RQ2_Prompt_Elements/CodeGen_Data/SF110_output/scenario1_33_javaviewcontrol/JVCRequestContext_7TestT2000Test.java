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

	private String makeLink(String anchor, String path, String extra) {
		// create the context
		JVCRequestContext context = new JVCRequestContext(anchor, path);

		// add a link with the optional arguments in the path
		context.getResponse().addHeader("X-FLASH", "Hello World");

		// request and print out the response
		context.getResponse().setStatus(HttpServletResponse.SC_OK);
		context.getResponse().getWriter().write(
			"FLASH "+ path + extra
		);

		// return the response
		return getPrintableResult(context.getResponse(), context.getFlow()); 
	}
    
    /**
    * Test that links can be formatted.
    */
    @Test
    public void testLinksCanBeFormatted() {
                                       
        // an image is required for the thumbnail request
        HttpURLConnection connection = null;
        HttpURLConnection htmlConnection = null;
        ArrayList<File> files = new ArrayList<File>(1);
                                    
        String key = makeLink("key", "/some/url/path");
                                                    
        if (key!= null) {

            // if the context is redirecting, redirect to another url
            connection = getHttpURLConnection("/some/url/path");
            files.add(getFile("some/path.gif"));
            
            connection.addRequestProperty("Cache-Control", "no-cache");
            connection.addRequestProperty("Pragma", "no-cache");
            connection.addRequestProperty("X-File-Name", "jvc.gif");
            connection.addRequestProperty("Content-type", "image/gif");
          

            htmlConnection = getHttpURLConnection(key);
            connection.setUseCaches(false);
            connection.connect();

            // print out the response
            assertEquals(-1, connection.getErrorCode());

            assertEquals(Response.SC_OK, connection.getResponseCode());


            String contentType = connection.getHeaderField("Content-type");
            assertTrue(contentType.startsWith("image/") && contentType.endsWith("/") && contentType.length() > 3);
            String contentDisposition = connection.getHeaderField("Content-Disposition");
            assertTrue(contentDisposition.endsWith("attachment; name="));



            // read in the image
            String inputFile = getTextFileContents(connection.getInputStream());
            assertNotNull("Missing path", inputFile);
            inputFile = removeEndToken(inputFile); // strip the trailing end token in the path
                                                    // (useful for the link text)

            files.add(getFile(inputFile));

            // read in the image
                    
            File outFile = getFile(contentType + "/" + contentDisposition + "/jvc.gif");
            outFile.deleteOnExit();
          
            connection.connect();
            
            // should no longer be able to download
            assertFalse(connection.getLastModified());
            assertFalse(connection.getUseCaches());
                                                     
            assertFalse(connection.getResponseCode(), true);
            
            // should have written
            //assertEquals(200, connection.getResponseCode()); 


            // form the link
            output = context.makeLink(files, outFile);

            // get the results
            connection.connect();

            outFile.deleteOnExit();
            connection.disconnect();
            connection = null;
            htmlConnection = null;

            // there should now be one result
            assertNotNull(outFile.exists());
            String linktext = new String(getBytes(outFile), "UTF-8");


            // request and print out the response
            assertEquals(-1, connection.getErrorCode());

            assertEquals(Response.SC_OK, connection.getResponseCode());

            // verify that the content was in a string
            assertTrue(linktext.length() > 0);

            assertTrue(linktext.replaceAll(" ", "")
                          .replaceAll("\n", "" )
                          .replaceAll("\r", "" )
                          .startsWith(extra));
                                    
        }
    }
    
    /**
    * Use case where the link is an absolute path.
    */
    @Test
   public void testLinkNotAnImage() {
            
        String key = makeLink("key", "/some/url2/path2");

        if (key!= null) {

            HttpURLConnection connection = null;

            connection = getHttpURLConnection("/some/url2/path2");

            // only request headers
            connection.setRequestProperty("X-File-Size", "0");
            connection.setRequestProperty("Content-Type", "text/plain");

            assertNull(connection.getHeaderField("Etag"));
            String url = (connection).getURL().toString();
            
            HttpURLConnection outConn = getHttpURLConnection(key);
            outConn.connect();
                    
            Connection connectionOut = outConn.getConnection();
            assertSame("Connection out should share the same connection", connectionOut, connection);
                       
            assertEquals(url, connectionOut.getURL().toString());

        }
    }
    
    /**
    * Test that we cannot write if the response header can't be set.
    */
    @Test(expected=IllegalStateException.class)
    public void testFileWriteThrowsException() throws Exception {
        
        String key = makeLink("key", "/some/url2/path/that/stry");
        HttpURLConnection conn = getHttpURLConnection("/some/url2/path/that/stry");    
    }
    
    /**
    * Test that we cannot read when the content length can't be determined.
    */
    @Test(expected=IllegalStateException.class)
    public void testFileLengthReadThrowsException() throws Exception {
        
        String key = makeLink("key", "/some/url2/path/that/stry");
        HttpURLConnection conn = getHttpURLConnection("/some/url2/path/that/stry");    
    }
    
    /**
    * Test that we can read the binary content but can't seek.
    */
    @Test
    public void testNotSeekWrite() throws Exception {
        
        String key = makeLink("key", "/some/url2/path/that/stry");
        HttpURLConnection conn = getHttpURLConnection("/some/url2/path/that/stry");    
    }
    