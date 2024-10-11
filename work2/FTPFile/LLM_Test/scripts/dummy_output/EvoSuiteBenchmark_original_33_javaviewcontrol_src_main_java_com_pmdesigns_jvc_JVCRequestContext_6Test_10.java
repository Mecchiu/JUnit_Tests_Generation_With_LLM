// JVCRequestContext_6Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContext_6Test {
		
    // Test method 

    // Convenience method to get a full key/value pair from a path
    public String relPath(String path);
    // Convenience method to get a full key/value pair from a path,
    // but only for an absolute path.  Does not check for redirects.
    public String relPath(String path, boolean includeRemainder);
    // Generates a complete path
	public String absPath(String path);
	
    
    // Tests of path generation and retrieval

    /*
     * Verify path generation
     *
     * Test path generation for the current request
     * and that it works as expected when the path starts with the current request path
     */
    @Test
    public void testAbsPath_pathGen()
	 throws Exception{
        // First request
        HttpServletRequest servletRequest = new HttpServletRequest() {
            public String getRequestURI () {
                String path = getString("path");
                return absPath(path);
            };
        };
        JVCRequestContext ctx = new JVCRequestContext(servletRequest);
        String path = ctx.absPath("/");
        String relpath = path.substring(relPathLen_start);
        assertEquals("testAbsPath_pathGen_1",path);
        assertEquals("testAbsPath_pathGen_1",relpath);
        
        // Second request
        servletRequest = new HttpServletRequest() {
            public String getRequestURI () {
                String path = getString("path");
                return path.substring(0,path.indexOf("redirect", path.lastIndexOf("/")));
            }
        };
        ctx = new JVCRequestContext(servletRequest);
        path = ctx.absPath("/");
        relpath = path.substring(relPathLen_start);
        assertEquals("testAbsPath_pathGen_2",path);
        assertEquals("testAbsPath_pathGen_2",relpath);
        
    }
    
    /*
     * Verify path generation with includeRemainder
     */
    @Test
    public void testAbsPath_includeRemainder()
	 throws Exception{
        // First request
        HttpServletRequest servletRequest = new HttpServletRequest() {
            public String getRequestURI () {
                String path = getString("path");
                return absPath(path.substring(0,path.indexOf("redirect", path.lastIndexOf("/")+1)),true);
            };
            public Collection getPathParameters() {
                return null;
            };
        };
        JVCRequestContext ctx = new JVCRequestContext(servletRequest);
        String path = ctx.absPath("/");
        String relpath = path.substring(relPathLen_start);
        assertEquals("testAbsPath_includeRemainder_1",path);
        assertEquals("testAbsPath_includeRemainder_1",relpath);
    }

    /*
     * Verify path generation with excludeRemainder
     */
    @Test
    public void testAbsPath_excludeRemainder()
	 throws Exception{
        // First request
        HttpServletRequest servletRequest = new HttpServletRequest() {
            public String getRequestURI () {
                String path = getString("path");
                return absPath(path.substring(0,path.indexOf("redirect", path.lastIndexOf("/")+1)),false);
            };
            public Collection getPathParameters() {
                return null;
            };
        };
        JVCRequestContext ctx = new JVCRequestContext(servletRequest);
        String path = ctx.absPath("/");
        String relpath = path.substring(relPathLen_start);
        assertEquals("testAbsPath_excludeRemainder_1",path);
        assertEquals("testAbsPath_excludeRemainder_1",relpath);
    }
    
            
    // Convenience methods for obtaining parts of a URL that are relative
    //   e.g.: if the response URI has been redircted, remove the "/"
    //   e.g.: if the servlet path is "/", replace it with the value of "/"
   
    public String relPath(String path, boolean includeRemainder) {
        String relpath = path.substring(relPathLen_start);
        if (!(includeRemainder || relpath.startsWith("/") || relpath.endsWith("/"))) {
            return Paths.relPath(path);
        }

        String newPath = null;
        
        // Absolute Path
        newPath = Paths.absPath(path);
        if (relpath.startsWith("/") || newPath == null) {
            // Replace the path by a new value
            if (newPath == null) {
                return Paths.relPath(path);
            }
            return newPath;
        }
        // Relative Path
        return Paths.relPath(newPath);
    }

    public String absPath(String path, boolean includeRemainder) {
        // Convenience method to get the relative path, but still do an includeRemainder check
        return Paths.absPath(relPath(path, includeRemainder));
    }
    
    public String relPath(String path, String value, boolean includeRemainder) {
        // First arg is not a value, it is relative path
        return Paths.relPath(path, value, true);
    }
    
    public String absPath(String path, String value, boolean includeRemainder) {
        // First arg is a value, path starts with the current request path
        //   This way path generation can be done on the path, not on the URL
        return Paths.absPath(path, value, true);
    }
    
    
    // Convenience methods for getting parts of a path
    public String relPath(String path) {
        String result = relPath(path, false);
        if ((result == null) || (!result.startsWith("/"))) {
            return null;
        }
        // Remove "relpath" suffix if present
        String part = result.substring(relPathLen_start);
        return Paths.relPath(part);
    }

    public String absPath(String path) {
        // Convenience method to get the absolute path, but still
}
}