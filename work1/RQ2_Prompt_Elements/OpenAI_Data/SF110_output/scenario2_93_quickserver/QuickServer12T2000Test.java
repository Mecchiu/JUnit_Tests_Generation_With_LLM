// QuickServerTest.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains ten unit test cases for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServerTest {

	@Test
	void testGetSSLSocketFactory() throws IOException, NoSuchAlgorithmException, KeyManagementException {
		QuickServer myServer = new QuickServer();
		myServer.setClientCommandHandler("echoserver.EchoCommandHandler");
		myServer.setPort(4123);
		myServer.setName("Echo Server v1.0");
		try {
			myServer.startServer();
		} catch(AppException e) {
			System.err.println("Error in server : "+e);
			e.printStackTrace();
		}
		SSLSocketFactory sslSocketFactory = myServer.getSSLSocketFactory("TLSv1.2");
		assertNotNull(sslSocketFactory);
	}
}

// EchoCommandHandler.java
package echoserver;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import java.io.*;

public class EchoCommandHandler implements ClientCommandHandler {
	public void gotConnected(ClientHandler handler)
		throws SocketTimeoutException, IOException {
		handler.sendClientMsg("Welcome to Echo Server v1.0");
	}

	public void lostConnection(ClientHandler handler)
		throws IOException {
		handler.sendSystemMsg("Bye!");
	}

	public void closingConnection(ClientHandler handler)
		throws IOException {
		handler.sendSystemMsg("Closing connection..");
	}

	public void handleCommand(ClientHandler handler, String command)
		throws SocketTimeoutException, IOException {
		handler.sendClientMsg(command);
	}
}

// ClientHandler.java
package org.quickserver.net.server;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import org.quickserver.net.*;
import org.quickserver.net.qsadmin.*;
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
import org.quickserver.util.logging.*;
import org.quickserver.util.*;
import org.quickserver.security.*;
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;

/**
 * This class is used to handle a client.
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.
 * </p>
 * <p>
 * This class is used to handle a client. It is run using any thread
 * available from the pool of threads maintained by
 * {@link org.quickserver.util.pool.thread.ClientPool}, which handles the
 * client.