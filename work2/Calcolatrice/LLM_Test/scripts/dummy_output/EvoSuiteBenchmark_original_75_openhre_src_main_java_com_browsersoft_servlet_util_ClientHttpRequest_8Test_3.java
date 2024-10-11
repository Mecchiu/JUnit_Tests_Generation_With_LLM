// ClientHttpRequest_8Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_8Test {
		@Test
		void test() throws IOException {
			for (int i=0; i < 10000; i++) {
			String filename = "test.txt";
				
				{ // test with a post.
					String contentType = "text/plain";
					String contentFile = "something.txt";
					
                    Map<String, Object> fields = new HashMap<String, Object>();
					fields.put("test", "123*");
					fields.put("i", new HashMap<String, Object>());
					fields.put("j", new HashMap<String, Object>());
					fields.put("k", new HashMap<String, Object>());
					
					String data = "data";
					fields.put("data",data);

                    String postString = ClientHttpRequest.formatFormParameters(fields);
					System.out.println(postString);
					//String postString = ClientHttpRequest.formatFile(filename);
					//System.out.println(postString);

					String postFile = "testPostFile";  
					String postFileDir = "/Users/pascak/Downloads/";
					//String postFileDir = "c:/Users/pascak/Downloads/";
					
					{ // post with a file.
                    	File dataFile = new File(postFileDir+postFile); 
					FileInputStream fis = new FileInputStream(dataFile);
					byte[] buf = new byte[4096];
					int len = 0, bytesRead = 0;
					//int n=0;
					do {
					len = fis.read(buf);
					if (len<=0)
					break;
					fis.read(buf, 0, len);
					bytesRead += len;
					} while (true);
					
					// n = System.getProperty("file.separator", "\\"))
					// System.out.println("bytesRead="+bytesRead+ ", len="+len);
					System.out.println(bytesRead+", " + (len));
					String result = ClientHttpRequest.get(postString);
					assertTrue("Result is null.",result!=null);
					String result1 = ClientHttpRequest.get(postString).getContentType();
					System.out.println(result1);
					//assertTrue(result1.equals(postFile));
					}
					//postFileDir + postFile;
					{ // post with a file.
                    	FileInputStream fis = new FileInputStream(dataFile);
					byte[] buf = new byte[4096];
					int len = 0, bytesRead = 0;
					while (true) {
					len = fis.read(buf, 0, 4096);
					if (len<=0)
					break;
					
					bytesRead += len;
					}
					System.out.println(bytesRead+", " + (len));
				}
					//postWithFile(filename);
					//postWithFile(filename, postFileDir);
					{ // post with a file.
                    	FileInputStream fis = new FileInputStream(dataFile);
				int len = 0;
					do
					 {
					len = fis.read();
					if (len<=0)
					break;
					
					bytesRead += len;
					}while (true);
					System.out.println(len+", "+bytesRead);
				}
                    String data = "data";
                    String postData = ClientHttpRequest.formatFormParameters(fields);
                    String postFormated = ClientHttpRequest.formatPost(postData, data);
					System.out.println(postFormated);
					String[] result = ClientHttpRequest.get(postFormated);
					System.out.println(result);
					assertEquals(2,result.length);
					assertEquals(data,result[0]);
					assertEquals(filename,result[1]);
                }
			}
		}
		
}