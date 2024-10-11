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
		//    private static final String HTML_RESET = ""; // for JUnit

// HTMLOutputStreamTest.java
    @Test
    public void test() throws Exception {
    }

// HTMLOutputStreamTest.java
    @SuppressWarnings("deprecation")
    @Test
    public void test_W_Java8_DEPRECATED() throws Exception {
    }

    // HTMLOutputStreamTest.java
    @SuppressWarnings("deprecation")
    @Test
    public void test_W_No_Deprecation() throws Exception {
        System.out.println(HTML_RESET);
    }

    // HTMLOutputStreamTest.java
    @SuppressWarnings("deprecation")
    @Test
    public void test_Test() throws Exception {
        System.out.print(HTML_START);
        HTMLOutputStream out = new HTMLOutputStream(response);
        out.print(HTML_ROOT);
        out.print(HTML_END);

        String s = out.output();

        s.substring(s.indexOf(HTML_START) + HTML_START.length(),
                s.indexOf(HTML_END)).substring(0, 10);
        
        System.out.println(s);
    }
}