// JVCRequestContext_1Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {
		
    /** The current request. */
    HttpServletRequest context;
    
    /** A reference to a reference to the servlet request. */
    HttpServletRequest request;

    /** A reference to the servlet response that this context will use. */
    HttpServletResponse response;

    /** Maps key/value pairs returned by {@link ServletFileUpload#parseRequest(File)}
     where <key> is a String, <value> a String
     of key/value pairs</. */
    private Map<String, String> uploadParamsFromServletReq;

    /** Maps key/value pairs returned by {@link ServletFileUpload#parseRequest(File)}
     with the prefix set for the key.  The Map is then used to gather all key/values. */
    private Map<String, String> uploadParamsFromFileUpload;

    /** Maps key/value pairs returned by {@link ServletFileUpload#parseRequest(File)}
     where <key> is a String that is already lower-cased.  The Map is in the scope
     of the request.</p> */
    private Collection<? extends Map.Entry> uploadParams;

    /**
     * Constructs a JVC request context.
     *
     * @param context the current request.  This parameter is used by the servlet request.
     * @param request the current servlet request.  This parameter is used by the servlet response.
     * @param response the current servlet response.  This parameter is used by the servlet request.
     */
    public JVCRequestContext_1Test(HttpServletRequest context, HttpServletResponse response, HttpServletRequest request, HttpServletResponse response) {
        this.context = context;
        this.request = request;
        this.response = response;
    }

}