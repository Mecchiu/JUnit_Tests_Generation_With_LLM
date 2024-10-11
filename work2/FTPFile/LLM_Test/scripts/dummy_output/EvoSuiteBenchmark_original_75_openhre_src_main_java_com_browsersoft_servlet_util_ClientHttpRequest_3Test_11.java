// ClientHttpRequest_3Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_3Test {
		
	/**
	* posts the requests to the server.
	* @param server server for which to send the requests.
	* @param cookies cookies that are included in the request
	* @param parameters parameters that will be included as a part of the POST request
	* @return input stream with sent requests
	* @throws IOException
	*/
	InputStream post(String server, Map cookies, Map parameters) throws IOException;
	int getResponseCode();
}

//ClientHttpRequest_4Test.java

public class ClientHttpRequest_4Test {

};