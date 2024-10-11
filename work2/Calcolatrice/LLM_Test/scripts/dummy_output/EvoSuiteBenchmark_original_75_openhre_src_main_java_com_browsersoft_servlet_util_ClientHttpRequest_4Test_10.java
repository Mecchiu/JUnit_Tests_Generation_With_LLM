// ClientHttpRequest_4Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_4Test {
		
	/**
	 * this is the test data string with parameters.
	 */
    public String _testDataString;
    
    /**
     * this is the list of all the parameters sent to the server.
     */
    Map<String, Object> _parameters = new HashMap<String, Object>();
    
    public void testPost(){
    	_parameters.put("param1", 1.0f + " param1");
    	_parameters.put("param2", map("key", 12));
    	_parameters.put("param1", 2.0f);
    	_parameters.put("param3", map("key", 12L));
    	_parameters.put("param4", map("key", 12.54f));
    	_parameters.put("param5", map("key1",12L, "key2", "12.53"));
    	_parameters.put("param6", set("key2",12.5f,"key3", "12.53"));
    	_parameters.put("param7", map("key1",12L, "key2", "12.53", "key3", "12.56"));
}
}