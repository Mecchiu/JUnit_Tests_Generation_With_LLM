// JVCRequestContext_7Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {
		
    private final JVCRequestContext context;
    
    private final HttpServletRequest request;
    
    private final HttpServletResponse response;
    
    /**
     * Creates a test object for the given context and input.
     * <p>
     * The first case, the request is stored in the context, and the input
     * in the request parameters
     * <p>
     * The second case, the input stream is stored in the request, and the
     * response is stored in the response object. 
     * <p>
     * Once the contexts are stored, a temporary map is stored as the context.
     * <p>
     * The third case, the output stream is stored as the response's header,
     * and the output object is stored in the output stream; note we store
     * the output in a temp file first, and the object is also stored in a final file.
     * This can be important since the servlet will automatically download the temp file or the object.
     * <p>
     * The rest of the cases are intended to test for the various functionality.
     *
     * @param i1 a first case in the test cases
     * @param i2 a second case in the test cases
     * @param i3 a third case in the test cases.  Should it be one of the 3 cases?
     * @param o1 an output object for the first test case or null if no output object.
     * @param o2 an output object for the second test case or null if no output object.
     * @param o3 an output object for the third case. Should it be one of the 3 cases?
     */
}