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
* It contains ten unit test cases for the {@link QuickServer#initService(QuickServerConfig)} method.
*/
class QuickServerTest {

	@Test
	void testInitService() {
		QuickServer quickServer = new QuickServer();
		QuickServerConfig quickServerConfig = new QuickServerConfig();
		quickServerConfig.setPort(4123);
		quickServerConfig.setName("Echo Server v1.0");
		quickServerConfig.setClientCommandHandler("echoserver.EchoCommandHandler");
		assertTrue(quickServer.initService(quickServerConfig));
	}
}

// QuickServerConfig.java
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

/**
 * This class is used to configure QuickServer.
 * <p>
 * This class is used to configure QuickServer.
 * </p>
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * package echoserver;
 *
 * import org.quickserver.net.*;
 * import org.quickserver.net.server.*;
 *
 * import java.io.*;
 *
 * public class EchoServer {
 * 	public static void main(String args[])	{
 * 		String cmdHandle = "echoserver.EchoCommandHandler";
 *
 * 		QuickServer myServer = new QuickServer();
 * 		myServer.setClientCommandHandler(cmdHandle);
 * 		myServer.setPort(4123);
 * 		myServer.setName(Echo Server v1.0");
 * 		try {
 * 			myServer.startServer();
 * 		} catch(AppException e) {
 * 			System.err.println("Error in server : "+e);
 * 			e.printStackTrace();
 * 		}
 * 	}
 * }
 * </pre></BLOCKQUOTE></code></p>
 *
 * @version 1.4.8
 * @author Akshathkumar Shetty
 */
public class QuickServerConfig implements Serializable {

    public synchronized boolean initService(QuickServerConfig qsConfig) {
        serviceError = null;
        try {
            initServer(qsConfig);
        } catch (Exception e) {
            serviceError = e;
            return false;
        }
        return true;
    }
}

// QuickServerConfigTest.java
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
* Test class of {@link QuickServerConfig}.
* It contains ten unit test cases for the {@link QuickServerConfig#initService(QuickServerConfig)} method.
*/
class QuickServerConfigTest {
		
	@Test
	void testInitService() {
		QuickServerConfig quickServerConfig = new QuickServerConfig();
		quickServerConfig.setPort(4123);
		quickServerConfig.setName("Echo Server v1.0");
		quickServerConfig.setClientCommandHandler("echoserver.EchoCommandHandler");
		assertTrue(quickServerConfig.initService(quickServerConfig));
	}
}

// QuickServerConfigDefaults.java
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

/**
 * This class is used to configure QuickServer.
 * <p>
 * This class is used to configure QuickServer.
 * </p>
 * <p>
 *  Eg:
 * <code><BLOCKQUOTE><pre>
 * package echoserver;
 *
 * import org.quickserver.net.*;
 * import org.quickserver.net.server.*;
 *
 * import java.io.*;
 *
 * public class EchoServer {
 * 	public static void main(String args[])	{
 * 		String cmdHandle = "echoserver.EchoCommandHandler";
 *
 * 		QuickServer myServer = new QuickServer();
 * 		myServer.setClientCommandHandler(cmdHandle);
 * 		myServer.setPort(4123);
 * 		myServer.setName(Echo Server v1.0");
 * 		try {
 * 			myServer.startServer();
 * 		} catch(AppException e) {
 * 			System.err.println("Error in server : "+e);
 * 			e.printStackTrace();
 * 		}
 * 	}
 * }
 * </pre></BLOCKQUOTE></code></p>
 *
 * @version 1.4.8
 * @author Akshathkumar Shetty
 */
public class QuickServerConfigDefaults implements Serializable {

    public synchronized boolean initService(QuickServerConfig qsConfig) {
        serviceError = null;
        try {
            initServer(qs