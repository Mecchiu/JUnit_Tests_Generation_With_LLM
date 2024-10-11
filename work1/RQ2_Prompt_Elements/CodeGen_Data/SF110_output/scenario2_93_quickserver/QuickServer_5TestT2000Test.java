// QuickServer_5Test.java
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
* It contains one unit test case for the {@link QuickServer#startService()} method.
*/
class QuickServer_5Test {
private ThreadLocal<Socket> socketL = null;
		private ThreadLocal<Socket> serverSocketL = null;
		private Thread testThreadL = null;
		private static Thread mainThreadL = null;
		private static String SERVERNAME = "EchoServer_5Test";
		private static String SERVERNAME2 = "EchoServer_5Test2";
		private static String SERVERNAME3 = "EchoServer_5Test3";
		private static String SERVERNAME4 = "EchoServer_5Test4";
		private static String SERVERNAME5 = "EchoServer_5Test5";
		private Map<String, String> poolMap = null;
		private Map<String, Map<String, String>> dataModeMap = null;
		private int poolSize = 5;
		private PoolableConnectionFactory factoryL = null;
		private Server serverL;
		private Socket s;
		private PrintStream p;
		private boolean initializedL = false;
        
		/**
		 * Initialization method of {@link QuickServer}
		 *
		 * @param host The host
		 * @param port The port
		 * @param protocol The protocol
		 */
		@Test
		public void initialization(String host, int port, String protocol) {
		    p = new PrintStream(new FileOutputStream("Echo_Server_init/EchoServer_5Test.sql"));
		}

	



        public void setUp() {
	    serverName = SERVERNAME;
	  init();
	}

	public void run() {
	    super.run();
	    try {
	      initialize();
	    } catch (Exception e) {
	      e.printStackTrace();
	      try {
	        serverL = new DefaultServer();
	      } catch (Exception ex) {
	        ex.printStackTrace();
		}
	    }
	    try {
	    mainThreadL = Thread.currentThread();
	    } catch (Exception e) {
	    }
	}


    /**
     * Close the server,