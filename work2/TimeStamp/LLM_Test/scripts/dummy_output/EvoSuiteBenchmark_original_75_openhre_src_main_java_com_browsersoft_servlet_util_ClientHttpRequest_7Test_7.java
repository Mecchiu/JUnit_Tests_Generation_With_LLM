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
		
		private final String hostname = "localhost";
		private final int httpPort = 8080;
		private final int tcpPort = 8080;

	private final Map<String, Object> reqParams = new HashMap<String, Object>();
    
	{
        reqParams.put("cookieParams", null);
	}	
	
	private final Map<String, Object> reqHeaders = new HashMap<String, Object>();
	
	{
        reqHeaders.put("Cookie", "bVc6uJb4VpVzZiKsO0bGd");
	}	

	private InputStream inputStream = null;
	private OutputStream outputStream = null;
	
	{
		this.inputStream = this.getClass().getResourceAsStream("input.txt");
		this.outputStream = this.getClass().getResourceAsStream("output.txt");
	}
	
    @Test
    public void httpPostTest1() {
		try {
			ClientHttpRequest.inputStream = this.getClass().getResourceAsStream("input.txt");
			ClientHttpRequest.outputStream = this.getClass().getResourceAsStream("output.txt");
			ClientHttpRequest.post(null, null, null, null, null, null);
			ClientHttpRequest.post(null, null, null, null, null, null);			
		} catch (IOException e) {
			fail();
		}
		System.out.println("\n---TEST---");
		System.out.println("Server URL:" + ClientHttpRequest.hostname);
    }
    
    @Test
    public void httpPostTest2() {
		try {
			ClientHttpRequest.inputStream = this.getClass().getResourceAsStream("input.txt");
			ClientHttpRequest.outputStream = this.getClass().getResourceAsStream("output.txt");
			ClientHttpRequest.post("bVc6uJb4VpVzZiKsO0bGd", "cookieParams", null, "file", null, null);
			ClientHttpRequest.post("bVc6uJb4VpVzZiKsO0bGd", "cookieParams", "httpPath", null, null, null);
			ClientHttpRequest.post("bVc6uJb4VpVzZiKsO0bGd", null, "httpParams", null, null, null);
			ClientHttpRequest.post("bVc6uJb4VpVzZiKsO0bGd", null, null, "cookieParams", "httpHeaders", null);
			ClientHttpRequest.post("bVc6uJb4VpVzZiKsO0bGd", null, null, null, null, "httpHeaders");
			ClientHttpRequest.post("bVc6uJb4VpVzZiKsO0bGd", null, null, null, "cookieHeaderParams", "httpHeaders");
			ClientHttpRequest.post("bVc6uJb4VpVzZiKsO0bGd", "cookieHeaderParams", "cookieHeaders", null, null, null);
			ClientHttpRequest.post("bVc6uJb4VpVzZiKsO0bGd", "cookieHeaderParams", "httpParams", null, "fileHeaders", null);				
		} catch (IOException e) {
			fail();
		}
		System.out.println("\n---TEST---");
		System.out.println("Server URL:" + ClientHttpRequest.hostname);
    }
}