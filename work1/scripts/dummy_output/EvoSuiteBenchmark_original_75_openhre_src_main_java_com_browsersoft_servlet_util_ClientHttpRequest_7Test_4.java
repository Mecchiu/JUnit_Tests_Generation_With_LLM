// ClientHttpRequest_7Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
		public ClientHttpRequest_7Test() {
		}
		/**
		* Test method for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)}.
		* @throws IOException exception
		*/
		@Test
		public void testPost() throws IOException {
				String request = "<h1>Hello World!</h1>";
				Map<String, String> parameters = new HashMap<>(2);
				parameters.put("Name1", "Value1");
				parameters.put("Name2", "Value2");
				parameters.put("Name3", "Value3");
				parameters.put("Name4", "Value4");
				String encodedRequest = encode(request, parameters);
				byte[] resp1 = decode(encodedRequest);
				assertTrue("Check 1", isMatch(resp1, new byte[] { 0, 1, (byte) 1 }) );
				assertTrue("Check 2", isMatch(resp1, new byte[] { (byte) 0, (byte) 2, (byte) 1 }) );

				String requestWithCookie = "<h1>A+B</h1>";
				Map<String, String> parametersForCookie = new HashMap<>(2);
				parametersForCookie.put("Name1", "CookieValue1");
				parametersForCookie.put("Name2", "CookieValue2");
				String encodedRequestWithCookie = encode(requestWithCookie, parametersForCookie);
				byte[] resp2 = decode(encodedRequestWithCookie);
				assertTrue("Check 3", isMatch(resp2, new byte[] { (byte) 0, (byte) 3, (byte) 1 } ) );
		}

        /**
         * Check for cookie added to POST with custom parameters.
         */
        private boolean isMatch(byte[] resp, byte[] cookie) {
            if(!cookie.length) return false;
            for(int i = 0; i < resp.length; i++) {
                if(resp[i] == (byte) 0x31 && resp[i+1] == (byte) 0x34 && resp[i+2] == (byte) 0x38) {
                    return true;
                }
            }
            return false;
        }
    }