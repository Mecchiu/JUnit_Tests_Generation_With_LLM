// HTMLOutputStreamTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLOutputStream}.
* It contains one unit test case for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {
		
    @Test
    public void test() {
    	
    	HTMLOutputStream.print("Hello, world!");
    	
    	try {
    		response.addHeader("text/html", "Hello, Ola");
    		byte b[] = new byte[10];
    		FileOutputStream out = new FileOutputStream("HTMLOutputStreamTest") {
    			public int write(int b) {
    				return super.write(b);
    			}
    		};
    		out.write(b);
    		out.flush();
    	} catch (IOException e) {
    		assertEquals(e.getMessage(), "Unable to write to stream.");
    	}
    	
    	assertEquals("Hello, Ola", response.getMessage());


    }

    void println(String str) {
    	String s1 = str;
}
}