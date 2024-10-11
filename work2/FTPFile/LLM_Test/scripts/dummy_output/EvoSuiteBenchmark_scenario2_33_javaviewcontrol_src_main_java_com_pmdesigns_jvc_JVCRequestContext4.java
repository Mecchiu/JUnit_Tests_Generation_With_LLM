// JVCRequestContextTest.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* It tests the case when the session is null.
	*/
	@Test
	void testGetSessionAttr_1() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return null;
			}
		};
		JVCRequestContext context = new JVCRequestContext(request, null, null);
		assertNull(context.getSessionAttr("name"));
	}
}