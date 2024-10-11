// ClientHttpRequest_4Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_4Test {
		/**
		 * @param args
		 */
    @Test
    public void testPost() throws IOException {
   
    	String str[] = {"user1", "user2"};
    	HashMap str2 = new HashMap(1);
    	System.out.println("str2.length()=" + str2.size());
    	
    	assertEquals( 0, str2.size() );
    	assertEquals( 0, str.length );
    	assertEquals( 0, str2.get("") );
    	
    	String str3[] = {"", "1"};
    	assertEquals( 0, str3.length );
    	assertEquals( 0, str2.get("") );
    	
    	String[] str4 = {"", "1", "user2"};
    	assertEquals( 0, str4.length );
    	assertEquals( 2, str3.length);
    	assertEquals( 2, str4.length);
    	
    	for(int i = 0; i < 2; i++){
    		str2.put(str3[i], str4[i]);
    	}
    	System.out.println("str2.size()=" + str2.size());
    	assertEquals( 2, str4.length);
    	
    	str2 = new HashMap(1);
    	assertEquals( 0, str2.size() );
    	
    	str4 = new String[] {"", "1"};
    	str4[0] = "";
    	assertEquals( 2, str4.length );
    	assertEquals( "", str4[0] );
    	
    	str3 = new String[] {}, str4 = new String[] {"", "1", "\"2\""};
    	for(int i = 0; i < 3; i++){
    		str3[i] = str4[i] ;
    	}
    	Iterator iterator = str3.iterator();
    	System.out.println(iterator.next()[0]);
    	assertEquals("1", str3[0]);
    	iterator = str4.iterator();
    	if(iterator.hasNext()){
    		iterator.next();
    	}
   }
}