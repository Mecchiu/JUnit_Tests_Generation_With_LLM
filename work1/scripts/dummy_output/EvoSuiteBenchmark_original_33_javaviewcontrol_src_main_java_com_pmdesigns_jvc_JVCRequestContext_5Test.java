package com.pmdesigns.jvc;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JVCRequestContext_5Test {

    @Test
    void testGetCookie_NullCookies() {
        JVCRequestContext requestContext = new JVCRequestContext();
        assertNull(requestContext.getCookie("test"));
    }

    @Test
    void testGetCookie_NoMatchingCookie() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), new Cookie("cookie2", "value2")};
        requestContext.setRequestCookies(cookies);
        assertNull(requestContext.getCookie("test"));
    }

    @Test
    void testGetCookie_MatchingCookie() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), new Cookie("test", "testValue")};
        requestContext.setRequestCookies(cookies);
        Cookie cookie = requestContext.getCookie("test");
        assertNotNull(cookie);
        assertEquals("test", cookie.getName());
        assertEquals("testValue", cookie.getValue());
    }

    @Test
    void testGetCookie_MultipleCookies() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), new Cookie("test", "testValue"), new Cookie("cookie2", "value2")};
        requestContext.setRequestCookies(cookies);
        Cookie cookie = requestContext.getCookie("test");
        assertNotNull(cookie);
        assertEquals("test", cookie.getName());
        assertEquals("testValue", cookie.getValue());
    }

    @Test
    void testGetCookie_CaseSensitive() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), new Cookie("Test", "testValue")};
        requestContext.setRequestCookies(cookies);
        assertNull(requestContext.getCookie("test"));
    }

    @Test
    void testGetCookie_EmptyName() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), new Cookie("", "testValue")};
        requestContext.setRequestCookies(cookies);
        assertNull(requestContext.getCookie(""));
    }

    @Test
    void testGetCookie_NullName() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), new Cookie("test", "testValue")};
        requestContext.setRequestCookies(cookies);
        assertNull(requestContext.getCookie(null));
    }

    @Test
    void testGetCookie_NullCookie() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), null};
        requestContext.setRequestCookies(cookies);
        assertNull(requestContext.getCookie("test"));
    }

    @Test
    void testGetCookie_NonNullCookie() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), new Cookie("test", "testValue")};
        requestContext.setRequestCookies(cookies);
        assertNotNull(requestContext.getCookie("test"));
    }

    @Test
    void testGetCookie_MatchingCookieValue() {
        JVCRequestContext requestContext = new JVCRequestContext();
        Cookie[] cookies = {new Cookie("cookie1", "value1"), new Cookie("test", "testValue")};
        requestContext.setRequestCookies(cookies);
        Cookie cookie = requestContext.getCookie("test");
        assertNotNull(cookie);
        assertEquals("testValue", cookie.getValue());
    }
}
