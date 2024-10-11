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

    /**
     * Convenience method to prepend the context path onto a servlet path
     *
     * @param path a servlet path
     * @return the context path plus the indicated path
     */
    public String absPath(String path) {
        return getContextPath() + (path.startsWith("/")? path : "/" + path);
    }
}

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
		
	@Test
	public void testAbsPath() throws Exception {
		
		HttpServletRequest request = new MockServletHttpServletRequest(new HttpServletRequestImpl());
		HttpServletResponse response = new MockServletHttpServletResponse();
		int code = HttpServletResponse.SC_MOVED_PERMANENTLY;
		HttpURLConnection connection = createHTULConnection(request, response, code);
		assertEquals(200, connection.getResponseCode());
		HttpURLConnection downloadConnection = createDownloadConnection(connection);
		assertNotNull(downloadConnection);
		assertEquals("/download.txt", downloadConnection.getHeaderField("Location"));
	}
	
	@Test
	public void makeFakeURLConnectionWithQueryString() throws Exception { 
            HttpURLConnection originalConnection = HttpURLConnection.createURLConnection(URL);
            originalConnection.connect();
            assertEquals(200, originalConnection.getResponseCode());
    }
    
	/**
	* Convenience Method to initialize the JVCRequestContext given a servlet request, a
	* servlet response and an int. 
	*
	* @param request the servlet request object
	* @param response the servlet response object
	* @param code the request's status code
	*/
	public void initContext(ServletRequest request, ServletResponse response, int code) throws Exception {
		JVCRequestContext context = 
            new JVCRequestContext(request, response, new MockServer());
        assertNotNull(context);
        context.setResponseCode(code);
	}
	
    public static HttpURLConnection createHTULConnection(HttpServletRequest request,
    		HttpServletResponse response, int code) throws IOException {

        String queryString = request.getQueryString();
        if (queryString == null) {
            Collection<String> values = 
                Arrays.asList(new String[]{"GET", "GET", "POST", "PATCH"});
            Streams.filter(queryString, values).forEach(String s -> {
                int p = s.indexOf('?');
                if (p == -1) {
                    return;
                }
                String key = s.substring(0, p);
                String value = s.substring(p + 1).trim();
                int i = (value.startsWith("$")? value.indexOf('$') :  value.length());
                StringBuilder builder = new StringBuilder(value.substring(0,i));
                if (key.indexOf('$') > 0) {
                    builder.append(value.substring(i+1));
                    value = value.substring(i+1);
                    i += 1;
                }
                String keyValue = builder.toString();
                String key = (keyValue.indexOf(";") > 0)? keyValue.substring(0, keyValue.indexOf(";")).trim() : keyValue;
                response.setHeader(key, value);
            });
        }
    		return request.getRequestURL().openConnection(response);
    }
    
    public static HttpURLConnection createDownloadConnection(HttpURLConnection original) throws Exception {
        StringBuilder urlBuilder = new StringBuilder(JVCRequestContext.absPath(original.getURL().toURI().getPath()));
        int p = urlBuilder.indexOf('?');
        if (p > 0) {
            urlBuilder.delete(p, p+1);
        } else {
            urlBuilder.insert(0, "?");
        }
        urlBuilder.append(original.getRequestMethod()).append(": ").append(original.getResponseCode());
        BufferedImage bufferedImage = new BufferedImage(original.getContentLength(), original.getContentType().getType(), original.getContentType().getClass().getClassLoader());
        OutputStream outputStream = bufferedImage.getOutputStream();
        Streams.copy(original.getInputStream(), outputStream);
        outputStream.close();
        return original;
    }
    
}
