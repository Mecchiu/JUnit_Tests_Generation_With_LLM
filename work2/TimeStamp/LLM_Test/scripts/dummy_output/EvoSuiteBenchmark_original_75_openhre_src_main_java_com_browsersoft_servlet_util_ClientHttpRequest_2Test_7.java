// ClientHttpRequest_2Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequest_2Test {
		 /**
        * Method testing the functionality of post requests.
        */
                @Test
		public void test_post() throws Exception {
					final String testPath = "Target/Test/test-method";
					assertNotNull(testPath);
					final String URL = ClientHttpRequest_2Test.class.getClassLoader().getResource("test-method") + "!/path/" + testPath;
					ClientHttpRequest cr = new ClientHttpRequest(URL);
					InputStream is = cr.post(new Object[]{"this value is a new value"});
					assertNotNull(is);
					cr.upload(is, testPath);
					assertEquals("this value is not equal to the expected", "this value is a new value", cr.upload(is, testPath));
			}
				/**
		 * Method testing the functionality of post requests.
		 */
				@Test
				public void test_post() throws Exception {
					final String testPath = "Target/Test/test-method";
					assertNotNull(testPath);
					final String URL = ClientHttpRequest_2Test.class.getClassLoader().getResource("test-method") + "!/path/" + testPath;
					ClientHttpRequest cr = new ClientHttpRequest(URL);
					String url="http://www.browsersoft.com";
					InputStream iss=cr.post(new Object[]{"this value is a new value"});

					//System.out.println("=====url:"+url);
					assertEquals("this value is not equal to the expected",url,cr.upload(iss,testPath));
					iss.close();
				 }
		}