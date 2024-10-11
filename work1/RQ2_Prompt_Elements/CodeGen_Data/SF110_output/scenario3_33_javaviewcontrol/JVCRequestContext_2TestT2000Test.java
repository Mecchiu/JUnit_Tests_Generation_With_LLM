// JVCRequestContext_2Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {

    @Test
    void unitTest() throws IOException {
        int expected = 2;
        int actual = 0;
        JVCRequestContext context = new JVCRequestContext();

        String[] params = context.getParamValues(JVCRequestContext_2Test.class.getName());
        assertEquals(params.length, expected);

        for (String param : params) {
            assertEquals("Parameter does not match.", param, param.trim() + " was not replaced with correct data");
            actual++;
        }

        assertEquals("Count of params not incremented", expected, actual);
    }
        
	static class TestInputStream extends InputStream {
		int contentLength = -1;
		int position = 0;

		TestInputStream(int contentLength) {
			this.contentLength = contentLength;
		}

		public int getContentLength() {
			return contentLength;
		}

		public synchronized int read() throws IOException {
			int value = readInternal();

			if (value == -1) {
				value = readInternal();
			}

			return value;
		}

		public synchronized int read(byte[] b) throws IOException {
			int contentLength = getContentLength();

			if (contentLength < 0) {
				return super.read(b);
			}

			return super.read(b, 0, contentLength);
		}

		public synchronized int read(byte[] b, int off, int len) throws IOException {
			int value = readInternal();

			if (value == -1) {
				return super.read(b, off, len);
			} else {
				return super.read(b, off, len);
			}
		}

		int readInternal() throws IOException {
			return super.read(new byte[1]);
		}

		public synchronized void close() throws IOException {
			super.close();
		}
	}

    @Test
    void unitTestOutputStream() throws IOException {
        int contentLength = -1;

		System.out.println("Content Length:" + contentLength);

        TestInputStream testInputStream = new TestInputStream(contentLength);

        Class<? extends HttpServletResponse> respClass = javax.servlet.http.HttpServletResponse.class;

        ServletOutputStream servletOutputStream = ServletTestUtils.wrapOutputStream(new PrintStream(testInputStream), respClass);

        String[] responseNames = JVCRequestContext.getParamNames(respClass);

        for (String name : responseNames) {
            String value = null;

            try {
                assertNull(httpRequestContext.getParamValue(name));
                value = httpRequestContext.getParamValue(name);

                assertNull("Could not get value for response " + name, value);

            } catch (Exception e) {
                assertEquals("Invalid response " + name, e.getMessage());

            }

        }

        servletOutputStream.flush();

        File file = servletOutputStream.getFile();

        assertTrue("No input streams assigned", (file.exists() && Files.exists(file)));

        String current = System.getProperty("user.dir");

        assertEquals("User dir not correctly set", current, file.getAbsolutePath());

        TestInputStream teb = new TestInputStream(contentLength);

        stream = new BufferedInputStream(teb);

    }

    File httpFile = null;
   /**
    * Get the param value for param name. This value may be in one of two ways:
    * - If the parameter is referenced in Http urls
    *   - If it is part of a Map associated with Http url.
     *   - If the name is the name of a param we just pass this one.
     *   - We get back the string "name of value", which is the actual string.
     *   - When called with an arbitrary name and no content type this method just returns that value.
     *  @param name the param's name
     *  @return the value for the param
     */
    String getParamValue(String name) {

        if (httpFile!= null) {
            String value = httpRequestContext.getParamValue(name);
            return value;
        }
        
        HttpServletRequest request = new MockHttpServletRequest();

        String keyToBeReplaced = name;
        String keyToBeDeleted = request.getParameter(keyToBeReplaced);
	
        assertNull(request.getParameter(keyToBeReplaced));

        if (keyToBeReplaced == null) {
            keyToBeDeleted = keyToBeReplaced = request.getParameter("somethingElse");
        }

        String[] value = StringUtils.getStringArrayFromRequest(request, keyToBeReplaced);

        return value[0];
    }

	HttpServletRequest httpRequestContext;

	Class<? extends AbstractHtmlPageContext> viewContext;

        TestInputStream testInputStream;

        File httpFile;

	ServletOutputStream servletOutputStream;

	FileOutputStream stream;

        String responseType;
        String contentType;

        boolean modified;

        static final int BUFFER_SIZE = 8 * 1024;

        HttpURLConnection requestConnection;

     /**
     * Initialize JVCRequestContext and test for servlet response.
     * @exception IOException
     */
     public JVCRequestContext() throws IOException {

        HttpURLConnection requestConnection = 
            (HttpURLConnection) request.openConnection();

        httpFile = Utils.makeTempFile("", "jvcreqctx");
        request.setRequestURL(httpFile);

        try {
            requestConnection.setRequestMethod("POST");
        } catch (IOException e) {
            // should not have an IOException
        }

        testInputStream = new TestInputStream(BUFFER_SIZE);

        servletOutputStream = ServletTestUtils.wrapOutputStream(new PrintStream(testInputStream), testContext);

        int requestCode = request.getRequestCode();

        String message = null;

        try {
            assertEquals("Invalid HttpRequest code", requestCode, request.getRequestCode());

            assertEquals("Invalid Request String",
                "POST", request.getRequestMethod());
            
