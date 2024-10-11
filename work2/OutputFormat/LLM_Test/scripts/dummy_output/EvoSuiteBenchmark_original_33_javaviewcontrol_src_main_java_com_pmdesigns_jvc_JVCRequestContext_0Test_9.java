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
		 * This method is used to get a HttpServletRequest object from the servlet
		 * response and return a HttpServletResponse object for use with the
		 * servlet.
		 *
		 * @param servletResponse the Http Servlet Request object to return
		 * @return the Http Servlet Response object
		 */
        @Test
    public void testGetParam() throws Exception {

        Request aRequest;
        Response aResponse;

        // Create a request object that will act as a context within JVCRequestContext

        HttpServletRequest aRequest_src = new Mock_MockHttpServletRequest("GET", "/foo.html");
        HttpServletRequest aRequest_dest = new Mock_MockHttpServletRequest("GET", "/bar.html");

        aRequest = new Mock_MockHttpServletRequest("POST", "/baz.html");

        aResponse = new Mock_MockHttpServletResponse();
    
        Request aRequestObj = new Request(aRequest);
        Response aResponseObj = new Response(aRequest, aResponse);
        JVCRequestContext._servletContext = aRequest_src.getSession().getServletContext();

        // get a param from the request object
        String param = JVCRequestContext._servletContext.getRequest().getParameter(aRequestObject.getParameterName());
        assertNotNull(param);
        assertEquals(param, aRequestObject.getParameter(aRequestObject.getParameterName()));
        assertEquals(param, aRequest.getParameter(aRequest.getParameterName()));

        // get the response to the param object
        String str = JVCRequestContext._servletContext.getRequestProperty(aRequestObject.getParameterName(), "default");
        assertEquals("default",str);

        aRequest_dest.setContentType("text/html");
        aResponse_src.setContentType("text/html");

        // get the response to the destination (param object) 
        String strDest = aResponseObj._getResponseAsString();
        assertEquals("text/html",strDest);

        aResponseObj.setContentType("text/plain");
        aResponse_dest.setContentType("text/plain");

        // get the response to the response object
        String strResponse = aResponseObj._getResponseAsString();
        assertEquals("text/plain",strResponse);

        // get the flash object
        Map flash = aResponse._getFlash();

        //get key from flash param
        String key = (String) flash.get("JVCParam");

        assertNotNull(key);
        assertEquals("default",key);

        //get the value from flash param
        String value = (String) flash.get("default");

        assertEquals("default",value);

        assertFalse(flash.get("JVCParam").equals(""));

        // get the flash value and check that it is not null
        aResponse.getFlash();

        assertNotNull(flash.get("JVCParam"));
        assertEquals("default",flash.get("JVCParam"));

        //get the response value and check that it is not null
        aResponseObj.getResponse();

        assertNotNull(aResponseObj.getFlash());

        // get the flash value and check that it is not null for this test

        String flashValue = flash.get("jvcParam");
        assertNotNull(flashValue);
        assertEquals("default", flashValue);

        // get the response value's flash value and check that it is not null

        String valResp = aResponse._getFlash().getString("value");

        assertNotNull(valResp);
        assertNotNull(valResp);

        // get the response's flash type and check that it is not null

        String FlashType = aResponse._getFlash().getString("type");

        assertEquals("text/html", FlashType);

        // check if the "jvcParam" attribute is present in response

        HttpServletRequest request = aRequest_src;
    		HttpServletResponse response = aResponse_src;

    	HttpSession session = request.getSession();

        String strAttr = null;
        strAttr = request.getAttribute(aRequestObject.getParameterName());

        assertNull(strAttr);

    	// create another object and check if it has the same value as the previous object (in case another request comes in and then this request receives the parameter from this)

        aRequest_dest = new Mock_MockHttpServletRequest("POST", "/baz.html");
        aRequest_dest.setContentType("text/html");
   		aResponse_dest = new Mock_MockHttpServletResponse();
    	aRequest_dest.setContentLength(1000);
    	aRequest_dest.setCharacterEncoding("UTF-8");
    	aResponse_dest.setContentLength(_jvcResponseLength);
    	aRequest_dest.addHeader(
        		"Content-length", String.valueOf(_responseLength));
    	aResponse_dest.setCharacterEncoding("UTF-8");
		aResponse_dest.addHeader(
        		"Content-length", String.valueOf(_responseLength));
    	aResponse_dest.setCharacterEncoding("UTF-8");

    	aResponse_dest = Thread.currentThread().getContextClassLoader().getResource("/bar.html");
        aRequest_dest = new HttpURLConnection("GET", aRequest_dest);
    	aRequest_dest = new HttpURLConnection("POST", aRequest_dest);

        aRequest_dest = new ServletFileUpload(aRequest_dest);

    	aRequest_dest = new ServletFileUpload(aRequest_dest);
        aRequest_dest = new ServletFileUpload(aRequest_dest);

            // set a temporary key

    	javax.servlet.http.Cookie c_dest = javax.servlet.http.Cookie.makeTemp("session-key");

            // use the cookie value to create a response object

        response = new HttpServletResponse();

    	Response aResponse_destobj = new Response(aRequest_dest,"text/html");

}
}