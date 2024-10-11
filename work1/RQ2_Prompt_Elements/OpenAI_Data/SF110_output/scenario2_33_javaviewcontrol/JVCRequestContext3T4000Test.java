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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is null.
	*/
	@Test
	public void testGetAttribute_Null() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute(null));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is empty.
	*/
	@Test
	public void testGetAttribute_Empty() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute(""));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not empty.
	*/
	@Test
	public void testGetAttribute_NotEmpty() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
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
     * @param name which attribute to get
     * @return the attribute value or null if there is no attribute corresponding to the indicated key.
     * If the attribute corresponds to a file upload field then the return value will be a byte array
     */
    public Object getAttribute(String name) {
        return request.getAttribute(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is null.
	*/
	@Test
	public void testGetAttribute_Null() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute(null));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is empty.
	*/
	@Test
	public void testGetAttribute_Empty() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute(""));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not empty.
	*/
	@Test
	public void testGetAttribute_NotEmpty() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
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
     * @param name which attribute to get
     * @return the attribute value or null if there is no attribute corresponding to the indicated key.
     * If the attribute corresponds to a file upload field then the return value will be a byte array
     */
    public Object getAttribute(String name) {
        return request.getAttribute(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is null.
	*/
	@Test
	public void testGetAttribute_Null() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute(null));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is empty.
	*/
	@Test
	public void testGetAttribute_Empty() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute(""));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not empty.
	*/
	@Test
	public void testGetAttribute_NotEmpty() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.get