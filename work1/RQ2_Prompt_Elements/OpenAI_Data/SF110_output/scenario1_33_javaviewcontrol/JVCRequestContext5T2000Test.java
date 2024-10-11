// JVCRequestContextTest.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContextTest {

	@Test
	void testGetCookie() {
		// Test case 1
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		Cookie cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 2
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 3
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 4
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 5
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 6
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 7
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 8
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 9
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 10
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
	}
}

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

    public Cookie getCookie(String name) {
        if (name == null)
            return null;
        Cookie[] cookies = request.getCookies();
        if (cookies == null)
            return null;
        for (Cookie c : cookies) {
            if (name.equals(c.getName()))
                return c;
        }
        return null;
    }
}

// JVCRequestContextTest.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContextTest {
		
	@Test
	void testGetCookie() {
		// Test case 1
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		Cookie cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 2
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 3
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 4
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 5
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 6
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 7
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 8
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
		
		// Test case 9
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie("name");
		assertEquals(null, cookie);
		
		// Test case 10
		jvcRequestContext = new JVCRequestContext();
		cookie = jvcRequestContext.getCookie(null);
		assertEquals(null, cookie);
	}
}

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

    public Cookie getCookie(String name) {
        if (name == null)
            return null;
        Cookie[] cookies = request.getCookies();
        if (cookies == null)
            return null;
        for (Cookie c : cookies) {
            if (name.equals(c.getName()))
                return c;
        }
        return null;
    }
}

// JVCRequestContextTest.java
package com.pmdesigns.jvc;