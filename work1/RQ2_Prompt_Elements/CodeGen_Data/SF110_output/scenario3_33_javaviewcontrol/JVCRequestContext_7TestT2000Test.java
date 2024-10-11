// JVCRequestContext_7Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create an absolute link where the anchor must start with "/".
	* This can result in a link in 'flash' which contains a reference to a '/' 
	* character.
	*/
	@Test
    public void makeLink_shouldReturnAnchorWithAnchorPathAndTarget() throws Exception {

		String path = makeLink(
			"/JVCRequestContextTest/JVCRequestContext_7.html",
			"/JVCRequestContextTest/");

		assertEquals(
			"Anchor of '/' missing from link",
			"/JVCRequestContextTest/JVCRequestContext_7.html",
			path);
    }

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create a page with "/JVCRequestContext/JVCRequestContext_7.html"
	* This can result in a page in "page.html".
	*/
	@Test
    public void makeLink_shouldReturnAnchorAndSetTarget() throws Exception {

		String path = makeLink("/JVCRequestContextTest/JVCRequestContext_7.html", "/JVCRequestContextTest/");

		assertEquals(
			"Anchor of "/ JVCRequestContext_7.html missing from link",
			"/JVCRequestContextTest/JVCRequestContext_7.html",
			path);
    }

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create a page with "/JVCRequestContext_7.html"
	* This can result in a link in "page.html".
	*/
	@Test
    public void makeLink_shouldReturnAnchorAndSetTarget() throws Exception {

		String path = makeLink("/JVCRequestContextTest/JVCRequestContext_7.html", "/JVCRequestContextTest/");

		assertEquals(
			"Anchor of "/ JVCRequestContext_7.html missing from link",
			"/JVCRequestContextTest/JVCRequestContext_7.html",
			path);
    }

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create a link with a "path" that is a relative link and
	* that does not start with "/". Assert that a "path" that is relative is used
	* as the target.
	*/
	@Test
    public void makeLink_shouldReturnAnchorWithRelativeLinkAndNoTarget() throws Exception {

		String path = makeLink("/JVCRequestContextTest/src/", "");

		assertEquals(
			"Anchor for '/' missing from link",
			"/JVCRequestContextTest/src/",
			path);
    }

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create a link with only a "path" that is a relative link,
	* that starts with a "/", and that does not end with "/".
	*/
	@Test
    public void makeLink_shouldReturnLinkWithRelativeLinkAndNoTarget() throws Exception {

		String path = makeLink("/JVCRequestContextTest/src/", "/");

		assertEquals(
			"Anchor for "/JVCRequestContextTest/src/" is missing from link",
			"/JVCRequestContextTest/src/",
			path);
    }

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create a page with "/JVCRequestContext/JVCRequestContext_7.html"
	* This can result in a page in "page.html".
	*/
	@Test
    public void makeLink_shouldReturnLinkWithRelativePageAndNoTarget() throws Exception {

		String path = makeLink("/JVCRequestContextTest/JVCRequestContext_7.html", "");

		assertEquals(
			"Page for /JVCRequestContext/JVCRequestContext_7.html missing to link",
			"/JVCRequestContextTest/JVCRequestContext_7.html",
			path);
    }

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create a page with "/JVCRequestContext_7.html"
	* This can result in a page in "page.html".
	*/
	@Test
    public void makeLink_shouldReturnLinkWithRelativePageAndTarget() throws Exception {

		String path = makeLink("/JVCRequestContextTest/JVCRequestContext_7.html", "/");

		assertEquals(
			"Page for /JVCRequestContext_7.html missing to link",
			"/JVCRequestContextTest/JVCRequestContext_7.html",
			path);
    }

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create a link with only a "path" that is a relative link,
	* that starts with a "/", and that does not end with "/". Assert that the
	* link starts with "/page" and is only a relative link.
	*/
    @Test
    public void makeLink_shouldReturnLinkWithRelativeLinkAndNoLink() throws Exception {

    	String path = makeLink("/JVCRequestContextTest/src/page.html", "");

    	assertEquals(
    			"No page for "/JVCRequestContextTest/src/" is missing from link",
    			"/JVCRequestContextTest/src/page.html",
    			path);
    }

	/**
	 * Unit test for {@link JVCRequestContext#makeLink(String, String)}.
	* This method will create a link with only a "path" that is a relative link,
	* that starts with a "/", and that does not end with "/". Assert that the
	* link starts with "/page" and is a relative link.
	*/
    @Test
    public void makeLink_shouldReturnLink