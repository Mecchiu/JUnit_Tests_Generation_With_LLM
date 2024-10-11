// JVCRequestContext_5Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContext_5Test {
		
	private static final String FILE =
		"a-file.txt.gz";

	private static final String URL = "http://example.com/index.html";

	private static final int REQUEST_FILTER_LENGTH = 30;

	protected static class MyServletConfig implements ServletConfig {
		
		public boolean getUseCaches() {
			return true;
		}
		
		public void setUseCaches(boolean use) {
		}
		
		public ServletContext getServletContext() {
			return null;
		}
		
		public String getServletName() {
			return null;
		}
		
		public AsyncContext startAsync() throws IOException {
			throw new UnsupportedOperationException();
		}
		
		public AsyncContext startAsync(ServletRequest request, ServletResponse response) throws IOException, javax.servlet.ServletException {
			throw new UnsupportedOperationException();
		}
		
		public int getAsyncSupported() {
			return 0;
		}
		
		public HttpRequestBase getHttpRequest() {
			return new PostParameterRequest();
		}
		
		public HttpResponseInternal getHttpResponse() {
			return new PostResponseError();
		}
		
		public HttpServletRequest getServletRequest() {
			return null;
		}
		
		public HttpServletResponse getServletResponse() {
			return null;
		}
		
		public URL getUrl() {
			return null;
		}
		
		public int getContentLength() {
			return 0; // this is not set
		}
	}

	final String cookieAttribute;
	final MyServletConfig servletConfig;

	public JVCRequestContext_5Test() {
		this("");
	}

	public JVCRequestContext_5Test(String cookieAttribute) {
		this.cookieAttribute = cookieAttribute;
		servletConfig = new MyServletConfig();
	}

    public JVCRequestContext_5Test(MyServletConfig servletConfig) {
		this.servletConfig = servletConfig;
	}

    public String getCookie(String cookieName) {
		// we need the cookie value or the test fails
		if (cookieAttribute!= null) {
			return this.servletConfig.getCookie(cookieName);
		}
		else {
			return "cookie.txt";
		}
	}

	public void setCookie(String cookieName, String cookieValue) {
		this.servletConfig.setCookie(cookieName, cookieValue);
	}

	public Map<String, Cookie> getCookies() {
		// we need the "raw" cookie value or the test fails
		if (cookieAttribute == null) {
			return this.servletConfig.asMap();
		}
		else {
			return this.servletConfig.getCookie(cookieAttribute);
		}
	}

	public void setUp() throws Exception {
		// don't set up anything, it'll get done by setUp()
	}

	public void tearDown() throws Exception {
		if (servletConfig.getHttpRequest()!= null) {
		}
		// clean a bit, it won't get cleared
	}

	/**
	 * This unit test class tests the functionality of the
     * {@link org.apache.commons.fileupload.servlet.ServletFileUploadUtils} class.
     *
     * It allows a test to retrieve the file on disk and parse it.  The
     * tests run against the file length is the <i>request</i> filter
     * length plus <i>response</i> filter depth.
     * This test also ensures that <i>no</i> filter data will be returned
     * by a servlet, it verifies that the contents of the filter
     * length is zero, as well as the contents of the filter depth.
     *
     * @throws Exception
     */
	@Test
	public void testGetFile() throws Exception {

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		HttpURLConnection conn = (HttpURLConnection) new URL(URL).openConnection();
		ServletFileUpload upload = new ServletFileUpload(new FileItemFactory((byte[] bs) -> {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			Streams.copyLarge(bs, out);
			return out;
		}));

		int size = (int) (conn.getContentLength() - REQUEST_FILTER_LENGTH);
		assertTrue("bad file size", size >= 0);

		upload.setFile(FILE);

		int fileUploadSize = 0;
		InputStream is = null;
		try {

			is = upload.openItem(0);

			// check for file uploaded with filter size / depth
			fileUploadSize = (int) is.skipBytes(REQUEST_FILTER_LENGTH);
			assertEquals("size check, zero file not reported", size, fileUploadSize);

			// check for file uploaded without filter size / depth
			fileUploadSize = (int) is.skipBytes(0);
			assertEquals("size check, zero file not reported", size, fileUploadSize);
		} finally {
			if (out!= null) {
                                out.flush();
				out.close();
			}
			if (is!= null) {
				is.close();
			}
		}
	}
}