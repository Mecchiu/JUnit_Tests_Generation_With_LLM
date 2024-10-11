// JVCRequestContext_3Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {
static {
			System.setProperty("java.net.useSystemProxies","false");
        }

	/**
	 * The key used for storing temporary keys
         */
    public static final String TEST_KEY = "TEST_KEY";
	/**
	 * The default scope attribute value
         */
    public static final String DEFAULT_SCOPE = "";
	/**
	 * test case of the getAttribute method.
	 */
    @Test
    public void testGetAttribute() {
    	JVCRequestContext context = new JVCRequestContext();
		assertNotNull("Context should not be null.", context);

        // Get attribute is a convenience method.
        Object key = context.getAttribute("key");
		if (key == null) {
		    assertNull("Context does not have a key.", key);
		} else {
		    assertEquals("Context attribute key is not correct.", TEST_KEY, key);
		}

        //Get attribute is a convenience method.
        Object scope = context.getAttribute("scope");
		assertEquals("Context scope not correctly defined.", DEFAULT_SCOPE, scope);
    }


	/**
	 * test case of the getFilePath method.
	 */
    @Test
    public void testGetFilePath() {
        final String pathString = "http://myip.foo.com/image.jpg";
        final HttpURLConnection connection = new MockHttpURLConnection(pathString, "/");

        // test default for use.
        String path = context.getFilePath(connection);
        assertEquals("getFilePath(connection) - default value is incorrect.", "/" + pathString, path);

        // test the file path attribute.
        path = context.getFilePath(connection, "bogusPathString");
        assertEquals("getFilePath(connection, unknown parameter) - badpathstring", "/bogusPathString", path);

        // test the file path attribute.
        path = context.getFilePath(connection, "bogusFilePath");
        assertEquals("getFilePath(connection, unknown paramter)", "/bogusFilePath", path);

        // test the file path attribute.
        path = context.getFilePath(connection, "pathString");
        assertEquals("getFilePath(connection, pathString)", pathString, ConnectionManager.normalizeFilePath(path).toString());

        // test FileUpload is used.
        try {
            context.getFilePath(connection, "bogusFilePath");
            fail("getFilePath(connection, bogusFilePath) should throw an Error for unsupported method.");
        } catch (IllegalArgumentException e) {
            assertEquals("FileUpload is used in getFilePath. (getFile)", ConnectionManager.getFile(connection));
        }

		// test the file path attribute.
		try {
			context.getFilePath(connection, "bogusPathString");
			fail("getFilePath(connection, pathString) should throw an Error for unsupported method.");
		} catch (IllegalArgumentException e) {
			assertEquals("FileUpload is used in getFilePath. (getPath)", ConnectionManager.getPath(connection));
		}

		// test the FileUpload is used with the context.
		connection.setRequestProperty("Content-Length", "3");
		context.getFilePath(connection, "pathString");
	}



	/**
	 * test case of the getResponseHeaders method.
	 */
	@Test
    public void testGetResponseHeaders() {
	    final HttpURLConnection connection = new MockHttpURLConnection("https://foo.com/", "/");

	    // test default for use.
        String temp = context.getResponseHeaders(connection);
        assertEquals("getResponseHeaders(connection) - default value for use value", "[]", temp);

        // test the responseHeaders attribute.
        List tempList = context.getResponseHeaders(connection, "key");
        assertEquals("getResponseHeaders(connection, key) - default value for use value", "[]", tempList);

        // test the responseHeaders attribute.
        temp = context.getResponseHeaders(connection, "key2");
        assertEquals("getResponseHeaders(connection, key2) - override value for key2", "key2", temp);

        // test the responseHeaders attribute.
        tempList = context.getResponseHeaders(connection, "key3");
        assertNotNull("Headers should not be null.", tempList);
        assertEquals("getResponseHeaders(connection, key3) - override value for key3", "{}" + key3, temp);

        // test FileUpload is used.
        try {
            context.getResponseHeaders(connection,
                "key2",
                new String[] {
                    FileUpload.CONTENT_ENCODING,
                    FileUpload.DEFAULT_CONTENT_ENCODING },
                "pathString");
            fail("getResponseHeaders(connection, key2, bogusFilePath) should throw an Error for unsupported method.");
        } catch (IllegalArgumentException e) {
            assertEquals("FileUpload is used in getResponseHeaders. (getFile)", ConnectionManager.getFile(connection));
        }

        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        context.getResponseHeaders(connection,
            "key2",
            new String[] {
                ConnectionManager.createMimeTypeHeader(ConnectionManager.MIME_PROPERTIES),
                FileUpload.DEFAULT_CONTENT_ENCODING,
                ConnectionManager.DEFAULT_CONTENT_ENCODING },
            "pathString");
        context.getResponseHeaders(connection,
            "key2",
            new String[] {
                ConnectionManager.createMimeTypeHeader(ConnectionManager.MIME_PROPERTIES),
                FileUpload.DEFAULT_CONTENT_ENCODING,
                ConnectionManager.DEFAULT_CONTENT_ENCODING },
            "pathString");

        // tests that the files of a file upload and that the file urlencoded response are as expected.
        try {
            context.getResponseHeaders(connection,
                "bogusFilePath",
                new String[] {
                    FileUpload.CONTENT_ENCODING,
                    FileUpload.DEFAULT_CONTENT_ENCODING,
                    ConnectionManager.DEFAULT_CONTENT_ENCODING },