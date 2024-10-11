// ClientHttpRequest_7Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
		
		/**
		 * this unit test class implements the test case.
		 */
    @Test
    void test_constructor() {
        ClientHttpRequest httpRequest = new ClientHttpRequest();
    }
    
    @Test
    void test_POST_HTTP() {
        File fileToCreate = new File("C:\\Users\\vnolan\\workspace\\src\\com.browsersoft.testlib\\client-http.txt");
        
        String filenameToCreate = "TEST_FILE_INPUT";
        File fileToPost;
        fileToPost = (File) this.test_constructor((String) null, (String) null, (String) null, (Map) null, null, null, null);
        
        assertNotNull(filenameToCreate);
        
        try {
        	httpRequest.post(filenameToCreate, "inputStream", null, null, null, null);
        	fail("Test 1. Test failed, because the file isn't read in.");
        } catch (Exception e) {
        	assertNotNull(e);
        }
        
        try {
        	httpRequest.post((String) null, null, null, null, null, null);
        	fail("Test 2. Test failed, because the parameters were not in the parameter map.");
        } catch (Exception e) {
        	assertNotNull(e);
        }
        
        try {
        	httpRequest.post((String) null);
        	fail("Test 3. Test failed, because the method is not provided in parameters.");
        } catch (Exception e) {
        	assertNotNull(e);
        }
        
        
    }
    
    
    @Test
    void test_POST_HTTP_File() {
        File fileToCreate = new File("C:\\Users\\vnolan\\workspace\\src\\com.browsersoft.testlib.client-http.txt");

        String filenameToCreate = "TEST_FILE_INPUT";
        File fileToPost;
        fileToPost = (File) this.test_constructor(filenameToCreate, (String) null, (String) null, (Map) null, null, null);
        
        assertNotNull(filenameToCreate);
        
        String fileName = fileToPost.toString();
        try {
        	httpRequest.post(filenameToCreate, fileToPost);
        	fail("Test failed, because the result file didn't exist yet.");
        } catch (Exception e) {
        	assertNotNull(e);
        }
        
        try {
        	httpRequest.post((String) null, new FileInputStream(fileToPost));
        	fail("Test failed, because a proper input stream was expected.");
        } catch (Exception e) {
        	assertNotNull(e);
        }
        
        try {
        	httpRequest.post((String) null);
        	fail("Test failed, because a proper request map was expected.");
        } catch (Exception e) {
        	assertNotNull(e);
        }
    }
    
    @Test
    void test_post_with_file() throws IOException {
    	File file = new File("C:\\Users\\vnolan\\workspace\\src\\com.browsersoft.testlib.client-http.txt");

        String fileName = file.toString();

		String methodName = "POST";
        String content = "fileToPost" + new Random().nextInt();
        String[] formVariables = { fileName };
        String formParams = (String) null;
        Map<String, String> parameters = new HashMap<>();
        
        ClientHttpRequest httpRequest = httpRequest(methodName, formParams, formVariables, parameters);
        String responseContent = httpRequest.post(fileName, new FileInputStream(file), content, formVariables, formParams);
        
        
        assertNotNull(responseContent);
        assertEquals(content, responseContent);
    }
	}