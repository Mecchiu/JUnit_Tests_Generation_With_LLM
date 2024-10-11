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

    /**
     * Tests {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)}.
     * @date 2014-12-10
     */
    @Test
    public void testPostS_01() throws Exception {
    	String name = "tstpost";
    	Object id = "tstid";
    	Map<String,Object> parameters = new HashMap<String,Object>();
    	parameters.put("name", name);
    	parameters.put("passwd", "1234");
    	parameters.put("email", "user@example.com");
    	String url = "http://127.0.0.1:9999/";
    	ClientHttpRequest testCase = ClientHttpRequest.post(name, parameters, url);
    	assertEquals(url, testCase.getUrl());
    	assertEquals(2, testCase.getHeaders().size());
    	assertEquals("POST", testCase.getHeaders().getFirst("Content-type"));
    	assertEquals("text/xml;charset=utf-8", testCase.getHeaders().getFirst("Content-Disposition"));
    	assertEquals(1, testCase.getParameters().size());
    	assertEquals(id, testCase.getParamters().get(name));
    	assertEquals("1234", testCase.getHeader("X-Post-Password"));
    	assertEquals(name, testCase.getHeader("X-Post-Name"));
    	assertEquals("user@example.com", testCase.getHeader(parameters.getFirst("passwd")));
    }

    /**
     * Tests {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)}.
     * @date 2014-12-10
     */
    @Test
    public void testPostS_02() throws Exception {
    	String name = "tstpost";
    	Object id = "tstid";
    	Map<String,Object> parameters = new HashMap<String,Object>();
    	parameters.put("name", name);
    	parameters.put("passwd", "1234");
    	parameters.put("email", "user@example.com");
    	String url = "http://127.0.0.1:9999/";
    	ClientHttpRequest testCase = ClientHttpRequest.post(name, parameters, url);
    	assertEquals(url, testCase.getUrl());
    	assertEquals(2, testCase.getHeaders().size());
    	assertEquals("POST", testCase.getHeaders().getFirst("Content-type"));
    	assertEquals("text/xml;charset=utf-8", testCase.getHeaders().getFirst("Content-Disposition"));
    	assertEquals(1, testCase.getParamerters().size());
    	assertEquals(id, testCase.getParamerters().get(name));
    	assertEquals("1234", testCase.getHeader("X-Post-Password"));
    	assertEquals(name, testCase.getHeader("X-Post-Name"));
    	assertEquals("user@example.com", testCase.getHeader(parameters.getFirst("passwd")));
    }
    
    /**
     * Tests {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)}.
     * @date 2014-12-10
     */
    @Test
    public void testPostS_03() throws Exception {
    	String name = "tstpost";
    	Object id = "tstid";
    	Map<String,Object> parameters = new HashMap<String,Object>();
    	parameters.put("name", name);
    	parameters.put("passwd", "1234");
    	parameters.put("email", "user@example.com");
    	String url = "http://127.0.0.1:9999/";
    	ClientHttpRequest testCase = ClientHttpRequest.post(name, parameters, url);
    	assertEquals(url, testCase.getUrl());
    	assertEquals(2, testCase.getHeaders().size());
    	assertEquals("POST", testCase.getHeaders().getFirst("Content-type"));
    	assertEquals("text/xml;charset=utf-8", testCase.getHeaders().getFirst("Content-Disposition"));
    	assertEquals(1, testCase.getParamerters().size());
    	assertEquals(id, testCase.getParamerters().get(name));
    	assertEquals("1234", testCase.getHeader("X-Post-Password"));
    	assertEquals(name, testCase.getHeader("X-Post-Name"));
    	assertEquals("user@example.com", testCase.getHeader(parameters.getFirst("passwd")));
    }

    /**
     * Tests {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)}.
     * @date 2014-12-10
     */
    @Test
    public void testPostS_04() throws Exception {
    	String name = "tstpost";
    	Object id = "tstid";
    	String url = "http://127.0.0.1:9999/";
    	InputStream body = new FileInputStream("body.txt");
    	ClientHttpRequest testCase = ClientHttpRequest.post(name, body, url);
    	assertEquals(url, testCase.getUrl());
    	assertEquals(2, testCase.getHeaders().size());
    	assertEquals("POST", testCase.getHeaders().getFirst("Content-type"));
    	assertEquals("text/plain", testCase.getHeaders().getFirst("Content-Disposition"));
    	assertEquals(1, testCase.getParamerters().size());
    	assertEquals(id, testCase.getParamerters().get(name));
    	assertEquals("body.txt", testCase.getHeader("Content-Disposition"));
    	assertEquals("body.txt", testCase.getContentAsString());
    	assertEquals(2, testCase.getParams().size());
    	assertEquals("POST", testCase.getParams().getFirst("Content-type"));
    	