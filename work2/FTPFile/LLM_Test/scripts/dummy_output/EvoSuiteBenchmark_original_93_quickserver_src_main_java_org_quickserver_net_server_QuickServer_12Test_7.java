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
		* Sets up a new quick server. It runs in the same
		* thread as running the tests.
		* 
		* @param clazz a Class representing an existing server.
		* @throws IOException If the setup failed.
		*/
		@Test
		public void testSetup(Class<?> clazz) throws Exception {
			final Thread currentThread = Thread.currentThread();
			final List<TestListener> listeners = new LinkedList<TestListener>();
			final Map<String, TestListener> testListeners = new HashMap();
			class MyListener implements TestListener {

                public void testCaseStarted(TestEvent event) {
                    System.out.println("MyListener#testCaseStarted["+event.getTarget()+"]");
                }

                public void testCaseFinished(TestEvent event) {
                    System.out.println("MyListener#testCaseFinished["+event.getTarget()+"]");
                }

                public void testCaseStartError(TestEvent event) {
                    System.out.println("MyListener#testCaseStartError["+event.getTarget()+"]");
                }

                public void testCaseError(TestEvent event) {
                    System.out.println("MyListener#testCaseError["+event.getTarget()+"]");
                }

			}
			TestListener testListener;
			class MyThread extends Thread {

				public void run() {
					System.out.println("MyThread#run() START");
					listeners.add(new MyListener());
					System.out.println("MyListener#run() END");
				}

				public void testStart(TestEvent event) {
					System.out.println("MyThread#testStart("+event+")");
				}

				public void testError(TestEvent event) {
					System.out.println("MyThread#testError("+event+")");
				}
			}
			
}
}