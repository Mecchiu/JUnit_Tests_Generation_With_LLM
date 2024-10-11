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
		public final static long DEFAULT_PORT = 54321;
    private static final Class<?>[] clazzes = new Class<?>[1];
    
    /**
     * Get version number of the framework.
     *
     * @return the number of the framework.
     */
    public static float getVersionNo() {
        return Runtime.getRuntime().version().split("-")[0];
    }

	/**
	 * Constructor for the class.
	 */
    public QuickServer_1Test() {
    }

    /**
    * The constructor for the class.  Creates the pool and starts the server.
    */
    public QuickServer_1Test(char host, int port) {
        this.host = host;
        this.port = port;
        this.init(clazzes);
		this.start();
	}

	/**
	 * Creates the pool and start the server.
	 */
    private void init(Class<?>[] classes) {

    	try {
    		DataModeModeMode mMode = MODE_NONE.getMode();
    		System.out.println("DataModeMode : " + mMode);
    		DataModeModeModeMode mModeMode = MODE_NONE.getMode();
    		System.out.println("DataModeModeMode : " + mMode);
    	} catch (SocketException ex) {
    		ex.printStackTrace();
    		return;
    	}
    	Connection[] conns = ManagementFactory.getPlatformMBeanServer().getConnector(host, port).getConnections();
}
}