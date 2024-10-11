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
    /**
     * This unit test will test {@link ClientHttpRequest#post()}
     */
    public void testPost() throws IOException {
        //System.out.println("getResponseAsStream");
        {
            ClientHttpRequest request = new ClientHttpRequest("http://www.browsersoft.com/?test=1&value=2");
            assertNotNull(request.getResponseAsStream());
            InputStream responseStream = request.getResponseAsStream();
            assertNotNull(responseStream);
            responseStream.close();
        }

        ClientHttpRequest request = new ClientHttpRequest("http://www.browsersoft.com/_method");
        assertNotNull(request.getResponseAsStream());
        InputStream responseStream = request.getResponseAsStream();
        assertNotNull(responseStream);
        responseStream.close();
    }

    @Test
    /**
     * This unit test will test {@link ClientHttpRequest#post()}
     */
    public void testPostWithContent() throws IOException {
        Map<String,String> headers = new HashMap<>();
        final int TOTAL_SIZE = 50000000;
        {
            RequestParams params = new RequestParams();
            params.set("_startTime", "0");
            params.put("startTime", "2000");
            params.put("test", "1");
            params.put("param1", "value of one");
            params.put("_param1", "value of one");
            params.set("_endTime", "100");
            params.put("endTime", "500");
            HttpHeaders headers = new HttpHeaders();
            headers.put("param1", "value of other");
            headers.put("_param1", "value of other");
            headers.put("startTime", "10");

            StringBuilder url = new StringBuilder();
            url.append("https://www.browsersoft.com/");
            url.append(params.get("_client").replace("_", "="));
            url.append("?");
            url.append(params.get("param1").replace("_", "="));
            url.append("&");
            url.append(params.get("endTime").replace("_", "="));

            ClientHttpRequest request = new ClientHttpRequest(url.toString(), new File("test.txt"), headers, null, headers);
            request.writeParameters();
            InputStream responseStream = request.getResponseAsInputStream();
            assertNotNull(responseStream);
            responseStream.close();
            assertEquals("value of one",
                    request.getParameters().get("param1").readProperty());
            assertEquals("value of other",
                    request.getParameters().get("_param1").readProperty());
            assertEquals("0",
                    request.getParameters().get("startTime").readProperty());
            assertEquals("0",
                    request.getParameters().get("endTime").readProperty());
        }

        headers = new HttpHeaders();
        headers.put("param1", "value of another");
        headers.put("startTime", "10");

        url = new StringBuilder();
        request = new ClientHttpRequest(url.toString(), new File("test.txt"), headers, null, headers);
        request.writeParameters();
        responseStream = request.getResponseAsInputStream();
        assertNotNull(responseStream);
        responseStream.close();

        headers = new HttpHeaders();
        headers.put("param1", "value of one");
        headers.put("_param1", "value of one");
        headers.put("startTime", "1000");

        request = new ClientHttpRequest(url.toString(), new File("test.txt"), headers, null, headers);
        request.writeParameters();
        responseStream = request.getResponseAsInputStream();
        assertNotNull(responseStream);
        responseStream.close();
    }

}