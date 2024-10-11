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
		
	/**
	 * main()
	 *
	 * @param args Command line arguments.
	 */
	public static void main(String args[]) {
		
		if(args.length <= 0) {
			throw new IllegalArgumentException("No command line arguments given");
		}
		QuickServerConfig qsConfig = null;

		try {
			qsConfig = getConfig(args);
		}
		catch(AppException e) {
            System.err.println("Error in " + args[0] + ":");
            e.printStackTrace();
            System.exit(1);
        }

        new QuickServer(qsConfig);
	}


	/**
	 * QuickServerConfig
	 *
	 * @param args Command line arguments.
	 */
	QuickServerConfig getConfig(String args[]) throws AppException {
		
		return new QuickServerConfig(args);
	}


	/**
	 * QuickServerConfig
	 *
	 * @param args Command line arguments.
	 * @throws AppException
	 */
	public QuickServerConfig(String[] args) throws AppException {
 		
		Connection c = null;
		HostAddress addr = null;
		InetAddress localaddr = null;
}
}