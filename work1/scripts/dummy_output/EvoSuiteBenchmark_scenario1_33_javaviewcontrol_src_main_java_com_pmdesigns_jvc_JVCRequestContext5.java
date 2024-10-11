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
* It contains ten unit test cases for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContextTest {
		
	@Test
	void testGetCookie() {
		// Test case 1
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		Cookie cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 2
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 3
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 4
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 5
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 6
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 7
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 8
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 9
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 10
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
	}
}