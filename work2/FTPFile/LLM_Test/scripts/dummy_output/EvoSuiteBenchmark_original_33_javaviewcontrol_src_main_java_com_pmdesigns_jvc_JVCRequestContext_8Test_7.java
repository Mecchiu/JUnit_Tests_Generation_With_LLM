// JVCRequestContext_8Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {
		/**
		* This test case will assert that the link is generated properly in the form
		* of a HttpServletRequest including a relative & or a Absolute path.
		*/
    @Test
    void makeLink() {
        String test = makeLink("/index.html", "/index.html");

        assertNotNull(test);
        assertTrue(test.startsWith("/index.html"));
        assertTrue(test.endsWith("/index.html"));
        
        // check that it has a trailing slash as specified by RFC 2396
        test = makeLink("/index.html", "/index.html/");
        assertNotNull(test);
        assertTrue(test.endsWith("/index.html/"));
        
        try {
            test = makeLink("/index.html", "/index.html/foobar");
            fail("Shouldn't allow URL escaping of a relative path");
        } catch (IllegalStateException e) {
            // expected
        }
        
        try {
            test = makeLink("/index.html", "/index.html/foobar");
            fail("Shouldn't allow relative paths in an absolute path");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}