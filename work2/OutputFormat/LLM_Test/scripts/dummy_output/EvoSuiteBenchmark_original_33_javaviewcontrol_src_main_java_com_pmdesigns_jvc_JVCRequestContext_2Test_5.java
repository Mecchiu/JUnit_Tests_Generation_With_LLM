
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
class JVCRequestContext_2Test {
    static HttpServletRequest testRequest;
    static HttpServletResponse testResponse;
    static URL testURLBase;
    static File testFile;
    public JVCRequestContext_2Test() {
    }
    @Test
    public void test_withParam() throws Exception {
        final HttpServletRequest request = new HttpServletRequest() {
            private static final long serialVersionUID = -Long.parseLong("7661823116468005960");
            @SuppressWarnings("rawtypes")
            @Override
            public Enumeration getParameterNames() throws ServletException {
                return null;
            }
            @SuppressWarnings("rawtypes")
            @Override
            public Enumeration getParameterValues(String name) throws ServletException {
                return null;
            }
        };
}
}