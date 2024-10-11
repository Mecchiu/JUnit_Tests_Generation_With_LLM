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
    public void ClientHttpRequest_3Test() throws IOException {
    	ClientHttpRequest request1 = createRequest("get, post=post file=a,cookie='a'", true, "<p>p1</p>", null);
    	assertEquals("p1", request1.getParameter("p1"));
    	assertNotNull(request1.getParameter("p2"));
    	assertEquals("a", request1.getParameter("p2"));
		assertTrue(request1.hasFile("a"));
		assertFalse(request1.hasFile("b"));
    }
    
    /**
* Creates a {@link ClientHttpRequest} object.
* @param post request parameters
* @param cookie request cookies
* @return a {@link ClientHttpRequest} instance
*/
static ClientHttpRequest createRequest(String post, boolean cookie, String file, Map formparams) {
    URL url = new URL(createURL(post, cookie));
    String cookiesStr = "";
    Object cookies = null;
    boolean cookiesAdded = false;
    if (post!= null && post.indexOf('=') > 0) {
    	String[] pairs = post.split(", ");
    	Iterator iterator = new Iterator();
    	while (iterator.hasNext()) {
    		String s = (String)iterator.next();
    		if (s.indexOf('=') > 0) {
    			int pairIdx = Integer.parseInt(s);
    			String key = cookiesStr + "," + pairIdx;
    			int c = 0;
    			while (iterator.hasNext()) {
		        	String pair = (String)iterator.next();
		        	int c_p = pair.indexOf('=');
		        	if (c == 0 && c_p > 0) {
		        		c = pair.length();
		        	}
		        	if (c == pairIdx) {
		        		c_p++;
		        		c_p++;
		        	}
		        	key += "=" + pair.substring(c, c_p);
					if (parameters == null) {
					  parameters = new HashMap();
                          formparams.put(pair.substring(c_p+1, pairIdx), value(pair));
    				  c++;
						continue;
					}
    				formparams.put(key, value(pair.substring(c_p, pairIdx)));
		        	iterator.next();
		        	iterator.next();
    			}
    			if (c > 0) {
	        		cs = key.substring(cs,c);
		        	cs = cs.toLowerCase();
		 		}
    		}
    		cookies = cookiesAdded? String.valueOf(key) : null;
    		if (cookieAdded) cookiesAdded = cookiesAdded || cookies.toLowerCase().equals(key.toLowerCase());
    	}
    }
    url.setRequestProperty("Cookie", cookies.toString());
    if (post!= null) url.setRequestProperty("POST", post);
    if (cookie) url.setRequestProperty("Cookie", cookies.toString());
    if (file!= null) url.setRequestProperty("File", file);
    if (formparams!= null) {
    	for (Enumeration pairs = formparams.keys(); pairs.hasMoreElements();) {
    		String pair = (String)pairs.nextElement();
    		url.setRequestProperty(pair, formparams.get(pair).toString());
    	}
    }
    URLConnection conn = url.openConnection();
    conn.setRequestProperty("Cookie", cookies.toString());
    conn.setRequestProperty("Accept-Language", "pt-PT");
    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    conn.setRequestProperty("SOAPAction", "http://code.google.com/apis/soap/file/e1");
    conn.setRequestProperty("Content-Length", "" + conn.getContentLength());
    conn.setRequestProperty( "User-Agent", 
        "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1.0)");
    if (cookie) {
    	InputStream in = null;
    	OutputStream out = null;
    	try {
    	  in = new FileInputStream(file);
    	  out = conn.getOutputStream();
    	  byte bytedata[] = new byte[1024];
    	  int count = 0;
    	  int bytecount = 0;
    	  while (count < 1000) {
    		  count = in.read(bytedata);
    	    bytecount += count;
    	  }
    	  out.write(bytecount);
    	  while (bytecount > 0) {
    		  byte count = in.read(bytedata, 0, bytecount);
    		  if (count == 0) {
    		    continue;
    		  }
    		  out.write(bytedata, 0, count);
    	  }
    	  in.close();
    	  out.close();
    	} finally {
    	  if (in!= null) {
    	    in.close();
    	  }
    	  if (out!= null) {
    	    out.close();
    	  }
    	}
    }
    return new ClientHttpRequest(conn);
  }

	private static String value(String param) {
    return "<param " + param + "=\"xx\">xx</param>";
  }

	private static URL createURL(String post) {
    String urlStr = "http://b.es:123456";
    int port = 443;
    if (post!= null && post.indexOf('=') > 0) {
      int p = post.indexOf('=');
      String portVal = post.substring(0, p);
      String path = post.substring(p + 1);
      int portValInt = Integer.parseInt(portVal);
      port = portValInt;
      String pathVal = post.substring(0, p);
      Path.setEnviron(pathVal);
      urlStr = urlStr + ":" + port + path;
    }
}
}