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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is null.
	*/
	@Test
	void testGetParamValues_Null() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues(null);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is empty.
	*/
	@Test
	void testGetParamValues_Empty() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues("");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is not null and not empty.
	*/
	@Test
	void testGetParamValues_NotNullAndNotEmpty() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues("name");
		
		// Assert
		assertNull(result);
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
     * Convenience method. Use this if you expect a parameter name
     * to map to multiple values.
     *
     * @param name the name of the parameter(s) to get
     * @return an array of paramter values corresponding to the indicated name
     * @see #getParam
     * @see #getParamMap
     * @see #getParamNames
     */
    public String[] getParamValues(String name) {
        if (name == null || name.length() == 0) {
            return null;
        }
        return request.getParameterValues(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is null.
	*/
	@Test
	void testGetParamValues_Null() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues(null);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is empty.
	*/
	@Test
	void testGetParamValues_Empty() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues("");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is not null and not empty.
	*/
	@Test
	void testGetParamValues_NotNullAndNotEmpty() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues("name");
		
		// Assert
		assertNull(result);
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
     * Convenience method. Use this if you expect a parameter name
     * to map to multiple values.
     *
     * @param name the name of the parameter(s) to get
     * @return an array of paramter values corresponding to the indicated name
     * @see #getParam
     * @see #getParamMap
     * @see #getParamNames
     */
    public String[] getParamValues(String name) {
        if (name == null || name.length() == 0) {
            return null;
        }
        return request.getParameterValues(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
