// ClientHttpRequest_1Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequest_1Test {
static volatile Map<String, Object> parameters;
		static volatile Map<String, Object> cookieValuesWithParams;

		static {
				parameters = new HashMap<String, Object>();

				parameters.put("param", null);
				parameters.put("param", "test value");

				cookieValuesWithParams = new HashMap<String, Object>();
				cookieValuesWithParams.put("Cookie", "abcabc");
				cookieValuesWithParams.put("cookie", "abcabc");
		}

		@Test
		void a(){
			ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
			try {
				clientHttpRequest.post(parameters);
			} catch(IllegalStateException exception) {
				//expected behaviour should be empty map
				assertEquals("Empty request's headers map.",0,parameters.size());
			}
		}
}