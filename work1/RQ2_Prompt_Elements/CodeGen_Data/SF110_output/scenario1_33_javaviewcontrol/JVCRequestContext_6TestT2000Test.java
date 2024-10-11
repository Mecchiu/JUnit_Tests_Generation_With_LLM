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
		
	public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String DELETE = "DELETE";
    public static final String GET = "GET";
    
	public static final List<String> DEFAULTS   = Arrays.asList("/index.jsp", "/index.xml", "/index.js", "/index.html");
	public static final List<String> DEFAULTS_A = Arrays.asList("/home.jsp", "/home.xml", "/home.js", "/home.html");
	
	private Map<String,String> DEFAULTS_m = new HashMap<String,String>();
	
	public static final List<String> GET_REL_m       = Arrays.asList("GET", "POST", "PUT", "DELETE", "GET", "HEAD");
	
	private Map<String,String> GET_REL_m_A = new HashMap<String,String>();
	
	private Map<String,String> POST_REL_m_A = new HashMap<String,String>();
	
    public Map<String,String> getDefaults() {
		return DEFAULTS_m;
    }
	
	public Map<String,String> getDefaults_A() {
		return DEFAULTS_m_A;
    }
	
	private Map<String,String> GET_REL_m_A_a = new HashMap<String,String>();
	
	public Map<String,String> getRelPost_RelA_m_A() {
		return GET_REL_m_A_a;
    }
	
	public Map<String,String> getRelPost_RelA_m() {
		return POST_REL_m_A;
    }
	
		
	@Test
	public void POST_GET() throws Exception {
		// test POST relative to index.jsp.
		String relativePath = "/";
		getRelPost_RelA_m().put(POST, relativePath);
		assertEquals(relativePath, JVCRequestContext.absPath(relativePath));
		assertTrue(request.containsFieldInContext("request.relativeUrl"));
		assertTrue(request.containsFieldInContext("relativeUrl"));
		
		
		// test POST relative to /index.jsp
		relativePath = POST;
		getRelPost_RelA_m().put(POST, relativePath);
		assertEquals(relativePath, JVCRequestContext.absPath(relativePath));
		assertTrue(request.containsFieldInContext("request.relativeUrl"));
		
		
		// test GET relative to /index.html
		getRelPost_RelA_m_A.put(GET, GET);
		assertEquals(GET, JVCRequestContext.absPath(GET));
		assertTrue(request.containsFieldInContext("request.relativeUrl"));
		assertTrue(request.containsFieldInContext("relativeUrl"));
		
		
		getRelPost_RelA_m_A.put(DELETE, POST.replaceAll("/", GET.replaceAll("/", ".")+"/"+GET));;
		assertEquals(POST.replaceAll("/index.html","index.js"), JVCRequestContext.absPath(POST.replaceAll("/", GET.replaceAll("/", ".")+"/"+GET)));
		assertTrue(request.containsFieldInContext("request.relativeUrl"));
		assertTrue(request.containsFieldInContext("relativeUrl"));
		
        getRelPost_RelA_m_A.put(GET, POST);
		assertEquals(POST.replaceAll("/index.html","index.js"), JVCRequestContext.absPath(POST.replaceAll("/", GET.replaceAll("/", "."))+"/"+GET));
        assertTrue(request.containsFieldInContext("request.relativeUrl"));
        assertTrue(request.containsFieldInContext("relativeUrl"));
        
        // test GET relative to /index.js
        getRelPost_RelA_m_A.clear();
        getRelPost_RelA_m_A.put(GET, POST);
        getRelPost_RelA.clear();
        getRelPost_RelA.put(GET, POST);
        assertEquals(POST.replaceAll("/", GET.replaceAll("/", ".")+"/"+GET), JVCRequestContext.absPath(POST.replaceAll("/", GET.replaceAll("/", ".")+"/"+GET)));
        assertTrue(request.containsFieldInContext("request.relativeUrl"));
        assertTrue(request.containsFieldInContext("relativeUrl"));
        
        
		// test GET relative to /index.jsp
		getRelPost_RelA_m_A.clear();
		getRelPost_RelA_m_A.put(POST, POST);
		getRelPost_RelA_m.clear();
        getRelPost_RelA.put(POST, POST);
		assertEquals(POST.replaceAll("/index.jsp","index.js"), JVCRequestContext.absPath(POST.replaceAll("/", GET.replaceAll("/", ".")+"/"+POST)));
        assertTrue(request.containsFieldInContext("request.relativeUrl"));
        assertTrue(request.containsFieldInContext("relativeUrl"));
        
		
		// test DELETE /index.jsp
		int offset = GET.replaceAll("/index.jsp","").length();
		getRelPost_RelA_m_A.clear();
		getRelPost_RelA_m.clear();
        getRelPost_RelA.clear();
		getRelPost_RelA.put(POST, POST.replaceAll("/index.jsp", "/index.html"));
		getRelPost_RelA.put(GET, POST.replaceAll("/index.html", GET));
        assertEquals(POST.replaceAll("/index.html", GET), JVCRequestContext.absPath(POST.replaceAll("/index.html", GET)));
        assertTrue(request.containsFieldInContext("request.relativeUrl"));
        assertTrue(request.containsFieldInContext("relativeUrl"));
        
        
	}

}
