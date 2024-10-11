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
		@Test
		public void test1() throws IOException {
				String firstParameterName = "firstParameterName";
				String firstParameterValue = "firstParameterValue";
				String secondParameterName = "secondParameterName";
				Object secondParameterValue = "secondParameterValue";
				String cookieName = "cookieName";

				String name1 = "name1"; // the name of the first parameter, the value
				Object value1 = "value1"; // the parameter value
				String name2 = "name2"; // the name of the second parameter, the value
				Object value2 = "value2"; // the parameter value

				ClientHttpRequest request = new ClientHttpRequest();
				request.setParameter(firstParameterName, value1);
				request.setParameter(secondParameterName, value2);

				request.addCookie(cookieName, new MyHttpCookie(firstParameterName, secondParameterName));

				String response = request.post(name1, value1, name2, value2);

				System.out.format("Response: <%s>\n", response);

				assertEquals(response, "<name1=value1%2Cname2=value2>");
				assertTrue(response.endsWith("<name1=value1%3Cname2=value2>"));


		}

		class CustomFileInputStream extends FileInputStream {
				CustomFileInputStream() throws IOException {
					super(new File("/Users/vlad/test"));
				}

		
				@Override
						public int getOffset() throws IOException {
							return 0;
						}


				@Override
						public long getLength() throws IOException {
							return 1024;
						}
	 }

				private interface MyHttpCookie {
			String name();

			String value();


			void setValue(String value);
		 }

		class MyClientHttpRequest extends ClientHttpRequest {
				class MyHttpCookieImpl implements MyHttpCookie {
					String name;
					String value;
				public MyHttpCookieImpl(String name, String value) {
					this.name = name;
					this.value = value;
				}
	
				@Override
	public <T> T getParameter(String name) throws IOException {
					if(name.equals(name1)){
				return (T)value1;
					} else if (name.equals(name2)) {
				return (T)value2;
				} else {
					return null;
				}
				}
	public String getCookieName() throws java.io.IOException
			{
				if(value==null)
					return null;
		return (String)getParameter(cookieName);
			}
			public void addCookie(String name, MyHttpCookie newHttpCookie) {
				if(name == null )name = name1;
		getParameter(cookieName) = newHttpCookie.name(); getParameter(cookieName) = newHttpCookie.value();
			}
			}

			MyClientHttpRequest get(String name, Object value) throws IOException {
				MyHttpCookieImpl myHttpCookie = new MyHttpCookieImpl(name, value);
				MyClientHttpRequest request = new MyClientHttpRequest();
				request.addCookie(cookieName, myHttpCookie);

				String response = request.post(firstParameterName, value1, name2, value2);

				System.out.format("Response: <%s>\n", response);

				assertEquals(response, "<name1=value1>\n</name1=value2>");
				assertTrue(response.endsWith("<name1=value1>"));

			}

}
}