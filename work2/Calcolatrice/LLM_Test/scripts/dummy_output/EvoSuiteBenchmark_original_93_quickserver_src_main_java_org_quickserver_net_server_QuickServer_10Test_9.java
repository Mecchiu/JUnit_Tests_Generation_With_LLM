// QuickServer_10Test.java
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
* It contains one unit test case for the {@link QuickServer#findAllClient()} method.
*/
class QuickServer_10Test {
		/**
		 * Returns an iterator containing all the
		 * {@link ClientHandler} that
		 * are currently handling clients.
		 *
		 * @since 1.3.1
		 */
		public Iterator findAllClient();
}

/*
 * This is to test ClassLoader.loadClass()
 *
 */

class LoadClass2 {
    private static final Logger myLogger = Logger.getLogger(QuickServer_10Test.class.getName());
	private static final boolean DEBUG = myLogger.isLoggable(Level.FINE);

public static void main(String args[]) throws Exception {
     List<String> args0 = new ArrayList<String>();
     String host0 = "127.0.0.1";
     int port0 = 4122;
}
}