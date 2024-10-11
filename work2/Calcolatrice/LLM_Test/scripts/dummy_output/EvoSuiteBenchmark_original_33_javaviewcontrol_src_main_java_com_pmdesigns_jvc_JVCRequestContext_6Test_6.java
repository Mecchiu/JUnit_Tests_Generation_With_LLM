// JVCRequestContext_6Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContext_6Test {
		
	/**
	 * This method serves a file with the specified name, using HttpServletRequest.
	 * <p>
	 * It returns the contents of the file as defined by the associated Servlet.
	 * <p>
	 * Note that this test doesn't require an HttpServletRequest object so its servlet request objects
	 * don't need to be created from a file.  The method is therefore not really a unit test
	 * but will use Spring's configured instance of the {@link JVCRequestContext}
	 * interface. If that has changed it must be changed in its setUp(), and also in
	 * our method's implementation.
	 *
     * @param name the name of the file to serve
     * @return a <code>Reader</code> containing the contents of the file
	 * @throws Exception if an error occurs
	 */
    @Test
    public void fileServletRequest(String name) throws Exception {
        logger.info("Testing fileServletRequest("+name+")");

        // Create and initialize a servlet context with a context path that points to the 
        // fileServletRequest().
        JVCRequestContext sc = new JVCRequestContext();
        sc.setReqPath("/ServletRequest/Servlet");
        sc.setReqData(new String[] { name });

        // Try serving the "File" file using the JVCRequestContext.
        logger.info("Testing ServletFileUpload.processFileUpload("+sc+")");
        ServletFileUpload sfu = new ServletFileUpload();
        sfu.setFileSizeMax(50000000);
        sfu.setHeaderEncoding("UTF-8");
        sfu.setFileName("file.zip");
        sfu.setRequest(sc.getHreq());

        Reader r = sfu.open(sc.getHreq()) ;
        StringBuffer sb = new StringBuffer();
        Streams.copy(r, sb);
        assertEquals("Unexpected number of fields in the StringBuffer.", 5, sb.length());
        assertEquals("Unexpected field", r.read(), "Unexpected field");
        // Now check the contents of the stream
        logger.info("Testing ServletFileUpload(" + sc + ").getFileName()");
        assertEquals("Wrong field", "file.zip", sfu.getFileName());
        r.close();
        logger.info("Testing ServletFileUpload(" + sc + ").getData()");
        assertEquals("Wrong number of fields", 2, sfu.getFileName().length);
        assertEquals("Unexpected field", sb.toString(), "Contents of field in the StringBuffer didn't match");
    }
        
    /**
	 * This method servles the stream to the specified URL (that is, via an
	 * HttpServletRequest).
	 * <p>
     * It returns null so we don't have to do any further work to create a
	 * ServletRequest object because the method is called as a TestAction.
	 *
	 * @param url a url to serve the stream
     * @return the stream, can be null
     * @throws Exception if an error occurs
	 */
    @Test
    public void streamUpload(String url) throws Exception {
        logger.info("Testing streamUpload(" + url + ")");

        // Create a new request with a HttpServletRequest for which the name is not defined.
        HttpServletRequest sc = new HttpServletRequest();
        sc.setBufferSize(0);
        sc.addHeader("Cookie", "b=");
        HttpURLConnection hc = (HttpURLConnection)sc.getConnection();
        hc.setUseCaches(false);

        // Create a servlet instance to encapsulate the request
        JVCRequestContext scu = new JVCRequestContext();
        scu.setReqPath("/ServletRequest/Servlet");
        scu.setReqData(new String[] {"fileServletRequestTest"});

        // Wrap up the request
        scu.setHreq(sc);

        InputStream instream = scu.streamUpload(url);

        Reader r = new InputStreamReader(instream);
        String s = r.readLine();
        assertNull("Stream didn't end-up with a null", s);
        instream.close();
        scu.close();
    }
}