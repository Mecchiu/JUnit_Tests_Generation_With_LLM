// QuickServer_1Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersionNo()} method.
*/
class QuickServer_1Test {
		private static Logger log = LoggerFactory.getLogger(QuickServer_1Test.class);
	@Test
	public void test1() throws IOException, InterruptedException {
		try {
			log.info("test1()...");

			String dataDir = "/home/anilah17/tmp" ;
			log.info("Starting test1()...");
			QuickServer quickServer = new QuickServer(null);

			quickServer.startServer();

		} catch (AppException e) {
				log.info(e.getMessage());
				e.printStackTrace();

		} catch (IOException e) {
				log.info(e.getMessage());
				e.printStackTrace();

		}
	}

}