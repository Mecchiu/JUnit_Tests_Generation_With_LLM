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

 /**
  * This is the test case for the {@link JVCRequestContext#getSessionAttr(String)} method.
  */
  @Test
  public void testGetSessionAttr() throws FileNotFoundException, IOException {
     
    ServletFileUpload uploadServlet = new ServletFileUpload();
    UploadStream uploadStream1 = null;
    try {
       if (request.getParameter("file").length()!= 0) {
        uploadStream1 = uploadServlet.parseRequest(new FileReader(request.getParameter("file").split(";")[0]));
        } 
           
    } catch (ParseException pe) {
        pe.printStackTrace();
        uploadStream1 = uploadServlet.parseRequest(new FileReader(request.getParameter("file").split(";")[0]));
    }
       
     assertEquals(uploadStream1, uploadServlet.getUploadStream(request));
     
     String expectedSessionValue = "test";
     String actualSession = request.getSession().getAttribute("session");
     assertTrue(actualSession.equals(expectedSessionValue));
     
     
         }
   
    
        
}
