// ClientHttpRequest_3Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_3Test {
		
    @Test
    public void test() throws IOException {
        String post_params = "param1=value1\nparam2=value2\nparam3=value3\nparam4=value4";
        assertTrue(ClientHttpRequest.post(null, null) instanceof ClientHttpRequest_3Test.PutRequest);
		ClientHttpRequest_3Test.PutRequest request = (ClientHttpRequest_3Test.PutRequest) ClientHttpRequest.post(null, null);
		assertEquals(post_params, request.getRequestAsString());
	}
    
    private class PutRequest extends ClientHttpRequest {

        public PutRequest(Map parameters) {
            super(parameters);
        }
        
        public void setCookies(Map cookies) {
            assertNotNull(cookies);
            m_cookie_set = true;
        }
        
        public boolean isCookieSet() {
            return m_cookie_set;
        }
        
        public void setParameters(Map parameter) {
            assertNotNull(parameter);
        }
        
        public Map getParameters() {
            return new HashMap();
        }
    }
    
    
}