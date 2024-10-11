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
		@Test
		public void testGetParamMap() {
			Map<String, String> map = JVCRequestContext.getParamMap("name");
			assertNotNull(map);
			assertEquals("name", map.get("name"));
		}

		@Test
		public void testGetParamValues() throws Exception {
			String value = null;
			HttpParameter[] values = JVCRequestContext.getParamValues("name");
			assertNotNull(values);
			assertEquals(1, values.length);
			HttpParameter p = values[0];
			assertEquals("name", p.getKey());
			value = p.getValue();
			assertNotNull(value);
			assertEquals("value", value);
		}

		@Test
		public void testGetParamNames() {
			Set<String> names = JVCRequestContext.getParamNames("name");
			assertNotNull(names);
			assertEquals(1, names.size());
			Iterator<String> it = names.iterator();
			String name = it.next();
			assertEquals("name", name);
		}
}