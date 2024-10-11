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
/**
		* Create a new ClientHttpRequest.
		*
	    Create a new ClientHttpRequest to be used with requests.
		* The object passed is the response object returned by a GET call.
		* This test will execute the test of the body-only method.
		*
		 */
	    private ClientHttpRequest createNewObject()throws IOException
			{
		    ClientHttpRequest request = new ClientHttpRequest(client);
		    request.setParameter("", new ByteArrayInputStream("someData.bin".getBytes()));
		    request.setParameter("", new ByteArrayInputStream("someData.bin".getBytes()));
		    request.setParameter("", new ByteArrayInputStream("someData.bin".getBytes()));
		    request.setParameter("", new ByteArrayInputStream("someData.bin".getBytes()));
		    request.setParameter("", new ByteArrayInputStream("someData.bin".getBytes()));
		    request.post("", null);
		    request.post("", new ByteArrayInputStream("someData.bin".getBytes()));
		    request.post("", new ByteArrayInputStream("someData.bin".getBytes()));
		    return request;
			}
	    ClientHttpRequest post(String name, Object value) throws IOException
			{
		    ClientHttpRequest request = new ClientHttpRequest(client);
		    setParameter(name, value);
		    return request;
			}

	    @Test
	    public void testSetParameter()throws IOException
			{
		    ClientHttpRequest request = new ClientHttpRequest(client);
		    request.setParameter("", new ByteArrayInputStream("someData.bin".getBytes()));
		    request.setParameter("", new ByteArrayInputStream("someData.bin".getBytes()));
		    assertEquals("someData.bin", request.getParameter(""));
		    assertEquals("", request.getParameter(""));
		    assertEquals("someData", request.getParameter(""));
		    assertEquals("someData.bin", request.getParameter("someData.bin"));
		    assertEquals("someDataTest1", request.getParameter("someData.bin"));
		    assertEquals("someDataTest2", request.getParameter("someOtherData.bin"));
		    assertEquals("", new ByteArrayInputStream("someDataTest1.bin").getBytes());
		    request.setParameter("someData", Byte.MAX_VALUE);
		    assertEquals(new ByteArrayInputStream("someData.bin", new ByteArrayInputStream("someDataTest1.bin")), request.getParameter("someData"));
		    assertEquals("someDataTest2", request.getParameter("someData"));
		    assertEquals("someDataTest1.bin", request.getParameter("someData.bin"));
		    assertEquals("someDataTest2.bin", request.getParameter("someData.bin"));
		    assertEquals("someDataTest1.bin", request.getParameter("someData"));
		    assertNull(request.getParameter("someData0"));
		    assertNull(request.getParameter(""));
    	}

    	@Test
	    public void testSetParameterIfExist()throws IOException
			{
		   ClientHttpRequest request = new ClientHttpRequest(client);
		   request.setParameter("someData", Byte.MAX_VALUE);
		   request.setParameter("someData", "someData.bin");
		   assertEquals("someData", request.getParameter("someData.bin"));
		   assertEquals("someData.bin", request.getParameter("someData"));

	    }

	    @Test
	    public void testSetParameterWithMap()throws IOException
			{
		   ClientHttpRequest request = new ClientHttpRequest(client);
		   request.exchangeFor("post");
		   assertEquals("post", request.getParameter("name"));
		   Iterator<String> iter = request.getParameterMap("name").keySet().iterator();
		   String name = iter.next();
		   assertNull(request.getParameter(name));
		   assertEquals("name", iter.next());
		   assertEquals("post", request.getParameterIfKeyExist(name));
		   assertTrue(iter.hasNext());
		   assertEquals("post", iter.next());
		   assertEquals("name2", iter.next());
		   assertEquals("post", iter.next());
       	   assertEquals("name2", iter.next());
		   assertTrue(iter.hasNext());
		   assertEquals("post", iter.next());
		   Iterator<String> iter2 = request.getParameterMap("name2").keySet().iterator();
		   Iterator<String> iter3 = iter2.next().iterator();
		   assertEquals("post", iter3.next());
		   iter3.next();
		   iter3.next();
		   iter3.next();
		   assertEquals("post", iter3.next());
		   assertEquals("post2", iter2.next());
		   Iterable<Map.Entry<String, String>> me = request.getParameterMap("name");

		   Map<String, String> map = new HashMap<String, String>();
		   map.put("name", "post");
		   map.put("name2", "post2");
		   map.put("name3", "post3");

		   Iterable<Map.Entry<String, String>> result = me.iterator();
		   String key = result.next().getKey();
		   assertTrue(result.iterator()  instanceof Map.Entry.class);
		   assertEquals("name", result.next().getKey());
     	   assertEquals("name2", result.next().getKey());
     	   assertTrue(result instanceof Map.Entry.class);
		   assertEquals("post", result.next().getKey());
     	   assertNull(result.next().getKey());
     	  }
	    }
}