// JVCRequestContext_9Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {

	public static final String FILE = "File Content";
	public static final List<String> METHODS = Arrays.asList("GET", "DELETE", "POST", "PUT", "HEAD", "DELETE", "PUT", "TRACE");
	public static final String QUERY_ARG = "q=p";
	public static final String REDIRECT_METHOD = "redirect";
	public static final String URL = "jvc.jmashall.com";
	public static final String CONTENT_TYPE_HEADER = "content-type";
	
	@Test
	public void testMethod() throws IOException{
		
		final RequestContext requestContext = new RequestContext(
				URL, 
				CONTENT_TYPE_HEADER, 
				HTTP_METHOD.NAME,
				METHODS.get(1), 
				QUERY_ARG);
			 
        RequestProcessor requestprocessor = new RequestProcessor();
        requestprocessor.process(requestContext);
	}
	
	@Test
	public void testGetRequestWithMethod() throws IOException = 
			{ 
			HttpServletRequest request = new HttpServletRequest(){ 
				@Override
				public String getMethod(){ 
					return "GET"; 
				}};
			
		final RequestContext requestContext = new RequestContext(
			URL, 
			CONTENT_TYPE_HEADER, 
			HTTP_METHOD, 
			METHODS.get(1), 
			QUERY_ARG);
		
        final HttpServletResponse response = new HttpServletResponse(){ 
            @Override
            public void sendError(int code, String message){
                setStatus(code);
                // Set all response headers to have the same content-type
                // to indicate that the requested page is not the first page.
                // It's the page that got redirected.
                setHeader("Content-Type", "");
                setHeader("Content-Length", "");
            } 
            };
        
		requestprocessor = new RequestProcessor(requestContext, response);
		requestprocessor.process(request);
        
	}
	
	@Test
	public void testGetRequestWithFormData() throws IOException{
	    HttpServletRequest request = new HttpServletRequest(){ 
			@Override
			public String getMethod(){ 
				return "Get"; 
			}};
	    ServletContextServlet servletContext = new ServletContextServlet();
		ServletWrapper servletWrapper = new ServletWrapper(
				new HttpServletConfig() {

				@Override
				public java.util.List<String> getInitParameterNames() {
					return Arrays.asList(
							"jvc.jmashall.com", 
							"jvc.jmashall.com/jvc", 
							"jvc.jmashall.com/files", 
							"jvc.jmashall.com/redirect", 
							"jvc.jmashall.com/redirect", 
							"jvc.jmashall.com/error", 
							"jvc.jmashall.com/redirect"
							);
				}
			});

		servletContext.addServlet(new ServletHolder(new HttpServlet()), "/");
		servletWrapper.addServlet(new ServletHolder(new HttpServlet()), "/");

		this.servletContext = servletContext;
		
	    RequestProcessor requestprocessor = new RequestProcessor(null, null);
		requestprocessor.process(request);
	}

	@Test
	public void testRequestWithoutRedirect_POST(){
		HttpServletRequest request = new HttpServletRequest(){ 
			@Override
			public String getMethod(){ 
				return "POST";
			}};
		ServletContextServlet servletContext = new ServletContextServlet();
		ServletWrapper servletWrapper = new ServletWrapper(
				new HttpServletConfig() {

					@Override
					public java.util.List<String> getInitParameterNames() {
						return Arrays.asList("jvc.jmashall.com", "jvc.jmashall.com/files");
					}});

		try{
			servletContext.addServlet(new ServletHolder(new HttpServlet()), "/");
		} catch(Exception ex) {
			System.out.println(ex);
			throw new RuntimeException(ex);
		}

		requestprocessor = new RequestProcessor(null, null);
		requestprocessor.process(request);	
    }
	
	@Test
	public void testRedirect_POST(){
		String jvcJson = "{\n \t\t\t\"files_type\" : \"files\",\n  \t\t\"redirect_uri\" : \""+ jvcPath + \"\",\n  \t\t\"query\" : \"q=p\",\n   	  \"http_method\" : \"POST\"\n  }";
		HttpServletRequest request = new HttpServletRequest(){ 
			@Override
			public String getMethod(){ 
				return "POST";
			}};
		ServletContextServlet servletContext = new ServletContextServlet();
		ServletWrapper servletWrapper = new ServletWrapper(
				new HttpServletConfig() {

					@Override
					public java.util.List<String> getInitParameterNames() {
						return Arrays.asList(
								"jvc.jmashall.com",
								"jvc.jmashall.com/jvc", 
								"jvc.jmashall.com/files",
								"jvc.jmashall.com/redirect",
								"jvc.jmashall.com/redirect"
								);
					}});

		try{
			servletContext.addServlet(new ServletHolder(new HttpServlet()), "/");
		} catch(Exception ex) {
			System.out.println(ex);
			throw new RuntimeException(ex);
		}

		servletContext = servletContext;
		
		requestprocessor = new RequestProcessor(null, null);
		requestprocessor.process(request);
    }
    
    public static final class Request