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

	@Test
	public void TestParam() {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		String parameters = null;
		RequestContext ctx = new JVCRequestContext(mapRequest, "BINARY_VALUE");
		Collection<String> result = ctx.getParamNames("param1");
		assertEquals(2, result.size());
		assertEquals(names[0], names[1]);
		result = ctx.getParamNames("param2");
		assertEquals(1, result.size());
	}

	@Test
	public void TestGetParamNames() {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		String parameters = null;
		RequestContext ctx = new JVCRequestContext(mapRequest, "BINARY_VALUE");
		Set<String> result = ctx.getParamNames("param1");
		assertEquals(2, result.size());
		assertEquals(names[0], names[1]);
		result = ctx.getParamNames("param2");
		assertEquals(1, result.size());
	}

	@Test
	public void TestGetParamMap() {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		Map<String, String[]> params = ctx.getParamMap("param1");
		assertEquals(2, params.size());
		assertEquals(names[1], params.get("param2")[0]);
	}

	@Test
	public void TestGetParamValues() {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		Collection<String> result = ctx.getParamValues("param1");
		assertEquals(2, result.size());
		assertEquals(names[0], names[1]);
		result = ctx.getParamValues("param2");
		assertEquals(1, result.size());
	}

	@Test
	public void TestGetParameterName() {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		String parameters = ctx.getParameterName("param1", false);
		assertEquals(names[0], parameters);
	}

	@Test
	public void TestGetParameterValue() {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		String parameters = ctx.getParameterValue("param2", false);
		assertEquals(names[1], parameters);
	}

	@Test
	public void TestRequest() throws Exception {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		String parameters = ctx.getRequest(names);
		assertEquals(names[1], parameters);
	}

	@Test
	public void TestGetRequest() {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		RequestContext ctx = ctx.getRequest("param1");
		assertNotNull(ctx);
		Collection<String> result = ctx.getRequestNames();
		assertEquals(2, result.size());
		assertEquals(names[1], result.iterator().next());
		mapRequest = ctx.getParamMap("param1");
		assertNotNull(mapRequest);
		assertEquals(2, mapRequest.size());
		for (Iterator<String> it = mapRequest.keySet().iterator(); it.hasNext();) {
			String key = it.next();
			if (key.startsWith("param.")){
				assertEquals("param.", key, result.iterator().next());
			} else {
				assertTrue(result.toString(), key.equals(result.iterator().next()));
			}
		}
	}
	
	@Test
	public void TestGetRequestNames() {
		String[] names = new String[]{"param1", "param2"};
		Map<String, String[]> mapRequest = new HashMap();
		mapRequest.put("param1",  (String [])names);
		mapRequest.put("param2",  (String [])names);
		Collection<String> result = ctx.getRequestNames("param1");
		assertEquals(2, result.size());
		Set<String> resultKeyset = new HashSet<String>();
		for (Iterator<String> it = result.iterator(); it.hasNext();) {
			String key = it.next();
			if (key.startsWith