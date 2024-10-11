// JVCRequestContext_1Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {
public static void main(String[] args) {
			org.junit.jupiter.api.Test(args);
		}

	private final ServletRequest req;
	private final ServletRequest req2;
	private final ServletResponse resp;
	private final String path;

    /**
     * Constructor for the constructor, taking a (required) request
     * object.
     * @param r The request object.
     */
    public JVCRequestContext_1Test(ServletRequest r) {
    	req   = r;
		req2  = null;
		resp   = null;
    	path   = null;
    }

    /**
     * Constructor for the constructor, taking a (required) request
     * object.
     * @param r The request object.
     * @param r2 The request object.
     */
    public JVCRequestContext_1Test(ServletRequest r, ServletRequest r2) {
    	req   = r;
		req2  = r2;
		resp   = null;
    	path   = null;
    }

		/**
		 * Constructor for the constructor, taking a (required) response
		 * object.
		 * @param r The response object.
		 */
		public JVCRequestContext_1Test(ServletResponse r) {
			resp = r;
		}

		/**
		 * Creates a blank map.
		 * @return A map.
		 */
		private Map<String, String> getParamMap() {
			return new HashMap<>(0);
		}

		/**
		 * Constructor for the instance method, taking a (required) request
		 * object.
		 * @param rs The request object.
		 */
		public static void instanceMethod(ServletRequest rs) {
			req = rs;
		}

		/**
		 * Constructor for the instance method, with a (required) request
		 * object.
		 * @param rs The request object.
		 * @param r2 The request object.
		 */
		public static void instanceMethod(ServletRequest rs, ServletRequest r2) {
			req   = rs;
			req2  = r2;
		}

		/**
		 * Constructor for the instance method, taking a (required) request
		 * object.
		 * @param rs The request object.
		 * @param r2 The request object.
		 */
		public static void instanceMethod(ServletRequest rs, ServletRequest r2,
		                           ServletResponse rs2) {
			req = rs;
			req2 = r2;
			resp = rs2;
		}


	@Test
	public void testRequestContext() throws Exception {
	        System.out.println("request");
	        HttpServletRequest request = req;

        String[] expected = new String[]{"foo[bar1]", "foo[bar2]", "foo"};
	        assertEquals(expected, getParamMap(path).keySet());

	        String[] actuals = new String[]{null, null, null};
	        List<String> expecteds = new ArrayList<>();
	        expecteds = new ArrayList<>(Arrays.asList(expected));

	        for (String expectedKey : expecteds) {
	            expecteds = new ArrayList<>();
	            expecteds.add(getParamMap(path + "/" + expectedKey).get(expectedKey));
	        }

	        for (String actualKey : getParamMap(path).keySet()) {
	            List<String> actualValues = new ArrayList<>(getParamMap(path).get(actualKey).split(","));
	            expecteds = new ArrayList<>(Arrays.asList(expecteds));  // remove duplicates
	            for (String expectedValue : expectedValues) {
	                if (expectedValue!= null) {
	                    assertEquals("expected "+expectedKey+"["+expectedValue+"]"+
	                            " found: "+actualValue+" in "+request.getRequestURL(),
	                            expecteds.contains(actualValue));
	                }
	            }
	        }
	    }
}
