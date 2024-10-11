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
		/**
* Initializes a new test case for the {@link HTMLOutputStream#HTMLOutputStream(HttpServletRequest)} class.
* In this case, we provide an {@link HttpServletRequest} value.
*/
    @Test
    public void testInit() throws Exception {

        HTMLOutputStream outputStream = new HTMLOutputStream(new HttpServletRequest());
	    if (outputStream!= null) {
		    outputStream.print("A test.");
	    }
	    System.out.println("");
	}		
}