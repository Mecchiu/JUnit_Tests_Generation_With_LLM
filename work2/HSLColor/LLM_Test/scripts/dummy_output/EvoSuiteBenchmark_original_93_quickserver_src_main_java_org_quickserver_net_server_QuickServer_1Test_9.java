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
		public static void main(String args[]) {
			boolean bRun = true;
			//boolean bRun = false;
			//QuickServer myServer = new QuickServer();
			while (bRun) {
				//QuickServer myServer = new QuickServer();
				//MyCommand myCommand = new MyCommand(this);
				//bRun = false;
				//QuickServer_1Test.run_1Test(myServer);
	}
}

/**
 * Runs some QuickServer tests.
 *
 */
private static void run_1Test(QuickServer myServer) {
    System.out.println("Starting QuickServer :" + myServer.getName());
    myServer.startServer();

    System.out.println("Finished QuickServer :" + myServer.getName());
}
/**
 *
 * @version
 * @author Akshathkumar Shetty
 *
 */
public abstract class QuickServer_1Test extends Test {

	private static final int NO_CHALLENGE_COUNT = 10000000;

	protected QuickServer(int noOfChains) {
	}

}
}