// JVCDispatcherTest.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import com.pmdesigns.jvc.tools.Base64Coder;
import com.pmdesigns.jvc.tools.JVCGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCDispatcher}.
* It contains one unit test case for the {@link JVCDispatcher#getRC()} method.
*/
class JVCDispatcherTest {
		
    void testGetRC() throws Exception {
        JVCDispatcher dispatcher = new JVCDispatcher();
        assertNotNull(dispatcher.getRC());
    }

    void testRequest() throws Exception {
        JVCDispatcher dispatcher = new JVCDispatcher();
        HttpURLConnection urlConnect = null;
                
        try {
            int result = 0;

            urlConnect = new TestURLConnection();
            String request = null; // will cause the test to start
            result &= dispatcher.requestForwardURLConnection(urlConnect, request, "test");
            result &= dispatcher.requestForwardURLConnection(urlConnect, request, "test");
            result &= dispatcher.requestForwardURLConnection(urlConnect, "test", "test");
        }
        catch (ServletException sex) {
            fail(sex.toString());
        }
        finally {
            if (urlConnect!= null) {
                urlConnect.getInputStream();
            }
        }
    }
    
    JVCDispatcherTest() {
        //nothing to do
    }
}

class TestURLConnection extends HttpURLConnection {

    public TestURLConnection() throws Exception {
        super(new URL("http://jvc.vmc.com/jvc2/jvc2.html?"));
        setRequestProperty("Origin", "http://jvc.vmc.com");
    }

    public TestURLConnection(URL url) throws Exception {
        super(url);
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}