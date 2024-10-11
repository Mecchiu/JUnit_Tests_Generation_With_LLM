// ClientHttpRequest_7Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
		/**
		* test of posting a POST request
		*/
    @Test
    void post() throws IOException {
        URLConnection con = new URL("http://localhost/x").openConnection();
        InputStream in = this.post("name1", new Integer(10));
        OutputStream out = con.getOutputStream();
        out.write(new String("Some string for this request").getBytes());
        in.close();
    }
    
    /**
    * test of post with files parameters  
	*/
    @Test
    void postWithFile() throws IOException {
        InputStream in = 
            this.getClass().getClassLoader().
            getResource("ClientHttpRequest_7Test/images/upload.jpg").openStream();
        
        FileInputStream fin = 
            new FileInputStream("ClientHttpRequest_7Test/images/upload.jpg");
        
        
        InputStream in2 = this.post("name", new FileInputStream("file2.jpg"), null, null);
       
        OutputStream out = 
            new FileOutputStream("ClientHttpRequest_7Test/images/upload.jpg");
       
        
        out.write(new byte[]{
            (byte) 0xAB, (byte) 0xCD, (byte) 0xEF
        });
    		fin.close();
        
        in2.close();
            
        in.close();
    }
    
    /**
    * test of setting HTTP Headers
	*/
    @Test
    void setHeader_basic() throws IOException {
    	
        URLConnection con = new URL("http://localhost/x").openConnection();
        
        con.setRequestProperty("key1", "value1");
        con.setRequestProperty("key2", "value2");
        con.setRequestProperty("key3", "value3");
        
        int responseCode = 
            con.getResponseCode();
        assertEquals("response should be 200", 200, responseCode);
    }
    
    /**
    * test of setting some invalid Header
    *
    * @throws IOException
    */
    @Test
    void setHeader_invalidHeaders()throws IOException {
        
        URLConnection connection = new URL("http://localhost/x").openConnection();
        
        Iterator iterator = connection.getHeaderFields().iterator();
        assertNull(iterator.next());
    }
    
    /**
    * test of setting some invalid Http Header
    *
    * @throws IOException
    */
    @Test
    void setHeader_invalidHttpHeader()throws IOException {
       
        URLConnection connection = new URL("http://localhost/x").openConnection();
        connection.addRequestProperty("key", "value");
        connection.addRequestProperty("key", "value2");
        
        Iterator iterator = connection.getHeaderFields().iterator();
        assertNull(iterator.next());
    }
    
    /**
    * test of sending some valid HTTP header
    *
    * @throws IOException
    */
    @Test
    void setHeader_validHttpHeader()throws IOException {
       
        URL connection = new URL("http://localhost/x").openConnection();
        connection.addRequestProperty("key1", "value1");
        connection.addRequestProperty("key2", "value2");
        connection.addRequestProperty("key3", "value3");
        
        Iterator iterator = connection.getHeaderFields().iterator();
        assertEquals("key1=value1;key2=value2;key3=value3", iterator.next());
    }
    
    /**
    * test of sending out file header
    *
    * @throws IOException
    */
    @Test
    void setHeader_validFileHeader()throws IOException {
       
        URLConnection con = new URL("http://localhost/x").openConnection();
       
        con.addRequestProperty("x-file-name-1", "file");
       
        Iterator iterator = con.getHeaderFields().iterator();
        assertEquals("x-file-name-1=file; ", iterator.next());
    }
    
    /**
    * test of sending out file header with key
    *
    * @throws IOException
    */
    @Test
    void setHeaderWithKey_validFileHeader()throws IOException {
       
        URLConnection con = new URL("http://localhost/x").openConnection();
        
        con.addRequestProperty("x-file-name-1", "file");
       
        con.addRequestProperty("key-file.xxx", "file");
        
        Iterator iterator = con.getHeaderFields().iterator();
        assertEquals("x-file-name-1=file;key-file.xxxx=file; ", iterator.next());
    }
    
    /**
    * test of sending out string
    *
    * @throws IOException
    */
    @Test
    void setHeader_string()throws IOException {
       
        URLConnection con = new URL("http://127.0.0.1/x").openConnection();
       
        con.addRequestProperty("x-a-string", "string value");
       
        Iterator iterator = con.getHeaderFields().iterator();
        assertEquals("x-a-string=string value; ", iterator.next());
    }
    
    /**
    * test of setting an invalid key but not value
    *
    * @throws IOException
    */
    @Test
    void setHeader_invalidKeyButValue()throws IOException {
     
        URLConnection con = new URL("http://localhost/x").openConnection();
      
        con.addRequestProperty("x-a-string", "value1");
       
        Iterator iterator = con.getHeaderFields().iterator();
        assertNull(iterator.next());
    }
    
    /**
    * test of reading the keyValue of an unknown key
    *
    * @throws IOException
    */
    @Test
    void testValueFromUnknownKey()throws IOException {
      
        URL url = new URL("http://localhost/x");
        
}
}