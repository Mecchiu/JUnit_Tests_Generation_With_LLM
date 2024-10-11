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
     Test case for the {@link ClientHttpRequest#post(Object[])} method
     */
    @Test
	public void testPost() {

        //Create parameters
        Object[] parameters = new Object[]{
                "abc", "def", "ghi", "jkl", "klm"
        };

        //Post
        String str2 = PostManager.post(parameters);

        assertEquals("jkl", str2);

    }

    @Test
    public void testGetAllParametersFromRequest() {

        Map<String, String> mapParams = new HashMap<String, String>();
        mapParams.put("key1", "value1");
        mapParams.put("key2", "value2");
        mapParams.put("key3", "value3");

        //Getting all the parameters
        Object[] allParams = ClientHttpRequest.getAllParameters(null, null, null, mapParams);
        assertEquals(3, allParams.length);
        assertEquals("value1", ((String) (allParams[0])).trim());

        allParams = ClientHttpRequest.getAllParameters(null, null, "foo", mapParams);
        assertEquals(1, allParams.length);
        assertEquals("foo", ((String) allParams[0]).trim());

        allParams = ClientHttpRequest.getAllParameters(null, null, null, "map", mapParams);
        assertEquals(0, allParams.length);

        allParams = ClientHttpRequest.getAllParameters("foo", null, null, mapParams);
        assertNotNull(allParams);
        assertTrue(allParams.length > 0);

        allParams = ClientHttpRequest.getAllParameters("", null, null, mapParams);
        assertNotNull(allParams);
        assertTrue(allParams.length > 0);

    }

    @Test
    public void testGetAllParametersFromURL() {

        //Create connection to the server
        URL url = new URL("http://brouzser.bw:8080/testRequest/");

        //Getting the parameters
        Object[] allParams = ClientHttpRequest.getAllParameters(null, url, null, null);
        assertEquals(3, allParams.length);
        assertEquals("abc", ((Object) (allParams[0])).toString().trim());

        allParams = ClientHttpRequest.getAllParameters(null, url, null);
        assertNotNull(allParams);
        assertTrue(allParams.length > 0);

        allParams = ClientHttpRequest.getAllParameters(null, url, "foo", null);
        assertNotNull(allParams);
        assertTrue(allParams.length > 0);

        allParams = ClientHttpRequest.getAllParameters("foo", url, null);
        assertNotNull(allParams);
        assertTrue(allParams.length > 0);

    }

    @Test
    public void testGetAllParametersFromRequest() {

        Map<String, String> mapParams = new HashMap<String, String>();
        mapParams.put("key1", "value1");
        mapParams.put("key2", "value2");
        mapParams.put("key3", "value3");

        //Getting all the parameters
        Object[] allParams = ClientHttpRequest.getAllParameters(null, null, null, mapParams);
        assertEquals(3, allParams.length);
        assertEquals("value1", ((String) (allParams[0])).trim());

        allParams = ClientHttpRequest.getAllParameters(null, null, "foo", mapParams);
        assertEquals(1, allParams.length);
        assertEquals("foo", ((String) allParams[0]).trim());

        allParams = ClientHttpRequest.getAllParameters(null, null, null, "map", mapParams);
        assertEquals(0, allParams.length);

        allParams = ClientHttpRequest.getAllParameters("foo", null, null, mapParams);
        assertNotNull(allParams);
        assertTrue(allParams.length > 0);

        allParams = ClientHttpRequest.getAllParameters("", null, null, mapParams);
        assertNotNull(allParams);
        assertTrue(allParams.length > 0);
    }

    @Test
    public void testGetAllParametersFromURLWithParameters() {

        //Create connection to the server
        URL url = new URL("http://brouzser.bw:8080/testRequest/");

        //Getting all the parameters
        Object[] allParams = ClientHttpRequest.getAllParameters(url, null, null, null);
        assertEquals("brouzser", ((String) (allParams[0])));
        Map<String, String> mapParams = ((Map<String, String>) ((HashMap) (allParams[0])).get("param"));
        assertNotNull(mapParams);
        assertTrue(mapParams.size() > 0);

        allParams = ClientHttpRequest.getAllParameters(url, null, null, "map");
        assertEquals("map", ((String) (allParams[0])));
        mapParams = ((Map<String, String>) (allParams[0]).get("param"));
        assertEquals("value1", ((String) mapParams.get("key1")).trim());

        allParams = ClientHttpRequest.getAllParameters(url, null, null, "key2=value2");
        assertEquals(2, allParams.length);
        assertEquals("value2", ((String) (allParams[0])).trim());
        Map<String, String> m2 = ((Map<String, String>) (allParams [0])).get("key2");
        assertEquals("value2", m2.get("key2"));
        
    }

   @Test
    public void testGetAllParametersFromNullUrl() {
        this.testGetAllParametersFromRequest();
    }

    @Test
    public void testGetAllParametersWithNullUrl() {
        this.testGetAllParametersFromRequest();
    }

    @Test
    public void testGetAllParametersFromAbsoluteUrl() {
        this.testGetAllParametersFromRequest();
    }

    @Test
    public void testConstructorNewWithoutParameter() {
}
}