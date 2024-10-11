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

    /*
     * Test to ensure javax.servlet.ServletRequest's set* methods
     * work with JPCM/ServletRequest objects.  We need the getParams method
     * to work with JPCM/ServletRequest objects, so we just do its setParams
     * method here.
     */ 
    void testSetParams(ServletRequest sc) {
        String[] values = JPCMRequestContext.getParamValues(
                "httpMethod");
        JPCMRequestContext.setParams(sc, values, values.length);
        values = JPCMRequestContext.getParamValues(
                "httpVerb");
        assertEquals(new String[] {"PUT", "DELETE", "GET", "HEAD", "POST", "PATCH", "OPTIONS", "TRACE" },
                            values);

        values = JPCMRequestContext.getParamValues("httpVerb");
        assertEquals(new String[] {"PUT", "DELETE", "GET", "HEAD", "POST", "PATCH", "OPTIONS", "TRACE" },
                             values);
    }

    /*
     * Test to ensure javax.servlet.ServletRequest's set* methods
     * work with JPCM/ServletRequest objects.  We need the getParam values
     * method to work with JPCM/ServletRequest objects, so we just do its setParams
     * method here.
     */
    void testSetRequestParams(ServletRequest sc) {
        String[] values = JPCMRequestContext.getParamValues("httpMethod");
        JPCMRequestContext.setRequestParams(sc, values, values.length);
        values = JPCMRequestContext.getParamValues("httpVerb");
        JPCMRequestContext.setRequestParams(sc, values, values, values.length);
        values = JPCMRequestContext.getParamValues("httpVerb");
        assertEquals(new String[] {"POST", "DELETE", "GET", "PUT", "HEAD", "OPTIONS", "PATCH", "TRACE"},
                        values);

        values = JPCMRequestContext.getParamValues("httpVerb");
        JPCMRequestContext.setRequestParams(sc, values, values.length);
        assertEquals(new String[] {"POST", "DELETE", "GET", "PUT", "HEAD", "OPTIONS", "PATCH"}, values);
    }

    void checkHttpHeaders(String[] values) {
        // the following headers were added as headers from the
        // servlet so we just compare them here
        
        checkHttpHeader(values, "Content-Disposition");
        checkHttpHeader(values, "Content-Disposition");
        
        // this may not be a good idea, so only test it if the headers
        // are present and the values are the same: 
        Object[] other = new Object[2];
        for (int i = 0; i < other.length; i++) {
            try {
                HttpServletRequest r = (HttpServletRequest)request;
                other[i] = r.getHeader("Content-Disposition");
                if(other[i] == null)
                    other[i] =  r.getHeader("Content-Disposition");
            } catch (Exception e) {}
            if(other[i]==null) {
                if(i==0)
                    fail("could not read out content disposition");
                else
                    System.out.println("expecting not a value");
            }
        }
        
    }
    
	void checkHttpHeader(String[] values, String headerKey) {
		if(values.length!= 0) {
    		// first element is a regular or absolute value
    		JPCMRequestContext.checkHttpHeader(values, "HTTP/"+headerKey+": "+(String[])values[0]);

    		// now try with a null first element as an alternative:
    		if (values[0] instanceof String) {
	    		JPCMRequestContext.checkHttpHeader(values, "HTTP/"+headerKey+": "+(String[])values[0].toString());
	    	}
		}
	}
	
    private void checkHttpHeader(String[] values, String key) {
        if(values.length > 1) {
        	JPCMRequestContext.checkHttpHeader(values, "HTTP/"+key+": "+(String[]) values[0]);
        	JPCMRequestContext.checkHttpHeader(values, "HTTP/"+key+": "+(String[]) values[1]);
        }
    }

    public void testGetFlash(ServletResponse sc) throws IOException {
        String url = "http://www.google.com/";
        String contentDisposition = "attachment; filename=google.txt";
        String flash = new String();
        byte[] bytes;
        
        String[] values = JPCMRequestContext.getParamValues("getFlash");
        
        String[] expected = {null, null, null, null, null, null, null};

        System.out.println("url" + url);
        
        for (int i = 0; i < expected.length; i++) {
            if (values[i]!= expected[i]) {
                System.out.println(values[i]+"!= expected "+expected[i]);
                fail("wrong flash contents");
            }
        }
        
        bytes = new ByteArrayOutputStream();
        JPCMRequestContext.setCache(true);
        JPCMRequestContext.setCaching(false);

        // JPCMRequestContext.getParamValues() returns the values in the format
        // {values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7]},
        // so these values needs to matched the above array
        values = JPCMRequestContext.getParamValues("getFlash");
        int index = 0;
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i]!= expected[index]) {
                System.out.println(
                        "values[i]=  " + values[i] + "!= expected (" + expected[index] + ")");
                fail("wrong flash contents");
            }
            index++;
            total++;
        }
        assertEquals(contentDisposition, values[0]);
        assertEquals(getRequest.getParameterValuesAsString(), values[1]);
        assertEquals(getRequest.getParameterValuesAsString(), values[2