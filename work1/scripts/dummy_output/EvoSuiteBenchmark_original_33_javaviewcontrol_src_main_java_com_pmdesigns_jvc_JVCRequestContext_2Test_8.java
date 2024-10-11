// JVCRequestContext_2Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {
		
    /** A test case for a JVCRequestContext. */
	@Test
	void getParamValues( ) {
		
    	String[] values = "oneString", "twoStrings", "threeKeys", "fourStringsAndFourValues";
        JVCRequestContext reqctx = new JVCRequestContext();
        String[] arr = reqctx.getParamValues(values);
        assertEquals(values.length, arr.length);
        
    }

	@Test
    void getParamNames( ) {
        String[] values = "oneString", "twoStrings", "threeKeys", "fourStringsAndFourValues";
        
        int count = 0;
        
        for (int i = 0; i < values.length; i++ ) {
            String[] arr = reqctx.getParamNames(values[i]);
            int count2 = 0;
            for (int j = 0; j < arr.length; j++ ) {
                count2++;
            }
            assertEquals(values[i], arr[0]);
        }
        
        count = 0;
        
        for (int i = 0; i < values.length; i++ ) {
            String[] arr = reqctx.getParamNames(values[i] + "_new");
            int count2 = 0;
            for (int j = 0; j < arr.length; j++ ) {
                count2++;
            }
            assertEquals(values[i] + "_new", arr[0]);
        }
    	
	}
}