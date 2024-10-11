// ClientHttpRequest_5Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequest_5Test {
		    private static final String CHARSET = "UTF-8";
		    private static final boolean DEBUG = false;

		/**
		 * Tests that the parameter values are correctly sent once the server responds.
		 * @throws IOException
		 */
		@Test
		public void postTest1() throws IOException {
				// Get parameter of the target resource.
			String name = "request.param";
			String value = "value";
		input_param(name, value);
		    
/*		    String targetURL = "/" + name + ".json";
		    InputStream input = get(targetURL);
		    try {
		    	for (int i = 0; i < count; i++) {
		    		String string = toString(input);
		    		// send POST request
		    		System.out.println(string);
		    		clientPut(string);
		    	}
		    
		    } finally {
		    	// clean-up
		    	cleanup(input);
		    }
*/


			// Get parameters from POST response.
		     ArrayMap<String, String> parMap = new ArrayMap<>(MAP_LENGTH);
}
}