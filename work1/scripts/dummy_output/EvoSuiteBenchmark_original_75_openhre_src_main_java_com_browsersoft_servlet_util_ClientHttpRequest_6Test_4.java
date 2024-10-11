// ClientHttpRequest_6Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {
		/**
		 * {@code name1} parameter name1's value
		 * @param name1 name of the first parameter
	 	 */
		private String name1;
		/**
		 * {@code name2} parameter value2's value
		 * @param name2 name of the second parameter
	 	 */
		private String name2;

		public ClientHttpRequest_6Test(String name1, String name2) {
			this.name1=name1;
			this.name2=name2;
		}
		/**
		 * @return name of the first parameter
		 */
		public String getName1() {
			return name1;
		}
		/**
		 * @param name1 second parameter that represents the name of the first parameter
		 */
		public void setName1(String name1) {
			this.name1=name1;
		}
		/**
		 * @return name of the second parameter
		 */
		public String getName2() {
			return name2;
		}
		/**
		 * @param name2 second parameter that represents the name of the second parameter
		 */
		public void setName2(String name2) {
			this.name2=name2;
		}

		public String getValue1() {
			return (String) getParam("name1");
		}
		/**
		 * @param value1 the value of the "name1" parameter
		 */
		public void setValue1(String value1) {
			this.setParam("name1", value1);
		}
		/**
		 * @return the "value2" parameter value
		 */
		public String getValue2() {
			return (String) getParam("name2");
		}
		/**
		 * @param value2 the value of the "name2" parameter
		 */
		public void setValue2(String value2) {
			this.setParam("name2", value2);
		}

		/**
		 * @return a map with {@link Map}s to add {@link String} entries to the server request
		 */
		public Map<String,String> getParam() {
			Map<String,String> map = new HashMap<>();
			map.put("value1", getValue1());
			map.put("value2", getValue2());

			return map;
		}

		/**
		 * @return a map with {@link Map}s to add {@link String} entries to the URL
		 */
		public Map<String,String> getRequest() {
			Map<String,String> map = new HashMap<>();
			map.put("name1", getName1());
			map.put("name2", getName2());

			return map;
		}

		/**
		 * @return a map with {@link Map}s to add {@link File} entries to the server request
		 */
		public Map<String,File> getFileRequest() {
			Map<String,File> map = new HashMap<>();
			File file1=getFile("name1");
			File file2=getFile("name2");
			map.put("name1", file1==null?file2:file1);
			map.put("name2", file2==null?file1:file2);

			return map;
		}

		/**
		 * @return a map with {@link Map}s to add {@link InputStream} entries to the server request
		 */
		public Map<String,InputStream> getInputStreamRequest() {
			Map<String,InputStream> map = new HashMap<>();
			FileInputStream fis1=getFile("name1");
			FileInputStream fis2=getFile("name2");
			map.put("name1", fis1==null?fis2:fis1);
			map.put("name2", fis2==null?fis1:fis2);

			return map;
		}
		/**
		 * @return a map with {@link Map}s to add {@link OutputStream} entries to the server request
		 */
		public Map<String,OutputStream> getOutputStreamRequest() {
			Map<String,OutputStream> map = new HashMap<>();
			FileOutputStream fos1=getFile("name1");
			FileOutputStream fos2=getFile("name2");
			map.put("name1", fos1==null?fos2:fos1);
			map.put("name2", fos2==null?fos1:fos2);

			return map;
		}

		/**
		 * returns server response with the specified parameters
		 * @param name1
		 * @param name2
		 * @param path
		 * @return server response with the specified parameters
		 * @throws IOException
		 */
		public InputStream post(String name1, Object value1, String name2, Object value2) throws IOException {
			return post(name1, value1, name2, value2, null, "Md5");
		}

		/**
		 * returns server response with the specified parameters
		 * @param name1
		 * @param name2
		 * @param path
		 * @param value1
		 * @param value2
		 * @param header
		 * @param algorithm
		 * @return server response with specified parameters
		 * @throws IOException
		 */
		public InputStream post(String name1, Object value1, String name2, Object value2, Map<String,String> header, String algorithm)
				throws IOException {
			String value2a = getValue2();
			String md5=getValue2();
			boolean useAsChecksum = getValue2()==null;
			boolean returnFile = value2a==null?true:getValue1()!=null;

			return post(name1, value1, name2, value2, header, algorithm, returnFile, useAsChecksum);
		}

		/**
		 * returns server response with the parameter-value pairs, specified by {@link URLConnection}
		 * @param name1
		 * @param name2
		 * @param path
		 * @param value1
		 * @param value2
		 * @param header
		 * @param algorithm
		 * @param returnFile
		 * @param useAsChecksum
		 * @return URLConnection
		 * @throws IOException
		 */
}