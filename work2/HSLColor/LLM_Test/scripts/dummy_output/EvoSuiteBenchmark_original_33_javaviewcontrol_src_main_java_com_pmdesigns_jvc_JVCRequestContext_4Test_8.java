// JVCRequestContext_4Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_4Test {
		
    //----------------------------------------------------------------
    public static void main(String []apis) throws Exception {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);             
        context.setContextPath("/test");
        ServletHolder holder = new ServletHolder("GetSession", JVCRequestContext.class);
        context.addServlet(holder, "/jvc/*");
        context.addServlet(new ServletHolder("PutInt", PutJVCRequestContext.class), "/get/*");
        context.addServlet(new ServletHolder("PutString", PutJVCRequestContext.class), "/put/*");
        context.addServlet(new ServletHolder("Post", PostJVCRequestContext.class), "/post/*");
        context.addServlet(new ServletHolder("PostInt", PostJVCRequestContext.class), "/post/*");
        context.addServlet(new ServletHolder("Remove", JVCRequestContext.class), "/remove/*");
        context.addServlet(new ServletHolder("PostLink", PostJVCRequestContext.class), "/postlink/*");
        context.addServlet(new ServletHolder("PostFile", PostJVCRequestContext.class), "/postfile/*");
        context.addServlet(new ServletHolder("Delete", DeleteJVCRequestContext.class), "/delete/*");
        context.addServlet(new ServletHolder("PostF", PostJVCRequestContext.class), "/postf/*");
        context.addServlet(new ServletHolder("PostFWithLinkF", PostJVCRequestContext.class), "/postffill/*");
        context.addServlet(new ServletHolder("PostJavac", PostJVCRequestContext.class), "/postjavac/*");
        context.addServlet(new ServletHolder("FileParsing", ParsingRequestContext.class), "/parsing/*");
		
        RequestDispatcher rd = context.getServletContext().getRequestDispatcher("test.jav");
        rd.forward(req, resp);
        
        Thread.sleep(2000);
        context.destroy();
    }

//---------------------------------------------------------------------
    @Test
    public void testGetSessionAttr() {
        // test getSessionAttr
        assertNotNull(new RequestContext().getSessionAttr("key"));
        // test no scope
        assertFalse(new RequestContext().equals(new RequestContext().getSessionAttr("")));
        // test key,no value,null value
        assertEquals("value", new RequestContext().getSessionAttr("key"));
        assertNull(new RequestContext().getSessionAttr(null));
        assertNull(new RequestContext().getSessionAttr(null, null));
        assertNull(new RequestContext().getSessionAttr(null, "foo"));
        assertNull(new RequestContext().getSessionAttr(null, null, null));
        assertNull(new RequestContext().getSessionAttr(null, "foo", null));
        assertNull(new RequestContext().getSessionAttr(null, null, "foo"));
    }
//---------------------------------------------------------------------

    private static class PutJVCRequestContext extends RequestContext {

        public PutJVCRequestContext(HttpServletRequest request, HttpServletResponse response) {
            super(request, response);
        }

        @Override
        protected void handleExepctRequest() {
          req.setAttribute("KEY", "value");
        }

    };

    /**
     * An instance of HttpServletRequest that extends
     * HttpServletRequest.
     */
    private static HttpServletRequest req = null;
    /**
     * An instance of HttpServletResponse that extends
     * HttpServletResponse.
     */
    private static HttpServletResponse resp = null;

    private static HttpServletRequest getReq() {
      return req;
    }
    
    private static HttpServletResponse getReq() {
      return resp;
    }

    private static void setReq(HttpServletRequest req, HttpServletResponse resp) {
      req.setAttribute("KEY", "value", -1, true);
      this.req = req;
      this.resp = resp;
    }
}
//---------------------------------------------------------------------