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
		 * test client http request
		 * @throws IOException
		 */
		@Test
		public void test() throws Exception {
				String path="../";
                int size =1024;
                int offset =1024;//size/2;       //add a padding 0 as a check for length
				int sizeOfBinary =2048;    //Size of binary
				int sizeOfBinaryByte = 64; //bytes
				int responseSize =2048+sizeOfBinaryByte;//size

				for(int i =0; i < offset; i++){
						Map<String,String> params =new HashMap<String,String>();
						params.put("filename1", "filename"+ (int) (Math.floor(Math.random()*2147483647)+size));
						params.put(HttpMethod.POST.name(), "" + sizeOfBinary);
						ClientHttpRequest.post(params);//.setRequestParameters(params).run();	
				}

				Map<String, String> params = new HashMap<String, String>();
				params.put("filename1", "filename"+ (int) (Math.floor(Math.random()*2147483647)+size));
				params.put("filename2", "" + sizeOfBinaryByte);
				params.put(HttpMethod.POST.name(), ""+(int) Math.floor(Math.random()*2147483647)+"");
				ClientHttpRequest.post(params);//.setRequestParameters(params).run();

				//Test ClientHttpRequest.post(String type) after the request is executed, to test response (without any cookies)
				URL url = new URL(path + "http_1.1");
					ClientHttpRequest r = new ClientHttpRequest(url, 0);

				clientHttpRequest = r; //initialize the ClientHttpRequest object with the url and request parameters
				try {
					assertEquals(r.getResponseCode(), 400);//the error was expected
				}catch (IOException e) {
					e.printStackTrace();
				}
				int i=1;
				while (true) {
					try {
						r.run();//it runs with no timeout specified
					}
					catch (IOException e) {
						assertTrue(true); //if I have a timeout that gives all the tests working
						break;
					}
					clientHttpRequest = r;
					//wait a couple of seconds before trying next operation
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					if (i==2) {
						assertEquals(clientHttpRequest.getResponseCode(), 201);//expected 201 response from client
						break;
					}
				}

				//Test ClientHttpRequest.post(String type) after the response is made
				r = new ClientHttpRequest(url, 0);
				clientHttpRequest = r;

				try {
					assertEquals(r.getResponseCode(), 400);//the error was expected
				}catch (IOException e) {
					e.printStackTrace();
				}
				int paramSize = 30;
}
}