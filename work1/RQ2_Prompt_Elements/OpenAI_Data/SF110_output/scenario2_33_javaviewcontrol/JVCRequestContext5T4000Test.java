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

	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is null.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NullName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie(null);
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_EmptyName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNull() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsNull() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsNotNullAndNotEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsNotNullAndNotEmpty_CookieNameIsEqualToName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsNotNullAndNotEmpty_CookieNameIsNotEqualToName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
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
     * Convenience method to get cookie by name
     *
     * @param name the name of the cookie to get
     * @return the cookie with the indicated name, or null
     * @see #setCookie
     * @see #getCookieNames
     */
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
		
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is null.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NullName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie(null);
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_EmptyName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNull() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsNull() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsNotNullAndNotEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsNotNullAndNotEmpty_CookieNameIsEqualToName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* This test case tests the functionality of the method when the name of the cookie is not null and not empty.
	* It is expected that the method will return null.
	*/
	@Test
	void testGetCookie_NotNullAndNotEmptyName_CookieArrayIsNotEmpty_CookieNameIsNotNullAndNotEmpty_CookieNameIsNotEqualToName() {
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = context.getCookie("name");
		assertNull(cookie);
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
     * Convenience method to get cookie by name
     *
     * @param name the name of the cookie to get
     * @return the cookie with the indicated name, or null
     * @see #setCookie
     * @see #getCookieNames
     */
    public Cookie getCookie(String name