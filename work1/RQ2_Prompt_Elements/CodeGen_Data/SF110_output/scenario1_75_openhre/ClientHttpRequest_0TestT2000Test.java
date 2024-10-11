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
private final Random random = new Random();
			ClientHttpRequest request = new ClientHttpRequest();

		@Test
		void boundary() {
			request.addHeader("foo", "bar");

            assertEquals("1234567890", request.getParameters().get("foo"));
        }
		
		@Test
        void random() {
            assertEquals(new Random().nextInt(), request.query.get("foo"));
        }
        
		@Test
        void queryParameter() {
            assertTrue(request.query.get("foo") == "bar");
        }

		@Test
		void writesAllValue() {
            request.addHeader("test", "value");
            assertFalse(request.query.get("test") == null);
            assertEquals("value", request.query.get("test"));
        }

		@Test
	    void readsAllValue() throws IOException, URLException {
	        request.post();
	        URLConnection connection = new URL("http://user:pass@host:12/foobar").openConnection();
	        connection.setRequestProperty("Content-Type", "text/plain; random=1");
	        URLConnection connection2 = connection.openConnection();
	        assertNotNull(connection2.getHeaderField("content-type"));
	        String body = connection2.getHeaderField("content-type");
	        int cnt = 3;
	        boolean bAll = true;
	        while (cnt > 0){
	            assertNotNull(body);
	            body = body.split(";")[0];
	            assertTrue(Integer.parseInt(body) == cnt);
	            cnt--;
	            bAll =!bAll;
	            if(bAll){
	                break;
	            }
	        }
	        assertFalse(bAll);
	    }
	}

// ClientHttpRequest_1Test.java
