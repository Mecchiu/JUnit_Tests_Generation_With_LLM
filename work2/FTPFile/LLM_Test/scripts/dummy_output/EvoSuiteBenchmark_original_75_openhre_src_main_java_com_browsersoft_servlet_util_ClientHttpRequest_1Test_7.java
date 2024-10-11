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
		
}

// ClientHttpRequest_2Test.java
import java.net.URL;

/**
* Tests for the {@link ClientHttpRequest#post(Map)} method.
* It calls the method with a Map<String,String> and then compares the result with the expected parameter map.
*/
class ClientHttpRequest_2Test {
	
	/**
	 * @param parameters parameters
	 * @throws IOException
	 * @see ClientHttpRequest#post(Map)
	 */
	@Test
	void post(Map parameters) throws IOException{
		System.out.println("POST request: " + parameters);
		ClientHttpRequest request=new ClientHttpRequest(null,"GET","","https://localhost/?v=1.0");
		Map result =request.post(parameters);
		assertNotNull(result);
		System.out.println("POST request: " + result);
		assertTrue(result.size()>1);
		
 
	}
	
	/**
	 * POST requests with a number of HTTP parameters
	 *
	 * @param numberOfParameters the parameter counter
	 * @throws IOException
	 * @see ClientHttpRequest#post(Map)
	 */
	@Test
	void post(int numberOfParameters) throws IOException{
		ClientHttpRequest request=new ClientHttpRequest(null,"GET","","https://localhost/?v=1.0");
		Map result =request.post(0,numberOfParameters);
		assertNotNull(result);
		System.out.println("POST request: " + result);
		assertTrue(result.get("number")>0);
		
	}
	
			
	
 	
	
		
	
	
	
	static private final Map<String,Object> parameters=new HashMap<String,Object>();

	static private final Random random = new Random();
	static private final int count = new Random().nextInt(5);

	static private final String url="https://localhost/?v=1.0&id=1&a=1";
    static private final String http="https://localhost/?v=1.0&format=json";

    ClientHttpRequest(URLConnection urlconnection) throws IOException {
        this.url=urlconnection.getURL().toString();
        urlbytes = urlconnection.getRequestProperty("a")
                               .encode().length()
                                + String.valueOf(urlconnection.hashCode());
    }
    ClientHttpRequest(File file) throws IOException {
        this.file=file;
        int numberOfBytes=-1;
        while (-1!= (numberOfBytes = file.length()) ){
        	url_ = url+"&"+file.toString();
        	urlbytes = urlbytes
        			+file.toString()
        			+String.valueOf(urlconnection.hashCode());
            System.out.println("URL-length "+numberOfBytes);
        }
        url_ = url+"?v=1.0&id=1&a=1";
    }
    void setParameters(Map<String,String> parameters){
    	assertNotNull(parameters);
    	this.parameters = parameters;
    }
    Map<String, Object>getParameters(){
    	return parameters;
    }

	String getRequestedURLBytes(){
		return urlbytes;
	}


	/**
	 * Returns the input stream with the server response
	 *
	 * @return input stream with the server response
	 * @throws java.net.IOException
	 * @see setParameters
	 * @see ClientHttpRequest#post
	 */
	InputStream post(){
		return new FileInputStream(file);
	}


	/**
	 * Returns the number of HTTP parameters that have been added to the request
	 *
	 * @return number of HTTP parameters that have been added to the request
	 */
	int lengthOfParameters(){
        return urlbytes.length() + file.length() -url_.length();
	}
	
  
	File file;
	public static final File file ;
	private FileInputStream urlbytes=null;
	private String url ; 

	FileInputStream urlbytesFile;
	  private static final Map<String, Object> parameters=new HashMap<String, Object>();
	  

	/**
	 * Returns the file with the response body
	 *
	 * @return input stream with the response body
	 * @throws java.io.IOException
	 */
	FileInputStream getInputStream(){
		if(null==urlbytesFile)
			urlbytesFile = new FileInputStream(file);
		return urlbytesFile;
		
	}
	
	String getRequestedURL(){
		return url;
	}

	/**
	 * Adds HTTP parameters for the method request to URLConnection (a Map, that is used to get the HTTP parameters)
	 * to the map
	 *
	 * @param url map for HTTP parameters
	 */
    void addParameter(Map<String,String> parameters){
    	assertNotNull(parameters);
    	assertTrue(parameters.size()==1 && "ID".equals(parameters.keySet().iterator().next()) && "v".equals(parameters.get("v")));
		setParameters(parameters);
    }
    
 }