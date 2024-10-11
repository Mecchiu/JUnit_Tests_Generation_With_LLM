// ClientHttpRequest_4Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_4Test {
		
	@Test
    public void testHttpRequest() throws Exception {
        String url_string = "jar:http://www.browsersoft-community.com/file-agenter/servlets/files/tests/1/1.txt";
        String user_string = "user:dummy";
        String password_string = "password:pass";
        String cookie_string = "";
        Object[] cookies = null;
        Object[] parameters = new Object[1];
        
		byte[] buffer = new byte[1024*1024];
		String content = "Hi there";
        String path = "/web/upload";

		ClientHttpRequest httpRequest = new ClientHttpRequest.ClientHttpRequest();

		// set the urls in the constructor
		httpRequest.setUrl(url_string);
		httpRequest.setUser(user_string);
		httpRequest.setPassword(password_string);
		httpRequest.setFileName(path);
		httpRequest.setCookies(cookie_string, cookies);
		httpRequest.setParameters(parameters);
		httpRequest.execute();

		// check values stored inside params
		content = "" + httpRequest.getParam(content);
		assertEquals(content, "Hi there");

		// check values stored inside cookies
		content = "" + httpRequest.getParam(content);
		assertEquals(content, "Hi there");

		// add and check the url to the parameter
		parameters[0] = null;
		content = "" + httpRequest.getParam(content);
		assertEquals(content, "Hi there");

		// check values stored inside cookies
		content = "" + httpRequest.getParam(content);
		assertEquals(content, "Hi there");

		// set cookies
		cookie_string = "foo=" + httpRequest.getParam("Foo");
		httpRequest.setCookies(cookie_string, cookies);
		// remove the cookies, they should never be used
		httpRequest.setCookies(cookie_string, null);
		// add and check values stored inside cookies
		parameters[0] = null;
		content = "" + httpRequest.getParam(content);
		assertEquals(content, "Hi there");

		// set cookies
		cookie_string = "foo=" + httpRequest.getParam("Foo");
		httpRequest.setCookies(cookie_string, cookies);
		// remove the cookies, they should never be used
		httpRequest.setCookies(cookie_string, null);
		// add and check values stored inside cookies
		parameters[0] = null;
		content = "" + httpRequest.getParam(content);
		assertEquals(content, "Hi there");

		// set files
		parameters[0] = null;
		File file = new File(content);
		String mimeType = httpRequest.getMimetype(file);
		assertEquals(mimeType, "application/octet-stream");
				
		// get the input stream of the response
		InputStream input_stream = httpRequest.post(null, parameters);
		assertNotNull(input_stream);
		file = FileIO.getFile(FileIO.readFromFile(input_stream, "abc"), "/web/upload");
		assertEquals(file.getAbsolutePath(), "/web/upload");

		// check the content (from the request headers)
		content = "" + FileIO.readFromFile(input_stream, "abc", 0, 30);
		assertEquals(content, "Hi there");
    }

	@Test
    public void testGetCookies() throws Exception {

		String url_string = "jar:http://www.browsersoft-community.com/file-agenter/servlets/files/test_cookies.txt";
		String user_string = "user:dummy";
		String password_string = "password:pass";
		String cookie_string = "";
		Object[] cookies = null;

		String name = "http_cookies";
		Object[] value = null;

		cookie_string = clientHttpRequest.setCookies(name, value, cookies);

		// check the cookies
		assertEquals(cookie_string, "http_cookies=test_cookies_value; Path=/; Domain=.browsersoft-community.com; HttpOnly=on");

		// read the file, which was written with cookies
		File file = FileIO.getFile(FileIO.readFromFile(getClass().getResourceAsStream("test_cookies.txt"), "abc"),
		    "/web/upload");
		assertEquals(file.getAbsolutePath(), "/web/upload");
		String content = FileIO.readFromFile(file, "abc").replace("\r", "");
		assertTrue(content.matches("http_cookies=test_cookies_value[0-9]*; Path=/; Domain=.browsersoft-community.com; HttpOnly=on$"));

		// change the client's http_session id.
		String id = "new_session_id";
		cookie_string = clientHttpRequest.setCookies(name, value, cookies);
		// check the cookies
		assertEquals(cookie_string + String.format("[%1$s]", id), "test_cookies_value; Path=/; Domain=.browsersoft-community.com; HttpOnly=on;" + id);

		// read the file, which was written with cookies
		file = FileIO.getFile(FileIO.readFromFile(getClass().getResourceAsStream("test_cookies.txt"), "abc"),
		    "/web/upload");
		assertEquals(file.getAbsolutePath(), "/web/upload");
		content = FileIO.readFromFile(file, "abc").replace("\r", "");
}
}