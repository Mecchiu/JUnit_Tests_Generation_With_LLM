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
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			int len = new Random().nextInt();
			System.out.println("len: " + len);
			Map<String, String> param = new HashMap<String,String>();
			param.put("param1", "param1");
			param.put("param2", "param2");
			param.put("param3", param);
			param.put("key1", "/user/name");
			param.put("key2", "/user/first");
			param.put("key3", "/user/second");
			ClientHttpRequest r =  new ClientHttpRequest.ClientHttpRequestBuilder(param).build();


			for (int i = 0; i < len; i++) {
				try {
					r.post("param" + i, null);
					//assertEquals(value1, r.getParameter("param"+i)[0]);
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}

}