// JVCRequestContext_7Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {
		
    /**
     * Test that a request parameter named "test" with an extra value of 
     * "test" is handled correctly.
     */
    @Test
    public void oneTestRequestParameter() {
        String[] strs = new String[] { "test", "test_x", "test%x", "test_x_y", "test%x_y" };
        List<String> list = Arrays.asList(strs).subList(0, 2);
        // String[] arrs = new String[2];
        // assertEquals(list, Arrays.asList(arrs));
        assertEquals(2, list.size());
        assertTrue(Arrays.equals("test", list.get(0)), list.get(0));
        assertTrue(Arrays.equals("test_y", list.get(1)), list.get(1));
    }

    /**
     * Test the JVCRequestContext.makeLink() method
     */
    @Test
    public void makeLink()
    {
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        StringBuffer buffer = null;
 
        try
        {
            String url =  "http://www.pmdesigns.com/jvcrequestcontexttest/formtest";
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.connect();
            InputStreamReader readerIn = new InputStreamReader(
               connection.getInputStream(), "UTF-8");

            int b;

            while ((b = readerIn.read()) >= 0)
            {
                buffer.append((char) b);
            } 

            Reader readerOut = new StringReader(buffer.toString());
            String m = ServletFileUpload.readAsString(readerOut);
            readerOut.close();

            String result = "test";
            boolean found = false;
            BufferedReader br = new BufferedReader(new StringReader(m));
			String s;
			StringWriter sw;

			// Check all of the input strings to see which one we found
			while ((s = br.readLine())!= null)
			{
				found = true;
				break;
			}

            // If we didn't found anything
			if (found == false)
			{
				buffer = new StringBuffer();
			}

            // Check that the URL has the key in the form: 
            m = m.indexOf("http://www.pmdesigns.com/jvcrequestcontexttest/formtest?test=1") + 14;
            assertEquals("test=1", m);

            // Finally, convert the result to unicode string
            String s2 = new String(new sun.misc.BASE64Decoder().decodeBuffer(sw.toString().getBytes()));
            s2 = s2.replace(result+"", "");
            result = s2;

			return;
        }
        catch (Exception e)
        {
            fail(e.getMessage());
        }
        finally
        {
            if (reader!= null)
            {
                try
                {
                    reader.close();
                }
                catch (Exception ignore)
                {
                    // ignore
                }
            }
        }
    }

    /**
     * Test the JVCRequestContext.absPath() method
     */
    @Test
    public void absPath()
    {
        String[] paths = new String[] { "/"+System.getProperty("testpath")+System.getProperty("testparam"),
            "/test"+System.currentTimeMillis(), 
            "/a/xy/abc/xy.txt", 
            "/a/xy/abc/xy.txt?param", };

        for (int i=0; i<paths.length; i++) {
            // this doesn't seem to be used, but some older version of JVM.
            assertEquals("expectedPath="+paths[i], paths[i], makeLink(paths[i], "/"));
        }
    }
}