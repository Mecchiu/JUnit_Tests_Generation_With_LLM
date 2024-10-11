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
		
	private final String[] cookies;
	private final Object[] parameters;
	
	/**
	 * 
	 */
	private ClientHttpRequest_4Test() {
	this(new Object[0]);
  }
	
	/**
	 * @param cookies cookies
	 * @param parameters parameters
	 */
	private ClientHttpRequest_4Test(Object[] cookies) {
		this.cookies = cookies;
		this.parameters = new Object[0];
	}

	/**
	 * @return the cookies
	 */
	public Object[] getCookies() {
		return cookies;
	}

	/**
	 * @return the parameters
	 */
	public Object[] getParameters() {
		return parameters;
	}
	
	@Test
	public void testPost() throws IOException {
		new ClientHttpRequest(cookies).post(parameters);
		
		assertEquals("getCookies()", cookies, getCookies());
		assertEquals("getParameters()", parameters, getParameters());
	}
}