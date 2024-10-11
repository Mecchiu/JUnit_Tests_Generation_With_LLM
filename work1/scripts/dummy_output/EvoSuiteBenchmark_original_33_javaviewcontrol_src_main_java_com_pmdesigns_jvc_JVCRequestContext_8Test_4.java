// JVCRequestContext_8Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {
		
    /**
     *
     * @param path the target path
     * @param filePath the file path
     * @param scope the path to scope (if null this is equivalent to <code>makeLink(null, null, options);</code> )
     * @param options extra html options to add to the link tag
     * @see JVCRequestContext#makeLink(String, String, String)
     */
    
    public String makeLink(String path, String filePath, String scope, String options)
    {
        // Create the context
        JVCRequestContext rc = new JVCRequestContext();
        rc.scope =  scope;


        if (path!=null) { r = rc.makeLink(path, filePath, options); }
        return r;
    }
    
    /**
     * Test the methods to construct links.  This is the same method except we have some extra extra stuff here.
     */
    @Test
    public void test_method() throws IOException {
        String r = makeLink("/cgi-bin/cgi.cgi", "getcgi.cgi", null);
        fail("should fail creating links: not even a valid path: "+r);
    }

    /**
     * Test the methods to construct links.  This is the same method except we have some extra stuff here.
     */
    @Test
    public void test_abs() throws IOException {
        String r = makeLink("/cgi", "getcgi.cgi", null);
        fail("should fail creating links: not even a valid path: "+r);
    }
    
    /**
     * Test the method to get the internal context name.
     * @param scope scope of the context
     */
    @Test
    public void test_getScope() {
        assertNull(rc.getScope());
        JVCRequestContext_8Test.this.scope = "1.23";
        assertEquals("1.23", rc.getScope());
    }
    /**
     * Test the method to get the internal context name.
     * @param scope scope of the context
     */
    @Test
    public void test_getRel() {
        assertNull(rc.getRel());
        JVCRequestContext_8Test.this.scope = "1.23";
        assertEquals("1.23", rc.getRel());
    }
	
}