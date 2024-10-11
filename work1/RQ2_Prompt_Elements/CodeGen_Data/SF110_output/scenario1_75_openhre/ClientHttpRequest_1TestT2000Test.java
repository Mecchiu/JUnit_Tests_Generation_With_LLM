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
/**
		 * Test {@link ClientHttpRequest#post(Map)}.
		 */
		@Test
		void testPost() throws IOException {
			String url = new URL("http://localhost:8082/").toString();
			String postData = "dummy post, dummies, dummy post";
			Map postParameters = new HashMap();
			post(postParameters);
			assertTrue(postParameters.get("post").equals(postData));
		}

		/**
		 * Test {@link ClientHttpRequest#post(Map)}.
		 */
		@Test
		void testPostWithExtraParameters() throws IOException {
			String url = new URL("http://localhost:8082/").toString();
			String postData = getPostParameterAsString("post", 0, 7);
			Map postParameters = new HashMap();
			post(postParameters);
			assertTrue(postParameters.get("post").equals(postData));
		}

		/**
		 * Test {@link ClientHttpRequest#post(Map)}.
		 */
		@Test
		void testPostWithFileParameters() throws IOException {
			String url = new URL("http://localhost:8082/").toString();
			File file = new File("test.txt");
			InputStream fis = new FileInputStream(file);
			String postData = getPostParameterAsString("post", 0, 7);
			Map postParameters = new HashMap();
			post(postParameters);
			assertTrue(postParameters.get("post").equals(postData));
			postParameters = getPostParameterMapOnFile(postData);
			assertTrue(postParameters.get("size").equals(new Integer(file.length()).toString()));
		}

		private void send(Map parameters, Map parametersAsArray) {
			String data = getPostParameterAsString(parameters.get("post"));
			String headers = getPostParameterMapOnFile(data);
			System.out.println("\ntestData=" + data);
			System.out.println("headers=" + headers);
			System.out.println("parameters" + parameters);
			URLConnection urlConnection = new URL("http://www.google.com").openConnection();
			try (OutputStream out = urlConnection.getOutputStream();) {
				for (Iterator i1=parametersAsArray.keySet().iterator(); i1.hasNext();) {
					urlConnection.setRequestProperty(i1.next(), parametersAsArray.get(i1.next()).toString());
				}
				System.out.println("\nwrite");
				System.out.println("urlConnection.setRequestProperty(\"foo\",");
				System.out.print(parametersAsArray.get("foo").toString());
				System.out.println("!\");");
				out.write(data.getBytes());
				out.write('\n');
				System.out.println("\nwrite end");
			}			
		}
		private Map getPostParameterMapOnFile(String data) {
			File file = new File("test.txt");
			try (InputStream fis = new FileInputStream(file);) {
				String postData = data.replace("\\", "\\\\");
				byte buf[] = new byte[postData.length()];
				fis.read(buf);
				HashMap postParameters = new HashMap();
				postParameters.put("POST_DATA", postData);
				return postParameters;
			}
		}
		private Map getPostParameterMapOnFile(String data, int size) {
			File file = new File("test.txt");
			try (InputStream fis = new FileInputStream(file);) {
				byte buf[] = new byte[data.length()];
				int read;
				int count = size;
				while (count-->0) {
					read = fis.read(buf);
					if (read>0) {
						System.out.printf("file read %d: %X\n", count, buf);
						throw new RuntimeException("File read");
					}
				}
				HashMap postParameters = new HashMap();
				postParameters.put("POST_DATA", data.substring(0, data.length()-(count*buf.length)));
				return postParameters;
			}
		}
		private Map getPostParameterMapOnFile(int size) {
			File file = new File("test.txt");
			try (InputStream fis = new FileInputStream(file);) {
				byte buf[] = new byte[size];
				int count = size;
				while (count-->0) {
					fis.read(buf);
					System.out.printf("file read %d: %X\n", count, buf);
				}
				HashMap postParameters = new HashMap();
				return postParameters;
			}
		}

		private void setParameters(Map parameters) {
			headers = getPostParameterMapOnFile("POST.DATA=dummy post,dummies, dummy post".replaceAll("\\?", ""));
			String testSize = parameters.get("size").toString();
			headers.put("Content-Type", "application/octet-stream");
			headers.put("Content-Length", testSize);
		}

		private Map getPostParameterMap(String path) {
			String[] parts = path.split("-");
			Map map = new HashMap();
			map.put(parts[2], parts[4]);
			return map;
		}
		private String getPostData() throws IOException {
			return getPostParameterMap(new File("test.txt"), 0, 7);
		}
	private String getPostParameterAsString(String parameterName, int start, int end) {
		String postData = "";
		//Get the headers Map
		Map headers = getPostParameterMap(parameterName);
		Map parameters = getPostParameterMap(parameterName);
		for (int i=start; i<=end; i++) {
			if (headers.get(parameters.get(i).toString()).equals(""))
				return "";
			postData = postData + parameters.get(i).toString() + "=" + headers.get(parameters.get(i).toString()) + "\n";
		}

		return postData;
	}

}
