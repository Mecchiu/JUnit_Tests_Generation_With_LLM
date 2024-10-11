// QuickServer_4Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(QuickServerConfig)} method.
*/
class QuickServer_4Test {
private static String qsConfigText = "package echoserver; ";
		private QuickServerConfig qsConfig;

	public void setUp() throws Exception {
		File file = new File("etc4net-quickserver.xml");
		StringReader stream = new StringReader(xmlReader.getXMLFromString(file.getPath()));
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(stream);
			Object o = in.readObject();
			File fileNew = new File(o.toString());
			in.close();
			setUp(fileNew);
		} catch(IOException e1) {
			e1.printStackTrace();
			throw e1;
		}

		qsConfig = (QuickServerConfig)in.readObject();
		file = new File("etc4net-quickserver.xml");
		stream.close();
	}

	/**
	 * Tests the method {@link QuickServer#initService(QuickServerConfig)}.
	 */
	@Test
	void testInitService() {
		QSClientConfiguration oQSC = new QSClientConfiguration();
		oQSC.setPort(qsConfig.getPort());
		QuickServer qs = QuickServer.createServer(oQSC);
		qs.initService(qsConfig);
		System.out.println("--- quick server instance ---");
		qs.start();
		Thread.sleep(3000);  // 3 Seconds to execute the start method.
		qs.clearCache();
		qs.close();
	}
}
