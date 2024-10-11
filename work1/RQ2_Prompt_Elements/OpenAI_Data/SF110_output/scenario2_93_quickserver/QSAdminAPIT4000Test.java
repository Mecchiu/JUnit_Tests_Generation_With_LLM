// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {

	/**
	* Test case for {@link QSAdminAPI#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
		assertTrue(qsAdminApi.logon());
		qsAdminApi.logoff();
	}
}

// QSAdminServer.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServer is a simple server that can be used to control a QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServer qsAdminServer = new QSAdminServer();
 * 	qsAdminServer.setPort(9080);
 * 	qsAdminServer.setQSAdminHandler(new QSAdminHandler());
 * 	qsAdminServer.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminHandler
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class QSAdminServer {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// QSAdminServerTest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminServer}.
* It contains ten unit test cases for the {@link QSAdminServer#logon()} method.
*/
class QSAdminServerTest {
		
	/**
	* Test case for {@link QSAdminServer#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		QSAdminServer qsAdminServer = new QSAdminServer();
		qsAdminServer.setPort(9080);
		qsAdminServer.setQSAdminHandler(new QSAdminHandler());
		qsAdminServer.startServer();
		assertTrue(qsAdminServer.logon());
		qsAdminServer.logoff();
	}
}

// QSAdminServerHandler.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServerHandler is a simple server that can be used to control a QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServerHandler qsAdminServerHandler = new QSAdminServerHandler();
 * 	qsAdminServerHandler.setPort(9080);
 * 	qsAdminServerHandler.setQSAdminHandler(new QSAdminHandler());
 * 	qsAdminServerHandler.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminHandler
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class QSAdminServerHandler {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// QSAdminServerHandlerTest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminServerHandler}.
* It contains ten unit test cases for the {@link QSAdminServerHandler#logon()} method.
*/
class QSAdminServerHandlerTest {
		
	/**
	* Test case for {@link QSAdminServerHandler#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		QSAdminServerHandler qsAdminServerHandler = new QSAdminServerHandler();
		qsAdminServerHandler.setPort(9080);
		qsAdminServerHandler.setQSAdminHandler(new QSAdminHandler());
		qsAdminServerHandler.startServer();
		assertTrue(qsAdminServerHandler.logon());
		qsAdminServerHandler.logoff();
	}
}

// QSAdminServerHandler2.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServerHandler2 is a simple server that can be used to control a QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServerHandler2 qsAdminServerHandler2 = new QSAdminServerHandler2();
 * 	qsAdminServerHandler2.setPort(9080);
 * 	qsAdminServerHandler2.setQSAdminHandler(new QSAdminHandler());
 * 	qsAdminServerHandler2.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminHandler
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class QSAdminServerHandler2 {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// QSAdminServerHandler2Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminServerHandler2}.
* It contains ten unit test cases for the {@link QSAdminServerHandler2#logon()} method.
*/
class QSAdminServerHandler2Test {
		
	/**
	* Test case for {@link QSAdminServerHandler2#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		QSAdminServerHandler2 qsAdminServerHandler2 = new QSAdminServerHandler2();
		qsAdminServerHandler2.setPort(9080);
		qsAdminServerHandler2.setQSAdminHandler(new QSAdminHandler());
		qsAdminServerHandler2.startServer();
		assertTrue(qsAdminServerHandler2.logon());
		qsAdminServerHandler2.logoff();
	}
}

// QSAdminServerHandler3.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServerHandler3 is a simple server that can be used to control a QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServerHandler3 qsAdminServerHandler3 = new QSAdminServerHandler3();
 * 	qsAdminServerHandler3.setPort(9080);
 * 	qsAdminServerHandler3.setQSAdminHandler(new QSAdminHandler());
 * 	qsAdminServerHandler3.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminHandler
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class QSAdminServerHandler3 {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// QSAdminServerHandler3Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminServerHandler3}.
* It contains ten unit test cases for the {@link QSAdminServerHandler3#logon()} method.
*/
class QSAdminServerHandler3Test {
		
	/**
	* Test case for {@link QSAdminServerHandler3#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		QSAdminServerHandler3 qsAdminServerHandler3 = new QSAdminServerHandler3();
		qsAdminServerHandler3.setPort(9080);
		qsAdminServerHandler3.setQSAdminHandler(new QSAdminHandler());
		qsAdminServerHandler3.startServer();
		assertTrue(qsAdminServerHandler3.logon());
		qsAdminServerHandler3.logoff();
	}
}

// QSAdminServerHandler4.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServerHandler4 is a simple server that can be used to control a QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServerHandler4 qsAdminServerHandler4 = new QSAdminServerHandler4();
 * 	qsAdminServerHandler4.setPort(9080);
 * 	qsAdminServerHandler4.setQSAdminHandler(new QSAdminHandler());
 * 	qsAdminServerHandler4.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminHandler
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class QSAdminServerHandler4 {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// QSAdminServerHandler4Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminServerHandler4}.
* It contains ten unit test cases for the {@link QSAdminServerHandler4#logon()} method.
*/
class QSAdminServerHandler4Test {
		
	/**
	* Test case for {@link QSAdminServerHandler4#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		QSAdminServerHandler4 qsAdminServerHandler4 = new QSAdminServerHandler4();
		qsAdminServerHandler4.setPort(9080);
		qsAdminServerHandler4.setQSAdminHandler(new QSAdminHandler());
		qsAdminServerHandler4.startServer();
		assertTrue(qsAdminServerHandler4.logon());
		qsAdminServerHandler4.logoff();
	}
}

// QSAdminServerHandler5.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServerHandler5 is a simple server that can be used to control a QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServerHandler5 qsAdminServerHandler5 = new QSAdminServerHandler5();
 * 	qsAdminServerHandler5.setPort(9080);
 * 	qsAdminServerHandler5.setQSAdminHandler(new QSAdminHandler());
 * 	qsAdminServerHandler5.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminHandler
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class QSAdminServerHandler5 {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// QSAdminServerHandler5Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminServerHandler5}.
* It contains ten unit test cases for the {@link QSAdminServerHandler5#logon()} method.
*/
class QSAdminServerHandler5Test {
		
	/**
	* Test case for {@link QSAdminServerHandler5#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		QSAdminServerHandler5 qsAdminServerHandler5 = new QSAdminServerHandler5();
		qsAdminServerHandler5.setPort(9080);
		qsAdminServerHandler5.setQSAdminHandler(new QSAdminHandler());
		qsAdminServerHandler5.startServer();
		assertTrue(qsAdminServerHandler5.logon());
		qsAdminServerHandler5.logoff();
	}
}

// QSAdminServerHandler6.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServerHandler6 is a simple server that can be used to control a QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServerHandler6 qsAdminServerHandler6 = new QSAdminServerHandler6();
 * 	qsAdminServerHandler6.setPort(9080);
 * 	qsAdminServerHandler6.setQSAdminHandler(new QSAdminHandler());
 * 	qsAdminServerHandler6.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminHandler
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class QSAdminServerHandler6 {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// QSAdminServerHandler6Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminServerHandler6}.
* It contains ten unit test cases for the {@link QSAdminServerHandler6#logon()} method.
*/
class QSAdminServerHandler6Test {
		
	/**
	* Test case for {@link QSAdminServerHandler6#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		QSAdminServerHandler6