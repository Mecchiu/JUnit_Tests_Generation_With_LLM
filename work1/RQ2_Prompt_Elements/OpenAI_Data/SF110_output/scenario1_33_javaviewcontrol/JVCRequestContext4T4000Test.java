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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a null session.
	*/
	@Test
	void testGetSessionAttrWithNullSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return null;
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertNull(context.getSessionAttr("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a valid session.
	*/
	@Test
	void testGetSessionAttrWithValidSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return new HttpSession() {
					public Object getAttribute(String name) {
						return "test";
					}
				};
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertEquals("test", context.getSessionAttr("test"));
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

    public Object getSessionAttr(String name) {
        if (request.getSession() == null)
            return null;
        return request.getSession().getAttribute(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a null session.
	*/
	@Test
	void testGetSessionAttrWithNullSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return null;
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertNull(context.getSessionAttr("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a valid session.
	*/
	@Test
	void testGetSessionAttrWithValidSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return new HttpSession() {
					public Object getAttribute(String name) {
						return "test";
					}
				};
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertEquals("test", context.getSessionAttr("test"));
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

    public Object getSessionAttr(String name) {
        if (request.getSession() == null)
            return null;
        return request.getSession().getAttribute(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a null session.
	*/
	@Test
	void testGetSessionAttrWithNullSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return null;
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertNull(context.getSessionAttr("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a valid session.
	*/
	@Test
	void testGetSessionAttrWithValidSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return new HttpSession() {
					public Object getAttribute(String name) {
						return "test";
					}
				};
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertEquals("test", context.getSessionAttr("test"));
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

    public Object getSessionAttr(String name) {
        if (request.getSession() == null)
            return null;
        return request.getSession().getAttribute(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a null session.
	*/
	@Test
	void testGetSessionAttrWithNullSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return null;
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertNull(context.getSessionAttr("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a valid session.
	*/
	@Test
	void testGetSessionAttrWithValidSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return new HttpSession() {
					public Object getAttribute(String name) {
						return "test";
					}
				};
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertEquals("test", context.getSessionAttr("test"));
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

    public Object getSessionAttr(String name) {
        if (request.getSession() == null)
            return null;
        return request.getSession().getAttribute(name);
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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a null session.
	*/
	@Test
	void testGetSessionAttrWithNullSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return null;
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertNull(context.getSessionAttr("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* This test case tests the method with a valid session.
	*/
	@Test
	void testGetSessionAttrWithValidSession() {
		HttpServletRequest request = new HttpServletRequest() {
			public HttpSession getSession() {
				return new HttpSession() {
					public Object getAttribute(String name) {
						return "test";
					}
				};
			}
		};
		JVCRequestContext context = new JVCRequestContext();
		context.request = request;
		assertEquals("test", context.getSessionAttr("test"));
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
 * key/value strings.  The scope of