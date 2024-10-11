// JVCRequestContext_0Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {
		private final String fileNameInTestData;

		protected JVCRequestContext_0Test(String fileNameInTestData) {
			this.fileNameInTestData = fileNameInTestData;	
		}

		@Test
		void thisTest() {
			// Set up the request
			HttpServletRequest request = new HttpServletRequestWrapper(new HttpServletRequest());
			request.setAttribute("File", new File(getFileName()));	
			
			// Set up the response
			HttpServletResponse response = new HttpServletResponseWrapper(new HttpServletResponse());
			request.setAttribute("Response", response);
			
			// Get the request
			request.getRequestDispatcher("test.jsp").forward(request, response);
		}

		private String getFileName() {
			return this.fileNameInTestData + "/fileNameInTestData." + request.getParameter(HTTP_REQUEST_CONTENT_TYPE) + ".txt";
		}
}

// Servlet 3.0 Test_4RequestContext.java