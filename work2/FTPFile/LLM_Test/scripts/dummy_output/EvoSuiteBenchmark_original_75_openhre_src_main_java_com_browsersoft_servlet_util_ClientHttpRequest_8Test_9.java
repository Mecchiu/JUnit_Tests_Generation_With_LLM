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
		File target, source, sourceFile;
		String name, name1, name2, name3, name4;

		/**
		* @throws java.lang.Exception
		*/
		@Before
		public void setUp() throws Exception {
			target=new File("../../../test/resources/target/");
			source=new File("../../../test/resources/data/");
			sourceFile=new File("../../../test/resources/data/data.txt");
			name=new StringBuilder("Name").toString();
			name1=new StringBuilder("Name1").toString();
			name2=new StringBuilder("Name2").toString();
			name3=new StringBuilder("Name3").toString();
			name4=new StringBuilder("Name4").toString();
		}

		/**
		* @throws java.lang.Exception
		*/
        @After
		public void tearDown() throws Exception {
        }

        /**
		* This method is not implemented in the interface.
		*
		* @throws java.lang.Exception
		*/
        @Test
        public void testPost() throws Exception {
        }

		/**
         * This test case is for the request that was sent to target,
         * including the cookies.
         * The test case generates an output file with the specified contents 
         *
         * @throws IOException
         */
		@Test
		public void test1() throws Exception {
			ClientHttpRequest request1 = new ClientHttpRequest();
			request1.setParameter(name, value1);
			request1.setParameter(name1, value2);
			request1.setParameter(name2, value3);
			request1.setParameter(name3, value4);
			request1.setParameter(name4, value5);

			URLConnection conn=null;
			OutputStream output=null;
			try {
				String targetFileName = "1.txt";
				String url1 = "http://www.browsersoft.com/cgi-bin/query/query_data";
				String url2 = "http://www.browsersoft.com";
				URL url = new URL(url1);
				conn = new URLConnection(url);
				output = conn.getOutputStream();
				request1.post(name,value2, name1, value3, name4, value4, name5, value5);


				output.write("Hello, World");
				output.close();

				OutputStream actual = new FileOutputStream(sourceFile.getCanonicalFile().getAbsolutePath());
				request1.post(name1,value1, name2, value2, name3, value3, name4, value4);
				actual.write(source.getBytes("UTF-8"));
				actual.close();
//				System.out.println(sourceFile.getAbsolutePath());

				inputStream = new FileInputStream(new File("data.txt"));
				expected = new FileInputStream(targetFileName);
				inputStream.readLine();
				output = inputStream;
				request1.post(name3, value3);
				inputStream.readLine();
				output = new FileInputStream(targetFileName);
				output.readLine();

				request1.prependCookie("HZID=11");
				request1.prependCookie("Cookie=Django.js; HZID="+11);

				request1.post(name4,value4);
				request1.post(name5,value5);
				request1.post(name6,value6);
				inputStream.readLine();
				output.write("Hello, World");
				output.close();

				output = new FileOutputStream(targetFileName);
				output.write(sourceFile.getBytes("UTF-8"));
				output.close();
			} finally {
				if (output!= null) {
					output.close();
				}
				if (conn!= null) {
					conn.disconnect();
				}
			}
			String result1=target.getCanonicalPath() + request1.getParameter(name1, value1) + request1.getParameter(name3, value3);
			String result2=target.getCanonicalPath() + request1.getParameter(name2, value2) + request1.getParameter(name3, value3);
			String result3=target.getCanonicalPath() + request1.getParameter(name4, value4) + request1.getParameter(name5, value5);
			String result4=target.getCanonicalPath() + request1.getParameter(name6, value6) + request1.getParameter(name7, value7);

			assertTrue(result1.equalsIgnoreCase(request1.getParameter(name, value)));
			assertTrue(result2.equalsIgnoreCase(request1.getParameter(name, value)));
			assertTrue(result3.equalsIgnoreCase(request1.getParameter(name, value)));
			assertTrue(result4.equalsIgnoreCase(request1.getParameter(name, value)));

		}
}