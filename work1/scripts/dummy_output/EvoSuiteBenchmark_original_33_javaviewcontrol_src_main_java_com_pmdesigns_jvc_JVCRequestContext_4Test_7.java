// JVCRequestContext_4Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_4Test {
		private final JVCRequestContext rc;

    /**
     * Constructor with the JVC request context to be tested.
     * @param rc JVCRequestContext to be used.
     */
    public JVCRequestContext_4Test(JVCRequestContext rc) {
		this.rc = rc;
	}

    /**
     * Test of getSessionAttr() method, of class JVCRequestContext.
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException 
     */
    @Test
    public void testGetSessionAttr() throws IOException, InterruptedException {
		final HttpURLConnection conn = this.rc.getConnection();
		assertNotNull(conn);
		final String url = conn.getURL().toString();
        
        assertEquals(url, conn.getURL().toString());
        try {
            conn.addRequestProperty("Content-Type", "application/vnd.net.mcms");
        } catch (final UnknownHostException ex) {
            fail("JVM does not support this HTTP request.");
        }
		final String attr = this.rc.getSessionAttr("flash.temp_url");
        assertNotNull(attr);
        assertEquals(url, attr);
        super.checkResponse(rc.getConnection(), conn);
    }

    /**
     * Test of setSessionAttr() method, of class JVCRequestContext.
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException 
     */
    @Test
    public void testSetSessionAttr() throws IOException, InterruptedException {
		this.rc.setSessionAttr("flash.temp_url", "new URL");
		final String attr = this.rc.getSessionAttr("flash.temp_url");
		assertNotNull(attr);
		assertEquals("new URL", attr);
		super.checkResponse(this.rc.getConnection(), this.rc.getConnection().getResponseCode());
	}

}