// JVCDispatcherTest.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import com.pmdesigns.jvc.tools.Base64Coder;
import com.pmdesigns.jvc.tools.JVCGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCDispatcher}.
* It contains one unit test case for the {@link JVCDispatcher#getRC()} method.
*/
class JVCDispatcherTest {
		@Test
        public void testGetRC() {
            JVCDispatcher jvc = new JVCDispatcher();
            JVCRequestContext context = jvc.getRC();
            int rc = context.getHttpRequest().getResponseCode();
            assertTrue("Unexpected Response Code: ", rc == HttpServletResponse.SC_OK);
            context = jvc.getRC();
            rc = context.getHttpRequest().getResponseCode();
            assertTrue("Unexpected Response Code: ", rc == HttpServletResponse.SC_BAD_REQUEST);
        }

        @Test
        public void testGetRC1() {
            JVCDispatcher jvc = new JVCDispatcher();
            JVCRequestContext context = jvc.getRC();
            int rc = context.getHttpRequest().getContentType();
            assertTrue("Unexpected Content Type: ", rc == "application/x-www-form-urlencoded");
        }
}

// JVCGenerator.java
package com.pmdesigns.jvc;

/**
 * JsonGenerator class
 *
 * @author Mike Dooley
 * @date Jul 16, 2010
 * @email mike dot dooley at gmail dot com
 */
public final class JsonGenerator extends HttpServlet {

    @Override
    public final void init() throws ServletException {
        // nothing
    }

    @Override
    public final void service(
        final HttpServletRequest request, 
        final HttpServletResponse response) throws ServletException, ServletException {
        Object value = request.getAttribute(
	        JVCGenerator.JSON_KEY);
        try {
            if (value instanceof String) {
                // no key
                String content = (String)value;
                Object res = JVCGenerator.objectFromString(content);
                if (res instanceof String) {
                    response.setContentType(JVCConstants.MIME_JSON);
                    response.getWriter().println(JVCGenerator.stringToBytes((String)res));                
                    // System.out.println("Json " + value); // debug
                } else if (res instanceof byte[]){
                    // byte[]: not written yet
                    response.setContentType(JVCConstants.MIME_JSON);
                    response.getWriter().write(Base64Coder.encode(JVCGenerator.objectToBytes((byte[])res)));
                    // System.out.println("Json " + value); // debug
                } else if (res instanceof InputStream) {
                    response.setContentType(JVCConstants.MIME_XML);
                    response.getWriter().write(((InputStream)res).read());
                    ((InputStream)res).close();
                    // System.out.println("Json " + value); // debug
                }
            } else
                response.setContentType("text/plain");
            response.getWriter().println(JVCGenerator.toString((JSONObject)value));
        } catch (IOException ioex) {
            // TODO: handle exception
            // System.err.print(ioex.getMessage()+"?");
        }
    }
}