// JVCRequestContext_2Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {
		
    // These test cases should not be run from the classfile, only from JVCRequestContextTest.java
	/** Test of getting a parameter value */
	@Test
	void getParamValues_shouldReturnARemoteValue() throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		// This does not include remote parameters
		context.setParam("blah", "blah");
		context.setParam("blah2", "blah2");
		
		String result = context.getParamValues("blah");

		assertEquals(2, context.getParamNames().length);

		assertTrue(result.length()!= 0);
		assertTrue(result.endsWith("/"));
		assertEquals("/blah", result);
		assertTrue(result.endsWith("/"));		
		assertEquals(2, result.length());
	}

	/** Test parameters getters */
	@Test
	void getParam() throws Exception {
		JVCRequestContext context = new JVCRequestContext();

		String result = context.getParam("blah");

		assertEquals("blah", result);
	}
	
	/** Test scope getters in a param */
	@Test
	void getParamMap() throws Exception {
		JVCRequestContext context = new JVCRequestContext();

		Map result = context.getParamMap();

		assertEquals(2, result.size());
		assertTrue(result.containsKey("blah"));
		assertTrue(result.containsKey("blah2"));
		assertTrue(result.containsKey("blah3"));

		String[] params = ((String[]) result.get("blah"));

		assertArrayEquals(3,params.length);

		assertTrue(params[0].endsWith("/"));
		assertTrue(params[1].endsWith("/blah"));
		assertTrue(params[2].endsWith("/"));
	}
	
	/** Test scope getters in a param */
	@Test
	void getParamNames() throws Exception {
		JVCRequestContext context = new JVCRequestContext();

		Collection result = context.getParamNames();

		assertEquals(2, result.size());
		assertTrue(result.contains("blah"));
		assertTrue(result.contains("blah2"));
	}

	/** Test the flash (key and value) */
	@Test
	void flash() throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		context.setFlash("blah");
		String flash = context.getFlash();

		assertTrue(flash.endsWith("/"));
		assertEquals("blah", flash);
	}
	
	/** Test the redirect page (remote) */
	@Test
	void localRedirection() throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		context.setRedirectURL("/redirect");
		String result = context.getRedirectURL();

		assertTrue(result.endsWith("/"));
	}

	/** Test that a remote location can be redirected */
	@Test
	void remoteRedirection() throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		context.setRedirectURL("/redirect");
		context.setParam("foo", "blah");
		String result = context.getParam("foo");

		assertTrue(result.endsWith("/"));
	}

	/** Test the response page (remote) */
	@Test
	void remoteResponse() throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		String result = context.getRemoteResponse();

		assertTrue(result.endsWith("/"));
	}

	/** Test set the flash for a certain flash key */
	@Test
	void setFlash(String flashKey) throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		context.setFlash(flashKey);
		String flash = context.getFlash();

		Collection flashKeys = context.getFlashKeys();

        assertFalse(flashKeys.isEmpty() );
		assertTrue( flash.endsWith("/"+flashKey) );
	}

	/** Test delete the flash key */
	@Test
	void deleteFlash() throws Exception {
		JVCRequestContext context = new JVCRequestContext();

		context.getFlash().remove("blah");

		Collection flashKeys = context.getFlashKeys();

		assertFalse( flashKeys.isEmpty());
	}

}