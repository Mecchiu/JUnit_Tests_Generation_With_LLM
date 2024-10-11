// JVCRequestContext_3Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {
		
    /**
     * Test set up.
     * @throws Exception if an exception occurs. 
     */
    @Test
    public void testSetUp() throws Exception {
        // JVCRequestContext_1Test.java
        
        Hashtable<String, String> flash = new Hashtable<String, String>();
        JVCRequestContext context = new JVCRequestContext();
        assertNull(context.getAttribute("flash"));

        String temp = "abcdefghijklmnop";
        context.setAttribute("flash", temp);

        assertEquals(temp, context.getAttribute("flash"));

        flash.put("flashKey", temp);

        assertEquals(temp, context.getAttribute("flash"));
    }
    
    /**
	 * Test get attribute using getAttribute(String).
	 */
    @Test
    public void testGetAttribute3() {
        
        Hashtable<String, String> flash = new Hashtable<String, String>();
        JVCRequestContext context = new JVCRequestContext();
        context.setAttribute("flash", "abcdefghijklmnop");

        assertEquals(null, context.getAttribute("flash"));

        String temp = "abcdefghijklmnop";
        flash.put("flashKey", temp);

        assertEquals(temp, context.getAttribute("flash"));
    }
    
    /**
     * Test the getAttribute(String name) method.  Get the flash value based
     * on name.
     */
    @Test
    public void testGetAttributeString() {
        
        Hashtable<String, String> flash = new Hashtable<String, String>();
        JVCRequestContext context = new JVCRequestContext();
        context.setAttribute("flash", "abcdefghijklmnop");

        assertEquals(null, context.getAttribute("flash"));

        String temp = context.getAttribute("flashKey");

        assertEquals("123", temp);
    }

}