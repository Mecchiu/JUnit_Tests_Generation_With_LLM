// JVCRequestContext_6Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContext_6Test {
		
    /**
     * Create a JVCRequestContext and assert that its contents can be accessed
     * by calling {@link JVCRequestContext#request}.
     * @param testString a string. This should contain the servlet path.
     * @return 
     * @throws Exception 
     */
    @Test
    public void testAbsPath(String testString) throws Exception {
        RequestContext context = new RequestContext(
            testString,
            new ServletRequestContext()
        );
        assertNotNull("AbsPath is not null", context.getServletContext().getAttribute("absPath"));
        assertNotNull("AbsPath is not null", context.getRequest());
        String contextPath = context.getRequest().getContextPath();
        assertTrue("No absolute path",!contextPath.equals(""));
        
        System.out.println("AbsPath:" + context.getRequest().getServletPath());
        assertTrue(context.abspath().equals(contextPath));

        String requestURL = context.request().getRequestURL();
        assertTrue("Request URL equal", requestURL.indexOf(context.getServletContext().getContextPath()) < 0);
        requestURL = context.request().getRequestURI();
        assertTrue("Request URI equal", requestURL.indexOf(context.getRequest().getContextPath()) < 0);
    }
}

/**
 * This class implements a RequestContext with a file upload request.
 * A MockRequest is used for unit test purpose.
 * It is stateful so that when the context is reset, it resets the contents.
 * This class is never instantiated.
 * The other fields are empty.
 * It does NOT use HttpURLConnection.
 */
class RequestContext implements RequestContextMock {
    
    /**
     * A MockFileUploadRequestContext is an adapter for a MockRequest.
     * All its methods should raise a ServletFileUploadException if it cannot
     * find the contents of an uploaded file.
     * See: <a href=http://jvcs.org/docs/api/fileupload_api/api-summary.html>API documentation</a> 
     */
    public class MockFileUploadRequestContext extends MockRequestContext {
        
        private File fileUpload;

        public MockFileUploadRequestContext(Servlet servlet) throws IOException {
            super(servlet, this.request);
            this.fileUpload = this.request.getFile("upload.image");
        }
        
        @Override
        public File uploadFile() throws IOException {
            if (fileUpload == null) {
                throw new ServletFileUploadException("No contents found!");
            }
            return fileUpload;
        }
        
    }
    
    /** Stores the context path. */
    private String path;
    /** Stores the contents of an uploaded image on the context path. */
    private File uploadFile;
    /**
     * Stores the contents of an uploaded image on the context path.
     * The contents of an uploaded image should be a File object.
     */
    private File uploadedFile;
    /** Stores the contents of an uploaded image on the context path. */
    private byte[] uploadedContents;
    
    /**
     * Stores the contents of an uploaded image on the context path.
     * The contents of an uploaded image should be a string.
     */
    private String uploadedString;
    
    /**
     * @param context
     */
    public RequestContext(
        ServletRequest servletRequest,
        RequestContext context
    ) {
        requestRequested(servletRequest);
        assertNotNull("path must not be null", context.getServletContext().getAttribute("path"));
        assertNotNull("uploadedFile", context.getServletContext().getAttribute("uploadedFile"));
        assertNotNull("uploadedContents", context.getServletContext().getAttribute("uploadedContents"));
        assertNotNull("uploadedString", context.getServletContext().getAttribute("uploadedString"));
    }

    /**
     * Stores the contents of an uploaded image on the context path.
     * The contents of an uploaded image should be a byte array.
     * {@inheritDoc}
     */
    public byte[] getUploadedContents() {
        return uploadedContents;
    }
    
    /**
     * Stores the contents of an uploaded image on the context path.
     * The contents of an uploaded image should be a String.
     * {@inheritDoc}
     */
    public String getUploadedString() {
        return uploadedString;
    }

    /** {@inheritDoc} */
    @Override
    public File uploadFile() throws IOException {
        if (uploadedFile == null) {
            throw new AssertionError();
        }
        return uploadedFile;
    }

    /**
     * Stores the contents of an uploaded image on the context path.
     * The contents of an uploaded image should be a File object.
     * {@inheritDoc}
     */
    public File getUploadedFile() {
        return uploadedFile;
    }

    /**
     * Stores the contents of an uploaded image on the context path.
     * The contents of an uploaded image should be a String.
     */
    public byte[] getUploadedContents() {
        return uploadedContents;
    }

    /**
     * Saves context state to a file.
     * @param filename of the file to be saved
     * @throws IOException
     */
    @Override
    public void save(String filename) throws IOException {
        this.path = this.getServletContext().getServletContext().getContextPath();
        this.uploadedFile = this.getServletContext().getRealPath("") + "/" + filename;
        this.uploadedString = contentOf(this.uploadedFile);
        this.uploadContents = Files.readAllBytes(this.uploadedFile);
    }

    /**
     * Saves context state to a file.
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        this.path = this.getServletContext().getServletContext().getContextPath();
        this.uploadedFile = this.getServletContext().getRealPath("") + "/uploaded.txt";
        this.uploadedString = "";
        this.uploadContents = new byte[1023];
    }

    private byte[] contentOf(File file) throws IOException {
}
}