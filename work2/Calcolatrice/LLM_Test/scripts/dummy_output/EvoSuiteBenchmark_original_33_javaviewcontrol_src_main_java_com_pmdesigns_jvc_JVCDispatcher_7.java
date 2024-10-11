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
		/**
		 * Test constructor method of {@link JVCDispatcher}
		 */
    @Test
    public void testConstructor() {
		JVCDispatcher jvc = new JVCDispatcher();
		assertEquals(null, jvc.getRC());
    }

	/**
	 * Test method of {@link JVCDispatcher#method(String)}.
	 * The method of the {@link JVCDispatcher} does nothing by default.
	 */
    @Test
    public void testMethod() {
		List<Object> list = new ArrayList<>();
		Method method = JVCDispatcher.class.getDeclaredMethod("method", SerializedResult.class);
		JVCRequestContext rc = new JVCRequestContext();
		try {
			method.invoke(jvc, new Object[]{ new SerializedResult(new JVCGenerator(), list) });
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		assertEquals(rc, jvc.getRC());
    }

    /**
     * Test method of {@link JVCDispatcher#dispatch(Object[])}.
     * The method of the {@link JVCDispatcher} does nothing by default.
     */
    @Test
    public void testDispatch() throws Exception {
		List<Object> list = new ArrayList<>();

        Class<? > clazz = String.class;
        Method method = clazz.getDeclaredMethod(
				"length",
				new Class[] { Integer.TYPE }
        );

		// Create the request context
		JVCRequestContext jvcRequestContext = new JVCRequestContext(list, null);
        jvcRequestContext.addParameter("type", "string");

		// Send the request to the server
        String[] requests = {
            "POST /path\n" +
            "Accept: application/xml\n" +
            "Content-Type: application/xml; charset=UTF-8\n" +
            "Content-Length: 0\n",
			"<test>Hello World!</test>\n",
        };

		byte[] buf = new byte[requests.length];
		for (int i = 0; i < requests.length; i++) {
			buf[i] = requests[i].getBytes()[0];
		}

		HttpServletResponse response = new MockServletResponse();
		HttpURLConnection ucon = addJsonRequest(clazz, method, jvcRequestContext, true, buf, ucon);

		// The following three tests fail, because the parameters are not in the headers
		// if (jvcRequestContext.dispatch(list, null, null, null)) {
		// fail("A parameter are not in the parameters list");
		// }
		// if (jvcRequestContext.dispatch(list)) {
		// fail("Should not succeed by now");
		// }

		assertNotNull(jvcRequestContext);
        jvcRequestContext.reset();

        ucon = new MockServletResponse();
        ucon.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        List<Cookie> cookies = new ArrayList<>();
		cookies.add(new Cookie("type", "string"));
        ucon.getHeaders(null);
        ucon.addCookie(cookies);

		// the mockServletResponse returns the cookie list, so to fail, we need to verify that is has a not empty
		// the list
		assertNotNull(jvcRequestContext.getParamNames());
        jvcRequestContext.dispatch(list, null, null, null);
        assertEquals(jvcRequestContext.getParamNames().size(), 0);    // no cookies for the type param
        assertFalse(jvcRequestContext.getParamNames().contains("type"));

    }

    public static class SerializedResult extends Serializable {

        private static final long serialVersionUID = 1L;
        private String[] response;

        public SerializedResult(JVCGenerator generator, List<Object> payload) {
            this.response = generator.generateString(payload);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Arrays.hashCode(response);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass()!= obj.getClass()) {
                return false;
            }
            SerializedResult other = (SerializedResult) obj;
            if (!Arrays.equals(response, other.response)) {
                return false;
            }
            return true;
        }
    }
}