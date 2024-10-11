// JVCRequestContext_2Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {
		
    /**
     * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamValues(String)}.
     */
    @Test
    public void testGetParamValues() throws IOException{
        // set up some objects that match the scope
    	String string = "param0 param1";
    	String[] value = {"param1", "param2"};
    	Vector<String> vector = new Vector<String>(Arrays.asList(value));
        // create the response
    	HttpServletResponse resp = new HttpServletResponse();
    	try {
			String fileName="test_jvc_request.ftl";
			Map<String, String> params = new HashMap<String, String>();
			params.put("string", string);
			params.put("value", StringUtils.arrayToCommaDelimitedString(value));

			File tempFile = File.createTempFile("temp", "tmp");
			PrintStream out = new PrintStream(new FileOutputStream(tempFile));
			out.print(params);
			out.close();
			ServletFileUpload upload = new ServletFileUpload();
			ServletRequest rq = new ServletRequest() {
			    public FileInputStream getFileInputStream(
			            ServletRequestAttributes attrs,
			            int pos)
			            throws IOException {
			        return new FileInputStream(tempFile);
			    }
			};
            upload.setFileMap(new FileMap());
            try {
		        Map uploadParams = upload.parseRequest(rq);
		        assertNotNull(uploadParams);
				@SuppressWarnings("unchecked")
				List<Map<String, String>> params = (List<Map<String, String>>) ( Object ) uploadParams;
				assertEquals(1, params.size());
				assertTrue(params.get(0).get("string")
				       .equals(string));
				assertTrue(params.get(0).get("value")
				       .equals(StringUtils.arrayToCommaDelimitedString(value)));
				out.close();
				// cleanup the generated temp file
				FileUtils.deleteFile(tempFile);
			} catch(FileNotFoundException e) {
                Log.warn(e + " no temp file to upload to.");
			}
			
		} catch (IOException e) {
            Log.warn("Exception when parsing request.");
		}
    	// now that we have the output we can get it
        String output = resp.getHeaderField(HttpHeaders.CONTENT_TYPE)
                + ":" + 
		        resp.getHeaderField(HttpHeaders.CONTENT_DISPOSITION)
				+ ":" + 
		        resp.getStatus();
        //log( "GET: " + string + " | " + Arrays.toString(value) );
    	 
        assertEquals(string, output);
        
    }
 	
    @Test
    public void testGetParamValuesMap(){
        // set up some objects that match the scope 
    	String string = "param0 param1";
    	String[] value = {"param1", "param2"};
        // create the response
        HttpServletResponse resp = new HttpServletResponse();
        Set<String> paramNames = new HashSet<String>();
        Map<String, String> paramMap = new HashMap<String, String>();
        paramNames.add("string");
        paramMap.put("value", StringUtils.arrayToCommaDelimitedString(value));
        long time = System.currentTimeMillis();
        try {
            File outputFile = File.createTempFile("temp", "tmp");
            PrintStream out = new PrintStream(new FileOutputStream(outputFile));
            out.print(paramNames);
            out.close();
            ServletFileUpload upload = new ServletFileUpload();
            @SuppressWarnings("unchecked")
            Set<String> uploadNames = (Set<String>) upload.parseRequest(new ServletRequest());
            assertNotNull(uploadNames);
            assertEquals(1, uploadNames.size());
            assertTrue(uploadNames.contains("string"));
            HashMap<String, String> hm = new HashMap<String, String>();
            Map uploadParams = upload.parseRequest(upload);
            assertNotNull(uploadParams);
            assertTrue(uploadParams.containsKey(paramNames.iterator().next()));
            assertTrue(uploadParams.containsValue(paramMap));

            // clean up the generated temp file
            FileUtils.deleteFile(outputFile);
            
            assertTrue(paramNames.size() == uploadNames.size());
        } catch (FileNotFoundException e) {
            
        } catch (IOException e) {
            
        }
    }
}