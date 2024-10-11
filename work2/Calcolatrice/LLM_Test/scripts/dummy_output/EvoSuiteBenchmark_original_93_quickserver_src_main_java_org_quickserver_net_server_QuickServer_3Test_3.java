// QuickServer_3Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(Object[])} method.
*/
class QuickServer_3Test {
		public static String myServer = null;
		public static Object myObject = null;
		public static Object[] params = null;
		public static String url = null;
		public static String[] ports = {};
		public static String name = null;
		public static int port = 11131;
		public static QueueHandler queueHandler = null;
		public static ClientObjectFactory client_obj_fact = null;
		public static ClientBinaryHandler client_bin_h = null;
		public static ClientData client_data = null;
		public static ClientCmdHandler client_cmd_h = null;
		public static Formatter formatter = null;
		public static int timeout_millis = 99999;
		
		public static void main(String args[]) {
			System.out.println("Starting "+name);
//quickServer.initialize(null, null, null);
			System.setProperty("java.net.preferIPv6Addresses", "false");
			
			myServer = null;
			myObject = null;
			params = null;
			name = null;
			port = 0;
			timeout_millis = 99999;
			formatter = null;
			
			System.setProperty("java.opennlsas.loggerName", "quickserver.QuickServer");
			
// QuickServer.isAvailable() takes a long time & can not be in main() method.
// So we need to use a synchronized variable.
			synchronized(QuickServer_3Test.class) {
                StringBuffer sb = new StringBuffer("Starting ");
				sb.append(name)+" v";
				System.out.println(sb);
				Thread.currentThread().setDaemon(true);
				Thread t = new Thread(new QuickServer(sb.toString()));
				t.start();
				System.out.println("Quickserver ready.");
			}
		}
	}
//QuickServer