// QuickServer_12Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServer_12Test {
		
    /**
     * This class contains methods to test connection creation,
     * server initialization, server shutdown and client command dispatching
     * via the clients.
     *
     * @since 1.4.0
     */
    static class ClientTest extends Thread {
        
		/**
		 * This is a dummy server implementation class.
		 * It provides all implementations as client interfaces.
		 *
		 * @since 1.4.0
		 */

	    /**
	     * Constructs the dummy server and initiates the test clients.
	     *
	     * @since 1.4.0
	     */
	    public ClientTest() {
			String className = "org.quickserver.impl.factory.ClientFactory";
			String packageName = "org.quickserver.impl.FactoryAPI";
			setName(className);
			setDaemon(true);
			setPriority(0);
			setTestOnBorrow(true);
			setStartTimeout(30);
			try {
				ClassLoader classLoader = getClass().getClassLoader();
				int timeInterval = (int) (System.currentTimeMillis()/100);
				Class<? extends Server> serverClass = classLoader.loadClass(className).asSubclass(Server.class);
				Server server = serverClass.getConstructor().newInstance();
				server.initialize(null);
				server.start();
				System.err.println("Wait time: " + timeInterval);
			} catch( Exception e ) {
				e.printStackTrace();
				System.err.println("Failed to initialize the class: org.quickserver.impl.FactoryAPI: "+e.getMessage());
				System.exit(-1);
			}
		}
		
}
}