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
	* It tests the method with a valid parameter name.
	*/
	@Test
	void testGetParamValuesWithValidParamName() {
		String[] expected = {"value1", "value2"};
		String[] actual = JVCRequestContext.getParamValues("paramName");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a null parameter name.
	*/
	@Test
	void testGetParamValuesWithNullParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues(null);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with an empty parameter name.
	*/
	@Test
	void testGetParamValuesWithEmptyParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that does not exist.
	*/
	@Test
	void testGetParamValuesWithNonExistingParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("nonExistingParamName");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has a null value.
	*/
	@Test
	void testGetParamValuesWithParamNameWithNullValue() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("paramNameWithNullValue");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has an empty value.
	*/
	@Test
	void testGetParamValuesWithParamNameWithEmptyValue() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("paramNameWithEmptyValue");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has a single value.
	*/
	@Test
	void testGetParamValuesWithParamNameWithSingleValue() {
		String[] expected = {"value1"};
		String[] actual = JVCRequestContext.getParamValues("paramNameWithSingleValue");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has multiple values.
	*/
	@Test
	void testGetParamValuesWithParamNameWithMultipleValues() {
		String[] expected = {"value1", "value2"};
		String[] actual = JVCRequestContext.getParamValues("paramNameWithMultipleValues");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has multiple values,
	* where one of the values is null.
	*/
	@Test
	void testGetParamValuesWithParamNameWithMultipleValuesOneNull() {
		String[] expected = {"value1", null};
		String[] actual = JVCRequestContext.getParamValues("paramNameWithMultipleValuesOneNull");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has multiple values,
	* where one of the values is empty.
	*/
	@Test
	void testGetParamValuesWithParamNameWithMultipleValuesOneEmpty() {
		String[] expected = {"value1", ""};
		String[] actual = JVCRequestContext.getParamValues("paramNameWithMultipleValuesOneEmpty");
		assertArrayEquals(expected, actual);
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
	* It tests the method with a valid parameter name.
	*/
	@Test
	void testGetParamValuesWithValidParamName() {
		String[] expected = {"value1", "value2"};
		String[] actual = JVCRequestContext.getParamValues("paramName");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a null parameter name.
	*/
	@Test
	void testGetParamValuesWithNullParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues(null);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with an empty parameter name.
	*/
	@Test
	void testGetParamValuesWithEmptyParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that does not exist.
	*/
	@Test
	void testGetParamValuesWithNonExistingParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("nonExistingParamName");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has a null value.
	*/
	@Test
	void testGetParamValuesWithParamNameWithNullValue() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("paramNameWithNullValue");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has an empty value.
	*/
	@Test
	void testGetParamValuesWithParamNameWithEmptyValue() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("paramNameWithEmptyValue");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has a single value.
	*/
	@Test
	void testGetParamValuesWithParamNameWithSingleValue() {
		String[] expected = {"value1"};
		String[] actual = JVCRequestContext.getParamValues("paramNameWithSingleValue");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has multiple values.
	*/
	@Test
	void testGetParamValuesWithParamNameWithMultipleValues() {
		String[] expected = {"value1", "value2"};
		String[] actual = JVCRequestContext.getParamValues("paramNameWithMultipleValues");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has multiple values,
	* where one of the values is null.
	*/
	@Test
	void testGetParamValuesWithParamNameWithMultipleValuesOneNull() {
		String[] expected = {"value1", null};
		String[] actual = JVCRequestContext.getParamValues("paramNameWithMultipleValuesOneNull");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has multiple values,
	* where one of the values is empty.
	*/
	@Test
	void testGetParamValuesWithParamNameWithMultipleValuesOneEmpty() {
		String[] expected = {"value1", ""};
		String[] actual = JVCRequestContext.getParamValues("paramNameWithMultipleValuesOneEmpty");
		assertArrayEquals(expected, actual);
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
	* It tests the method with a valid parameter name.
	*/
	@Test
	void testGetParamValuesWithValidParamName() {
		String[] expected = {"value1", "value2"};
		String[] actual = JVCRequestContext.getParamValues("paramName");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a null parameter name.
	*/
	@Test
	void testGetParamValuesWithNullParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues(null);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with an empty parameter name.
	*/
	@Test
	void testGetParamValuesWithEmptyParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that does not exist.
	*/
	@Test
	void testGetParamValuesWithNonExistingParamName() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("nonExistingParamName");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the method with a parameter name that has a null value.
	*/
	@Test
	void testGetParamValuesWithParamNameWithNullValue() {
		String[] expected = null;
		String[] actual = JVCRequestContext.getParamValues("paramNameWithNullValue");
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case