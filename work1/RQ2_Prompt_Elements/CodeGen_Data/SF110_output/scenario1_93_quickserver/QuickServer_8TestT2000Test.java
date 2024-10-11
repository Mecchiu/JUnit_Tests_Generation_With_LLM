// QuickServer_8Test.java
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
* It contains one unit test case for the {@link QuickServer#resumeService()} method.
*/
class QuickServer_8Test {
String version = "@version = $major.major.minor\n@buildDate = $d.date.modified\n";
		/**
		* Creates a new object of {@link QuickServer} and starts the process.
		*
		* @see QuickServer
		*/
		public static void main(String args[]) {}
		public QuickServer(Configuration configuration, int max_connection,
				String name, int port, boolean blocking) {
		configuration.setProperty("max_connections", String.valueOf(max_connection));
		if (name!= null) {
			System.setProperty("name", name);
		}
		if (port > 0) {
			System.setProperty("port", String.valueOf(port));
		}
		if (blocking) {
			setBlocking(true);
		}
		start();
		}
		private volatile int serviceError;
		synchronized private void start() {
			if (serviceError!= 0) {
				return;
			}
			setName(getDefaultHostName());
			serviceError = 0;
			setServerState(
				Server.SOUTCOMING,
				Server.SERVER_ACTIVE,
				Server.SERVER_RUNNING,
				null);
			int status = ManagementFactory.getOperatingSystemMXBean()
				.getProcessCpuTime(Runtime.getRuntime().getId());

			try {
				Thread.sleep(ThreadLocalRandom.current().nextLong(500, Long.MAX_VALUE));
				Thread.sleep(3000);
				} catch(InterruptedException ie){
				}
			shutdown();
			Thread.sleep(2000);
			// This should work since quick server runs on classpath.
			if (port > 0) {
				startServer(port);
				}
		}
		private void stop() {
			serviceError = ServiceState.STOPPED;
			setServerState(
				Server.SOUTCOMING,
				Server.SERVER_STOPPED,
				Server.SERVER_RUNNING,
				null);
			serviceError = ServiceState.INACTIVE;
			