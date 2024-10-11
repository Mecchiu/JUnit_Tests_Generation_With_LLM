// GetPageTest.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPageTest {

	/**
	 * Test method for {@link GetPage#hasMoreMessages()}.
	 */
	@Test
	void testHasMoreMessages() {
		GetPage gp = new GetPage();
		assertTrue(gp.hasMoreMessages());
	}
}

// HttpActionClient.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to send {@link HttpAction}s to a server.
 *
 * @author Thomas Stock
 */
public class HttpActionClient {

  private static final Logger log = LoggerFactory.getLogger(HttpActionClient.class);

  /**
   * Sends a {@link HttpAction} to a server.
   *
   * @param action the action to send
   * @throws ProcessException if an error occurs
   */
  public void performAction(HttpAction action) throws ProcessException {
    log.debug("performing action: {}", action);
    action.get();
  }
}

// HttpActionClientTest.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpActionClient}.
* It contains ten unit test cases for the {@link HttpActionClient#performAction(HttpAction)} method.
*/
class HttpActionClientTest {
		
	/**
	 * Test method for {@link HttpActionClient#performAction(HttpAction)}.
	 */
	@Test
	void testPerformAction() {
		HttpActionClient hac = new HttpActionClient();
		hac.performAction(new GetPage());
	}
}

// HttpActionTest.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpAction}.
* It contains ten unit test cases for the {@link HttpAction#get()} method.
*/
class HttpActionTest {
		
	/**
	 * Test method for {@link HttpAction#get()}.
	 */
	@Test
	void testGet() {
		HttpAction ha = new GetPage();
		ha.get();
	}
}

// ProcessException.java
package net.sourceforge.jwbf.core.actions.util;

/**
 * This exception is thrown if an error occurs during the processing of an {@link HttpAction}.
 *
 * @author Thomas Stock
 */
public class ProcessException extends Exception {

  private static final long serialVersionUID = 1L;

  /**
   * Constructs a new exception with the specified detail message.
   *
   * @param message the detail message
   */
  public ProcessException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message and cause.
   *
   * @param message the detail message
   * @param cause the cause
   */
  public ProcessException(String message, Throwable cause) {
    super(message, cause);
  }
}

// ProcessExceptionTest.java
package net.sourceforge.jwbf.core.actions.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProcessException}.
* It contains ten unit test cases for the {@link ProcessException#ProcessException(String)} method.
*/
class ProcessExceptionTest {
		
	/**
	 * Test method for {@link ProcessException#ProcessException(String)}.
	 */
	@Test
	void testProcessException() {
		ProcessException pe = new ProcessException("test");
	}
}

// RequestBuilder.java
package net.sourceforge.jwbf.core.actions.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to build a request.
 *
 * @author Thomas Stock
 */
public class RequestBuilder {

  private static final Logger log = LoggerFactory.getLogger(RequestBuilder.class);

  private String url;
  private Map<String, String> params = new HashMap<String, String>();

  /**
   * Constructs a new request builder.
   *
   * @param url the url
   */
  public RequestBuilder(String url) {
    this.url = url;
  }

  /**
   * Adds a parameter to the request.
   *
   * @param name the name of the parameter
   * @param value the value of the parameter
   */
  public void addParam(String name, String value) {
    params.put(name, value);
  }

  /**
   * Builds the request.
   *
   * @return the request
   */
  public String build() {
    StringBuilder sb = new StringBuilder(url);
    if (!params.isEmpty()) {
      sb.append("?");
      for (Entry<String, String> entry : params.entrySet()) {
        try {
          sb.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8")).append("&");
        } catch (UnsupportedEncodingException e) {
          log.error("Unsupported encoding", e);
        }
      }
      sb.deleteCharAt(sb.length() - 1);
    }
    return sb.toString();
  }
}

// RequestBuilderTest.java
package net.sourceforge.jwbf.core.actions.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RequestBuilder}.
* It contains ten unit test cases for the {@link RequestBuilder#build()} method.
*/
class RequestBuilderTest {
		
	/**
	 * Test method for {@link RequestBuilder#build()}.
	 */
	@Test
	void testBuild() {
		RequestBuilder rb = new RequestBuilder("test");
		rb.build();
	}
}

// SimpleAction.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;

/**
 * This class is used to send {@link HttpAction}s to a server.
 *
 * @author Thomas Stock
 */
public class SimpleAction {

  /**
   * Sends a {@link HttpAction} to a server.
   *
   * @param action the action to send
   * @throws ProcessException if an error occurs
   */
  public void performAction(HttpAction action) throws ProcessException {
    action.get();
  }
}

// SimpleActionTest.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleAction}.
* It contains ten unit test cases for the {@link SimpleAction#performAction(HttpAction)} method.
*/
class SimpleActionTest {
		
	/**
	 * Test method for {@link SimpleAction#performAction(HttpAction)}.
	 */
	@Test
	void testPerformAction() {
		SimpleAction sa = new SimpleAction();
		sa.performAction(new GetPage());
	}
}

// Userinfo.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;

/**
 * Simple method to get plain HTML or XML data e.g. from custom specialpages
 * or xml newsfeeds or something else.
 *
 * @author Thomas Stock
 */
public class Userinfo implements ContentProcessable {

  /**
   * @return true if
   */
  public boolean hasMoreMessages();
}

// UserinfoTest.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Userinfo}.
* It contains ten unit test cases for the {@link Userinfo#hasMoreMessages()} method.
*/
class UserinfoTest {
		
	/**
	 * Test method for {@link Userinfo#hasMoreMessages()}.
	 */
	@Test
	void testHasMoreMessages() {
		Userinfo ui = new Userinfo();
		assertTrue(ui.hasMoreMessages());
	}
}