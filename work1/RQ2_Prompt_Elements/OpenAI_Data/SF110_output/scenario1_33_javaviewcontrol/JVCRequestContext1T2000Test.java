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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContextTest {

	@Test
	void testGetParamMap() {
		// test case 1
		JVCRequestContext context = new JVCRequestContext();
		Map<String, String> m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 2
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 3
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 4
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 5
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 6
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 7
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 8
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 9
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
		
		// test case 10
		context = new JVCRequestContext();
		m = context.getParamMap("test");
		assertEquals(0, m.size());
	}
}