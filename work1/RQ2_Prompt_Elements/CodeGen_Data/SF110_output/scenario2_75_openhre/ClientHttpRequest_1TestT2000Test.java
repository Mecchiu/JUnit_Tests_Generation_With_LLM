// ClientHttpRequest_1Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequest_1Test {

    @Test (expected = IOException.class)
    public void test_error_1() throws IOException {
    	URLConnection con = new URL("http://localhost:9876/").openConnection();
    	con.setConnectTimeout(1000);
    	con.setReadTimeout(1000);
    	con.connect();
        
        try {
	    	ClientHttpRequest request = new ClientHttpRequest();
	    	// request.post(parameters);
	    	request.post();
	    } catch (IOException e) {
	        throw e;
	    }
        throw new IOException("client error");
    }

	@Test
    public void test_success_1() throws IOException {
    	final String filename = String.format("%d", new Random().nextInt(1000000000));
		
    	File file = new File(filename);
    	FileInputStream input = new FileInputStream(file);
    	try {
        	final URL url = new URL("file://" + filename);
            final URLConnection urlConn = url.openConnection();

	    	final ClientHttpRequest request = new ClientHttpRequest();
	    	request.setParameters(null);
	    	urlConn.connect();

	        URLConnection connection = urlConn;
	        Map<String,String> parameters = new HashMap<String, String>(1);
	        parameters.put("param1", "value1");
	        request.setParameters(parameters);
	        
	        InputStream in = connection.getInputStream();

	        return_check(in);
	    } finally {
	        input.close();
	    }
    }
    
    private static void return_check(InputStream in) {
        HashMap<String,String> results = new HashMap<String, String>();
        
        results.put("key1", "value1");
        results.put("key2", "value2");
        results.put("key3", "value3");
        
        assertEquals(results, new ClientHttpRequest().getParameters());
        
        try {
	        boolean success = false;
	        Iterable<String> iterator = results.keySet().iterator();
	        while (iterator.hasNext()) {
	            final String key = iterator.next();
	            final String value = results.get(key);
	            assertEquals(key, value);
	            // success = success | value
	            success = iterator.hasNext();
	        }
	        assertTrue("return_check on empty client", success);
        } catch (IOException e) {
            fail();
        }
    }
    
}
