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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case where the path is an absolute path.
	*/
	@Test
	void testMakeLinkAbsolutePath() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "/path";
		String options = "options";
		String expected = "<a href='" + path + "' " + options + ">" + anchor + "</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
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

    public String makeLink(String anchor, String path, String options) {
        if (path.startsWith("/"))
            path = absPath(path);
        return "<a href='" + path + "' " + options + ">" + anchor + "</a>";
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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case where the path is an absolute path.
	*/
	@Test
	void testMakeLinkAbsolutePath() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "/path";
		String options = "options";
		String expected = "<a href='" + path + "' " + options + ">" + anchor + "</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
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

    public String makeLink(String anchor, String path, String options) {
        if (path.startsWith("/"))
            path = absPath(path);
        return "<a href='" + path + "' " + options + ">" + anchor + "</a>";
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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case where the path is an absolute path.
	*/
	@Test
	void testMakeLinkAbsolutePath() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "/path";
		String options = "options";
		String expected = "<a href='" + path + "' " + options + ">" + anchor + "</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
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

    public String makeLink(String anchor, String path, String options) {
        if (path.startsWith("/"))
            path = absPath(path);
        return "<a href='" + path + "' " + options + ">" + anchor + "</a>";
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
import org.apache.commons.