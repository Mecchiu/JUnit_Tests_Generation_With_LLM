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
		
	/**
	 * Test class {@link QuickServer}.
	 * <p>
	 * Tests:
	 * <ul>
	 *      <li>{@link QuickServer#initService(Object[])}</li>
	 * </ul>
	 * <p>
	 * @author Shreyas Vishwar
	 */
	static class QuickServerTestCase extends QuickServer {

		/**
		 * Constructs a class {@link QuickServerTestCase}.
		 * @param fileName test file path.
		 * @param args the args.
		 * @since 1.3
		 * @see #QuickServerTestCase(java.lang.String)
		 */
		public QuickServerTestCase(String fileName, Object[] args) {
			super(fileName, args);
			// TODO Auto-generated constructor stub
		}

		/**
		 * Constructs testcase with exception, without the arguments,
		 * e.g.
		 * for (String test : args)
		 *   test = "test";
		 *   
		 * @param exception to throw.
		 */
		public QuickServerTestCase(Exception exception) {
			super(exception);
			// TODO Auto-generated constructor stub
		}

		/**
		 * Invokes {@link #constructor(Object[])} method.
		 * <p>
		 * @param args array of arguments to the method.
		 */
		@Override
		public void run() throws Exception {
			constructor(args);
		}

		/**
		 * Invokes {@link #serverCommand(String,Object[])} method.
		 * <p>
		 * @param cmd command.
		 * @param args arguments to the command.
		 */
		@Override
		public void run(String cmd, Object[] args) {
			serverCommand(cmd,args);
		}

		/**
		 * Invokes {@link #setPort(int) } method.
		 * <p>
		 * @param port port to set.
		 */
		@Override
		public void run(int port) {
			setPort(port);
		}

}
}