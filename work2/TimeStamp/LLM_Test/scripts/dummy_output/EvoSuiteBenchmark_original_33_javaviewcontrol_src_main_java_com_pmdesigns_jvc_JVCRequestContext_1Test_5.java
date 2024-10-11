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
		
	/**
	 * Test method for {@link JVCRequestContext#getParamMap(String)}
	 * (see JDK 8 API specification JAXP 1.2 specification).
	 */
	@Test
	@SuppressWarnings("unchecked")
	public void testGetParamMap() {
		Map<String, String> m = new HashMap<>();
		m.put("foo[bar1]", "baz1");
		m.put("foo[bar2]", "baz2");
		System.out.print("foo[bar1] = ");
		assertEquals(m.get("foo[bar1]"), "baz1");
		System.out.print("foo[bar2] = ");
		assertEquals(m.get("foo[bar2]"), "baz2");
		
		
	}
}