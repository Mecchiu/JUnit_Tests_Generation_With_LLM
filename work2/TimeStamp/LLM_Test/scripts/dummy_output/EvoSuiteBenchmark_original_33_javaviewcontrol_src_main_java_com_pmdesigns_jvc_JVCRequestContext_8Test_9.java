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
		
//---------------------------------------------------------------
    static {
        System.setProperty("java.awt.headless", "true");
    }
//-----------------------------------------------------
///
// A utility method to retrieve the context parameter for the default port
    static Integer getContextPort(ServletRequest request) {
        String parm = (String) request.getAttribute("javax.servlet.request.dispatcher_path");
        if (parm == null) { parm = request.getContextPath(); }
        return new Integer(parm.hashCode());
    }
//---------------------------------------------------------------

    /**
     * Convenience method to make a link tag from a string reference
     *
     * @param anchor the text in an anchor link
     * @param path the anchor target, if the path starts with a '/' character then
     * its assumed that this is an absolute link and the context path will be prepended to it
     * @param contents the string to be incorporated into the anchor tag
     * @param options extra html options to add to the anchor tag
     * @return a tag string containing the string and the contents
     * @see #makeLink
     */
    public static final String makeLink(String anchor, String path, String contents) {
        return ("<a href=\"" + makeLink2(makeLink(anchor, path, null), path, contents) + "\" target=\"" + getContextPort(null) + "\">" + contents + "</a>");
    }

    /**
     * Convenience method to make a link tag from two string references
     *
     * @param text1 the first string
     * @param text2 the second string
     * @param contents the string to be incorporated into the anchor tag
     * @param options extra html options to add to the anchor tag
     * @return a tag string containing both strings and the contents
     */
    public static final String makeLink(String text1, String text2, String contents) {
        return ("<a href=\"" + makeLink2(null, null, makeLink(text1, text2, contents)) + "\" target=\"" + getContextPort(null) + "\">" + contents + "</a>");
    }

    /**
     * Convenience method to make a link tag
     *
     * @param anchor the text in an anchor link
     * @param a target url if this is an absolute link or a relative target for
     *        the context path.
     *        
     * @param options extra html options to add to the anchor tag
     * @return a tag string containing the string and the contents
     */
    public static String makeLink2(String anchor, String a, String contents) {
        return ("<a href=\"" + makeLink2(makeLink(anchor, a), a, contents) + "\" target=\"" + getContextPort(null) + "\">" + contents + "</a>");
    }

    /**
     * @return path attribute
     */
    public static String getPathAttribute(ServletRequest request) {
        return (String) request.getAttribute("javax.servlet.context.pathInfo");
    }

//---------------------------------------------------------------

    /**
     * a utility method to remove redundant parameters from the url string
     *
     * @param hrefStr the url string
     * @return a parameter string containing a redundant parameter
     */
    static String removeRedundantParams(String hrefStr) {
        // clean up all parameters so that they are not duplicates
        hrefStr = hrefStr.trim();
        String path = hrefStr.substring(hrefStr.indexOf(HttpServletRequest.SCRIPT_NAME) + HttpServletRequest.SCRIPT_NAME.length());
        String paramStr = hrefStr.substring(path.length() + 1);
        return (paramStr);
    }

//---------------------------------------------------------------

    /**
     * Convenience method to make a simple http request
     *
     * @param text the text to send
     * @param port the default port on which the servlet is running
     * @return a simple http request
     * @see #makeLink
     * @see #makeLink(int, int, String)
     * @see #makeLink(String, String, String)
     */
    public static HttpServletRequest makeHttpRequest(String text, int port) throws Exception {
        return (new JVCRequest(text, new HttpServletRequest() {
            public String getParameter(String arg0) { return removeRedundantParams(arg0); }
            public String getParameter(String arg0, int arg1) { return removeRedundantParams(arg0); }
            public Enumeration getParameterNames() { return null; }
            public String getParameterNames() { return "" + (char)0; } // return null if called in null case
            public String getParameterValues(String arg0) { return null; }
            public Enumeration getParameterValues(String arg0) { return null; }
            public URL getURL() throws MalformedURLException { return null; }

            private void setParameter(String arg0, String arg1) {
                try {
                    String value = arg1.trim();
                    if (value.indexOf(":") > 0) { // check that value is not empty
                        value = value.substring(value.indexOf(":") + 1); // remove the leading colon
                    }
                    setParameter(arg0, value);
                } catch (java.lang.IndexOutOfBoundsException e) { }
            }
        }));
    }
//---------------------------------------------------------------

    /**
     * A utility method to execute a HttpRequest object.
     *
     * @param request the HttpServletRequest object to be used to make
     * the actual call
     * @return the HttpRequest object
     * @throws IOException
     */
    public static HttpServletRequest getHttpServletRequest(ServletRequest request) throws IOException {
}
}