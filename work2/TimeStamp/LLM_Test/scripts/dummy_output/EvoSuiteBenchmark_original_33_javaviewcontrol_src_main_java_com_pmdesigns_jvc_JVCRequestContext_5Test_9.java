// JVCRequestContext_5Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContext_5Test {
		static {
			try { Thread.currentThread().setContextClassLoader(RequestContext.class.getClassLoader()); }
			catch (Exception e) { throw new Error(e); }
		}
    /**
     * This test covers the implementation of {@link #getCookie(String)}.
     * The test case is generated with the servlet 3.1 framework and it should 
     * return <code>null</code> if a cookie is not found.
     */
    @Test
    public void getCookieNull()
    {
        try {
            this.getCookie("null");
            fail("No exception thrown if no cookie is associated with the string");
        } catch (Exception e) {
        }
        assertNull("no exception seen if no cookie is associated with the string", this.getCookie("null"));
    }

    /**
     * This test covers the implementation of {@link #getCookie}.
     * The test case is generated with the servlet 3.1 framework and it should 
     * return <code>null</code> if a cookie is not found.
     */
    @Test
    public void getCookieNull2()
    {
        final Map<String, String> names = new HashMap<String, String>();
        this.getCookie("", names, "");
        assertNull("returning null for non cookie", getCookie("", names, ""));
    }


    /**
     * This test covers the implementation of {@link #getCookie} with values.
     * The test case is generated with the servlet 3.1 framework and it should 
     * return <code>null</code> if a cookie is not found.
     */
    @Test
    public void getCookieFromParameters ()
    {
        Map<String, String> names = new HashMap<String, String>();
        names.put("name", "peter");
        this.getCookie("name", names, "");
        System.out.println("Name = " + names.get("name"));
        assertNull("no exception seen if no cookie is associated with the string", this.getCookie("name"));
        this.getCookie("name", names, "");
    }

    /**
     * This test covers the implementation of {@link #getCookie} with 
     * scope values.
     * The test case is generated with the servlet 3.1 framework and it should 
     * return <code>null</code> if a cookie is not found.
     */
    @Test
    public void getCookieFromScope ()
    {
        Map<String, String> names = new HashMap<String, String>();
        names.put("jane", "joe");
        this.getCookie("jane", names, "");
        System.out.println("Name = " + names.get("jane"));
        System.out.println("joe = " + names.get("joe"));
        assertNull("no exception seen if no cookie is associated with the string", this.getCookie("jane", names, ""));
        this.getCookie("jane", names, "");
    }


    /**
     * This test covers the implementation of {@link #getCookie} with 
     * scope values.
     * The test case is generated with the servlet 3.1 framework and it should 
     * return <code>null</code> if a cookie is not found.
     */
    @Test
    public void getCookieFromScope2 ()
    {
        Map<String, String> names = new HashMap<String, String>();
        names.put("jane", "joe");
        Map<String, String> scopes = new HashMap<String, String>();
        scopes.put("scope", "public");
        this.getCookie("jane", names, scopes);
        System.out.println("Name = " + names.get("jane"));
        System.out.println("joe = " + names.get("joe"));
        assertNull("no exception seen if no cookie is associated with the string", getCookie("jane", names, scopes));
        this.getCookie("jane", names, "");
    }


    /**
     * This test cases a scenario where the request has multiple values
     * with the scope set to "protected".
     */
    @Test
    public void getCoupleSingleScopeValue ()
    {
        final Map<String, String> names = getCookie("jane");
        System.out.println("names = " + names.toString());
        request = new HttpServletRequest("GET", "/getCookie") {
            public boolean isSecure() {
                return false;
            }
        };
        request.setServerName("jane");
        request.setScheme("HTTP");
        response = new HttpServletResponse() {
            public void addCookie(Cookie cookie) {
                cookie.setValue(getEncodedUrlParam("cookiename"));
                super.addCookie(cookie);
            }
            public Cookie[] getCookieArray() {
                Cookie c[] = super.getCookieArray();
                return c;
            }
            public Cookie[] getCookies() {
                Cookie c[] = super.getCookies();
                return c;
            }
            public int getStatus() {
                return 400;
            }
        };
}
}