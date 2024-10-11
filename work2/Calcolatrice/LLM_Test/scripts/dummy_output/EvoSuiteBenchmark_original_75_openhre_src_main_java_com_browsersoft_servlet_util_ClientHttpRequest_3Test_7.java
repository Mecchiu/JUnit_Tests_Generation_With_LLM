// ClientHttpRequest_3Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_3Test {
		
	private static void basicTest() throws java.io.FileNotFoundException, java.io.IOException {
		
		Map cookies = new HashMap();
		Map parameters = new HashMap();
		
		String url = "http://www.browsersoft.com";
		
		Map respDataMap = new HashMap();
		respDataMap.put("cookies", cookies);
		respDataMap.put("parameters", parameters);
		
		testSetParameters(getDataMap());
		
		Request clientRequest = new Request(new URL(url));
		
		System.out.println("request:\n" + clientRequest);
		
		String urlString = url.substring(1, url.length() - 1);
		
		clientRequest = clientRequest.setRequestURI(urlString);
		
		byte[] testBytes = new byte[4];
		OutputStream outputStream = new OutputStream() {
			public void write(int i) {
				testBytes[(i & 0x000000FF) >> 0] = (byte)i;
			}
		};
				
		clientRequest.setHeaderFields(testBytes);
		
		String resp = client.getResponseContent(clientRequest);
		
		System.out.println("Response: " + resp);

		assertEquals(urlString, clientRequest.getRequestURI());
		assertEquals(respDataMap, (HashMap)respDataMap);
		
		assertEquals(String.valueOf(resp), "Response:" + ClientUtil.toAsciiString(respDataMap, "text"));
		
	}

	private static void testServerResponse(String resp, String urlString) throws IOException, java.io.IOException {
		String urlStringNoCookie = "http://www.browsersoft.com";
		String urlStringServerCookie = "jsessionid=JSESSIONID";
		
		assertTrue(resp.contains(ClientUtil.toString(urlString)));
		assertTrue(resp.contains(ClientUtil.toString(urlStringServerCookie)));
		assertTrue(resp.contains(ClientUtil.toString(urlStringNoCookie)));
	
		String urlStringCookie = "jsessionid=JSESSIONID;COOKIE=jsessionid" ;
		String urlStringCookieServer = "jsessionid=JSESSIONID ; " + ClientUtil.toString(urlStringNetworkCookie) + "=";
				
		assertTrue(resp.contains(ClientUtil.toString(urlStringServerCookie)));
		assertTrue(resp.contains(ClientUtil.toString(urlStringCookieServer)));

	}

	private static void setParameters(Map params) {
		
		String key = new Random().nextInt();
			
		params.put(urlParameter("key"), key);

		String val = new Random().nextInt() > 2? "a" : "b";

		params.put(urlParameter("val"), val);

		val = new Random().nextInt(65535) + "u";

		params.put("val2", val);

		key = new Random().nextInt() > 2? "key:" : "val:";

		assertEquals("key", params.get(key));

		key = new Random().nextInt() > 2? "key2:" : "key3";

		try {
			params.put(key, val);
			params.subset("key3");
		} catch(Exception e) {
			System.out.println("Unexcetected exception: " + e.getMessage());
		}
	}

	private static void setCookies(Map cookies) {
		
		String key = new Random().nextInt() > 2? "c" : "d";
		
		String val = new Random().nextInt() > 2? "e" : "f";
		
		cookies.put(key, val);

		key = new Random().nextInt() > 2? "c2" : "c3";
		
		try {
			cookies.put(key, val);
		} catch(Exception e) {
			System.out.println("Unexcetected exception: " + e.getMessage());
		}
		
	}


	private static void getDataMap() {
		
		Map cookies = new HashMap();
		Map parameters = new HashMap();

		createCookie("key", "val");
		createCookie("key2", "val");
		createCookie("c", "val");
		createCookie("c2", "key");
		createCookie("c3", "key2");
		createCookie("c4", "c3");
		
		cookies.put("c", "key2");
		cookies.put("c2", "c3");
		cookies.put("c3", "key2");
		cookies.put("c4", "key");
		
		parameters.put("val", "a");
		parameters.put("val2", "b");
		
		map("cookie", cookies);
		map("param", parameters);
		
	}
	
	private static void createCookie(String key, String val) {
		String val2 = val;
		Map<String,String> map = new HashMap<String, String>();

		map.put(key, val2);

		byte[] testBytes = ((Random)(new Random()).nextBoolean()? new byte[]{1,1,0,0} : new byte[]{1,0,0,0}).clone();
				
		Cookie cookie = new Cookie(key, ClientUtil.toString(testBytes));
		cookie.setSecure(true);
		cookie.setDomain(val);
		
		ByteArrayWrapper baw = new ByteArrayWrapper(val2);
		cookie.setValue(baw);
				
		map.put("val3", cookie);

		map.put("val4", val2);
						
		map.put("val5", cookie);
		
		map.put("val6", val2);
		
		map.put("val7", val2);
		
		map.put("val8", val2);
		map.put("val9", Cookie.getInstance(true));
		map.put("val10", Cookie.getInstance(true, null));
		map.put("val11", Cookie.getInstance(true, (String)null));
		
}
}