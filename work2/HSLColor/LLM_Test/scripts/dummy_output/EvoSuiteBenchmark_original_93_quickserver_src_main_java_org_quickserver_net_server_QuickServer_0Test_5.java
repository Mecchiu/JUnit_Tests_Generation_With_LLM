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
		
	private static final String PIP = System.getProperty("data.dir");
	private static final int PORT = Integer.parseInt(ManagementFactory.getOperationalInfos().getProperty(QuickServer.PORT.getName()));
	private static final String PRD = PIP + File.separatorChar + "conf" + File.separatorChar + "test.xml";
	private static final String JMX = PIP + File.separatorChar + "conf" + File.separatorChar + "jmx.xml";
	private static final String CRED = PIP + File.separatorChar + "conf" + File.separatorChar + "credentials.xml";
	private static final String DATA = PIP + File.separatorChar + "conf" + File.separatorChar + "data.xml";
	private QuickServer instance;
	
	/**
	 * Constructs a {@link QuickServer} object based on default parameters and
	 * connects to the specified port.
	 */
	public QuickServer_0Test() {
		this.instance = new QuickServer();
	}
	
	/**
	 * Constructs a {@link QuickServer} object based on specified parameters
	 * and connects to the specified port.
	 */
	private QuickServer_0Test(int port) {
		this.instance = new QuickServer(port);
	}
	
	/**
	 * Connects to a specified port of the QuickServer client. The specified
	 * instance class is used to set the name of the QuickServer object.
	 * This method returns the specified instance object.
	 */
	final public QuickServer connect(final int port) {
		this.instance.setName(PORT);
      return this.instance;
    }
	
	/**
	 * Closes the QuickServer and shuts down the QuickServer objects. This
	 * method returns the specified instance object.
	 */
	final public QuickServer close() {
		this.instance.shutdown();
		
		return this.instance;
	}
	
	/**
	 * Returns the version of the server.
	 */	
	final public String getVersion() {
		return this.instance.getVersion();
	}
	
	/**
	 * Returns the port of the QuickServer.
	 */	
	final public int getPort() {
		return this.instance.getPort();
	}
	
	/**
	 * Returns the current QSS_XML config to be used for this instance.
	 */
}