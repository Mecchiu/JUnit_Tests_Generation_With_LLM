// JVCRequestContext_0Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {
		
    /**
     * Test case for the getParam(String) method.
     */
    @Test
    public void testGetParam() throws Exception {
                
        // Create request
    	String reqStr = "";
    	URL url = new URL(null, "?command=getParam&param=<none>", reqStr.getBytes(),
    				"&contentLength=" + reqStr.getBytes().length);
    	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        HttpURLConnection.setInstanceFollowRedirects
        (conn, false);
    	conn.connect();

        // Check if the request is handled
        assertEquals("GET", conn.getRequestMethod());
        // Check the value of the 'a' parameter
        String aParam = conn.getHeaderField("a");
        assertNotNull(aParam);
        assertEquals("<none>", aParam);
        // Ensure the request param has been handled
        assertNull(conn.getHeaderField("b"));
        // Read response
        ServletOutputStream resp = new ServletOutputStream() {

			@Override
			public void write(int b) throws IOException {
				int v;
    			try {
	    			v = (int) (b & 0xff);
    			} catch (Exception e) {
    				assertNull(e);
    			}
    			resp.write(b);
    		}
		};

		resp.close();

        // check the response
        HttpURLConnection respConn = (HttpURLConnection) url.openConnection();
        try {
            respConn.getInputStream();
            resp = respConn.getErrorStream();
            assertNotNull(resp);
        } finally {
            respConn.disconnect();
         }
    }
		
  /**
* Test case for the getParam() method.
*/
  @Test
  public void testGetParamWithMultiParam() throws Exception {
    // Create request
    String reqStr = "";

    // Add parameters with values
    List<MultiPartRequestParameter> reqParams = new ArrayList<MultiPartRequestParameter>();
    reqParams.add(new MultiPartRequestParameter("param1", "value1", "valueA"));
    reqParams.add(new MultiPartRequestParameter("param2", "value2", "valueB"));
    reqParams.add(new MultiPartRequestParameter("param3", "", "c"));

    byte[] bytes = "{\"param1\"=value1,\"param2\"=value2,\"param3\"=c}".getBytes();
    String paramStr = "?param1=valueA&param2=valueB&param3=c";
    URL url = new URL(null, reqStr + paramStr, bytes,
            "&contentLength=" + bytes.length);

    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    MultiPartEntityParser parser = new MultiPartEntityParser();
    conn.setRequestMethod("POST");
    if(reqParams.size() > 0) {
        conn.setDoOutput(true);
        conn.setInstanceFollowRedirects(false);
        conn.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
        StringBuilder body = new  StringBuilder();
        conn.setRequestProperty("Content-Length", ""+bytes.length);
        for (MultiPartRequestParameter mParam : reqParams) {
            if (mParam.getValue()!=null) {
                String value = mParam.getValue();
                body.append(value);
            }
        }
    	conn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
        try {
                parser.parse(conn);
        } catch (Exception e) {
        	fail ("Error parsing POST request");
        }
        // Check if the value is retrieved
            String v = parser.getValue();
            assertNotNull(v);
            // Check the value
            assertEquals("valueA", v);
    }
    conn.connect();
  }
}