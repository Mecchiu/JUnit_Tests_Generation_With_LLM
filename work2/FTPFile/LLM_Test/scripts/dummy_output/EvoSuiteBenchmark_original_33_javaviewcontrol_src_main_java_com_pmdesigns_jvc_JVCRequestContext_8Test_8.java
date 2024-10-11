// JVCRequestContext_8Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {
		public static final String URL = "http://localhost:8086/webclient/index.cgi?foo=1234");

		/**
		 * Checks if an html anchor link has been created from a GET request.
		 *
		 * @param anchor link to check
		 * @param options extra html options to add to the anchor tag
		 */
		public void checkGetAnchor(String anchor, String path, String options)
		{
				System.out.println("Checking "+URL+"...");
				String body = "<html><head><link href=\""+anchor+"\" rel=\"stylesheet\"/></head><body>";
				
				int linkLength=20;
				
				if(options!=null) options=options.replaceAll("\\+", " ");
				StringBuilder r = new StringBuilder();
				
				if(options!= null) {
					// add href attribute
					String hrefString = options;
					int index = hrefString.indexOf("#");
					while (index >= 0) {
						String next = hrefString.substring(index+1);
						r.append(next);
						index=next.lastIndexOf("#");
					}
					// r.append(hrefString);
				}
				
			
				//r.append(options);
				for (int i=0;i<linkLength;i++) {
					r.append("</head></body>");
				}
			
				//System.out.println(""+r.toString());
			
				if (body!=null) {
					//System.out.println("Checking "+body);
					try {
						BodyContentType ft=new org.apache.commons.httpclient.BodyContentType(BodyContentType.HTML);
						HttpURLConnection con = (HttpURLConnection) URLDecoder.decode(URL, "UTF-8");
						con.setDoOutput(false);
						try (OutputStream s=con.getOutputStream()) {
							s.write(body.getBytes());
						}
					} catch (Exception err) {
						// handle any other exception
						System.out.println(err.toString());
					}
					//System.out.println("---");
				}
				
			}
		
		
	/**
	 * Tests the path parameter of the method {@link #makeLink(String, String, String)}
	 * to ensure there is atleast one link in the request context.
	 *
	 * @throws Throwable if something goes wrong
	 * @see JVCRequestContext.makeLink
	 * @see #checkGetAnchor
	 */
	@Test
	public void testGetLink() throws Throwable {
		JVCRequestContext context = makeJVCRequestContext();
		context.checkGetAnchor("/index.cgi?foo=1234", null, null);
	}
	
	/**
	 * Returns the HTTP response context
	 *
	 * @return HTTP response context
	 * @see HttpServletResponse
	 */
	public HttpServletRequest getHttpRequest() {
		return request;
	}

        private HttpServletRequest request = null;

	private JVCRequestContext makeJVCRequestContext()
	{
            JVCRequestContext context = new JVCRequestContext();
            request = context.getHttpRequest();
            if (request!=null)
            {
                // HttpServletRequest
                if (! (request instanceof HttpServletRequest))
                {
                    throw new IllegalStateException("HTTP Request must be an instance of HttpServletRequest, but was "+request.getClass().getCanonicalName());
                }
                request=(HttpServletRequest)request;
            }
            return context;
	}

	private HttpServletResponse getHttpResponse()
	{
        return request;
	}

		
}