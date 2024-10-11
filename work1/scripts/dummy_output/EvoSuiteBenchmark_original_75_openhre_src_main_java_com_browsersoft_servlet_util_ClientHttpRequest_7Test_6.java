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
		
	@Test
	void testPost() throws IOException, InterruptedException{
        final Random r=new Random();
        final Random r2=new Random();
        System.setProperty("file.encoding","UTF-8");
        final File f=new File("/home/sri.sadri.nog.shahni/Downloads/FileDownload/temp/0");
        f.getParentFile().mkdirs();
        StringBuilder sb=new StringBuilder();
        final Map<String,String> args=new HashMap<>();
        final FileOutputStream fos=new FileOutputStream(f);
        final FileInputStream fis=new FileInputStream(f);
        InputStream is=null;
		if(r2.nextLong()==r.nextLong())
            is=fis;
			args.put("name1", new Integer(r.nextInt(10000)));
			args.put("value1", new Integer(r.nextInt()));
            args.put("name2", new Integer(r.nextInt(10000)));
			args.put("value2", new Integer(r.nextInt()));
            args.put("name3", new Integer(r.nextInt(10000)));
			args.put("value3", new Integer(r.nextInt()));            	
		String query="";
                while(is!=null)
                {
                    final byte[] bytes=new byte[is.available()];                    
                    is.read(bytes);
                    int len=bytes.length;
                    query=new String(bytes);
                    
                }
                final String result=ClientHttpRequest.post(sb.toString(),args,query);
                assertNotNull(result);
                assertEquals("test_test:7",result);
        fos.close();
		    fis.close();                    
		    is.close();
                final String result2=ClientHttpRequest.post(sb.toString(),new HashMap<>(),query);
                assertNotNull(result2);
                assertEquals("test_test:7",result2);
		}
		
}