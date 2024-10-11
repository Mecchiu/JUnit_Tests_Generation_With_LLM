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
		/**
// * Test Class with one thread to service the server (run in parallel).
			 * @since 1.2
				 */
		public static TestSuite test = new TestSuite();
		/**
// * Test Class with 1 thread to service the server (run in non blocking mode)
				 * @since 1.1
				 */
		public static TestSuite test1 = new TestSuite();
		/**
// * Test Class with 1 thread to service the server (run on server started)
				 * @since 1.1
				 */
		public static TestSuite test2 = new TestSuite();
		/**
// * Test Class with 5 thread to service the server.
				 * @since 1.2
					*/
		public static TestSuite test3 = new TestSuite();
		/**
				 * Method to run this class after the program is started
				 * @since 1.2
				 */
		public static void main(String[] args) throws Exception {
			createNetworkServer(5,
					"localhost",
					1234,
					QuickServer.test,
					QuickServer_6Test.class);

			createNetworkServer(6,
					"localhost",
					1234,
					QuickServer_6Test.class,
					NetworkServerTest.class);

			Thread thread1 = new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(5000);
					} catch(Exception e) {
					}
				}
			}, "QuickServer_Thread1");
			Thread thread2 = new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(5000);
					} catch(Exception e) {
					}
				}
			}, "QuickServer_Thread2");
			Thread thread3 = new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(5000);
					} catch(Exception e) {
					}
				}
			}, "QuickServer_Thread3");
			Thread thread4 = new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(5000);
					} catch(Exception e) {
					}
				}
			}, "QuickServer_Thread4");
}
}