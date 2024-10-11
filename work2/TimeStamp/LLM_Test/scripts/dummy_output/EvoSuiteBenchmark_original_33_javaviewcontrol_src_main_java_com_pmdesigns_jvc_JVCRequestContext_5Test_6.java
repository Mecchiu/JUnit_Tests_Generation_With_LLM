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
		public static class JVCRequestContext_10 implements HttpServletRequest, HttpServletResponse{
        @Override
		public String getServletPath (){
			return "test_1";
		}
		@Override
		public String getPathInfo (){
			return "testPathInfo";
    }
		@Override
		public String getQueryString (){
			return "testQueryString";
		}
		@Override
		public String getURL (){
			return "testURL";
		}
		@Override
		public String getRequestURI (){
			return "testRequestUri";
    }
		@Override
		public String getRequestURL (){
			return "testRequestURL";
		}
		@Override
		public String getCharacterEncoding (){
			return "testCharacterEncoding";
		}
		@Override
		public String getContentType (){
			return "testContentType";
		}
		@Override
		public Cookie[] getCookies(){
			return new Cookie[]{new Cookie("jvctestcookie", "this is test")};
		}
		@Override
		public String getHeader(String name) {
			return "testvalue";
    }
		@Override
		public Enumeration getHeaders(String name){
			return null;
		}
		@Override
		public int getStatus() {
			return 10;
		}
		@Override
		public String getContentType() {
			return null;
		}
		@Override
		public String getParameter(String name) {
			return null;
		}
		@Override
		public Map<String,String[]> getParameterMap(){
			return null;
		}
		@Override
		public Map getParameterMap(String name) {
			return null;
		}
		@Override
		public Enumeration getParameterNames() {
			return null;
		}
		@Override
		public String[] getParameterValues(String name){
			return null;
		}
		@Override
		public String getHeader(String name) {
			return "testvalue";
    }
		@Override
		public Map getHeaderMap(){
			return null;
		}
		@Override
		public Enumeration getHeaderNames(){
			return null;
		}
		@Override
		public String getProtocol(){
			return null;
		}
		@Override
		public String getScheme(){
			return null;
		}
		@Override
		public String getHost() {
			return null;
    }
 		@Override
 		public int getPort(){
			return 0;
    }
 		@Override
 		public String getLocalAddr() {
			return null;
    }
 		@Override
 		public int getLocalPort() {
			return 0;
    }
 		@Override
 		public String getRemoteAddr() {
			return null;
    }
 		@Override
 		public int getRemotePort() {
			return 0;
    }
 		@Override
 		public String getProtocol(){
			return null;
    }
 		@Override
 		public String getRequestedSessionId(){
			return null;
    }
 		@Override
 		public String getRequestedSessionIdURL(){
			return null;
    }
 		@Override
 		public Object getAttribute(String name) {
			return null;
    }
 		@Override
 		public Enumeration getAttributeNames(){
			return null;
    }
 		@Override
 		public String getAuthType(){
			return null;
    }
 		@Override
 		public String getAuthType(String name){
			return null;
		}
		@Override
		public boolean isRequestedSessionIdFromCookie(){
			return false;
		}
		@Override
		public boolean isRequestedSessionIdFromUrl(){
			return false;
		}
		@Override
		public boolean isRequestedSessionIdValid(){
			return true;
    	}
		@Override
		public Object getAttribute(String name,Class ifClass){
			return null;
		}
		@Override
		public Enumeration getAttributeNames(Class ifClass) {
			return null;
		}
 	}  
	  public void setDataDirResourceRoot(String ddir){
		  base = ddir;
	  }
	  public String getDataDirResourceRoot(){
		  return base;
	  }
	  private String base;

	public JVCRequestContext_10(){
		this.base = "/servlet/test_1";
	}


    public RequestContext getRequestContext(){
}
}