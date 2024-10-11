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
		
    @Test	
    public void testPostWithHttpMethod() throws IOException {
        String url = "/index.html";

        //Create a random string
        String random_str = createRandom();

        System.out.println("Random string size: " + random_str.length());

        //Add a random String to the form
        String hash = url.hashCode() + random_str;

        System.out.println("Hash of url: " + hash);

        //Send post request with the hash
        ClientHttpRequest.post(url, new HashMap<String,String>());
    }

    @Test
    public void testPost() throws IOException {
        String url = "/index.html";

        System.out.println("Random string size: " + url.length());

        //Create a random string
        String random_str = createRandom();

        System.out.println("Hash of url: " + url.hashCode() + random_str);

        //Send post request with the hash
        ClientHttpRequest.post(url, new HashMap<String,String>());
    }

    @Test
    public void testPostWithPostForm() throws IOException {
        String url = "/index.html";

        //Create a random string
        String random_str = createRandom();

        System.out.println("Hash of url: " + url.hashCode() + random_str);

        //Check that the method of the post request can be set
        ClientHttpRequest.setMethod(ClientHttpRequest.POST);

        //Send post request for POST
        ClientHttpRequest.post();
    }

    @Test
    public void testPostWithUrlWithAot() throws IOException {
        String url = "/index.html?A";

        //Create a random string
        String random_str = createRandom();

        System.out.println("Hash of url: " + url.hashCode() + random_str);

        //Send post request for POST URL without parameters
        ClientHttpRequest.post(url, null);
    }
    
    /**
     * Test method for {@link ClientHttpRequest#setMethod(java.lang.String)}.
     */
    @Test
    public void testSetMethod() throws IOException {
        String url = "/index.html";

        System.out.println("Hash of url: " + url.hashCode());

        //Create a random string
        String random_str = createRandom();

        //Add hash for random string
        Map<String, String> params_hash = new HashMap<String, String>();
        params_hash.put("hash2", random_str);

        //Add hash for parameters
        ClientHttpRequest.setMethod(ClientHttpRequest.POST);

        //Set the HTTP method parameter
        ClientHttpRequest.setMethod(ClientHttpRequest.HTTP_POST_METHOD);

        //Check the result
        String result_hash = url.hashCode() + random_str;
        System.out.println("Hash of url: " + result_hash);
        assertNotEquals(result_hash, url.hashCode());

        //Send request to get the result
        String result = new ClientHttpRequest().put(url).get();
        System.out.println("Hash of result: " + result);

        //Make sure the result is the same
        assertTrue(result == result_hash);

        //Check the result hash
        result_hash = url.hashCode() + random_str;
        System.out.println("Hash of result: " + result_hash);
        assertNotEquals(result_hash, url.hashCode());

        //Send the request with method is POST
        result = new ClientHttpRequest(ClientHttpRequest.HTTP_POST_METHOD).post();
        System.out.println("Hash of result: " + result);

        result_hash = url.hashCode() + random_str;
        System.out.println("Hash of result: " + result_hash);
        assertNotEquals(result_hash, url.hashCode());

        //Test hash equality - we use this method as the compareTo method
        String hash1 = result_hash;
        result = new ClientHttpRequest(ClientHttpRequest.HTTP_POST_METHOD).put(url);
        System.out.println("Hash of result: " + result);

        if(result_hash.equals(hash1)) {

            new ClientHttpRequest(ClientHttpRequest.HTTP_POST_METHOD).get();
        }
        else {
            new ClientHttpRequest(ClientHttpRequest.HTTP_POST_METHOD).put(url);
        }

        result = new ClientHttpRequest(ClientHttpRequest.HTTP_POST_METHOD).get();
        System.out.println("Hash of result: " + result);
        assertEquals(url.hashCode(), result_hash);
    }
    private String createRandom(){
        String random_str_1 = String.valueOf((char)((random.nextInt() & 0xff) + 65));
        int count_random_str = 1 + random.nextInt(0xd);

        String rand_str = "";
        while (rand_str.length() < count_random_str) {
            rand_str = new StringBuilder(rand_str.length()).append(rand_str);
        }
        System.out.println("Generated Random String: " + rand_str);
        return rand_str;
    }

    /**
     * Test method for {@link ClientHttpRequest#put(java.lang.String)}.
     * @throws IOException
     * @throws ClientHttpRequestException
     */
    @Test
    public void testPutWithBinary() throws IOException, ClientHttpRequestException {
        ClientHttpRequest request = new ClientHttpRequest(ClientHttpRequest.PUT);

        //Create a random string
        String random_str = createRandom();

        System.out.println("Hash of url: " + request.hashCode() + random_str);

        //Send the request with the hash
        request.setContentLength(random_str.length());
        request.setContentCharset("UTF-8");

        request.setParameter("length", random_str.length());
}
}