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
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#absPath(String)}.
	 */

	@Test 
	public void testAbsPath() throws Exception {
	
    HttpServletRequest request = new JVCRequestContext().set("/").set("/a/a/").set("/a/b/").set("/b/").set("/y/").set("/z/").set("/").set("/g/").set("/a/a/").set("/b/").set("/");
    HttpServletResponse response = null;
    Object obj = null;
    
    assertNotNull(request);
    assertNotNull(response);

    // test empty path
    obj = request.getAttribute(JVCRequestContext.absPath(""));
    assertEquals(obj, "");
    obj = request.getAttribute(JVCRequestContext.absPath("/"));
    assertEquals(obj, "/");
    obj = request.getAttribute(JVCRequestContext.absPath("/a/"));
    assertEquals(obj, "/a/");
    obj = request.getAttribute(JVCRequestContext.absPath("/b/"));
    assertEquals(obj, "/b/");
    obj = request.getAttribute(JVCRequestContext.absPath("/"));
    assertEquals(obj, "/");

    // test relative /, a or b
    obj = request.getAttribute(JVCRequestContext.absPath("/a/"));
    assertEquals(obj, "/a/");
    obj = request.getAttribute(JVCRequestContext.absPath("/b/"));
    assertEquals(obj, "/b/");
    obj = request.getAttribute(JVCRequestContext.absPath("/b"));
    assertEquals(obj, "/");

    // test relative /, in a or b
    obj = request.getAttribute(JVCRequestContext.absPath("/a/"));
    assertEquals(obj, "/a/");
    obj = request.getAttribute(JVCRequestContext.absPath("/b"));
    assertEquals(obj, "/b");

	}
    
}