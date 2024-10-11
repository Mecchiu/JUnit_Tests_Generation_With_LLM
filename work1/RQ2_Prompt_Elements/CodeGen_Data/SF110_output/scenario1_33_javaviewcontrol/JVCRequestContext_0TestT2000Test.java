// JVCRequestContext_0Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {
// JVCRequestContext.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * This class contains state information for processing an http request.
 * It wraps the standard HttpServletRequest, HttpServletResponse and HttpServlet
 * objects and provides convenience methods for accessing them.
 * <p>
 * It also provides access to the 'flash' which is a Map for storing temporary
 * key/value strings.  The scope of the flash is the current request or
 * the following request in the case of a redirect response.
 * <p>
 * It also contains some convenience methods for forming links and absolute paths.
 *
 * @author mike dooley
 */
public final class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o!= null && o instanceof String)? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }
}

// JVCRequestContext_0Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {
		
    private final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat( "MMMddyyyy");
    
    private final Map flash = new HashMap();
    private SimpleDateFormat DEFAULT_FLASH_FORMAT = getDefaultFlashFormat();

    private HttpURLConnection conn;
    private BasicHttpEntity entity;

    private void testRequestContext(String formFieldName) throws Exception {
        request.setCharacterEncoding("UTF-8");
        conn.setConnectTimeout(30000);
        conn.setReadTimeout(30000);

        addPostHeaderElement();
        HttpGet get =
                new HttpGet( JVCRequest.getUri(request) + "?" + formFieldName );

        HttpResponse resp = conn.getResponse();

        InputStream instream = null;
        
        if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            if (conn.getContentEncoding() == null) {
                instream =
                        resp.getEntity().getContent();
            }
        }

        if ( conn.getContentEncoding()!= null ) setEncoding(conn.getContentEncoding());
        else conn.getInputStream().reset();

        if (instream == null) {
            fail("Failed to obtain stream.");
        }

        String mime = resp.getEntity().getContentType().getValue();
        String contentType = resp.getEntity().getContentEncoding().getValue();

        if (mime == null) mime = "text/plain";

        System.out.println("Received content type : "+ contentType);
        System.out.println("Received mime type : "+ mime);

        if (resp.getContentLength() < 200) {
            fail("Failed to parse request.");
        }

        if (contentType.equals("application/octet-stream")) {
            byte[] content = new byte[resp.getContentLength()];
            resp.getEntity().getContent().read(content, 0, content.length);
        } else if (instream.available() > 0) {
            byte[] content = Streams.toByteArray(instream);

            // This will throw an exception if the inputstream is null, when no
            // upload is started.
            instream.reset();

            if (instream.available() > 0) {
                byte[] content2 = new byte[resp.getContentLength()];
                resp.getEntity().getContent().read(content2);
                String flashStr = new String(content2);
                Iterator iter = flash.entrySet().iterator();
                while(iter.hasNext()) {
                    Map.Entry entry = (Map.Entry)iter.next();
                    entry.setValue(entry.getKey() + " " + flashStr);
                }
            }
        }

        if (request.getAttribute("RequestCtx") == null) {
            request.setAttribute("RequestCtx", createUricRequest(req));
        }
        else request.setAttribute("RequestCtx",
                ((javax.servlet.http.HttpServletRequest)request).
                getAttribute("RequestCtx"), ALIAS);

        req.setAttribute("JVCRequestContext", this);

        EntityUtils.consume(resp.getEntity());

        if (conn == null) {
            fail("conn is null");
        }

        setEncoding(conn.getContentEncoding());
    }

    private String createUricRequest(HttpServletRequest request) {
        StringBuffer requeststr=new StringBuffer();
        String method = "GET";

        if (request.getQueryString()!= null &&!request.getQueryString().equals("")) {
            method = "POST";
            if (request.getQueryString().equals("POST")) {
                method = "PUT";
            }
        }

        if (!req.isSecure()) {
            requeststr.append(method+" ");
        }
        
        requeststr.append("url=\"");
        if (request.getScheme().equalsIgnoreCase(java.net.URL.HTTP)) {
            requeststr.append(HTTP_METHOD_GET);
        } else if (request.getScheme().equalsIgnoreCase(java.net.URL.HTTPS)) {
            requeststr.append(HTTP_METHOD_POST);
        } else if (request.getScheme().equals(java.net.URL.HTTP_POST)) {
            if (request.getQueryString() == null)
                requeststr.append(HTTP_METHOD_POST_NO_QUERY);
            else
                requeststr.append(request.getQueryString());
        } else if (request.getScheme().equals(java.net.URL.HTTPS_POST)) {
            if (request.getQueryString() == null)
                requeststr.append(HTTP_METHOD_POST_NO_QUERY);
            else
                requeststr.append(request.getQueryString());
        } else {
            throw new IllegalStateException("Invalid scheme: " +
                    request.getScheme() );
        }

        requeststr.append("\"");

        requeststr.append(" " +
                method + " " +
                request.getProtocol() + " " +
                request.getServerName() + " " +
                request.getServerPort() + " " +
                request.getContextPath() + " " +
                request.getServletPath());

        if (!isSecure(request)) {
            requeststr.append("?secure");
        }

        requeststr.append("=" + request.getQueryString());

        return removeTrailingWhitespace(requeststr.toString());
    }

    private void setEncoding(String contentEncoding) {
        if (contentEncoding!=null &&!contentEncoding.equals("")) {
            conn.setContentType(contentEncoding);
        } else {
            conn.setRequestProperty("Accept-Encoding", "gzip");
        }
    }

    private void addPostHeaderElement() throws UnsupportedEncodingException {
        addElement("Content-Type",     DEFAULT_FLASH_FORMAT + ";charset=UTF-8");
        
        if (request.getParameter("J