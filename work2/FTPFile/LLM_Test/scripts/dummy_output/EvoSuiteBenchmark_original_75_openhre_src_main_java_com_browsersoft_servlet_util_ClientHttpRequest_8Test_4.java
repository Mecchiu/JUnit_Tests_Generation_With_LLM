// ClientHttpRequest_8Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_8Test {
		
}
/*
 * ---------------
 * ClientHttpRequest
 * ---------------
 */
class ClientHttpRequest{

    private static final Random random = new Random();

    private String postString;

    public void post(String request, Object value1, String name2, Object value2, String name3, Object value3, String name4, Object value4) throws IOException{
        this.postString = String.format("%s=%s%s%s%s%s%s%s%s%s%s", name1, value1, name2, value2, name3, value3, name4, value4, name1, value1, name2, value2, name3, value3, name4, value4);
        post(request);
    }

    public InputStream post(String request) throws IOException {
        InputStream inputstream1 = getClass().getResourceAsStream("/testdata/resources/" + request);
        InputStream inputstream = new FileInputStream(new File("server.out"));

        return new InputStream() {
            public int read() throws IOException {
                int b = inputstream.read();
                int size = inputstream.read();
                return b;
            }
            @Override
            public void close() throws IOException {
                inputstream.close();
            }
        };
    }

    public static void main(String[] args) throws IOException{
        String baseDir = "testdata/resources/";

        File file1 = new File("server.out");
        OutputStream o = new FileOutputStream(file1);
        o.write(new char[]{'h', 'e', 'n',
                'l', 'o', 'r', 't',
                'a','s','s', 'e',
                'r', 'y', 'd'}[random.nextInt(10)]);
        o.close();
        ClientHttpRequest.post("GetTest.", 8);
        try{
            ClientHttpRequest.post("PostTest.", 10, 0);
            throw new AssertionError();
        } 
        catch(IOException e) {
        }
        ClientHttpRequest.post("PostTest4", new Integer(200));
        ClientHttpRequest.post("PostTest5", new Integer(2000));
        ClientHttpRequest.post("PostTest6", new Long(3000));
        ClientHttpRequest.post("PostTest7", new String("asdf"));
        ClientHttpRequest.post("PostTest8", new int[0]);
        ClientHttpRequest.post("PostTest9", new char[0]);
        ClientHttpRequest.post("PostTest10", new InputStream[] { new FileInputStream("server.out") });
    }
}