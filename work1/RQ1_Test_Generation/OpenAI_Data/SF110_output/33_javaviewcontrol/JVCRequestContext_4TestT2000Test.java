// JVCRequestContext_4Test.java
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
class JVCRequestContext_4Test {

		@Test
		void testGetSessionAttr() {
				// TODO: implement this test
		}
}

// JVCDispatcher.java
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
 * This class is the main entry point for the JVC framework.
 * It is a servlet which is configured in the web.xml file.
 * <p>
 * It is responsible for dispatching requests to the appropriate
 * controller and action.
 * <p>
 * It also provides a mechanism for caching page generator fragments.
 *
 * @author mike dooley
 */
public class JVCDispatcher extends HttpServlet {

    /**
     * The default controller to use if none is specified in the url
     */
    public static final String DEFAULT_CONTROLLER = "default";

    /**
     * The default action to use if none is specified in the url
     */
    public static final String DEFAULT_ACTION = "index";

    /**
     * The default view to use if none is specified in the controller
     */
    public static final String DEFAULT_VIEW = "index";

    /**
     * The default layout to use if none is specified in the controller
     */
    public static final String DEFAULT_LAYOUT = "default";

    /**
     * The default content type to use if none is specified in the controller
     */
    public static final String DEFAULT_CONTENT_TYPE = "text/html";

    /**
     * The default character encoding to use if none is specified in the controller
     */
    public static final String DEFAULT_CHARACTER_ENCODING = "UTF-8";

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_TIME = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_SIZE = 1000;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_AGE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_LIVE_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE_IDLE_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD_IDLE_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD_LIVE_IDLE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_DEAD_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE_DEAD_IDLE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD_IDLE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE_IDLE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_DEAD_LIVE_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE_DEAD_IDLE_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD_IDLE_LIVE_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD_LIVE_IDLE_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_LIVE_DEAD_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE_IDLE_DEAD_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_DEAD_LIVE_DEAD_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_LIVE_DEAD_IDLE_LIVE_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD_IDLE_LIVE_DEAD_LIVE = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_DEAD_LIVE_IDLE_LIVE_DEAD = 0;

    /**
     * The default cache time to use if none is specified in the controller
     */
    public static final int DEFAULT_CACHE_MAX_IDLE_LIVE_DEAD_LIVE_DEAD = 0;

    /**
     * The