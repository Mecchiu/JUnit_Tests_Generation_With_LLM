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
		private static final Random randomN = new Random();
		
	/**
	* A testcase to test the ClientHttpRequest.post() method.
	* Creates an empty request object and sends the requests with different content types.
	*/
	@Test
	void testPost(){
        final Map<String, Object> params = new HashMap<String, Object>(1);
        final String name1 = "test";
        String value1 = null;
		final ClientHttpRequest request = new ClientHttpRequest.ClientHttpRequest(){

			public <T>Response execute(HttpRequest<T> request){
				response = request.execute(params);
				assertNotNull(response);
                return response;
            }
		};
			// get a random string
}
}