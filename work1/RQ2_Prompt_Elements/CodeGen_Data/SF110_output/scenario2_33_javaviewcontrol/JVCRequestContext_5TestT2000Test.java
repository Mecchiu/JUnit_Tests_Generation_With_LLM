// JVCRequestContext_5Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContext_5Test {

    /** Test that a String in the flash is properly created. */
    @Test
    void flashStringTest() {
        // Get the flash string
        String flashString = request.getFlash();

        // Check it for a validity
        assertNotNull(flashString);
    }

    /** Check that the Request contains a required field. */
    @Test
    void checkRequiredField() {
        // Fetch the key
        String key = request.getParameter("RequiredField1");
        // Check it exist
        assertNotNull(key);
        // Check it contains value
        assertTrue(key.endsWith("=RequiredField1"));
        // Check key size
        assertEquals(key.length(), 6);
        // Check length of the key
        assertEquals(key.length(), (int) key.charAt(0) + 1);
        // Get value
        String keyValue = request.getParameter("RequiredField2");
        // Make sure it's null.
        assertNull(keyValue);
        // Check if it contains the key
        assertTrue(keyValue.endsWith("=RequiredField2"));
    }

}

//JVCRequestContext_7Test.java
