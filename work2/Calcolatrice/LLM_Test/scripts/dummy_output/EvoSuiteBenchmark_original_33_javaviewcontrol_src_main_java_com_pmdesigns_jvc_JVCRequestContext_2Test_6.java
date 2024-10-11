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
		
    /** The url for the request */
    private String url = "http://www.example.com/?param=one&param=two";

    /** The context. */
    private HttpServletRequest request = new HttpServletRequest("GET", url) {
        };

    /** The writer. */
    private HttpServletResponse response = new HttpServletResponse() {
 
        /**
         * Gets the response content type.
         *
         * @return this HttpServletResponse's content type
         * @see HttpServletResponse#setContentType
         */
        public String getContentType() {
          return "application/xml; charset=UTF-8";
        }

        /**
         * Gets the status-code.
         *
         * @return this HttpServletResponse's status-code
         */
        public int getStatus() {
          return 200;
        }
        
      };

	@Test
	public void testGetResultAsMap() throws FileNotFoundException, XmlPullParserException {
		
		// Check status 200 and status for XML request.
		assertEquals("GET", request.getMethod());
		assertEquals("UTF-8", request.getCharacterEncoding()); // UTF-8: "UTF-8" is a default character set for text files -- it is also the default character set used by Java.
//        assertEquals("POST", request.getHeader("test")); // No test parameter.
		assertEquals("2", request.getParameter("test")); // test parameter not present (but should be in the request)
		assertFalse(request.getAttribute("status") == null); // check status is not null by default.
		assertEquals("1", getParamValue("param")); // check parameter value

        // This check also avoids false positives when the value for the flash Map is empty.
        // (This value won't be passed back to the client because the client will only see the value it had
        // at the beginning of the request, which we don't expect to receive due to the "X-HTTP-Header: ", in the request's response.)
        assertTrue(getParamValues("param").length == 0);
	}
	
	/**
	 * Gets the parameter value.
	 *
	 * @param key the name of the parameter(s) to get
	 * @return the parameter value for the indicated name, or null if the value could not be retrieved
	 */
	public String getParamValue(String key) {

		String value = response.getHeader(key);
		if (value == null) {
			value = getParamValue(key, null);
		}
		return value;
	}
	
	/**
	 * Gets the parameter value.
	 *
	 * @param key the name of the parameter(s) to get
	 * @param params a Map of parameter names and values to retrieve
	 * @return the parameter value for the indicated name, or null if the value could not be retrieved
	 */
	public String getParamValue(String key, Map<String,String> params) {
		String value = params.get("param");
		if (value == null) {
			value = getParamValue(key);
			params.put("param", value);
		}
		return value;
	}

	/** Returns the http response as a reader */
	Reader getReader() {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(response.getInputStream()));
        String line = reader.readLine();
        while (line!= null) {
            line = line.trim();
            if (line.length() > 0) {
//        	System.out.println("<" + line + ">");
            	return new StringReader(line);
            }
        }
		return new StringReader("");
	}
}