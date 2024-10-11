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
	* This is the test method.
		* 
	* 
	*/
	@Test
	public void test() throws Exception {
        /*
		* 
		*   var input_stream = "POST Request";
		*   var input_stream = "POST Request with headers";
		*   var content_type = "application/x-www-form-urlencoded";
		*   var parameters = null;
       */

	try {
			/*
			* 
			*   ClientHttpRequest.post(input_stream, null, content_type, parameters,...);
			*	    
		* 
		*	    parameters => null;
		*		
		*    The last parameter must be a Map object because it is the request content which will be sent in the response.
		*/

			ClientHttpRequest request = new ClientHttpRequest(
					"POST Request",
					null,
					null,
					null,
			      null,
			      null,
                      null,
                      null);

			/*
			* 
			*   System.exit(0);
			*	    
		*   // Request sent for POST:
		*   request.post(input_stream, content_type, null, null, null, map);
		*/

			/**
			* 
			*/
			ClientHttpRequest.post(input_stream, null, content_type, null, null, null, parameters, null);

			/*
			* 
			*  parameters => map(string). It is a Map in the last parameter.
			*
			*  It uses a new map object because it is a map object which maps to String.
			*/
			assertEquals(new Map<String, String>("parameters", parameters), request.getParameters());

			/*
			* 
			*  parameters => null;
			*	    
		*    This is the last parameter.
		*      
		*    It uses a new map object because the last parameter is a Map object.
		*/
			request.setParameter("parameters", parameters);
			
			ClientHttpRequest.post(input_stream, null, content_type, null, null, null, parameters, null);
			
			/**
			* 
			*/
			ClientHttpRequest.post(input_stream, null, content_type, null, null, null, null, null, null);
		} catch (IllegalArgumentException e) {
			fail(e.getMessage());
		}
    }

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// end class ClientHttpRequest_8Test


}
