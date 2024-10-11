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
		
	private final static String POST_VALUE = "test";
	private final static String POST_NAME = "param1";
	private final static String POST_PATH = "/some/path/with/queries";
	private final static String POST_FILE = "/some/file/";
	private final static String POST_RESOURCE = "/some/resource";
	private final static String POST_ENDPOINT = "localhost";
	private final static int POST_PORT = 80;
	private final static String POST_PARAMS = "name=value1, name=value2, myname=myvalue";
	
	@Test
	void aTest() throws Exception {
		final Random r = new Random();
		final Map<String, String> map = new HashMap<>();
		final File file = new File("/a");
		
		urlToFile_8Test(map, file);
		urlToFile_8Test(map, POST_RESOURCE);
		urlToFile_8Test(map, POST_NAME);
		urlToFile_8Test(map, POST_PATH);
		urlToFile_8Test(map, POST_FILE);
		urlToFile_8Test(map, POST_ENDPOINT);
	}
	
	private void urlToFile_8Test (Map<String, String> map, String filename) throws IOException {
		String url = "localhost:" + POST_PORT + "/" 
				+ POST_NAME 
				+ POST_FILE 
				+ POST_RESOURCE 
				+ POST_ENDPOINT;
		URLConnection oc = new URL(url).openConnection();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			final String name = entry.getKey();
			final String value = entry.getValue();
			oc.setRequestProperty(name, value);
		}
		file = new File("/a/" + filename);
		oc.setDoOutput(true);
		OutputStream os = oc.getOutputStream();
		os.write(POST_VALUE.getBytes());
		os.write(' ');
		os.close();
		OutputStream resposete = oc.getResponseOutputStream();
		int n = 0;
		InputStream bis = oc.getInputStream();
		byte[] buff = new byte[512];
		final byte[] data = new byte[512];
		while ((n = bis.read(buff)) > 0) {
			bos = new ByteArrayOutputStream();
			resposete.write(buff, 0, n);
			resposete.flush();
			os = bos.close();
			resposete = bos;
			bos = new ByteArrayOutputStream();
			bis.read(data);
			int read = bis.read(buff);
			bis.close();
			n = read;
		}
		resposete.close();
		bis.close();
	}
	
	
	@Test
	void aTestParam_8Test() throws Exception {
		final Map<String, String> values = new HashMap<>();
		values.put("key1", "value1");
		values.put("key2", "value2");
		
		urlToFile(values, POST_ENDPOINT);
		urlToFile(values, POST_PATH);
		urlToFile(values, POST_RESOURCE);
		urlToFile(values, POST_NAME);
		urlToFile(values, POST_PAGES);
		urlToFile(values, POST_FIELDS);
		urlToFile(values, POST_FILE);
		urlToFile(values, POST_NAME);
		urlToFile(values, POST_ENDPOINT);
		urlToFile(values, POST_NAME);
		urlToFile(values, POST_PAGES);
		urlToFile(values, POST_PARAMS);
		urlToFile(values, POST_NAME);
		urlToFile(values, POST_ENDPOINT);
		urlToFile(values, POST_NAME);
		urlToFile(values, POST_PAGES);
		urlToFile(values, POST_PARAMS);
		urlToFile(values, POST_NAME);
		urlToFile(values, POST_ENDPOINT);
	}
}