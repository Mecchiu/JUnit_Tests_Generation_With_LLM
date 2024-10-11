// JVCRequestContext_2Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {
		/**
   		* This test method is the set of units to be performed within the {@link JVCRequestContext} class:
   		*
   		* setUp() performs one test set up sequence - the following
   		* sequence is executed:
   		* 1. request setup
   		* 2. request path evaluation
   		* 3. create request
   		* 4. validate request path against expected results
   		* 5. validate request path against the flash
   		* 6. process the request.
   		* 7. verify the resulting results
   		*
   		* @throws Exception thrown in case of an error.
     */
  @Test
  public void testSetup() throws Exception {

    /**
   		request setup
   		*/
  	JVCRequestContext ctx = new JVCRequestContext();

    TestRequest rq = new TestRequest();
    ctx.setRequestObject(rq);

    assertEquals("http", rq.getRequest().getProtocol());
    assertEquals("test_url", rq.getRequest().getTargetURL());

    // create request
    HttpServletRequest req = new HttpServletRequest(rq.getRequest());
    rq.setRequest(req);

    assertNotNull(rq.getRequest().getRequestURI());
    StringBuffer srq = ctx.getRequestURI();
    String requestURI = srq.toString();
        
    int testIDx = 0;
    for (testIDx = 0; testIDx < 7; testIDx++) {
    	String testURL = "test" + testIDx + "/";
    	if (requestURI.indexOf("?") == -1) {
    		srq.append(testURL);
    		srq.append("?");
    	} else {
    		srq.append(testURL);
    		srq.append("&");
    	}
    }

    req.setRawRequest(srq.toString());
    req.getContextPath();                       // path is not being used
    req.setCharacterEncoding("UTF-8");  // not setting this in the original fileupload
    req.setSecure( true );

    byte[] postByte = new byte[2];
    postByte[0] = (byte)0xFF;
    postByte[1] = (byte)0xD0;
    req.setContent( new ByteArrayInputStream(postByte) );

    HttpServletResponse resp = new HttpServletResponse(ctx);
    HttpURLConnection conn = (HttpURLConnection)req.openConnection();
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Type", "image/jpeg");
    conn.setRequestProperty("Content-length", String.valueOf(postByte.length));
    conn.setRequestProperty("Cookie", "testCookieValue");
    OutputStream os = conn.getOutputStream();
    Streams.write(postByte, 0, postByte.length);
    os.write(postByte);
    InputStream is = conn.getInputStream();
    Streams.copy(is);
    os.close();

    assertEquals("javax.servlet.http.HttpServletResponse", conn.getResponseContentType());
    assertEquals(200, conn.getResponseCode());

    String link = ctx.createLink("index.jsp", "1.jsp");
    assertEquals("index.jsp", l);

    assertTrue(ctx.linkExists("index.js"));
	
    assertEquals("text/html", ctx.getRequest().getContentType());

    Streams.closeQuietly(os);
    assertTrue(ctx.linkExists("index.html"));

    Streams.closeQuietly(is);

  	rq.validateParam("query", "param");                // test value, param name
    rq.validateParam("", "param2"); 

    // test flash
    OutputStream os = ctx.getRequest().getOutputStream();    // use default flash, empty flash
    Streams.write("", os);
    Streams.closeQuietly(os);
 
    Map flash = ctx.getParamMap("flash");
    assertNotNull(flash);
    assertTrue(flash.size() == 3);
  	if(flash.size() == 5 && flash.containsKey("flash1"))
  		assertTrue(flash.get("flash1").compareTo("test_url") == 0);
  	else if(flash.size() == 5 && flash.containsKey("flash2"))
  		assertTrue(flash.get("flash2").compareTo("url") == 0);

    os = ctx.getRequest().getOutputStream();    // use flash with "url" key
    File f = new File("Test.jsp");   
		os.write(f.getBytes());
    os.close();
  	
    rq.getRedirect();

  }

  private class TestRequest extends HttpServletRequest implements ServletRequest {

    public TestRequest() {

    }

    void validateParam(String key, String value) {

    }

    void linkExists(String linkname) {

    }

    boolean linkExists() {

    	return false;
    }

  }

  private class TestRequest2 implements ServletRequest {

   	String[] params = {};

    public TestRequest2() {

        params = testParamValues();
    }

  	public String[] getParamValues(String name) {
        return testParamValues();
    }

    private String[] testParamValues() {
        Enumeration e = req.getParameterNames();

        Vector values = new Vector();
        while (e.hasMoreElements()) {
            String name = (String)e.nextElement();
            values.add(name);
        }

        return (String[])values.toArray(new String[values.size()]);
    }
  }


}