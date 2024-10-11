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
	 * Initialization
	 */
	@Test
    void beforeTest() {
        HttpServletRequest request = getRequest();
        HttpServletResponse response = getResponse(request);
        assertNotNull(request);
        assertNotNull(response);
    }

    @Test
    void testSimpleCookie() {
        HttpServletRequest request = getRequest();

        Cookie cookie = new Cookie("abc", "value");
        Cookie cookie2 = getRequestCookie(request, "abc");
        Cookie cookie3 = getRequestCookie(request, "def");
        assertTrue(cookie.equals(cookie2));
        assertFalse(cookie.equals(cookie3));
    }
	
	/**
	 * Test with multiple cookies
	 */
	@Test
    void testManyCookies() {
        HttpServletRequest request = getRequest();
        assertNotNull(request);

        Cookie[] cookies = getRequestCookieList(request);
        // 1st cookie should be the original request
        assertNotNull(cookies[0]);
        assertEquals("value", cookies[0].getValue());
        assertEquals("value", cookies[0].getName());
        // Add another cookie
        Cookie cookie2 = getRequestCookie(request, "abcde");
        cookies[1] = cookie;
        // The second cookie should be the new cookie
        assertNotNull(cookies[1]);
        assertEquals("value", cookies[1].getValue());
        assertEquals("value", cookies[1].getName());
    }

    @Test
    void testMultipleCookies() {
        HttpServletRequest request = getRequest();
        assertNotNull(request);

        Cookie[] cookies = getRequestCookieList(request);
        assertNotNull(cookies);
        assertEquals(2,cookies.length);

        int index = 1;
        while (index < cookies.length) {
            Cookie cookie = cookies[index];
            if (index % 2 == 1) {
                assertTrue(cookie.equals(cookies[index-1]));
            } else {
                assertTrue(cookie.equals(cookies[index]));
            }
            index++;
        }
    }

	/**
	 * Test with multiple cookies with multiple values
	 */
    @Test
    void testMultipleValues() {
        HttpServletRequest request = getRequest();
        HttpServletResponse response = getResponse(request);
        assertNotNull(request);
        assertNotNull(response);
        
        Cookie[] cookieList = getRequestCookieList(request);
        assertNotNull(cookieList);

        if (cookieList!= null) {
            String value = null;

            String name = "javahc";
            int max =  (int) (1000/0.3/10*1);
            int min_value = 300;
            int max_value = 600;
            int mid = (int) (min_value+(max_value-min_value)/2.0);
            
            try {
                for (int i=0; i < 1000; i++) {
                    Cookie cookie = new Cookie(name, "value" + i);
                    response.addCookie(cookie);

                    String encodedValue = Base64Coder.bytesToBytes(Base64Coder.encode(String.valueOf(i)));
                    cookie = new Cookie("javafhc"+i, encodedValue);  
                    cookieList[i-1] = cookie;

                    if (i >= min_value && i <= max_value) {
                        value = encodedValue;
                    }
                }
                assertTrue(value.equals(cookieList[mid].getValue()));
                
                value = null;
            } catch (Exception e) {
                fail("Exception " + e.getMessage());
            }
        }   

        assertNull(response.getCookie(name));
    }
    
    private HttpServletRequest getRequest() {
        return getRequest(null);
    }
    
    private HttpServletRequest getRequest(HttpServletRequest original) {
        Class<JVCRequestContext> clazz  = JVCRequestContext.class ;
        Constructor<JVCRequestContext> method = clazz.getDeclaredConstructor(HttpServletRequest.class,
                                                  HttpServletResponse.class);
        method.setAccessible(true);
        Object[] args = new Object[4];
        
        args[0] = original;
        args[1] = getResponse(original);
        args[2] = getRequestCookieList(original);
        if (original!= null) {
            args[3] = original;
        }
        
        return (HttpServletRequest) method.newInstance(args);
    }
    
    private HttpServletResponse getResponse(HttpServletRequest request) {
        Class<JVCRequestContext> clazz  = JVCRequestContext.class ;
        Constructor<JVCRequestContext> method = clazz.getDeclaredConstructor(HttpServletRequest.class);
        method.setAccessible(true);
        
        Object[] args = new Object[3];
        args[0] = request;
        args[1] = getResponse(request);
        args[2] = getRequestCookies(request);
        
        return (HttpServletResponse) method.newInstance(args);
    }
    
    private Cookie[] getRequestCookieList(HttpServletRequest request) {
        Class<JVCRequestContext> clazz  = JVCRequestContext.class ;
        Constructor<JVCRequestContext> method = clazz.getDeclaredConstructor(HttpServletRequest.class);
        method.setAccessible(true);
        
        ArrayList<Cookie> cookies = new ArrayList<Cookie>();
        for (Enumeration<?> e = request.getCookies(); e.hasMoreElements(); ) {
        	Cookie cookie = new Cookie(
    	(String)e.nextElement(), 
    	(String)e.nextElement()
    	);
            cookies.add(cookie);
        }
        
        Object[] args = new Object[3];
        args[0] = request;
        args[1] = cookies;
}
}