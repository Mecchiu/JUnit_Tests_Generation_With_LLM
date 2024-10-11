// ClientHttpRequest_0Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_0Test {
		
    /**
     * Test method of {@link com.browsersoft.servlet.util.ClientHttpRequest#post()}.
     * Creates POST HTTP request and the same form
     *
     * @throws IOException
     * @throws IllegalArgumentException
     */
    @Test
    public void testPost() throws IOException, IllegalArgumentException {
        assertNotNull(ClientHttpRequest.post(), "Request cannot be null");
        assertEquals(1, ClientHttpRequest.post().size(), "Request has wrong size");
        Iterator<HttpRequest> iterator = new ClientHttpRequest.Iterator();
        assertTrue(iterator.hasNext());
        ClientHttpRequest.Iterator it = iterator;
        ClientHttpRequest.Iterator next = iterator;
        assertEquals(it.next(), ClientHttpRequest.POST, "HTTP request sequence not correct");
        next.hasNext();
        assertFalse(next.hasNext(), "Next test sequence must not contain next element");
        assertEquals(next, next.next());
    }
    
    /**
     * Test method of {@link com.browsersoft.servlet.util.ClientHttpRequest#post()}.
     * Creates a POST HTTP request with a file
     *
     * @throws IOException
     * @throws IllegalArgumentException
     */
    @Test
    public void testPostFile() throws IOException, IllegalArgumentException {
        assertNotNull(ClientHttpRequest.POST.newFile(new File("testfile")), "Request cannot be null");
        assertTrue(ClientHttpRequest.POST.newFile(new File("testfile")).exists(), "Created POST file is incorrect");
        Iterator<HttpRequest> iterator = new ClientHttpRequest.Iterator();
        assertTrue(iterator.hasNext());
        ClientHttpRequest.Iterator it = iterator;
        ClientHttpRequest.Iterator next = iterator;
        assertEquals(it.next(), ClientHttpRequest.POST, "HTTP request sequence not correct");
        assertEquals(next, next.next());
        assertFalse(next.hasNext(), "Next test sequence must not contain next element");
        try {
            next.next();
        }
        catch (Exception ignored) {
        }
        iterator.hasNext();
        assertFalse(next.hasNext(), "Next test sequence must not contain next element");
    }
    
    /**
     * Test method of {@link com.browsersoft.servlet.util.ClientHttpRequest#post()}.
     * Creates a POST HTTP request with a file in URL
     *
     * @throws IOException
     * @throws IllegalArgumentException
     */
    @Test
    public void testPostURL() throws IOException, IllegalArgumentException {
        File file = new File("testfile");
        assertTrue(file.createNewFile(), "Created POST file is incorrect");
        assertTrue(file.exists(), "Created POST file is incorrect");
        URL url = new URL("http://localhost:8080/" + file.getAbsolutePath());
        assertNotNull(url, "Created URL does not exist");
        assertFalse(url.isFile(), "Created URL uses a file as a URI");
        
        URLConnection urlConnection = url.openConnection();
        assertNotNull(urlConnection, "URLConnection cannot be null");
        assertTrue(urlConnection instanceof FileURLConnection, "FileURLConnection should not be null");
        assertEquals(urlConnection.getFile(), file.getAbsolutePath(), "URLConnection contains wrong file path");
        assertTrue(urlConnection.isConnectionUpgraded(), "Connection not upgraded");
    }
    
    /**
     * Test method of {@link com.browsersoft.servlet.util.ClientHttpRequest#get(Map)}.
     * Creates a POST request, adds a form, and then the request to the server
     *
     * @throws IOException
     * @throws IllegalArgumentException
     */
    @Test
    public void testGetMap() throws IOException, IllegalArgumentException {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        map.put("string", "value2");
        URLConnection urlConnection = new URL("http://localhost:8080/", map).openConnection();
        assertNotNull(urlConnection);
        assertNotNull(map, "Response cannot be null");
        assertTrue(urlConnection.getContentType().contains("application/x-www-form-urlencoded"), "Could not add form with name 'type' but received unexpected content type");
        assertEquals(urlConnection.getContentType(), "application/x-www-form-urlencoded", "First line must be of 'application/x-www-form-urlencoded'; second line is 'application/x-www-form-urlencoded'");
        assertTrue(urlConnection.getResponseCode() < 400, "First line must begin with 200. Got '%" + urlConnection.getResponseCode() + "%'");
    }
    
    /**
     * Test method of {@link com.browsersoft.servlet.util.ClientHttpRequest#get()}.
     * Creates a POST request, adds a form, and then the request to the server
     *
     * @throws IOException
     * @throws IllegalArgumentException
     */
    @Test
    public void testGet() throws IOException, IllegalArgumentException {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        map.put("string", "value2");
        map.put("random.name", "Random Value");
        URLConnection urlConnection = new URL("http://localhost:8080/", map).openConnection();
        assertNotNull(urlConnection);
        assertNotNull(map, "Response cannot be null");
        assertTrue(urlConnection.getContentType().contains("application/x-www-form-urlencoded"), "Could not add form with name 'type' but received unexpected content type");
        assertEquals(urlConnection.getContentType(), "application/x-www-form-urlencoded", "First line must contain value of 'application/x-www-form-urlencoded'");
        assertEquals(urlConnection.getResponseCode(), 303, "Response message must be \"303\"");
    }
    
    /**
     * An example implementation of {@link com.browsersoft.servlet.util.ClientHttpRequest.Iterator} 
     *
     * @author Nick Schafer (@NSchafer)
     */
    public abstract class IteratorImpl implements Iterator<String> {
        int count = 0;
}
}