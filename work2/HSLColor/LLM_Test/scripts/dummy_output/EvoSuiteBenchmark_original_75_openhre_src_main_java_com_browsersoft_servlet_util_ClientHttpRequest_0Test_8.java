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
     * Test of POST method for {@link com.browsersoft.servlet.util.ClientHttpRequest#post()}.
     */
    @Test
    void post() {
        Map<String, Object> headers = new HashMap<>();
        headers.put(ClientHttpRequest.CONTENT_TYPE, "application/x-www-form-urlencoded");
        ClientHttpRequest request = new ClientHttpRequest();
        String name = "post";
        String fileName = "file";
        String method = "POST";
        String targetUrl = "http://example.com";
        String[] listOfArguments = {name, fileName, method, targetUrl};
        int index = 0;
        int expectedLength = listOfArguments.length;
        byte[] body = null;
        byte[] fileBody = null;
        try {
            body = (byte[]) listOfArguments[index++].getClass().newInstance();
            fileBody = (byte[])listOfArguments[index].getClass().newInstance();
            InputStream inputStream = new FileInputStream("target/index-" + index);
            request.post(inputStream, body, fileBody);
            InputStream response = request.post(inputStream, fileBody);
            outputStream(response);
            response.close();
            response = request.post(inputStream, fileBody);
            outputStream(response);
            outputStream(request.post(inputStream, fileBody));
//            test.assertNotEquals(0, body.length);
//            test.assertEquals(expectedLength, body.length);
//            test.assertTrue(body.length == fileBody.length);
            expectedLength = body.length;
        } catch (Exception e) {
            test.fail("Unexpected exception while testing if body is a string with length 0");
        }
        
        test.assertEqualsInNames(expectedLength, name, method, targetUrl);
    }

	private static void outputStream(Object o) throws IOException {
		if (o instanceof OutputStream) {
			((OutputStream) o).close();
		} else if (o instanceof InputStream) {
			try {
				((InputStream) o).close();
			} catch (IOException e) {
				fail();
			}
		}
	}

	private static void test(String testName, Object o) throws IOException {
		String test = testName + "\n" + o;
		test(test);
	}

	private static void test(String test) {
		String request = ClientHttpRequest.class.getName() + "." + ClientHttpRequest.class.getName() + "." + o.getClass().getName() + ".POST[";
		request += o.getClass().getName() + "::toString()";
		request += "]";
		new TestExecutor().execute(test, request + "\n");
	}
}

class TestExecutor extends Thread {

    private String test;
    ClientHttpRequest request;
    
    public TestExecutor() {
        
    }
    
    public TestExecutor(String test) {
        this.test = test;
    }

    @Override
    public void run() {
        ClientHttpRequest request = null;
        String name = "test.run";
        try {
            if (ClientHttpRequest.class.isAssignableFrom(TestExecutor.class)
                    &&!name.contains("Test"))
                request = (ClientHttpRequest) testClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (request!= null)
            test("Test "+ name + " execution time in "+ test);
    }
}