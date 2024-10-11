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
		private final String requestPath = "/getRequest/1";
        private final Integer numberOfParts = 4;
        private final int numberOfCookies = 20000;
        private final byte[] postParameterContentType = { 1, 2, 3, 4 };
        private final String postParameterValue = "value";

        private final Map<String, String> requestHeaders = new HashMap<>();
        private static Random random = new Random();

    @Test
    /**
     * create a new ClientHttpRequest with the post test by test the number of parts.
     */
    void createFromPostTest() {
        // create a new post request of part with numberOfPart, which is randomly determined at random.
        ClientHttpRequest newRequest = new ClientHttpRequest.ClientHttpRequest_5Test_1();
        newRequest.setRequestPath(requestPath);
        // create a number of cookies
        Map<String,String> cookies_value = new HashMap<>(numberOfCookies);
        cookies_value.put(random.nextInt(9000), "value2");
        newRequest.setRequestHeader("cookie", cookies_value);
        // create the number of parts
        Map<String,Integer> requestParameters_value = new HashMap<>(numberOfParts);
        requestParameters_value.put(random.nextInt(1000), numberOfParts);
        newRequest.setParameter(postParameterValue, postParameterContentType);
        // post new request
        OutputStream postOutputStream = newRequest.post(postParameterValue, postParameterContentType);

        // close postOutputStream, because client does't send the POST to the server.
        postOutputStream.close();
    }

    @Test
    /**
     * create a new ClientHttpRequest by setting new request path with parameters.
     */
    void createTest() {
        // create a new ClientHttpRequest of part that is randomly determined at random.
        ClientHttpRequest newRequest = new ClientHttpRequest.ClientHttpRequest_5Test_1();
        newRequest.setRequestPath(requestPath);
        // add number of cookies
        Map<String,String> cookies_value = new HashMap<>(numberOfCookies);
        cookies_value.put(random.nextInt(9000), "value2");
        newRequest.setRequestHeader("cookie", cookies_value);
        // add new request
        newRequest.setRequest(requestParameters_value);
        // post new request
        OutputStream postOutputStream = newRequest.post(null, null);

        // close postOutputStream, because client does't send the POST to the server.
        postOutputStream.close();
    }

    @Test
    /**
     * create a new ClientHttpRequest by setting no new request
     */
    void createTest_0() {
        // create a new ClientHttpRequest of part that is randomly determined at random.
        ClientHttpRequest newRequest = new ClientHttpRequest.ClientHttpRequest_5Test_1();
        newRequest.setRequestPath(requestPath);
        // add number of cookies
        Map<String,String> cookies_value = new HashMap<>(numberOfCookies);
        cookies_value.put(random.nextInt(9000), "value2");
        newRequest.setRequestHeader("cookie", cookies_value);
        // add new request
        newRequest.setRequest(null);
        // post new request
        OutputStream postOutputStream = newRequest.post(null, null);
        // close postOutputStream, because client does't send the POST to the server.
        postOutputStream.close();

        // to test cookies by get a File object, we need to set cookies manually
        // create File path with cookies.
        File cookies_file = new File(File.separator);
        final File cookiesDir = new File(File.separator);
        cookies_file.mkdirs();
        new RequestCookie(newRequest, cookiesDir);
    }

    @Test
    void createTest_1() {
        // create a new ClientHttpRequest by setting no new request
        ClientHttpRequest newRequest = new ClientHttpRequest.ClientHttpRequest_5Test_2();
        newRequest.setRequestPath(requestPath);
        // add number of cookies
        Map<String,String> cookies_value = new HashMap<>(numberOfCookies);
        cookies_value.put(random.nextInt(9000), "value2");
        newRequest.setRequestHeader("cookie", cookies_value);
        // add new request
        newRequest.setRequest(null);
        // post new request
        FileRequest file_param = new RequestCookie(newRequest, File.separator);
        OutputStream os = this.requestPath.getFile(file_param.getFileName());
        os.write("".getBytes());
        os.close();
        // close our output stream
        OutputStream os1 = newClientRequest(this.requestPath);
        os1.close();

        // to test cookies by GET a File object, we need to set cookies manually
        InputStream postContent = this.requestPath.getFile(file_param.getFileName()).openStream();
        assertNotNull("The request path of the new ClientHttpRequest is NULL", postContent);
        assertTrue("The read content is NULL", postContent.available()>0);

        byte[] postBytes = new byte[postContent.available()];
        postContent.read(postBytes);
        postContent.close();
        assertNotNull("The content of the new ClientHttpRequest is NULL", postBytes);
        assertEquals("Post bytes don't read the right content.", postParameterValue, postBytes);
    }

}