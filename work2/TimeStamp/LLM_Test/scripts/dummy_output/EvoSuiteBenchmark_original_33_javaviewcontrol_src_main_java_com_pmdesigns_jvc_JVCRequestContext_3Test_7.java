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
		/**
		* Constant value for "key"
		*/
	public static final String VALUE_KEY = "key";
		/**
		* Constant value for "alt-key"
		*/
	public static final String VALUE_ALT_KEY = "alt-key";
		/**
		* Constant value for "value-attr"
		*/
	public static final String VALUE_ATTR_VALUE = "value-attr";
	/**
	 * HttpServlet request parameter that contains a key for the flash
	 * {@link Object#toString()} method
	 */
	public static final String PARAM_KEY_FLASH = "key";
	/**
	 * HttpServlet request parameter that contains an alternate key for the flash
	 * {@link Object#toString()} method
	 * {@link Object#toString()} is called prior to a change request into a request attribute {@link
	 * #VALUE_ALT_KEY}
	 * {@link Object#toString()} is called if the request parameter value is null or does not match {@link
	 * #VALUE_ATTR_VALUE}.
	 * @throws Exception
	 */
    @Test
    public void test_getAttribute_alt_key_value_attr() throws Exception {
    	try {
    		HttpServletRequest request = new MockHttpServletRequest("GET", "/foo/baz");
    		int a = request.getSession().getAttribute(PARAM_KEY_FLASH).length();
    		assertTrue(a == 1);
    	} catch (Exception exception) {
    	}
    }
	/**
	 * HttpServlet request parameter that contains the key for the flash
	 * 		{@link Object#toString()} method
	 *
	 * @throws Exception
	 */
    @Test
    public void test_getParameter_key_flash() throws Exception {
    	int a = request.getParameter(PARAM_KEY_FLASH).length();
    	assertTrue(a > 0);
    }
	/**
	 * HttpServlet request parameter that contains a key for the flash
	 * 		{@link Object#toString()} method
	 * {@link Object#toString()} is called prior to a change request into a request attribute {@link
	 * #VALUE_KEY}
	 * {@link Object#toString()} is called if the request parameter value is null or does not match {@link
	 * #VALUE_ATTR_VALUE}.
	 * @throws Exception
	 */
    @Test
    public void test_getParameter_key_value_attr() throws Exception {
    	int a = request.getParameter(VAL_KEY, 0).length();
    	assertTrue(a > 0);
    }
	/**
	 * HttpServlet request parameter that contains an alternate key for the flash
	 * 		{@link Object#toString()} method
	 * {@link Object#toString()} is called prior to a change request into a request attribute {@link
	 * #VALUE_ALT_KEY}
	 * {@link Object#toString()} is called if the request parameter value is null or does not contain
	 * {@link VAL_ATTR_VALUE}.
	 * @throws Exception
	 */
    @Test
    public void test_getParameter_alt_key_value_attr() throws Exception {
    	int a = request.getParameter(VALUE_ATTR_VALUE, 0).length();
    	assertTrue(a > 0);
    }
	/**
	 * HttpServlet request parameter that contains the key for the flash
	 * 		{@link Object#toString()} method
	 *  
	 * @throws Exception
	 */
    @Test
    public void test_parameter_key_flash() throws Exception {
    	String[] a = request.getParameterKeys();
    	assertTrue(a.length > 0);
    	assertTrue(a[0].equals(PARAM_KEY_FLASH));
    }
	/**
	 * HttpServlet request parameter that contains the key for the flash
	 * 		{@link Object#toString()} method
	 * @throws Exception
	 */
    @Test
    public void test_parameter_key_value_attr() throws Exception {
    	String[] a = request.getParameterValues(VAL_KEY);
    	assertTrue(a.length > 0);
    	assertTrue(a[0].equals(VAL_ATTR_VALUE));
    }
	/**
	 * HttpServlet request parameter that contains an alternate key for the flash
	 * 		{@link Object#toString()} method
	 * {@link Object#toString()} is called prior to a change request into a request attribute {@link
	 * #VALUE_ALT_KEY}
	 * 	{@link Object#toString()} is called if the request parameter value is null or does not contain
	 * {@link VAL_ATTR_VALUE} or the request parameter value isn't null
	 * @throws Exception
	 */
    @Test
    public void test_parameter_alt_key_value_attr() throws Exception {
    	String[] a = request.getParameterValues(VALUE_ATTR_VALUE);
    	assertTrue(a.length > 0);
    	assertTrue(a[0].equals(VAL_ALT_KEY));
    }
	/**
	 * HttpServlet request path that contains the key for the flash
	 * 		{@link Object#toString()} method
	 *
	 * @throws Exception
	 */
    @Test
    public void test_path_key_flash() throws Exception {
    	String[] a = request.getPathVariables();
    	assertTrue(a.length > 0);
    	assertTrue(a[0].equals(PATH_FLASH));
    }

    /**
	 * Test of the url-encoded path with a query with a variable {@link #PARAM_KEY_FLASH}
	 * @return a path that is encoded as an encoded query
	 */
	public String urlEncodeParammokey_querypath_encoded() {
		return "{\"key\":\"flash.mykey\"}";
	}
}