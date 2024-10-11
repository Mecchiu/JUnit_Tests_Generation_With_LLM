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
* It contains ten unit test cases for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is null.
	*/
	@Test
	void testAbsPathNull() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("/", context.absPath(null));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is empty.
	*/
	@Test
	void testAbsPathEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("/", context.absPath(""));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a single slash.
	*/
	@Test
	void testAbsPathSingleSlash() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("/", context.absPath("/"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a double slash.
	*/
	@Test
	void testAbsPathDoubleSlash() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("//", context.absPath("//"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a triple slash.
	*/
	@Test
	void testAbsPathTripleSlash() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("///", context.absPath("///"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a single slash followed by a word.
	*/
	@Test
	void testAbsPathSingleSlashWord() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("/word", context.absPath("/word"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a double slash followed by a word.
	*/
	@Test
	void testAbsPathDoubleSlashWord() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("//word", context.absPath("//word"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a triple slash followed by a word.
	*/
	@Test
	void testAbsPathTripleSlashWord() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("///word", context.absPath("///word"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a single slash followed by a word followed by a slash.
	*/
	@Test
	void testAbsPathSingleSlashWordSlash() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("/word/", context.absPath("/word/"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a double slash followed by a word followed by a slash.
	*/
	@Test
	void testAbsPathDoubleSlashWordSlash() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("//word/", context.absPath("//word/"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a triple slash followed by a word followed by a slash.
	*/
	@Test
	void testAbsPathTripleSlashWordSlash() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("///word/", context.absPath("///word/"));
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

    /**
     * Convenience method to prepend the context path onto a servlet path
     *
     * @param path a servlet path
     * @return the context path plus the indicated path
     */
    public String absPath(String path) {
        if (path == null) {
            return "/";
        }
        if (path.startsWith("/")) {
            return path;
        }
        return "/" + path;
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
* It contains ten unit test cases for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is null.
	*/
	@Test
	void testAbsPathNull() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("/", context.absPath(null));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is empty.
	*/
	@Test
	void testAbsPathEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("/", context.absPath(""));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a single slash.
	*/
	@Test
	void testAbsPathSingleSlash() {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals("/", context.absPath("/"));
	}
	
	/**
	* Test case for the {@link JVCRequestContext#absPath(String)} method.
	* It tests the case where the path is a double slash.
	*/
	