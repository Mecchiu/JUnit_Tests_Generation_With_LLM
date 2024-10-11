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
* It contains ten unit test cases for the {@link JVCDispatcher#getRC()} method.
*/
class JVCDispatcherTest {

	/**
	* Test case for {@link JVCDispatcher#getRC()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetRC_Null() {
		JVCDispatcher.ctxHolder.set(null);
		assertNull(JVCDispatcher.getRC());
	}
	
	/**
	* Test case for {@link JVCDispatcher#getRC()} method.
	* It tests the method with a non-null value.
	*/
	@Test
	void testGetRC_NonNull() {
		JVCDispatcher.ctxHolder.set(new JVCRequestContext());
		assertNotNull(JVCDispatcher.getRC());
	}
}

// JVCGenerator.java
package com.pmdesigns.jvc.tools;

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

/**
 * JVCGenerator
 *
 * @author mike dooley
 */
public class JVCGenerator {

    /**
     * Generate a JVC page
     *
     * @param pageName the name of the page to generate
     * @param request the HttpServletRequest
     * @param response the HttpServletResponse
     * @param pageContext the JVCPageContext
     * @throws IOException
     * @throws ServletException
     */
    public static void generatePage(String pageName, HttpServletRequest request, HttpServletResponse response, JVCPageContext pageContext) throws IOException, ServletException {
        JVCRequestContext rc = JVCDispatcher.getRC();
        if (rc == null) {
            throw new ServletException("JVCDispatcher.getRC() returned null");
        }
        JVCPage page = rc.getPage(pageName);
        if (page == null) {
            throw new ServletException("JVCDispatcher.getRC().getPage(" + pageName + ") returned null");
        }
        page.generate(request, response, pageContext);
    }
}

// JVCRequestContext.java
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

/**
 * JVCRequestContext
 *
 * @author mike dooley
 */
public class JVCRequestContext {

    /**
     * Return the JVCPage associated with the given page name
     *
     * @param pageName the name of the page to return
     * @return the JVCPage associated with the given page name
     */
    public JVCPage getPage(String pageName) {
        return pages.get(pageName);
    }
}

// JVCPage.java
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

/**
 * JVCPage
 *
 * @author mike dooley
 */
public class JVCPage {

    /**
     * Generate the page
     *
     * @param request the HttpServletRequest
     * @param response the HttpServletResponse
     * @param pageContext the JVCPageContext
     * @throws IOException
     * @throws ServletException
     */
    public void generate(HttpServletRequest request, HttpServletResponse response, JVCPageContext pageContext) throws IOException, ServletException {
        JVCRequestContext rc = JVCDispatcher.getRC();
        if (rc == null) {
            throw new ServletException("JVCDispatcher.getRC() returned null");
        }
        JVCGenerator.generatePage(pageName, request, response, pageContext);
    }
}

// JVCPageContext.java
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

/**
 * JVCPageContext
 *
 * @author mike dooley
 */
public class JVCPageContext {
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

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

/**
 * Base64Coder
 *
 * @author mike dooley
 */
public class Base64Coder {

    /**
     * Encode a string
     *
     * @param s the string to encode
     * @return the encoded string
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
}