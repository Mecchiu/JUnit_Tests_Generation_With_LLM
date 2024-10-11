// ClientHttpRequest_5Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_5Test {
 /**
		* 
		*/
		private Map<String, String> queryParams;

		/**
		* Sets up the test class.
		*/
		private void setup(Map<String,String> parameters) {
			queryParams = new HashMap<>(parameters);
			queryParams.put("name","a_value_of_param");
		}

		/**
		* @throws Exception if it fails
		*/
		@Test
		public void getReturnsPOST() throws Exception {
			setup(queryParams);
			ClientHttpRequest httpRequest = new ClientHttpRequest();
			assertEquals(ClientHttpRequest.GET,httpRequest.method);
			String str;
			Iterator<String> parameterNames = queryParams.keySet().iterator();
			int count = 0;
			while (parameterNames.hasNext()) {
				str = parameterNames.next();
				assertTrue(parameterNames.hasNext());
				assertEquals("a_value_of_param", str);
				count++;
				if(count%2==0){
					assertTrue(parameterNames.hasNext());
					assertEquals("name_id_exists","true");
				}
				else{
					assertEquals("name_id_exists","false");
				}
			}
		}
}