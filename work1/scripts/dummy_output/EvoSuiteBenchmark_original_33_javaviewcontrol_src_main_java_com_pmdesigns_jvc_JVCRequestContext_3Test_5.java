// JVCRequestContext_3Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {
		
    @Test
    public void testConstructor() throws Exception {
        // create a test context with just the test file upload service
        Hashtable<String, Object> environment = new Hashtable<String, Object>();
        FileItem file = new FileItem("upload_file_1.txt");
        ServletFileUpload upload = new ServletFileUpload(new DiskFileItemLoader(file));
        context = new JVCRequestContext(environment, upload, null, null, null, null);
        assertEquals("a string", context.getAttribute("key1"));
    }

    @Test void testConstructor() throws Exception {
        // create a test context with just the test file upload service
        Hashtable<String, Object> environment = new Hashtable<String, Object>();
        FileItem file = new FileItem("upload_file_2_1.txt");
        ServletFileUpload upload = new ServletFileUpload(new DiskFileItemLoader(file));
        context = new JVCRequestContext(environment, upload, null, null, null, null);
        assertNull(context.getAttribute("key1"));
        
        assertTrue("the key1 is valid", context.getAttribute("key1") instanceof String);
        assertEquals("the uploaded file is 1", 1, context.getAttribute("key1").length());

    }
    
    @Test void testConstructorWithFileAttribue() throws Exception {
        Hashtable<String, Object> environment = new Hashtable<String, Object>(); 
        File file = new File("/tmp/dummy.file");
        ServletFileUpload upload = new ServletFileUpload(new DiskFileItemLoader(file));
        context = new JVCRequestContext(environment, upload, null, null, null, null);
        assertNull(context.getAttribute("key1"));
       
        UploadFileTask request = new UploadFileTask();
        request.setFile(file);
        
        context =
        	new JVCRequestContext(environment, upload, request, null, null, null);
        assertEquals("the key1 is valid", 1, context.getAttribute("key1").length());
    }
    
    @Test void testGetAttribute(ServletRequest sc, ServletResponse rs, ServletContext scc) throws Exception {
        Hashtable<String, Object> environment = new Hashtable<String, Object>();
        // Set the file to upload.
        Object fileAttr = environment.get("upload_file_1.txt");
        assertNotNull("upload should have a property set", fileAttr);
		fileAttr = ((FileItem)((ServletFileUpload)fileAttr).getItem()).getInputStream();
        System.err.println("file to upload is:" + fileAttr);
        ServletFileUpload upload = new ServletFileUpload(new DiskFileItemLoader(fileAttr));
        context = new JVCRequestContext(environment, upload, null, null, null, null);
        assertTrue("the key1 is valid", context.getAttribute("key1") instanceof String);
        fileAttr = context.getAttribute("key1");
        assertEquals("the uploaded file is 1", 1, ((String)((FileItem)fileAttr).getField("file-1")).length());
        
        
        assertTrue("the key2 is valid", context.getAttribute("key2") instanceof String);
        fileAttr = context.getAttribute("key2");
        assertEquals("the uploaded file is 2", 2, (((String)((FileItem)fileAttr).getField("file-2")).length()));
    }
    
    @Test void testGetAttribute(ServletRequest sc, ServletResponse rs, ServletContext scc) throws Exception {
        Hashtable<String, Object> environment = new Hashtable<String, Object>();
        // Check some fields for key1 attribute
        
        File uploadFile = new File("/tmp/upload_file_2_1.txt");
        String file = (String)((ServletFileUpload)environment.get("upload_file_1.txt")).
            getItem().getInputStream().getChannel().size();
        
        assertTrue("the file is 2", file.endsWith("2"));
        assertTrue("the file is valid", ((FileItem)((ServletFileUpload)environment.get("upload_file_2_1.txt")).getItem())
           .getField("file-2").length() > 0);
        
        // Check some fields for key2
        
        file = (String)((ServletFileUpload)environment.get("upload_file_2_1.txt")).
            getItem().getInputStream().getChannel().size();
        assertTrue("the file is valid", file!= null && file.endsWith("2"));
        
        // Check some fields for key3 and a file
        
        file = (String)((ServletFileUpload)environment.get("upload_file_1.txt")).
            getItem().getInputStream().getChannel().size();
        assertFalse("the file is invalid", file.endsWith("2"));
        assertFalse("the file is valid", ((FileItem)((ServletFileUpload)environment.get("upload_file_2_1.txt")).getItem()).
            getField("file-2").length() > 0);
        assertTrue("the file is valid", file!= null && file.endsWith("2"));
    }

}