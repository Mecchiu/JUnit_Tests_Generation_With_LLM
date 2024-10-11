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
* It contains ten unit test cases for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContext_5Test {
    
    /**
     * Test case for getting a cookie that exists.
     */
    @Test
    void testGetCookieExists() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        Cookie cookie = new Cookie("testCookie", "testValue");
        when(request.getCookies()).thenReturn(new Cookie[] {cookie});
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertEquals(cookie, context.getCookie("testCookie"));
    }
    
    /**
     * Test case for getting a cookie that does not exist.
     */
    @Test
    void testGetCookieNotExists() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getCookies()).thenReturn(null);
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertNull(context.getCookie("testCookie"));
    }
    
    /**
     * Test case for getting a cookie with a null name.
     */
    @Test
    void testGetCookieNullName() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertNull(context.getCookie(null));
    }
    
    /**
     * Test case for getting a cookie with an empty name.
     */
    @Test
    void testGetCookieEmptyName() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertNull(context.getCookie(""));
    }
    
    /**
     * Test case for getting a cookie with a name that matches partially.
     */
    @Test
    void testGetCookiePartialMatch() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        Cookie cookie = new Cookie("testCookie", "testValue");
        when(request.getCookies()).thenReturn(new Cookie[] {cookie});
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertNull(context.getCookie("test"));
    }
    
    /**
     * Test case for getting a cookie with a name that matches case-insensitively.
     */
    @Test
    void testGetCookieCaseInsensitive() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        Cookie cookie = new Cookie("testCookie", "testValue");
        when(request.getCookies()).thenReturn(new Cookie[] {cookie});
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertEquals(cookie, context.getCookie("TESTCOOKIE"));
    }
    
    /**
     * Test case for getting a cookie with multiple cookies in the request.
     */
    @Test
    void testGetCookieMultipleCookies() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        Cookie cookie1 = new Cookie("testCookie1", "testValue1");
        Cookie cookie2 = new Cookie("testCookie2", "testValue2");
        when(request.getCookies()).thenReturn(new Cookie[] {cookie1, cookie2});
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertEquals(cookie2, context.getCookie("testCookie2"));
    }
    
    /**
     * Test case for getting a cookie with a cookie that has no value.
     */
    @Test
    void testGetCookieNoValue() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        Cookie cookie = new Cookie("testCookie", null);
        when(request.getCookies()).thenReturn(new Cookie[] {cookie});
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertEquals(cookie, context.getCookie("testCookie"));
    }
    
    /**
     * Test case for getting a cookie with a cookie that has no name.
     */
    @Test
    void testGetCookieNoName() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        Cookie cookie = new Cookie(null, "testValue");
        when(request.getCookies()).thenReturn(new Cookie[] {cookie});
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertNull(context.getCookie("testCookie"));
    }
    
    /**
     * Test case for getting a cookie with a cookie that has an empty name.
     */
    @Test
    void testGetCookieEmptyCookieName() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        Cookie cookie = new Cookie("", "testValue");
        when(request.getCookies()).thenReturn(new Cookie[] {cookie});
        JVCRequestContext context = new JVCRequestContext(request, null, null);
        assertNull(context.getCookie("testCookie"));
    }
}