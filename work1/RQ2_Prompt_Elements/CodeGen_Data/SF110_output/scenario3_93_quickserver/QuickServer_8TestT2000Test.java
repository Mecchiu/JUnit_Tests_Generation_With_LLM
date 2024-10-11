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
private String testName;

		QuickServer_8Test(String testName) {
			this.testName = testName;
		}

		/**
		 * Test whether service was resumed from suspended state.
		 * @return true if service was resumed from suspended state.
		*/
		public boolean resumeService() {
				this.testName = "QUICKSERVER:" + this.testName;
			switch (this.testName) {
			case "resumeService":
				System.out.println("Service was resumed from suspended state.");
				return false;
				break;
			case "ping":
				System.out.println("ping: SUCCESS");
				break;
			default:
				break;
			}
			this.testName = "QUICKSERVER:" + this.testName;
			return true;
	}

	/**
	 * Test class for the {@link QuickServer}
	 * {@link #QUICKSERVER(String)}.
	 * @since 1.1
	 */
	public static class TestDriver implements Runnable {

		/**
		* The {@link QuickServer#QuickServer()} object
		* @since 1.1
		*/
		public final QuickServer quickServer = QuickServer.this;

		/**
		* {@inheritDoc}
		* @since 1.1
		*/
		public final void run() {
			quickServer.ping();
		}
	}
}
