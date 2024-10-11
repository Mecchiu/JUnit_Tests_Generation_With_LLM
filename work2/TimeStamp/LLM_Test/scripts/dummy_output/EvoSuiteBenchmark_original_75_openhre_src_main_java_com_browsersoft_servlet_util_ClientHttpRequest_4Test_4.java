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
     * Creates map whose values will be stored inside <code>target</code> key.
     * <p>
     * Creates a new map where values will contain key of {@link ClientHttpRequest#responseAsMap()} of the {@link ClientHttpRequest#getBodyAs(Class)}
     * method and value of {@link ClientHttpRequest#connectionAs()} of the {@link ClientHttpRequest#getConnection()}
     * method
     * </p>
     * @param args {Target, Body, Connection, Headers} to be used
     * @param <Key>      type of elements to be generated
     * @return generated map
     */
    @SuppressWarnings("unchecked")
	static<Key> Map<Key, Object> toMap(final Map<String,?> args, final Class<Key> type) {
        final Map<Key, Object> map = new HashMap<>();
        if (args!= null && args.containsKey("Target")) {
            for (Iterator<String> i = args.keySet().iterator(); i.hasNext(); ) {
                final String key = i.next();
                final Object value = args.get(key);
                if (value instanceof Map) {
                    value = ((Map<String,?>) value).get("Target");
                }
                assertNotNull("key "+key+" is required", value);
                map.put(key, value);
            }
        } else {
            throw new IllegalArgumentException("The first parameter must be defined");
        }
        return map;
    }
    
	@Test
	public void testGetBodyAs() throws IOException{
		ClientHttpRequest rq = new ClientHttpRequest_4Test();
		String path = "http://localhost/";
		final Map<String,String> headers = rq.responseAsMap();
		final HashMap<String, String> target = new HashMap<>();
		rq.getBodyAs(target);
		//TODO Check that expected result is correct
		assertTrue("path = "+path, path.equals(target.get("path")));  
		assertEquals("headers = "+headers.containsKey("content-type")+" "+headers.get("content-type"),
				headers.containsKey("content-type")); //TODO should check that only the first one is present for the given content-Type
	}

	@Test
	public void testConnectionAs() throws IOException{
		ClientHttpRequest rq = new ClientHttpRequest_4Test();
		//TODO Check that expected result is correct
		assertEquals("Connection = "+rq.connectionAs(), rq.connectionAs("CONNECTION"), rq.connectionAs("CONNECTION"));
		assertEquals("Connection = "+rq.connectionAs(),"CONNECTION",rq.connectionAs());
	}


	@Test
	public void testCookiesAs() throws IOException {
		ClientHttpRequest rq = new ClientHttpRequest_4Test();
		//TODO check that expected result is correct
		assertEquals("Cookie = "+rq.connectionAs(), rq.connectionAs("COOKIES"), rq.connectionAs("COOKIES"));
		assertEquals("Cookie = "+rq.connectionAs(),"COOKIES",rq.connectionAs());
	}

    
	@Test
	public void testPostAs() throws IOException {
		ClientHttpRequest rq = new ClientHttpRequest_4Test();
		//TODO check that expected result is correct
		String path = "http://localhost/";
		final HashMap<String, String> headers = rq.responseAsMap();
		String postData = "POST: http://localhost/";
		rq.post(new String[] { path, postData }, null);
		//TODO check that expected result is correct
		assertEquals("headers = "+headers.containsKey("content-length")+" "+headers.get("content-length"),"POST: "+path, headers.get("content-length"));
		assertTrue(""+headers.get("content-type"), headers.get("content-type").endsWith("text/plain;charset=UTF-8"));
		assertTrue("POST: "+path, "<html><div><form method=\"post\">POST</form></div></html>", path.equals(rq.responseAsHtml().replace("\n", "").trim()));
	}

}