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
		
	/**
	 * This method starts a test with server parameters.
	 * In the method's body, it reads the parameters and writes it in the
	 * parameters map sent by server.
	 * It reads in server parameter first and writes it in the map sent by the server.
	 * After the read, it uses the map sent by the server to get the value for the parameter.
	 * The value is used while reading the header of the request. 
	 * The next operation of the request is started with that client
	 * parameter. The value is used, when the request is processed.
	 * The value returned by the server can be read in the body of the request,
        * if there is any.
	 * Then the value sent in the request is returned to the client.
	 * If there are no parameters after the request, the server's response
        * is sent the the client.
	 * If there is no parameters, the headers sent by the client are checked against the server's response
	 * of the server.
	 * If the headers are found in the server's response, the value for that parameter is set.
	 * The method returns the value in the map.
	 *
	 * @throws IOException
	 * @see ClientHttpRequest#setHttpParameters
	 */
    @Test
    public void postTest_serverParameter() throws IOException {
        ClientHttpRequest.setHttpParameters(_request, new HashMap<String,String>());
    }

	/**
	 * This method sets the parameters of the request, based on the parameters of the server.
	 * The value sent in the request is set based on the value of the parameters sent by the server.
	 * @throws IOException
	 * @see ClientHttpRequest#setHttpParameters
	 */
    @Test
    public void postTest_setHttpParameters() throws IOException {
    	Map<String,String> map = new HashMap<String,String>();
    	map.put("param1", "param2");
    	map.put("param3", "param");
    	ClientHttpRequest.setHttpParameters(_request, map);

    	map = ClientHttpRequest.getHttpParameters(_request);
    	assertEquals("param",map.get("param"));
    	assertEquals("param2",map.get("param2"));
    	assertEquals("param3",map.get("param3"));
    }

    /**
     * Get a random number between [1,10) with 0 as range.
     */
    private int randomNumber() {
    	Random seed = new Random();
    	return seed.nextInt(10) + 1;
    }
    
    /**
     * This method sends the request to the server with POST method and then to the server with a GET URL.
	 * @throws IOException
     * @see ClientHttpRequest#sendRequest
     * @throws ClassNotFoundException
     */
    @Test
    public void post_getRequest() throws IOException, ClassNotFoundException {
        _request = new ClientHttpRequest("http://localhost:8080/");
        _getRequest = _request.getRequest();
        _getRequest.get();
    }

    /**
     * This method sends the request to the server with GET method and passes the parameter and a GET URL in map.
	 *
	 * @param parameters http parameters
     * @throws IOException
     * @see ClientHttpRequest#sendRequest
     * @deprecated This method was added to support the use of the same test with different parameters.
     * As of the v1.x releases,
     * it will remain the last one that can be used for testing.
         */
    public void sendRequest_parameterGetRequest(Object[] parameters) throws IOException {
        _request = new ClientHttpRequest("http://localhost:8080/", parameters);
        _getRequest = _request.getRequest();
        _getRequest.get();
    }    

    private final ClientHttpRequest _request;
    private final ClientHttpRequest _getRequest;
}