// QuickServer_0Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersion()} method.
*/
class QuickServer_0Test {
		
    public final static boolean isEnabled = true;
	public final static boolean enabled = initServer();
	public final static boolean start= true;
	public final static boolean shutdown= true;
	public final static boolean getVersion= true;
	public static final Formatter LOGGER_PRINT =  new Formatter(new PrintStream(new OutputStreamWriter(System.err),"UTF-8"));
	public static final String LOG_LEVEL= "DEBUG";
	public static final boolean LOG_DEBUG= true;
	public static final boolean LOG_WARN= false;
	//public QuickServer_0Test():
//v1.2
	public QuickServer_0Test() throws IOException {
		super();
		if (!isEnabled) {
			throw new UnsupportedOperationException("QuickServer is started");
		}
		//v1.2
		SocketFactory socketFactory = getSocketFactory();
		//ServerSocket ss = ServerSocketFactory.getDefault().createServerSocket(9999, 0);
		ServerSocket ss = ServerSocketFactory.getDefault().createServerSocket(9999);
		ss.setReuseAddress(true);
		String host = "127.0.0.1";
		int port = 9999;
		InetAddress bind = null;
}
}