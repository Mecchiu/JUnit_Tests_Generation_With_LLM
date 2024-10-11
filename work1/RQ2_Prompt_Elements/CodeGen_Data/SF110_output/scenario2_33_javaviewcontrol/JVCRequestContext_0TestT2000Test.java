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
// JVCRequestContext.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * This class contains state information for processing an http request.
 * It wraps the standard HttpServletRequest, HttpServletResponse and HttpServlet
 * objects and provides convenience methods for accessing them.
 * <p>
 * It also provides access to the 'flash' which is a Map for storing temporary
 * key/value strings.  The scope of the flash is the current request or
 * the following request in the case of a redirect response.
 * <p>
 * It also contains some convenience methods for forming links and absolute paths.
 *
 * @author mike dooley
 */
public final class JVCRequestContext {

    /**
     * Convenience method
     *
     * @param name which parameter to get
     * @return the parameter value or null if there is no parameter corresponding to the indicated key
     * or BINARY_VALUE if this is a multipart request and there is binary data for the indicate key,
     * which can be retrieved as a byte array via the getAttribute method.
     * @see #getParamMap
     * @see #getParamValues
     * @see #getParamNames
     */
    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o!= null && o instanceof String)? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }
}

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
		
	@Test
	public void testGetParam_1()
			throws Exception {
		
		JVCRequestContext context = new JVCRequestContext("param1");
		assertTrue(context.getParam(JVCRequestContext.PARAM_KEY_NAME) instanceof String);
		assertEquals("param1", context.getParam(JVCRequestContext.PARAM_KEY_NAME).toString());
		
	}

	@Test
	public void testGetParam_2()
			throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("param1", context.getParam(JVCRequestContext.PARAM_KEY_NAME));
		context = context.getParam(JVCRequestContext.PARAM_KEY_NAME, "param1=new");
		assertEquals("param1=new", context.getParam(JVCRequestContext.PARAM_KEY_NAME));
		context = context.getParam(JVCRequestContext.PARAM_KEY_NAME, "param1=new ");
		assertEquals("param1=new", context.getParam(JVCRequestContext.PARAM_KEY_NAME));
		context = context.getParam(JVCRequestContext.PARAM_KEY_NAME, "param1=&");
		assertEquals("param1=", context.getParam(JVCRequestContext.PARAM_KEY_NAME));
		context = context.getParam(JVCRequestContext.PARAM_KEY_NAME, "param1=& param2=new");
		assertEquals("param1=", context.getParam(JVCRequestContext.PARAM_KEY_NAME));
	
	}

	@Test
	public void testGetParam_3()
			throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("", context.getParam(JVCRequestContext.PARAM_KEY_NAME));
		String param1 = context.getParam(JVCRequestContext.PARAM_KEY_NAME, " param1");
		assertNull(param1);
		context = context.getParam(JVCRequestContext.PARAM_KEY_NAME, " param1=& param2=new");
		param1 = context.getParam(JVCRequestContext.PARAM_KEY_NAME, " param1=& param2=new");
		assertEquals("param1=", param1);
		param1 = context.getParam(JVCRequestContext.PARAM_KEY_NAME, " param1=& param2=new");
		assertEquals("param1=", param1);
	}

	@Test
	public void testGetParamNames_1()
			throws Exception {
		
		JVCRequestContext context = new JVCRequestContext();
		Collection<String> names = context.getParamNames();
		Iterator<String> it = names.iterator();
		assertTrue(it.hasNext());
		assertTrue(it.next() == JVCRequestContext.PARAM_KEY_NAME);
		
		context = context.getParamNames();
		assertTrue(it.hasNext());
		assertTrue(it.next().equals(JVCRequestContext.PARAM_KEY_NAME));
		
	}

	@Test
	public void testGetParamValues_1()
			throws Exception {
		
		JVCRequestContext context = new JVCRequestContext();
		String[] values = context.getParamValues(JVCRequestContext.PARAM_KEY_NAME);
		
		assertNull(values);
		// this string should have been BINARY_VALUE
		values = context.getParamNames();
		assertTrue(values.hasNext());
		assertTrue(values.next().equals(JVCRequestContext.PARAM_KEY_NAME));
		
		context = context.getParamNames();
		assertTrue(values.hasNext());
		assertTrue(values.next().equals(JVCRequestContext.PARAM_KEY_NAME));
		
		
	}
	
	@Test
	public void testGetParamNames_2()
			throws Exception {
		
		String param1 = "param1";
		String param2 = "param1";
		Collection<String> names = JVCRequestContext.getParamNames();
		Collection<String> values = JVCRequestContext.getParamValues(param1);
		assertTrue(names.size() == 2);
		assertTrue(values.size() == 2);
		assertTrue(names.contains(JVCRequestContext.PARAM_KEY_NAME));
		assertTrue(values.contains(param1));
		values = JVCRequestContext.getParamValues(param2);
		assertTrue(names.size() == 2);
		assertTrue(values.size() == 2);
		assertTrue(names.contains(JVCRequestContext.PARAM_KEY_NAME));
		assertTrue(values.contains(param1));
		
	}
}
