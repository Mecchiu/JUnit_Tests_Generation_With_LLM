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
 * QSAdminServer is a simple server that can be used to control QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServer qsAdminServer = new QSAdminServer();
 * 	qsAdminServer.setPort(9080);
 * 	qsAdminServer.setBindAddr("127.0.0.1");
 * 	qsAdminServer.setAuthenticationHandler(new SimpleAuthenticationHandler());
 * 	qsAdminServer.setCommandHandler(new SimpleCommandHandler());
 * 	qsAdminServer.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminAPI
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
		qsAdminServer.setBindAddr("127.0.0.1");
		qsAdminServer.setAuthenticationHandler(new SimpleAuthenticationHandler());
		qsAdminServer.setCommandHandler(new SimpleCommandHandler());
		qsAdminServer.startServer();
		assertTrue(qsAdminServer.logon());
		qsAdminServer.logoff();
	}
}

// SimpleAuthenticationHandler.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * SimpleAuthenticationHandler is a simple implementation of
 * AuthenticationHandler.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServer qsAdminServer = new QSAdminServer();
 * 	qsAdminServer.setPort(9080);
 * 	qsAdminServer.setBindAddr("127.0.0.1");
 * 	qsAdminServer.setAuthenticationHandler(new SimpleAuthenticationHandler());
 * 	qsAdminServer.setCommandHandler(new SimpleCommandHandler());
 * 	qsAdminServer.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminServer
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class SimpleAuthenticationHandler implements AuthenticationHandler {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// SimpleAuthenticationHandlerTest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleAuthenticationHandler}.
* It contains ten unit test cases for the {@link SimpleAuthenticationHandler#logon()} method.
*/
class SimpleAuthenticationHandlerTest {
		
	/**
	* Test case for {@link SimpleAuthenticationHandler#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		SimpleAuthenticationHandler simpleAuthenticationHandler = new SimpleAuthenticationHandler();
		assertTrue(simpleAuthenticationHandler.logon());
	}
}

// SimpleCommandHandler.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * SimpleCommandHandler is a simple implementation of CommandHandler.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServer qsAdminServer = new QSAdminServer();
 * 	qsAdminServer.setPort(9080);
 * 	qsAdminServer.setBindAddr("127.0.0.1");
 * 	qsAdminServer.setAuthenticationHandler(new SimpleAuthenticationHandler());
 * 	qsAdminServer.setCommandHandler(new SimpleCommandHandler());
 * 	qsAdminServer.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminServer
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class SimpleCommandHandler implements CommandHandler {

    /**
     * Will attempt to connect and logon to the remote QsAdminServer.
     */
    public boolean logon() throws IOException {
        return logon(username, password);
    }
}

// SimpleCommandHandlerTest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCommandHandler}.
* It contains ten unit test cases for the {@link SimpleCommandHandler#logon()} method.
*/
class SimpleCommandHandlerTest {
		
	/**
	* Test case for {@link SimpleCommandHandler#logon()} method.
	* It tests the method with valid username and password.
	*/
	@Test
	public void testLogon() throws IOException {
		SimpleCommandHandler simpleCommandHandler = new SimpleCommandHandler();
		assertTrue(simpleCommandHandler.logon());
	}
}

// QSAdminServer.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 * QSAdminServer is a simple server that can be used to control QuickServer.
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * 	QSAdminServer qsAdminServer = new QSAdminServer();
 * 	qsAdminServer.setPort(9080);
 * 	qsAdminServer.setBindAddr("127.0.0.1");
 * 	qsAdminServer.setAuthenticationHandler(new SimpleAuthenticationHandler());
 * 	qsAdminServer.setCommandHandler(new SimpleCommandHandler());
 * 	qsAdminServer.startServer();
 * </pre></BLOCKQUOTE></code></p>
 *
 * @see QSAdminAPI
 * @since 1.4
 * @author Akshathkumar Shetty
 */
public class QSAdminServer {

    /**
     * Will attempt to connect and log