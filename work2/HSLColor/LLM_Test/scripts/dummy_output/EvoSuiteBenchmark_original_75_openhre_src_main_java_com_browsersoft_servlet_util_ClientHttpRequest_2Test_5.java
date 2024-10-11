// ClientHttpRequest_2Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequest_2Test {
		public final String CWD = "d:\\";	// Path to the folder containing the test files
	    public final int PORT = 3389;	// Port number to your server
	    public final URL URL;	// URL of the server
	    public final File PROJECTVALUE = new File("src\\main\\resources\\WEB-INF\\classes\\junit\\test.properties");	// The property file of your tests
    	
	    public ClientHttpRequest_2Test(String testname, File folder, String baseUrl) throws Exception {
	        this.URL = new URL(baseUrl);		// Set the base URL of your testing
	        this.PROJECTVALUE.mkdirs();	// Define the folder where files are saved
	        URLConnection connection = getConnectionNoCookieJar();	// Connection is just a proxy from the browser
            this.URL = new URL(testname);		// Define the URL of your test
        }
	    
	    public static final URLConnection getConnectionNoCookieJar() {
	    	URLConnection connection = null;
	    	try {
				connection = new URLConnection(this.URL);
        	} catch (Exception e) {
				throw new RuntimeException(e);
			}
		    return connection;
	    }

	    public static void setParameters(Map<String, String> parameters) {
	    	getConnectionNoCookieJar().setParameter(ClientHttpRequest.CLIOE_NO_COOKIE,"yes");	// Add cookies
		    getConnectionNoCookieJar().setParameter(ClientHttpRequest.CLIOE_COOKIE_ENCODING, "UTF-8");	// Set the content encoding
		    for (Map.Entry<String, String> entry : parameters.entrySet()) {
		        getConnectionNoCookieJar().setParameter(entry.getKey(), entry.getValue());
		    }
		}
	    
	    public static String getUrl(String testname) {
	        getConnectionNoCookieJar().setRequestProperty("User-Agent", "Mozilla/5.0"+" "+testname );
	        return getConnectionNoCookieJar().getRequestMethod()+" "+getConnectionNoCookieJar().getRequestURL().toString();
	    }
	
	    /**
	     * a test case of the method call {@link ClientHttpRequest#post(Object[])}
	     *
	     * @throws Exception
	     */
	    @Test
	    public void testCMDPOSTwithMultipleFiles() throws Exception {
	        String f1 = "./src/main/resources/test/testCMDPOST_1.txt";	// First file is located in the folder of your test
	        String f2 = "./src/main/resources/test/testCMDPOST_2.txt";	// Second file is located in the folder of your test
	        String f3 = "./src/main/resources/test/testCMDPOST_3.txt";	// Both files are located in the folder of your test
	        String f4 = "./src/main/resources/test/testCMDPOST_4.txt";	// Both files are located in the folder of your test
	        String f5 = "./src/main/resources/test/testCMDPOST_5.txt";	// Both files are located in the folder of your test
	        Map<String, String> parameters = new HashMap<String, String>();
	        parameters.put("param1", "1");
	        parameters.put("param2", "2");
	        parameters.put("param3", "3");
	        parameters.put("param5", "5");
	        
	        ClientHttpRequest request = new ClientHttpRequest();
	        String[] params = {f1,f2,f3,f5};
	      
	        // This is using a file path as the path
	        // so that we would like to put everything on one file
	        InputStream is = new FileInputStream(PROJECTVALUE);
	        try {
	            is = getConnectionNoCookieJar().getInputStream();
	        } catch(IOException e) {
	            fail("Could not test it to send POST requests");
	        }

	        // Sending the parameters as map object
	        String resp = request.post(params);
	        
	        // Check if the POST has the right file
	        // if not do the test just for the sake of completeness
	        File value = new File(f1);
	        assertTrue("The param2 file should be read", String.valueOf(value.length()).equals("2"));
	        try {
	            value.delete();	// Delete the file
	        } catch (Exception e) {
	            assertTrue("The param2 file should be deleted", f1.delete());
	            throw e;
	        }
	        
	        InputStream is1 = new FileInputStream(PROJECTVALUE);
	        String resp1 = request.post(f1);
	        
	        File value2 = new File(f2);
	        assertTrue("The param3 file should be read", String.valueOf(value2.length()).equals("2"));
	        try {
	            value2.delete();	// Delete the file
	        } catch (Exception e) {
	            assertTrue("The param3 file should be deleted", f2.delete());
	            throw e;
	        }
	        
	        InputStream is2 = new FileInputStream(PROJECTVALUE);
	        String resp2 = request.post(f2);
	        
	        File value3 = new File(f3);
	        assertTrue("The param4 file should be read", String.valueOf(value3.length()).equals("2"));
	        try {
	            value3.delete();	// Delete the file
	        } catch (Exception e) {
	            assertTrue("The param4 file should be deleted", f3.delete());
	            throw e;
	        }
	        
	        InputStream is3 = new FileInputStream(PROJECTVALUE);
	        String resp3 = request.post(f3);
	        
	        File value4 = new File(f5);
	        assertTrue("The param5 file should be read", String.valueOf(value4.length()).equals("5"));
}
}