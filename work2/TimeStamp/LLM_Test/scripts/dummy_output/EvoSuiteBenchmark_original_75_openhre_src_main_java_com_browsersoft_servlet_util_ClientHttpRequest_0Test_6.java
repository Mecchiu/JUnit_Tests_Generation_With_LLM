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
     * test method for {@link ClientHttpRequest#post()}
     */
    @Test
    public void test_post() throws IOException, InterruptedException {
        
        URL url_1;
        ClientHttpRequest request;
        
        ClientHttpRequest.createFileInTempFile("filename_01/filename_1", "text");
        
        try(InputStream url_1_is = new FileInputStream(testFile)){
            url_1 = new URL(new File("filename_01"), "localhost", 1024 + "/filename_01", url_1);
            request = ClientHttpRequest.createFileInTempFile("filename_01", "text");
        }
        catch(Exception e) {
            fail("unable to generate POST URL with one file");
        }
        
        request.getMethod();
        
        ClientHttpRequest.getPath();
        
        ClientHttpRequest.getQueryParams();
        
        ClientHttpRequest request2;

        try(InputStream url_1_is2 = new FileInputStream(testFile); ){
            request2 = ClientHttpRequest.createFileInTempFile("filename_01/filename_2", "text2");
        }
        catch(Exception e) {
            fail("unable to generate POST URL with two files");
        }
        
        try(InputStream url_1_is3 = new FileInputStream(testFile); ){
            ClientHttpRequest.createFromFile("file_path_1", testFile, true);
        }
        catch(Exception e) {
            fail("unable to generate POST URL with file with different extension");
        }
        
        ClientHttpRequest request2.getMethod();
        
        ClientHttpRequest.getPath();
        
        ClientHttpRequest request3 = ClientHttpRequest.create();
        
        request3.getMethod();
        
        ServerHttpRequest.createFileInTempFile("filename_01.png", "text2");
        
        ClientHttpRequest.getPath();
        
        ClientHttpRequest request_2 = ClientHttpRequest.create();
        
        ClientHttpRequest.getQueryParams();
        
        request2.post();
        
        String url = ServerHttpRequest.getPath();
        
        String expected = (new URL(url))
               .defaultPort
               .getProtocol()
               .toLowerCase()
               .concat(ServerHttpRequest.defaultPort
                       .getServerPort())
               .concat("?path=")
               .concat(url
                       .split("/")
                       .split("?")[1].split("=")[0])
               .concat("#").concat(
                        new Random().nextInt(Integer.MAX_VALUE))
               .toString();
        
        expected = expected.replace("%2F", "/")
               .replace("%3B", "?")
               .replace("%22", "&")
               .replace("%26", "&")
               .replace("%3C", ",")
               .replace("%25", "%")
               .replace("%3F", "/")
               .replace("%2F", "/")
               .replace("%3B", "/")
               .replace("%22", "/")
               .replace("%26", "");
        
        assertEquals(expected, request.getUrl().toString().replace("%2F", "/")
                       .replace("%3B", "?path=")
                       .replace("%22", "&")
                       .replace("%26", "&")
                       .replace("%3C", ",")
                       .replace("%25", "%")
                       .replace("%3F", "/")
                       .replace("%2F", "/")
                       .replace("%3B", "/")
                       .replace("%22", "/")
                       .replace("%26", "&")
                       .replace("%26%26%26%26", "");
        
        assertEquals(ServerHttpRequest.getPath()
               .toString().replace("%2F", "/")
               .replace("%3B", "?")
               .replace("%22", "&")
               .replace("%26", "&")
               .replace("%3C", ",")
               .replace("%25", "%")
               .replace("%3F", "/")
               .replace("%2F", "/")
               .replace("%3B", "#")
               .replace("%22", "/")
               .replace("%26", ""));
    }
} // end of ClientHttpRequest_0Test.class