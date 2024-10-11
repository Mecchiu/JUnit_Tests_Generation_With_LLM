// ClientHttpRequest_8Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_8Test {
		
    /**
     * The test method.
     * It sends the POST request, each parameter in name1, value1, name2,
     * value2, name3, value3, and name4 respectively, with a custom 
     * {@link org.junit.jupiter.api.TestFactory}.
     */
    @Test
    public void test_post(){
        // Send the POST request
        URLConnection connection = 
                    ClientHttpRequest_8Test.this.getConnection(
                    "POST", 
                    "http://bittrex.com/proxy/",
                    "/trade/trade-data.json");
        InputStream content = connection.getInputStream();
        assertNotNull(content);
        content.close();

        // read the body
        connection = (URLConnection) connection.proceed();
        String string = new String (readContentFromInputStream(connection));
        //System.out.println(string);
    }

    private URLConnection getConnection(String urlConnectionMethodName, URL connectionStr, String targetPath) throws IOException {
    	URLConnection connection = null;
    	try {
    		connection = this.createConnection(connectionStr);
		} catch(IOException ioe) {
			connection = null;
		}
    	return connection;
    }

	private URLConnection createConnection(String urlConnectionMethodName) throws IOException {
        //Create the connection
        URL url = new URL(urlConnectionMethodName);
        InputStream inputStream = url.openStream();
        
//        System.out.println(inputStream.toString());
    	HashMap<String, Object> paramMap = new HashMap<String, Object>();
    	int size = 10;
    	for(int i = 0 ; i < size ; i++) {
    		paramMap.put("param" + i, new Random().nextInt(100));
    	}
    	
        connection = new URLConnection (url).openConnection();
    	connection.setDoInput(true);
    	connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    	contentTypeCheck(connection.getRequestProperty("Content-Type"));
    	//Content body
    	Map<String, Object> content = (Map<String,Object>) inputStream.readObject();
        assertNotNull(content);
    	outputStream = connection.getOutputStream();
        outputStream.writeObject(content);
        outputStream.writeObject(new Random());
        outputStream.close();
    	connection.setDoInput(false);
    	//Close the connection object
	    connection.disconnect();
        return connection;
    }
    
    private void contentTypeCheck(String contentType) throws IOException {
    	// check the content type is ok
    	if (!contentType.equals("application/x-www-form-urlencoded")) {
    		fail("Unexpected content type. expected: 'application/x-www-form-urlencoded', found: '" + contentType + "'");
    	}
    }

    private void outputStream = null;
    private URLConnection connection;
    private OutputStream outputStream;
    
    private InputStream inputStream;

	public static URLConnection getConnection(String url)
    {
    	
        URLConnection connection = null;
        try {
        
            connection = ClientHttpRequest.class.getResource(url).openConnection();
            connection = (URLConnection)connection;

        } catch(IOException ioe) {
            fail("Error when connecting to URL: " + url);
        }

        return connection;
    }
    
    private InputStream readContentFromInputStream(URLConnection connection) throws IOException {
        InputStream ins = connection.getInputStream();

        String file = File.separator + "BITTREX_" + new Date().getTime() + ".json";
    
        //check the content
        if (!file.endsWith(".json")){
            fail("Unexpected file extension. expected:.json, found: '" + file + "'");
        }

        File fileToOpen = new File(file);

        inputStream = new FileInputStream(fileToOpen);

        return ins;
    }
}