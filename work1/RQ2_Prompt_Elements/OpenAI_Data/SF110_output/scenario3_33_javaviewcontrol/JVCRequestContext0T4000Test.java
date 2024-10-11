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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is not present in the request.
	*/
	@Test
	void testGetParam_NotPresent() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request.
	*/
	@Test
	void testGetParam_Present() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
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
     * Convenience method
     *
     * @param name which parameter to get
     * @return the parameter value or null if there is no parameter corresponding to the indicated key
     * or BINARY_VALUE if this is a multipart request and there is binary data for the indicate key,
     * which can be retrieved as a byte array via the getAttribute method.
     * @see #getParamMap
     * @see #getParamValues
     * @see #getParamNames
     */
    public String getParam(String name) {
        if (name == null) {
            return null;
        }
        if (isMultipart) {
            if (multipartParams.containsKey(name)) {
                return BINARY_VALUE;
            }
        }
        return request.getParameter(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is not present in the request.
	*/
	@Test
	void testGetParam_NotPresent() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request.
	*/
	@Test
	void testGetParam_Present() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
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
     * Convenience method
     *
     * @param name which parameter to get
     * @return the parameter value or null if there is no parameter corresponding to the indicated key
     * or BINARY_VALUE if this is a multipart request and there is binary data for the indicate key,
     * which can be retrieved as a byte array via the getAttribute method.
     * @see #getParamMap
     * @see #getParamValues
     * @see #getParamNames
     */
    public String getParam(String name) {
        if (name == null) {
            return null;
        }
        if (isMultipart) {
            if (multipartParams.containsKey(name)) {
                return BINARY_VALUE;
            }
        }
        return request.getParameter(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is not present in the request.
	*/
	@Test
	void testGetParam_NotPresent() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request.
	*/
	@Test
	void testGetParam_Present() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
	}
	
	/**
	* Test case for the {@link JVCRequestContext#getParam(String)} method.
	* It tests the case when the parameter is present in the request and has a value.
	*/
	@Test
	void testGetParam_PresentWithValue() {
		// TODO: implement this test case
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
     * Convenience method
     *
     * @param name which parameter to get
     * @return the parameter value or null if there is no