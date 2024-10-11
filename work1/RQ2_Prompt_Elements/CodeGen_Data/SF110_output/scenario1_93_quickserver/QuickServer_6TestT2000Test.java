// QuickServer_6Test.java
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
* It contains one unit test case for the {@link QuickServer#stopService()} method.
*/
class QuickServer_6Test {
private final static String USER_DATA_PASS = "quickserver.data.password";
		private final static String USER_DATA_RSAKEY = "quickserver.data.rsakey";
		private final static String USER_DATA_RSAKEYPASSWORD = "quickserver.data.rsakecryption.password";
		private final static String USER_DATA_USERNAME = "quickserver.data.username";
		private final static String USER_DATA_HOST = "quickserver.data.server.ip";
		private final static String USER_DATA_PORT = "quickserver.data.server.port";
		private final static String USER_DATA_SOCKET = "quickserver.data.client.socket";
		private final static String USER_DATA_PASSWORD = "quickserver.data.password";
		private final static String USER_PATH = "quickserver.user.dir";
		private final static String USER_DATA_SECURITY_PASSWORD = "quickserver.data.security.password";
		private final static String QUICKSERVER_HOST = "quickserver.server.ip";
		private final static String QUICKSERVER_PORT = "quickserver.server.port";

	
	private Queue client;
   private ClientPool  clientPool;        // singleton
   /**
     * If true, we call stopServer() which is done in a separate thread
     */
   private volatile boolean stopServer = false;
   /**
     * ClientHandler object that is used for client interaction and
     * binary data
     */
   private ClientHandler clientHandler = null;
   /**
     * If true, this thread can create connections that are NOT shared
     */
   private volatile boolean useSharedAddresses = true;
   private final static int MAX_CONNECTIONS = 3;

   public QuickServer_6Test() throws AppException {
     // clear the pools

     clearAllPools();
    
    clearClientPool();

   }

   private void clearAllPools() throws AppException {
   	clientPool = null;
		//clearClient