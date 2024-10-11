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
    public void aJVCRequest()throws IOException {
        HttpServletResponse response = new JVCResponseContext(request, responseMessage);
        assertNotNull(response);
        assertNotNull(response.getInStream());
        assertNotNull(response.getOutStream());
        assertEquals(ContentTypes.TEXT_PLAIN_UTF_8, response.getContentType());
        
    }

    @Test
   public void testGetRequest() {
         // Create the JVC request object
        HttpServletRequest request = new JVCRequestContext(requestMessage, servletContext).getRequest();
   
   // check result from Json Serialization
           assertNotNull(request);
   
   // check result from reading request in the input stream
           assertTrue(request.getInputStream() instanceof InStream);
   
   // check result from reading request in the OutputStream
           assertTrue(result instanceof JsonInOutStream);
 
    }

   @Test
   public void testFormField() throws JsonProcessingException, IOException {
       File tempDir = new File("./tempdir");
       assertTrue(tempDir.exists());

       File file = new File("./file");

   // check result from Form Field reading
       assertTrue(formField.getFileName() == file.getName());
        
    }

      @Test
   public void testFormSubDir() throws JsonProcessingException, IOException {
       File tempDir = new File("./tempdir");
       assertTrue(tempDir.exists());

       File file = new File("./file");

   // check result from Form Field reading
       Set<String> files = new HashSet<>();
       files.add(file.getAbsolutePath());
       Set result = formSubDir.findSubDirs(files);

   // check result from Form Field reading
       assertEquals(new File("./file"), result.toString());
        
    }
    
}
