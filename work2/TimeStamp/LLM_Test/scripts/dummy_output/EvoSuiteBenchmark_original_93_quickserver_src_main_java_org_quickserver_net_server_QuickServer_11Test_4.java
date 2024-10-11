// QuickServer_11Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_11Test {
		private static String[] protocolNames;
	private static Class[] clientCommandHandlers;
	private static Class[] clientCommandHandler;
	private static String port;
//	private static Object myConnection;
	private static Object myConnection;
	private static Object myConnection;
	private static URL url;
	private static URL url1;
	private static boolean blockingServer;
	private static Object conn;

	/**
	 * Starts the QuickServer.
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 */

	public static void main(String args[]) throws IOException, NoSuchAlgorithmException, KeyManagementException {
		if(args.length > 0)
			port = args[0];
		if(args.length > 1)
			blockingServer = true;
		blockingServer = blockingServer;
		loadServerSSLContext("TLSv11,SUN+");

		url = new URL("http://localhost:" + port + "/");
		url1 = new URL("https://localhost:" + port + "/");
		URL url2 = new URL("http://localhost:" + port + "/");
		List<URL> urls = new ArrayList<URL>();
		urls.add(url);
		urls.add(url1);
		urls.add(url2);

		for(URL url1: urls) {
			if(blockingServer) {
				Runtime.getRuntime().addShutdownHook(new Thread());
				conn = Runtime.getRuntime().exec(url1.openConnection().toString());
				conn.getInputStream();
			} else {
				System.err.println("Booting the quickservers");
				Runtime.getRuntime().addShutdownHook(new Thread());
				conn = Runtime.getRuntime().exec(url1.openConnection().toString());
				conn.waitFor();
			}
		}
	}

	///////////////////////
}