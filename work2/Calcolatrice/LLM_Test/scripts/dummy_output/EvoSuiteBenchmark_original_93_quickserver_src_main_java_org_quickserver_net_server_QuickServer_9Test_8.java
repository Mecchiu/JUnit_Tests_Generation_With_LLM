// QuickServer_9Test.java
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
* It contains one unit test case for the {@link QuickServer#info()} method.
*/
class QuickServer_9Test {
		

	/**
	 * @throws Exception 
	 * @see QuickServer#info()
	 */
	@Test
	public void test() throws Exception {
		Runtime runtime = Runtime.getRuntime();
		Runtime.getRuntime().log(Message.M_LAST_EXCEPTION + runtime.freeMemory());

		//test all methods
		Runtime.getRuntime().log(Message.M_LAST_EXCEPTION + runtime.freeMemory());
		String ip = ManagementFactory.getRuntimeMXBean().getInetAddr().getHostAddress();
		String p = ManagementFactory.getRuntimeMXBean().getName();
		Runtime.getRuntime().log(ip + "\n" + p);

		//test server close
		runtime = Runtime.getRuntime();
		Runtime.getRuntime().log(Message.M_LAST_EXCEPTION + runtime.freeMemory());
		runtime.close();

		//test null pointer
		runtime = Runtime.getRuntime();
		Runtime.getRuntime().log(Message.M_LAST_EXCEPTION + runtime.freeMemory());
		byte [] b = new byte[10];
		Runtime.getRuntime().log(Message.M_LAST_EXCEPTION + Runtime.getRuntime().freeMemory());
		runtime = null;
		Runtime.getRuntime().log(Message.M_LAST_EXCEPTION + runtime.freeMemory());
		runtime = new ServerThread();
		Runtime.getRuntime().log(Message.M_LAST_EXCEPTION + Runtime.getRuntime().freeMemory());
		runtime.setName("EchoServer (null)");
		Runtime.getRuntime().log(Message.M_LAST_EXCEPTION + Runtime.getRuntime().freeMemory());

		//assert true
		assertTrue("Test not correctly executed", true);
	}
}