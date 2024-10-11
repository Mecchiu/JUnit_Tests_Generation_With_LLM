// JVCRequestContext_0Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {
		/**
		 * The set of parameters for which the test checks getParam implementations.
		*/
    private static String[] params = {"a", "b"};

	/**
	 * Test the getParams method.
	 */
	@Test void testGetParam() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(null);
        assertTrue(params.size() == 1);
        assertEquals(params.get("a"), "b");
    }


	/**
	 * Test the getParam method when null.
	 */
	@Test void testGetParamNull() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(null);
        assertNotNull(params);
        assertTrue(params == null);
	}


	/**
	 * The list of parameters for which the test checks getParam implementations.
	 */
	private static String[] names = {"a", "b"};
	private static String[] values = {"A", "B"};

	/**
	 * Tests getParam with no parameters.
	 */
	@Test void testGetParamEmptyArray() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(names);
        assertNotNull(params);
        assertTrue(params.size() == 0);
	}

	/**
	 * Tests getParam with no parameters in array.
	 */
	@Test void testGetParamEmptyMap() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(names);
        assertNotNull(params);
        assertTrue(params.size() == 0);
	}


	/**
	 * Tests getParam with one parameter.
	 */
	@Test void testGetParam() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(names);
        assertNotNull(params);
        assertTrue(params.size() == 1);
        assertEquals(params.get("a"), "b");
	}

	/**
	 * Tests getParam with one parameter in array.
	 */
	@Test void testGetParamArray() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(names);
        assertNotNull(params);
        assertTrue(params.size() == 1);
        assertEquals(params.get("a"), "b");
	}

	/**
	 * Tests the getParam value method.
	 */
	@Test void testGetParamValue() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(null);
		assertNull(params);
	}

	/**
	 * Tests setParam by adding a parameter and its value.
	 */
	@Test void testSetParamByAddingParam() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(names);
		params = ctx.getParamMap(params);
		params.put("a", "b");
		assertEquals(params.size(), 2);
	}


	/**
	 * Tests setParam by adding a parameter, its value, and removing a parameter.
	 */
	@Test void testSetParamByAddingParamAndRemoveParam() {
		JVCRequestContext ctx = new JVCRequestContext();
		Map<String, String> params = ctx.getParamMap(names);
		params = ctx.getParamMap(params);
		Map<String, String> removeParams = new HashMap<String, String>(params);
		removeParams.remove("a");
		params = new HashMap<String, String>(params);
		params.remove("a");
		params = new HashMap<String, String>(ctx.getParamMap(params)) ;
		assertEquals(params.size(), removeParams.size());
	}
}