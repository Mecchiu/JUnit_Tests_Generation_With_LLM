// JVCRequestContext_9Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {
		
    static final String TEST_DATA = "<div>hello</div><div>there</div>";
    
    /**
     * Constructor for JVCRequestContext_9Test.
     */
    public JVCRequestContext_9Test() {
    }

    /**
     * Check that a JVCRequestContext contains a key that has some type.
     */
    @Test
    public final void checkType() {
        final JVCRequestContext thisContext = new JVCRequestContext();
        thisContext.setHttpRequest(new HttpServletRequest());
        thisContext.setHttpServletResponse(new HttpServletResponse());
        thisContext.setKey("testType");
        assertNotNull(thisContext.getKey());
    }
    
    /**
     * Test getRequest method.
     */
    @Test
    public final void checkGetRequest() {
        final JVCRequestContext thisContext = new JVCRequestContext();
        thisContext.setHttpRequest(new HttpServletRequest());
        thisContext.setHttpServletResponse(new HttpServletResponse());
        thisContext.setKey("testGetRequest");
        thisContext.setHttpServletRequest(new HttpServletRequest());
        thisContext.setHttpServletResponse(new HttpServletResponse());
        assertEquals(thisContext.getHttpRequest(), thisContext.getHttpServletRequest());
        assertEquals(thisContext.getHttpServletResponse(), thisContext.getHttpServletResponse());
    }

    /**
     * Test getHttpRequest method.
     */
    @Test
    public void checkGetHttpRequest() {
        final JVCRequestContext thisContext = new JVCRequestContext();
        thisContext.setHttpRequest(new HttpURLConnection());
        thisContext.setHttpServletResponse(new HttpServletResponse());
        assertEquals(thisContext.getHttpRequest(), thisContext.getHttpURLConnection().getRequest());
    }

    /**
     * Test getHttpServletRequest method.
     */
    @Test
    public void checkHttpServletRequest() {
        final JVCRequestContext thisContext = new JVCRequestContext();
        thisContext.setHttpRequest(new URL("http://localhost"));
        thisContext.setHttpServletResponse(new HttpServletResponse());
        assertEquals(thisContext.getHttpServletRequest(), thisContext.getHttpURLConnection().getRequest());
    }

    /**
     * Test getHttpServletResponse method.
     */
    @Test
    public void checkHttpServletResponse() {
        final JVCRequestContext thisContext = new JVCRequestContext();
        thisContext.setHttpRequest(new URL("http://localhost"));
        thisContext.setHttpServletResponse(new HttpServletResponse());
        assertEquals(thisContext.getHttpServletResponse(), thisContext.getHttpURLConnection().getResponse());    
    }    

    /**
     * Test getKey method.
     * An attempt to retrieve the key does not trigger an attempt to retreive a value.
     */
    @Test
    public void checkKey() {     
        final HttpServletRequest expected = new HttpServletRequest();
        final HttpServletResponse expectedResp = new HttpServletResponse();
        final JVCRequestContext thisContext = new JVCRequestContext();
        thisContext.setKey("testKey");
        assertEquals(expected.getAttribute(HttpServletRequest.SCOPE_ATTRIBUTE), null);
        assertEquals(expectedResp.getAttribute(HttpServletResponse.SCOPE_ATTRIBUTE), expected); 
        assertEquals(expectedResp.getAttribute(HttpServletRequest.FILE_ATTRIBUTE), null);
        assertEquals(expectedResp.getAttribute(HttpServletResponse.FILE_ATTRIBUTE), null);
        assertEquals(thisContext.getKey(), expected.getParameter(HttpServletRequest.SCOPE_ATTRIBUTE));
    }

 
    /**
     * Test getHttpServletRequest method.
         
     * This test demonstrates a tricky issue, which is that a servlet does not
     * return an object from the following methods.
     * <ul>
     * <li>getInputStream()</li>
     * <li>getInputStream()</li>
     * <li>getContentType()</li>
     * <li>getContentLength()</li>
     * </ul>
     */
    @Test
    public void checkGetHttpServletRequest() throws IOException {
        final HttpServletRequest expected = new HttpServletRequest();
        final ServletRequestAttributeSet attrs = new HashSet<>();
        expected.setAttribute("http", attrs);

        final ServletRequestAttributeSet attrs2 = new HashSet<>();
        expected.setAttribute("http", attrs2);
        
        final ServletRequestAttributeSet attrs3 = new HashSet<>();
        expected.setAttribute("http", attrs3);
        
        final ServletRequestAttributeSet attrs4 = new HashSet<>();
        expected.setAttribute("http", attrs4);
        
        final ServletRequestAttributeSet attrs5 = new HashSet<>();
        expected.setAttribute("http", attrs5);
        
        final ServletRequestAttributeSet attrs6 = new HashSet<>();
        expected.setAttribute("http", attrs6);
        
        expected.setAttribute("http", attrs);
        // make sure the first attribute set returned is 'key=value'
        attrs.add(new Attribute("http",
            "key",
            "value"));
        // and the second is 'key=value'
        attrs2.add(new Attribute("http",
            "key",
            "value"));
        // and the third is 'key=value'
        attrs3.add(new Attribute("http",
            "key",
            "value"));
        // and the fourth is 'key=value'
        attrs4.add(new Attribute("http",
            "key",
            "value"));
        // and the fifth is 'key=value'
        attrs5.add(new Attribute("http",
            "key",
            "value"));
        // and the sixth is 'key=value'    
}
}