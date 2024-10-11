// JVCRequestContext_9Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {
		public static String flash = null;
	
	@Test
	public void testThatGetFlash() throws Exception {
		assertNotNull(flash);
		JVCRequestContext ctx = new JVCRequestContext();
		assertTrue(ctx.getFlash()!= null);
		assertTrue(ctx.getFlash().isEmpty());
	}
	
	@Test
	public void testThatGetFlashReturnsNullForUndefinedKey() throws Exception {
		assertTrue(ctx.getFlash().isEmpty());
		ctx.setFlash(null);
		assertTrue(ctx.getFlash() == null);
	}
	
	@Test
	public void testThatGetFlashReturnsValue() throws Exception {
		JVCRequestContext ctx = new JVCRequestContext();
		ctx.setFlash("My flash value");
		assertTrue(ctx.getFlash().exists("My flash value"));
		assertTrue(ctx.getFlash().isEmpty());
	}
	
	@Test
	public void testThatSetFlashReturnsValue() throws Exception {
		JVCRequestContext ctx = new JVCRequestContext();
		ctx.setFlash("My flash");
		assertTrue(ctx.getFlash().isEmpty());
		assertTrue(ctx.getFlash() == "My flash");
	}
	
	@Test
	public void testThatSetFlashClearsTheFlash() throws Exception {
		JVCRequestContext ctx = new JVCRequestContext();
		ctx.setFlash("My flash");
		assertTrue(ctx.getFlash().exists("My flash"));
		assertFalse(ctx.getFlash().isEmpty());
		assertEquals("My flash", ctx.getFlash());
	}
	
	@Test
	public void testThatSetFlashDoesNotFail() throws Exception {
		JVCRequestContext ctx = new JVCRequestContext();
		ctx.setFlash("My flash value");
		assertTrue(ctx.getFlash().exists("My flash value"));
		assertTrue(ctx.getFlash().isEmpty());
		assertEquals("My flash", ctx.getFlash());
	}
	
	@Test
	public void testThatGetHrefReturnsTheLinkWithPathFromTheFormWithAbsolute() throws Exception {
		JVCRequestContext ctx = new JVCRequestContext();
		ctx.setHref("http://www.pmdesigns.com/");
		ctx.setPath("/");
		assertEquals("http://www.pmdesigns.com/", ctx.getHref());
		assertEquals("/", ctx.getPath());
	}
	
	@Test
	public void testThatGetHrefReturnsValueFromTheURLForTheFirstUri() throws Exception {
		JVCRequestContext ctx = new JVCRequestContext();
		ctx.setHref("http://purl.org/dc/elements/1.0/");
		assertEquals("http://purl.org/dc/elements/1.0/", ctx.getHref());
	}
	
	@Test
	public void testThatGetHrefReturnsValueFromTheURLForTheURIForTheFirstUri() throws Exception {
		JVCRequestContext ctx = new JVCRequestContext();
		ctx.setHref("http://purl.org/dc/sections/01");
		assertEquals("http://purl.org/dc/sections/01", ctx.getHref());
	}
	
    @Test
    public void testThatPutFormURLEncode() throws Exception {
        JVCRequestContext ctx = new JVCRequestContext();
        ctx.setPath("/jvc");
		ctx.setHref("http://www.greensock.org/");
        String string = ctx.urlEncode("greensock");
        assertEquals("&greensock=", string);
        ctx.setHref("http://www.greensock.org/" + string);
        assertEquals("greensock%20", string);
    }
}